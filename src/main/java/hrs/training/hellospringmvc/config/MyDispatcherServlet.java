package hrs.training.hellospringmvc.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyDispatcherServlet extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyDispatcherServlet(WebApplicationContext webApplicationContext) {
		super(webApplicationContext);
	}

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(request.getHeader("user-agent") + request.getRequestURI());
		if (request.getHeader("user-agent").contains("Chrome") && (!request.getRequestURI().contains("/notsupport"))) {
			request.getRequestDispatcher("/notsupport").forward(request, response);
		}
		super.doDispatch(request, response);
	}
}
