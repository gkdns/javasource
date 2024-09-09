package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        // ResultSet rs = null; Select 할때만 사용

        try {

            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. insert 작업
            // 4-1. 실행할 sql 구문 작성

            String sql = "INSERT INTO emp_temp values(7201, 'TEST_USER1', 'MANAGER', 7788, '2016-10-28', 4500, NULL, 80)";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);

            // 4-3. sql 구문 실행 후 결과받기
            // excuteUpdate() : insert,delete, update
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("입력성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 선언한거 반대로 닫기
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
