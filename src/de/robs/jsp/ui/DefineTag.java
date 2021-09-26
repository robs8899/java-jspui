package de.robs.jsp.ui;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class DefineTag extends BodyTagSupport {

  private static final long serialVersionUID = 1L;
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int doAfterBody() throws JspException {
    String bodyContent = getBodyContent().getString();
    Util.getParams(pageContext).put(name, bodyContent);
    return SKIP_BODY;
  }

  @Override
  public void release() {
    name = null;
  }

}
