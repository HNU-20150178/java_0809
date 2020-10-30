package JDBCTest;

import java.sql.ResultSet;
import java.sql.Statement;

public class OracleSQL2 extends OracleConn {
	Statement stmt = null;
	ResultSet rs = null;
	public void exam02() throws Exception {
		String query = " select ename, salary, job, dno, nvl(commission, 0), salary*12, salary*12+nvl(commission,0) from employee";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
	
		System.out.println("이름\t급여\t직업\t부서번호\t커미션\t연급");
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3) + "\t"+rs.getInt(4) + "\t"+rs.getInt(5) + "\t"+rs.getInt(6));
		}
	}
	
	
	@Override
	public void cleanUp() throws Exception {
		rs.close();
		stmt.close();
	}
}
