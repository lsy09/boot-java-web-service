package info.thecodinglive.importSelect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportSelectApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        UseMyBean bean = context.getBean(UseMyBean.class);
        bean.printMsg();
    }
}
