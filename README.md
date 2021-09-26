# java-jspui

JSP Templating Tags like JSF Facelets UI Tags.

## Tag Documentation

See `src/META-INF/jsp-ui.tld`.

## Examples

### Classic JSP Syntax

- The Template:

    ```html
    \<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%\>
    \<%@ taglib prefix="ui" uri="http://robs.de/jsp-ui" %\>
    \<html\>
      \<head\>
        \<title\>\<ui:insert name="title" /\>\</title\>
      \</head\>
      \<body\>
        \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="header" /\>\</div\>
        \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="content" /\>\</div\>
        \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="footer" /\>\</div\>
      \</body\>
    \</html\>
    ```

- A Page Composition:

    \<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%\>
    \<%@ taglib prefix="ui" uri="http://robs.de/jsp-ui" %\>
    \<ui:composition template="/WEB-INF/res/template.jsp"\>
      \<ui:define name="title"\>Hello Title\</ui:define\>
      \<ui:define name="header"\>
        \<h2 style="color:#EF4F4F;"\>This is the header section\</h2\>
        \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
          diam nonumy eirmod tempor invidunt ut labore et dolore magna
          aliquyam erat, sed diam voluptua.\</p\>
      \</ui:define\>
      \<ui:define name="content"\>
        \<h2 style="color:#4F4FCF;"\>This is the content section\</h2\>
        \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
          diam nonumy eirmod tempor invidunt ut labore et dolore magna
          aliquyam erat, sed diam voluptua.\</p\>
      \</ui:define\>
      \<ui:define name="footer"\>
        \<h2 style="color:#6F6F6F;"\>This is the footer section\</h2\>
        \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
          diam nonumy eirmod tempor invidunt ut labore et dolore magna
          aliquyam erat, sed diam voluptua.\</p\>
      \</ui:define\>
    \</ui:composition\>

### XML based JSPX Syntax

- The Template:

    \<?xml version="1.0"?\>
    \<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://robs.de/jsp-ui" version="2.2"\>
      \<jsp:directive.page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" /\>
      \<html\>
        \<head\>
          \<title\>\<ui:insert name="title" /\>\</title\>
        \</head\>
        \<body\>
          \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="header" /\>\</div\>
          \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="content" /\>\</div\>
          \<div style="margin:4px;padding:4px;border:1px solid silver;"\>\<ui:insert name="footer" /\>\</div\>
        \</body\>
      \</html\>
    \</jsp:root\>

- A Page Composition:

    \<?xml version="1.0"?\>
    \<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://robs.de/jsp-ui/" version="2.2"\>
      \<jsp:directive.page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" /\>
      \<ui:composition template="/WEB-INF/res/template.jspx"\>
        \<ui:define name="title"\>Hello Title\</ui:define\>
        \<ui:define name="header"\>
          \<h2 style="color:#EF4F4F;"\>This is the header section\</h2\>
          \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
            diam nonumy eirmod tempor invidunt ut labore et dolore magna
            aliquyam erat, sed diam voluptua.\</p\>
        \</ui:define\>
        \<ui:define name="content"\>
          \<h2 style="color:#4F4FCF;"\>This is the content section\</h2\>
          \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
            diam nonumy eirmod tempor invidunt ut labore et dolore magna
            aliquyam erat, sed diam voluptua.\</p\>
        \</ui:define\>
        \<ui:define name="footer"\>
          \<h2 style="color:#6F6F6F;"\>This is the footer section\</h2\>
          \<p\>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
            diam nonumy eirmod tempor invidunt ut labore et dolore magna
            aliquyam erat, sed diam voluptua.\</p\>
        \</ui:define\>
      \</ui:composition\>
    \</jsp:root\>

    