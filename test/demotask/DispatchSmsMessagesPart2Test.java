package demotask;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import task1.FakeValidator;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class DispatchSmsMessagesPart2Test {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Mock
  SmsGateway smsGateway;


  FakeValidator validator = new FakeValidator();


  @Test
  public void happyPath() {
    final Dispatcher dispatcher = new Dispatcher(smsGateway, validator);
    final SimpleMessage message = new SimpleMessage("mm", "title1", "body1");

    validator.result = true;

    context.checking(new Expectations() {{
      oneOf(smsGateway).send(message);
      will(returnValue(true));
    }});


    dispatcher.send(message);
  }

  @Test
  public void messageWasNotValid() {
    final Dispatcher dispatcher = new Dispatcher(smsGateway, validator);
    final SimpleMessage message = new SimpleMessage("mm", "title1", "body1");

    validator.result = false;

    context.checking(new Expectations() {{
      never(smsGateway).send(message);
    }});

    dispatcher.send(message);
  }

}
