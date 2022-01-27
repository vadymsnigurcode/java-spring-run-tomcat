import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.annotation.PostConstruct;

public class TomcatLauncher {

    @PostConstruct
    public void launch() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/", "helloServlet");
        tomcat.start();
        new Thread(()->tomcat.getServer().await()).start();

    }
}
