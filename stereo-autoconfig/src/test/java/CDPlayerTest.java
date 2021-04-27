import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.spring4combat.config.StereoConfig;
import org.spring4combat.service.CompactDisc;
import org.spring4combat.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {StereoConfig.class})
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void playCD(){
        cdPlayer.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + System.getProperty("line.separator"),
                log.getLog());
    }

}
/*
cdShouldNotBeNull:
    这个测试结果就是：一片空白，因为断言cd不为null，所以条件满足；
    如果cd为null,则抛出AssertionError异常；
playCD:
    这个例子本来是在断言后边之前用的是\n，执行断言失败，只是因为这个line separator不一致，所已用了这个语句；
    在java中存在一些转义字符,比如"\n"为换行符,但是也有一些JDK自带的一些操作符
    比如 : System.getProperty("line.separator")
    这也是换行符,功能和"\n"是一致的,但是此种写法屏蔽了 Windows和Linux的区别
 */
