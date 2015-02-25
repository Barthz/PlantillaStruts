package curso.jee.interceptores;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MiInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Se empieza a ejecutar mi interceptor");
		String resultado = arg0.invoke();
		System.out.println("Se termina de ejecutar mi interceptor: "
				+ resultado);
		return resultado;
	}

}
