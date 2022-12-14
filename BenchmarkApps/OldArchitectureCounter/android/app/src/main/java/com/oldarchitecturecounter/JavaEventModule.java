package com.oldarchitecturecounter;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class JavaEventModule extends ReactContextBaseJavaModule {

    private int eventCount = 0;

    JavaEventModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "JavaEventModule";
    }

    @ReactMethod
    public void createEventPromise(Promise promise) {
    try{
        promise.resolve("Data returned from promise");
        eventCount += 1;
        sendEvent(getReactApplicationContext(), "EventCount", eventCount);
    } catch (Exception e){
    promise.reject("Error returned from promise", e);
    }
    }

    private void sendEvent(ReactContext reactContext,
                           String eventName,
                           int params) {
        reactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }
}
