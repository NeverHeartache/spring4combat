import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.spring4combat.config.StereoConfig;
import org.spring4combat.service.CompactDisc;
import org.spring4combat.service.impl.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StereoConfig.class)
public class CompactDiscTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void assetCDNotnull(){
        assertNotNull(compactDisc);
        systemOutRule.enableLog();
    }

    @Test
    public void assertCDPlayerNotNull(){
        assertNotNull(cdPlayer);
    }
}
