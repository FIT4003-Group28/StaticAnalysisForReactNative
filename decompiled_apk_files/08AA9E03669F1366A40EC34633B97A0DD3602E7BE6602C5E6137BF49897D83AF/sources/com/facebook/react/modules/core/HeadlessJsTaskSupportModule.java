package com.facebook.react.modules.core;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    protected static final String MODULE_NAME = "HeadlessJsTaskSupport";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public HeadlessJsTaskSupportModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void notifyTaskFinished(int i) {
        com.facebook.react.c.a a2 = com.facebook.react.c.a.a(getReactApplicationContext());
        if (a2.b(i)) {
            a2.a(i);
        } else {
            com.facebook.common.e.a.b((Class<?>) HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }
}
