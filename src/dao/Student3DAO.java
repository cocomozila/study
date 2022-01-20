package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Student3DTO;

public class Student3DAO {
	
	public void insertStudent3 (Student3DTO dto) {
					
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("연결 성공");
				Connection conn =
				DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "root", "1234");
				
				String insertSQL = "insert into students3 values(null,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(insertSQL);
				
				ps.setString(1, dto.getName());
				ps.setString(2, dto.getEmail());
				ps.setString(3, dto.getPhone());
				ps.setString(4, dto.getMajor());
				
				ps.executeUpdate();
				ps.close();
				conn.close();
				
				System.out.println("연결 종료");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public void updateStudent3 (String column, String newWord, String oldWord) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("연결 성공");
			Connection conn =
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "root", "1234");
			
			String updateSQL = "update students3 set major = ? where major = ?";
			PreparedStatement ps = conn.prepareStatement(updateSQL);
			
//			ps.setString(1, column); // "major"
			ps.setString(1, newWord);// "시각디자인"
//			ps.setString(3, column); // "major"
			ps.setString(2, oldWord);// "컴퓨터공학"
			
			ps.executeUpdate();
			ps.close();
			conn.close();
			
			System.out.println("연결 종료");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
}

}
