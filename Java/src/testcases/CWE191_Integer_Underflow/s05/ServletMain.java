package testcases.CWE191_Integer_Underflow.s05;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGetCWE1(request, response);
		doGetCWE2(request, response);
		doGetCWE3(request, response);
		doGetCWE4(request, response);
		doGetCWE5(request, response);
		doGetCWE6(request, response);
		doGetCWE7(request, response);
		doGetCWE8(request, response);
		doGetCWE9(request, response);
	}
	
	private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_51a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_42()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_11()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_02()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_61a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_68a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_15()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_04()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_09()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_03()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_14()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_81a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_13()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_42()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_17()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_15()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_05()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_71a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_22a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_66a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_72a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_68a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_74a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_01()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_06()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_75a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_67a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_61a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_54a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_41()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_16()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_21()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_04()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_09()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_14()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_31()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_81a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_53a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_01()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_10()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_08()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_41()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_03()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_52a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_75a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_22a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_45()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_71a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_08()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_53a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_07()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_02()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_05()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_17()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_31()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_05()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_41()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_03()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_13()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_74a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_67a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_75a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_17()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_54a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_12()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_54a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_06()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_16()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_14()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_02()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_73a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_06()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_07()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_51a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_51a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_21()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_11()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_81a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_07()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_13()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_04()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_74a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_16()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_45()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_08()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_53a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_15()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_11()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_73a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_01()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_09()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_42()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_10()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_22a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_72a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_31()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_10()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_12()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_66a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_21()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getCookies_Servlet_predec_73a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_66a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_72a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_71a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_52a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_45()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_61a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_12()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getQueryString_Servlet_predec_67a()).runTest(request, response);
			(new testcases.CWE191_Integer_Underflow.s05.CWE191_Integer_Underflow__int_getParameter_Servlet_predec_68a()).runTest(request, response);
			/* END-AUTOGENERATED-SERVLET-TESTS-1 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

			/* END-AUTOGENERATED-SERVLET-TESTS-2 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

			/* END-AUTOGENERATED-SERVLET-TESTS-3 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */

			/* END-AUTOGENERATED-SERVLET-TESTS-4 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

			/* END-AUTOGENERATED-SERVLET-TESTS-5 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

			/* END-AUTOGENERATED-SERVLET-TESTS-6 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

			/* END-AUTOGENERATED-SERVLET-TESTS-7 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */

			/* END-AUTOGENERATED-SERVLET-TESTS-8 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

			/* END-AUTOGENERATED-SERVLET-TESTS-9 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
