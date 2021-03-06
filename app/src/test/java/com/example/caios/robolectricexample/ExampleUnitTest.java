package com.example.caios.robolectricexample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ExampleUnitTest {
    private MainActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = Robolectric.buildActivity( MainActivity.class )
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveWelcomeFragment() throws Exception {
        assertNotNull(activity.getFragmentManager().findFragmentById(R.id.fab));
    }
}