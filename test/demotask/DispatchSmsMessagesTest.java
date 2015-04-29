package demotask;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class DispatchSmsMessagesTest {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Mock
  SmsGateway smsGateway;

  @Mock
  MessageValidator validator;


  @Test
  public void happyPath() {
    final Dispatcher dispatcher = new Dispatcher(smsGateway, validator);
    final SimpleMessage message = new SimpleMessage("mm", "title1", "body1");

    context.checking(new Expectations() {{

      oneOf(validator).validate(message);
      will(returnValue(true));

      oneOf(smsGateway).send(message);
      will(returnValue(true));
    }});


    dispatcher.send(message);
  }

  @Test
  public void messageWasNotValid() {
    final Dispatcher dispatcher = new Dispatcher(smsGateway, validator);
    final SimpleMessage message = new SimpleMessage("mm", "title1", "body1");

    context.checking(new Expectations() {{

      oneOf(validator).validate(message);
      will(returnValue(false));

      never(smsGateway).send(message);
    }});

    dispatcher.send(message);
  }

  interface MessageFinder {
    List<SimpleMessage> receivedMessages();
  }

  @Mock
  MessageFinder finder;

  @Test
  public void testtt() {
    final List<SimpleMessage> messages = new ArrayList<SimpleMessage>();
    messages.add(new SimpleMessage("","",""));

    context.checking(new Expectations() {{
      allowing(finder).receivedMessages();
      will(returnValue(messages));
    }});


    System.out.println(finder.receivedMessages());
    System.out.println(finder.receivedMessages());
  }

}
