package support;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

import static Runner.MyTestRunner.step;

public class HardAssertion extends Assertion {
    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        step.pass(assertCommand.getExpected().toString());
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        String details="Actual:"+assertCommand.getActual()+" ; Expected:"+assertCommand.getExpected();
        try {
            step.fail(details, MediaEntityBuilder.createScreenCaptureFromPath(Events.getScreenshot()).build());
        } catch (Exception ioex) {
            System.out.println("problem with file:"+ioex);
        }
    }
}
