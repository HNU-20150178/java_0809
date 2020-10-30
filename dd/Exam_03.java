package JDBCTest;

public class Exam_03 {

	public static void main(String[] args) throws Exception {
		OracleSQL2 sql = new OracleSQL2();
		sql.makeConn();
		sql.exam02();
		sql.takeDown();
	}

}
