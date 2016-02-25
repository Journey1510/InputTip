package org.crazyit.inputtip.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.List;

import org.crazyit.inputtip.service.*;

import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@WebServlet(urlPatterns="/getDetail.do")
public class GetDetailServlet extends HttpServlet
{
	public void service(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, java.io.IOException
	{
		// ͨ��WebApplicationContextUtils��������Spring������
		// ͨ��Spring�������������е�ҵ���߼����
		TipService ts = (TipService)WebApplicationContextUtils
			.getWebApplicationContext(getServletContext())
			.getBean("tipService");
		// ���ý����õ��ַ�����Ajax��POST���󶼲���UTF-8�ı��뼯
		request.setCharacterEncoding("utf-8");
		// ��ȡ�������
		String model = request.getParameter("model");
		response.setContentType("text/html;charset=GBK");
		PrintWriter out =  response.getWriter();
		// �����Ӧ
		out.println(ts.getDescByModel(model));
	}
}