
package jenkins.model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jvnet.hudson.test.Issue;

public class IdStrategyTest
{
  @Test public void idFromFilenameBasic() throws Exception
  {
    IdStrategy idStrategy = new IdStrategy.CaseSensitive();
    assertEquals(idStrategy.idFromFilename("basic~filename.thing-thing_thing"), "basicFilename.thing-thing_thing");
  }

  @Test public void idFromFilenameHexShouldWork() throws Exception
  {
    IdStrategy idStrategy = new IdStrategy.CaseSensitive();
    assertEquals(idStrategy.idFromFilename("lets_have_$BEEF_for_dinner"), "lets_have_\ubeef_for_dinner");
  }

}
