package JDBCTest;

import java.sql.ResultSet;
import java.sql.Statement;

public class OracleSQL extends OracleConn{
	Statement stmt = null;
	ResultSet rs = null;
	
	public void exam01() throws Exception {
		String query = " select ename,salary, salary*12 as sum from employee";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);

		System.out.println("이름\t급여\t연봉");
		while(rs.next()) {
			System.out.print(rs.getString("ename")+"\t");
			System.out.print(rs.getInt("salary")+"\t");
			System.out.println(rs.getInt("sum"));
			//System.out.println(rs.getString(1)+ "\t" + rs.getInt(2) + "\t" + rs.getInt(3));
		}
		
	}
	
	@Override
	public void cleanUp() throws Exception {
		rs.close();
		stmt.close();
	}
}
