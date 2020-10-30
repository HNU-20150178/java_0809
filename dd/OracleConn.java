package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class OracleConn { //상속받는 사람에게 추상메소드를 오버라이딩 시키기위해 선언했음
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String myID = "jslhrd46";
	private String myPass = "1234";
	
	protected Connection myConn;
	
	public OracleConn() {}
	
	public void makeConn() throws Exception {
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL,myID,myPass);
	}
	public abstract void cleanUp() throws Exception; // 오버라이딩하세요
	
	public void takeDown() throws Exception {
		cleanUp();
		myConn.close();
	}
}
