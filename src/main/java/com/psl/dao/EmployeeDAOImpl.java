package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.psl.entity.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return template.query("select * from employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
			
		});
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		System.out.println("In dao Employee");
		String sql="insert into  employee(id,name) values("+e.getId()+",'"+e.getName()+"')";
		template.update(sql);
		
		sql="update employee set email='mohit@gmail.com' where id="+e.getId();
		template.update(sql);
		
		sql="delete from employee where id="+e.getId();
		//template.update(sql);
	}

}
