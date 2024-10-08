package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    // CRUD 작업을 위한 메소드 작성
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static 블럭: 클래스 로드되면 인스턴스 생성 여부와 상관없이 실행
    static {
        // 1.드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        // 3. connection 얻기
        // con = DriverManager.getConnection(url, user, password);
        // return con;
        return DriverManager.getConnection(url, user, password);

    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            // 선언한거 반대로 닫기
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            // 선언한거 반대로 닫기
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CRUD 메소드 작성
    public boolean insert(EmpDTO dto) {

        boolean flag = false;

        try {
            con = getConnection();

            String sql = "INSERT INTO emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
            sql += " values(?,?,?,?,?,?,?,?)";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);

            // ? 해결
            pstmt.setInt(1, dto.getEmpno());
            pstmt.setString(2, dto.getEname());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());
            pstmt.setString(5, dto.getHiredate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptno());

            int result = pstmt.executeUpdate();

            if (result > 0)
                flag = true;

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

}
