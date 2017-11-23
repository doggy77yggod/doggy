package com.edu.iii.eeit9911;

import java.sql.SQLException;
import java.util.List;

public interface TestInterfaceDAO {
	public void getConnection() throws SQLException;
	public int insert(TestEmpVO emp) throws SQLException;
	public int update(TestEmpVO emp) throws SQLException;
	public int delete(int empno) throws SQLException;
	public TestEmpVO findByPrimaryKey(int empno) throws SQLException;
	public List<TestEmpVO> getAll() throws SQLException;
	public void closeConn() throws SQLException;
}
