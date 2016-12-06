import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Juggler implements Performer {

    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("C:\\Users\\tays\\IdeaProjects\\springBoot\\src\\main\\java\\Beans.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }

    private int beanBags = 3;

    public Juggler(){}

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
