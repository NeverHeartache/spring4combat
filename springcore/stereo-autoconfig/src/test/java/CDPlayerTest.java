import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring4combat.config.StereoConfig;
import org.spring4combat.service.CompactDisc;
import org.spring4combat.service.impl.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {StereoConfig.class})
public class CDPlayerTest {

//    @Autowired
//    private CompactDisc compactDisc;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void playCD(){
        cdPlayer.play();
    }

}
/*
//    @Test
//    public void cdShouldNotBeNull() {
//        System.out.println("充当日志：cdShouldNotBeNull called...");
//        assertNotNull(compactDisc);
//    }
这个测试结果就是：一片空白，因为断言cd不为null，所以条件满足；
如果cd为null,则抛出AssertionError异常；
 */
