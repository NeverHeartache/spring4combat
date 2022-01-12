package boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sia.knights.Knight;

public class KnightMain {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
    Knight knight = applicationContext.getBean("knight", Knight.class);
    knight.embarkQuest();
    applicationContext.close();
  }
}
