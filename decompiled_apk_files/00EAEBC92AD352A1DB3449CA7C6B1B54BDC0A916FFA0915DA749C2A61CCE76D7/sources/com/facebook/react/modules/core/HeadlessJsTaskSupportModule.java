package com.facebook.react.modules.core;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
@com.facebook.react.d0.a.a(name = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        com.facebook.react.c0.b a2 = com.facebook.react.c0.b.a(getReactApplicationContext());
        if (a2.b(i)) {
            a2.a(i);
        } else {
            c.d.d.e.a.c(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }

    @ReactMethod
    public void notifyTaskRetry(int i, Promise promise) {
        boolean z;
        com.facebook.react.c0.b a2 = com.facebook.react.c0.b.a(getReactApplicationContext());
        if (a2.b(i)) {
            z = Boolean.valueOf(a2.c(i));
        } else {
            c.d.d.e.a.c(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
            z = false;
        }
        promise.resolve(z);
    }
}
