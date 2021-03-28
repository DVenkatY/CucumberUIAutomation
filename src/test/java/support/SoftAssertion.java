package support;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static Runner.MyTestRunner.step;

public class SoftAssertion extends SoftAssert {
    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        step.pass(assertCommand.getExpected().toString());
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        String str="Expected: "+assertCommand.getExpected().toString()+"<br/>Actual: "+assertCommand.getActual().toString();
        try {
            step.fail(str, MediaEntityBuilder.createScreenCaptureFromPath(Events.getScreenshot()).build());
        } catch (IOException ioex) {
            System.out.println("problem with file:"+ioex);
        }
    }
}
