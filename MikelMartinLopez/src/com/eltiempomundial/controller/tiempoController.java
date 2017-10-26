package com.eltiempomundial.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eltiempomundial.pojo.localizacion;

@WebServlet("/eltiempo")
public class tiempoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "Ooops";
		String view = "tiempo.jsp";
		try {
			// recoger parametros
			String ciudad = request.getParameter("ciudad");
			String temperatura = request.getParameter("temperatura");
			// validar
			if ("".equals(ciudad)) {
				msg = "Faltan Campos Obligatorios";
				view = "index.jsp";
			} else if (!"bilbao".equalsIgnoreCase(ciudad) && !"londres".equalsIgnoreCase(ciudad)) {
				msg = "\"no hay nada con esa poblacionn " + ciudad;
				view = "index.jsp";
			} else {
				localizacion w = new localizacion(ciudad, temperatura);
				request.setAttribute("tiempo", w);
				request.setAttribute("temperatura", temperatura);
			}

		} catch (Exception e) {
			msg = "Excepción " + e.getMessage();
			e.printStackTrace();
		} finally {
			request.setAttribute("msg", msg);
			request.getRequestDispatcher(view).forward(request, response);
		}

	}
}
