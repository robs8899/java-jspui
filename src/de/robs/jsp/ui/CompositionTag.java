package de.robs.jsp.ui;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class CompositionTag extends TagSupport {
  
	private static final long serialVersionUID = 1L;
	private String template;

	public void setTemplate(String template) {
		this.template = template;
	}

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		try { pageContext.include(template);
		} catch (Exception e) { throw new JspException(e.toString(), e);
		}
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		template = null;
	}

}
