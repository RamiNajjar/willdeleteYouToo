package com;

        import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// AbstractAnnotationConfigDispatcherServletInitializer CREATE both ContextLoaderListener & DispatcherServlet
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // config class use for ContextLoaderListener that is in turn create ((application context))
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // config class use for DispatcherServlet that is in turn create ((application context))
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{WebConfig.class};
    }
}
