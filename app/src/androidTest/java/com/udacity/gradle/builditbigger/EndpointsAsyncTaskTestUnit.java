
package com.udacity.gradle.builditbigger;
/**
 * Created by Theodosios Tziomakas as part of Udacity Nanodegree's project 'Build it bigger' on 15-April-17.
 */
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import static com.udacity.gradle.builditbigger.EndpointsAsyncTask.myApiService;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTestUnit {
    String TAG = EndpointsAsyncTask.class.getSimpleName();
   /* @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);*/

   /*
    @Test
    public void verifyEndpointsResponse() {

        try {
            String joke = myApiService.getRandomJokeService().execute().getData();
            //comment
            Log.d(TAG,"joke = "+joke);
            assertNotNull (joke);
            //assert(!(joke.equals("fun and fun equal fun!!")));
            Assert.assertTrue(!joke.equals(""));
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
    */
   @Test
   public void iTest() throws Exception {

       EndpointsAsyncTaskTest aTest =  new EndpointsAsyncTaskTest();
       aTest.execute(InstrumentationRegistry.getContext());
       String joke = aTest.get(5, TimeUnit.SECONDS);
       Assert.assertTrue(!joke.equals(""));
   }
}

