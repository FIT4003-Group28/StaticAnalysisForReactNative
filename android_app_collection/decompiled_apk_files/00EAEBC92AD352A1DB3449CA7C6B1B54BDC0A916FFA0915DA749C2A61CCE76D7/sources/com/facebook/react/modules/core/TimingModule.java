package com.facebook.react.modules.core;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
@com.facebook.react.d0.a.a(name = TimingModule.NAME)
/* loaded from: classes.dex */
public final class TimingModule extends ReactContextBaseJavaModule implements LifecycleEventListener, com.facebook.react.c0.c {
    public static final String NAME = "Timing";
    private final d mJavaTimerManager;

    /* loaded from: classes.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.facebook.react.modules.core.c
        public void callIdleCallbacks(double d2) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d2);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void callTimers(WritableArray writableArray) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void emitTimeDriftWarning(String str) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
            }
        }
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, com.facebook.react.devsupport.h.c cVar) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new d(reactApplicationContext, new a(), g.a(), cVar);
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d2, boolean z) {
        this.mJavaTimerManager.a(i, i2, d2, z);
    }

    @ReactMethod
    public void deleteTimer(int i) {
        this.mJavaTimerManager.a(i);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        com.facebook.react.c0.b.a(getReactApplicationContext()).a(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        com.facebook.react.c0.b.a(getReactApplicationContext()).b(this);
        this.mJavaTimerManager.d();
    }

    @Override // com.facebook.react.c0.c
    public void onHeadlessJsTaskFinish(int i) {
        this.mJavaTimerManager.b(i);
    }

    @Override // com.facebook.react.c0.c
    public void onHeadlessJsTaskStart(int i) {
        this.mJavaTimerManager.c(i);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mJavaTimerManager.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mJavaTimerManager.b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mJavaTimerManager.c();
    }

    @ReactMethod
    public void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.a(z);
    }
}
