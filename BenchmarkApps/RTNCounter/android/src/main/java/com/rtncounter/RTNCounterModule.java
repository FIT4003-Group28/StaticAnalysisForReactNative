package com.RTNCounter;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Map;
import java.util.HashMap;

public class RTNCounterModule extends NativeRTNCounterSpec {

    public static String NAME = "RTNCounter";
    private int eventCount = 0;

    RTNCounterModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override
    public void createEventPromise(Promise promise) {
        promise.resolve(eventCount += 1);
    }
}