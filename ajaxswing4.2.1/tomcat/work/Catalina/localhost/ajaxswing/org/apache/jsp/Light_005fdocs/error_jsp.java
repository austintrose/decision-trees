package org.apache.jsp.Light_005fdocs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.creamtec.ajaxswing.i18n.I18NUtils;
import com.creamtec.ajaxswing.i18n.I18NKeys;
import java.util.Locale;
import com.creamtec.ajaxswing.core.AjaxSwingProperties;
import com.creamtec.ajaxswing.core.AjaxSwingPropertiesManager;
import com.creamtec.core.StringUtilities;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String appName = request.getParameter("appName");
	if (StringUtilities.isEmpty(appName)) {
		appName="default";
	}
	AjaxSwingProperties defaultProps = null;
	try {
		defaultProps = AjaxSwingPropertiesManager.getInstance().getAppProperties(appName);
	} catch(Exception ex) {
		appName="default";
		defaultProps = AjaxSwingPropertiesManager.getInstance().getAppProperties(appName);
	}
	String currentLocale = request.getParameter(defaultProps.getProperty(AjaxSwingProperties.HTTP_URL_LOCALE,"locale"));
	if (currentLocale == null) {
		currentLocale = defaultProps.getProperty(AjaxSwingProperties.AGENT_DEFAULT_LOCALE);
	}
	Locale userLocale = I18NUtils.createLocale(currentLocale);
	if(userLocale == null) userLocale = Locale.getDefault();
	String messageAjaxswingErrorTitle = I18NUtils.getMessage(I18NKeys.MESSAGE_AJAXSWING_ERROR_TITLE, userLocale);
	String messageAjaxswingErrorInternal = I18NUtils.getMessage(I18NKeys.MESSAGE_AJAXSWING_ERROR_INTERNAL, userLocale);
	String messageAjaxswingErrorText = I18NUtils.getMessage(I18NKeys.MESSAGE_AJAXSWING_ERROR_TEXT, userLocale);
	String messageAjaxswingErrorButton_text = I18NUtils.getMessage(I18NKeys.MESSAGE_AJAXSWING_ERROR_BUTTON_TEXT, userLocale);
	String messageAjaxswingErrorBottom_text = I18NUtils.getMessage(I18NKeys.MESSAGE_AJAXSWING_ERROR_BOTTOM_TEXT, userLocale);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"description\" content=\"CreamTec developed Java to HTML conversion utility that web-enables Java applications and deploys Swing in browser\">\r\n");
      out.write("<meta name=\"keywords\" content=\"creamtec,ajaxswing,Java to HTML conversion,web-enabling java applications,swing applications in browser,deploy java through html,applets executing within browser,java conversion,convert swing,java to html,automatic web-enabling\">\r\n");
      out.write("<title>");
      out.print(messageAjaxswingErrorTitle);
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("h1 {font-family: 'Dosis', sans-serif;\r\n");
      out.write("\tfont-size: 32px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: \r\n");
      out.write("\t#E99420;}\r\n");
      out.write("p, div, li, td {font-family: 'Dosis', sans-serif;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: \r\n");
      out.write("\t#333;}\r\n");
      out.write(".sidebar {\r\n");
      out.write("\twidth: 320px;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tpadding: 0px 0 0 0;\r\n");
      out.write("}\r\n");
      out.write("a { color: \r\n");
      out.write("\t#345D9E;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write(".help {\r\n");
      out.write("\tpadding:5px;\r\n");
      out.write("\twidth:144px;\r\n");
      out.write("\tborder-width:0px;\r\n");
      out.write("\tborder-style:solid;\r\n");
      out.write("\tborder-color:#7C335D;\r\n");
      out.write("}\r\n");
      out.write("pre {\r\n");
      out.write("\twidth:550px;\r\n");
      out.write("\theight:250px;\r\n");
      out.write("\toverflow:scroll;\r\n");
      out.write("\tfont-size:9px;\r\n");
      out.write("}\r\n");
      out.write(".main > a {\r\n");
      out.write("\ttext-decoration:none;position:absolute;display:block;\r\n");
      out.write("}\r\n");
      out.write(".sidebar > a {\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body style=\"background:url(../bg.gif) repeat;text-align:center;margin:0px;\">\r\n");
      out.write("<div class=\"main\" style=\"margin: 0px auto;position:relative;width:780px;height:600px;text-align:center;background:transparent url(images/com/creamtec/ajaxswing/laf/icons/banner.png) no-repeat left top;\">\t\r\n");
      out.write("\t<div style=\"text-decoration:none;position:absolute;display:block;top:155px;left:0px;width:500px;height:100px;text-align:left\">\r\n");
      out.write("\t\t<h1>");
      out.print(messageAjaxswingErrorInternal);
      out.write("</h1>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");

				Object value = session.getAttribute("ajaxswing.errorMessage");
				if ((value != null) && (value.toString().length()>0)) {
			
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(session.getAttribute("ajaxswing.errorMessage"));
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p><p>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<i>");
      out.print(messageAjaxswingErrorText );
      out.write("</i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form method=POST action=\"");
      out.print(session.getAttribute("ajaxswing.submitURL"));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"__Action\" value=\"refresh\">\r\n");
      out.write("\t\t\t<INPUT TYPE=\"image\" SRC=\"images/com/creamtec/ajaxswing/laf/icons/refresh.png\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<p>");
      out.print(messageAjaxswingErrorBottom_text);
      out.write("</p>\r\n");
      out.write("\t\t<div style=\"margin:0px;margin-top:42px;color:#898989;text-align:left;\">2012 © CreamTec, LLC. All rights reserved.</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"sidebar\" style=\"position:absolute;left:588px;top:172px;text-align:left;\">\t\r\n");
      out.write("\t\t<a href=\"http://www.creamtec.com/services/conversion_to_ajax.html\">\r\n");
      out.write("\t\t<div class=\"help\">\r\n");
      out.write("\t\t\t<span style=\"font-size:16px;font-weight:bold;color:#345D9E;\">Need Help?</span><br>\r\n");
      out.write("\t\t\t<span>Experts at CreamTec professional services can help you quickly get to 100% working web UI</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<a href=\"http://creamtec.com/services/index.html\">\r\n");
      out.write("\t\t<div class=\"help\">\r\n");
      out.write("\t\t\t<span style=\"font-size:16px;font-weight:bold;color:#345D9E;\">Talent On Demand</span><br>\r\n");
      out.write("\t\t\t<span>We offer full range of services from web design to development</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<a href=\"http://creamtec.com/\" style=\"top:0px;left:0px;width:150px;height:100px;\">&nbsp;</a>\r\n");
      out.write("\t<a href=\"../\" style=\"top:110px;left:0px;width:150px;height:32px;\">&nbsp;</a>\r\n");
      out.write("\t<a href=\"http://creamtec.com/\" style=\"top:110px;left:180px;width:150px;height:32px;\">&nbsp;</a>\r\n");
      out.write("\t<a href=\"http://creamtec.com/services/index.html\" style=\"top:110px;left:588px;width:150px;height:32px;\">&nbsp;</a>\r\n");
      out.write("</div>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
