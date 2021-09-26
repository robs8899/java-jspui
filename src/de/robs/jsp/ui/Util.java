package de.robs.jsp.ui;

import java.util.Hashtable;
import java.util.Map;

import javax.servlet.jsp.PageContext;

public class Util {

  public static final String UI_ATTR_NAME = "de.robs.jsp.ui";

  @SuppressWarnings("unchecked")
  public static Map<String, String> getParams(PageContext pageContext) {
    
    Map<String, String> params = (Map<String, String>) pageContext.
        getAttribute(UI_ATTR_NAME, PageContext.REQUEST_SCOPE);
    
    if (params == null) {
      
      params = new Hashtable<String, String>();
      pageContext.setAttribute(UI_ATTR_NAME,
          params, PageContext.REQUEST_SCOPE);
    }
    
    return params;
    
  }

}
