import org.junit.Assert;
import org.junit.Test;

public class TestTestApplication {
    
    @Test
    public void testHoconSimple() throws Exception {
        final TestApplication testApplication = new TestApplication();
        testApplication.run(new String[]{"server", "simple.conf"});
        Assert.assertNotNull(testApplication.getConfiguration());
        Assert.assertEquals("X", testApplication.getConfiguration().getFoo());
        Assert.assertEquals("Y", testApplication.getConfiguration().getBar());
    }
    
    @Test
    public void testHoconSubtitution() throws Exception {
        final TestApplication testApplication = new TestApplication();
        testApplication.run(new String[]{"server", "substitution.conf"});
        Assert.assertNotNull(testApplication.getConfiguration());
        Assert.assertEquals("X", testApplication.getConfiguration().getFoo());
        Assert.assertEquals("X", testApplication.getConfiguration().getBar());       
    }
}
