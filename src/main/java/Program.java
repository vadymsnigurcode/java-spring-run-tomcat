import org.apache.catalina.LifecycleException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) throws LifecycleException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DefaultAppConfig.class);
    }
}
