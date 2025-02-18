package com.cognizant.moviecrusier.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecrusier.dao.MovieDao;
import com.cognizant.moviecrusier.dao.MovieDaoSqlImpl;

@WebServlet(urlPatterns = "/ShowMovieListAdmin")
public class ShowMovieListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MovieDao movieDao = new MovieDaoSqlImpl();
		request.setAttribute("movieList", movieDao.getMovieListAdmin());
		RequestDispatcher rd = request.getRequestDispatcher("movie-list-admin.jsp");
		rd.forward(request, response);

	}

}
