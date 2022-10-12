package com.oldarchitecturecounter;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class JavaEventModule extends ReactContextBaseJavaModule {

    private String eventString = "Java Sourced String";

    JavaEventModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "JavaEventModule";
    }

    @ReactMethod
    public void createEventPromiseFromJava(Promise promise) {
        try{
            promise.resolve("Data returned from promise");
            sendEvent(getReactApplicationContext(), "EventStringFromJava", eventString + " requested from Java");
        } catch (Exception e){
        promise.reject("Error returned from promise", e);
        }
    }

    @ReactMethod
    public void createEventPromiseFromJs(Promise promise) {
        try{
            promise.resolve("Data returned from promise");
            sendEvent(getReactApplicationContext(), "EventStringFromJs", eventString + " requested from Javascript");
        } catch (Exception e){
        promise.reject("Error returned from promise", e);
        }
    }

    private void sendEvent(ReactContext reactContext,
                           String eventName,
                           String params) {
        reactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }
}
