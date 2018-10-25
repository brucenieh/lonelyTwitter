package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    public LonelyTwitterActivityTest(){
        super(LonelyTwitterActivity.class);
    }

    private Solo solo;

    @Override
    public void setUp(){
        solo = new Solo(getInstrumentation(),getActivity());
    }
    @Override
    public void tearDown(){
        solo.finishOpenedActivities();
    }

    public void testTweet(){
        solo.assertCurrentActivity("wrong activity", "LonelyTwitterActivity");
    }

    public void testEqual(){
        assertEquals("not equal","5","6");
    }


}
