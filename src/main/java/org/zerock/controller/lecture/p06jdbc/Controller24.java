package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.Customer;

@Controller
@RequestMapping("ex24")
public class Controller24 {

	@Autowired
	private DataSource dataSource;

	@GetMapping("sub01")
	public void listAllCustomers(
			@ModelAttribute("customerlist")ArrayList<Customer>list)
	
	String sql = "SELECT "
			+"CustomerID id, "
			+"CustomerName name, "
			+"ContactName, "
			+"Address, "
			+"City "
			+"PostalCode "
			+"Country "
			+"FROM Customers "
			+"ORDER BY CustomerID DESC";
	
	Connection con = dataSource.getConnection();
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);{
		
		while(rs.next()) {
			Customer c= new Customer();
			c.setName(rs.getString("name"));
			c.setAddress(rs.getString("address"));
			c.setCity(rs.getString("city"));
			c.setCountry(rs.getString("country"));
			c.setPostalCode(rs.getString("postalCode"));
			c.setId(rs.getInt("id"));
			c.setContactName(rs.getString("contactName"));
			
			list.add(c);
		}
		}
	}





















