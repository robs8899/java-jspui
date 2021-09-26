package de.robs.jsp.ui;

import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class InsertTag extends TagSupport {

  private static final long serialVersionUID = 1L;
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int doStartTag() throws JspException {

    Map<String, String> params = Util.getParams(pageContext);
    String param = (String) params.get(name);

    if (param != null) try { pageContext.getOut().write(param);
    } catch (Exception e) {throw new JspException(e.toString(), e);
    }

    return SKIP_BODY;

  }

  @Override
  public void release() {
    name = null;
  }

}
