import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring4combat.config.StereoConfig;
import org.spring4combat.service.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StereoConfig.class)
public class CompactDiscTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void assetCDNotnull(){
        assertNotNull(compactDisc);
    }
}
