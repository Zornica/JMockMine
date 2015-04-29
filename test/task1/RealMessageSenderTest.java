package task1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class RealMessageSenderTest {

  RealMessageSender sender = new RealMessageSender();

  @Test
  public void happyPath() {
    assertThat(sender.send(new Message(new Person("john"), "title1", "body1")), is(true));
  }

  @Test
  public void titleIsMissing() {
    assertThat(sender.send(new Message(new Person("john"), "", "body1")), is(false));
  }

  @Test
  public void bodyIsEmpty() {
    assertThat(sender.send(new Message(new Person("john"), "ttest", "")), is(false));
  }
}
