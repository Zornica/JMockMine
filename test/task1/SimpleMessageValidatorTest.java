package task1;

import demotask.SimpleMessage;
import org.jmock.Expectations;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class SimpleMessageValidatorTest {

  SimpleMessageValidator validator = new SimpleMessageValidator();

  @Test
  public void happyPath() {
    final SimpleMessage message = new SimpleMessage("mm", "title1", "body1");
    assertThat(validator.validate(message), is(true));
  }

  @Test
  public void titleIsMissing() {
    final SimpleMessage message = new SimpleMessage("mm", "", "body1");

    assertThat(validator.validate(message), is(false));
  }

  @Test
  public void bodyIsMissing() {
    final SimpleMessage message = new SimpleMessage("mm", "fff", "");
    assertThat(validator.validate(message), is(false));
  }

  @Test
  public void recipientIsMissing() {
    final SimpleMessage message = new SimpleMessage("", "fff", "dddd");
    assertThat(validator.validate(message), is(false));
  }
}
