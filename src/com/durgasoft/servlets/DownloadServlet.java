package com.durgasoft.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public static final String fileName="Desert.png";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("APPLICATION/OCTET-STREAM");
		PrintWriter out=response.getWriter();
		response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
		FileInputStream fis= new FileInputStream("C:\\Users\\DUSHYANT SIROHI\\eclipse-workspace\\upload\\Desert.png");
		int i =fis.read();
		while(1!=-1) {
			out.write(i);
			i=fis.read();
		}
	}

}
