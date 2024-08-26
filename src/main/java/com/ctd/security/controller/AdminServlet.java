package com.ctd.security.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.ctd.security.dto.UserDto;


@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<UserDto> users = new ArrayList<UserDto>();
		UserDto user1 = new UserDto(1, "DIOP", "Fatou", "diop8fatou@gmail.com");
		UserDto user2 = new UserDto(2, "DIOP", "Cheikh Tidiane", "diop8fatou@gmail.com");
		UserDto user3 = new UserDto(3, "Ndiaye", "Soda", "diop8fatou@gmail.com");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		req.setAttribute("usersList", users);
		req.getRequestDispatcher("WEB-INF/jsp/users/liste.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		


	}
}
