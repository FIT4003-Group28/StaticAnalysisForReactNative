package com.facebook.react.bridge;

import android.app.Activity;
import c.d.k.a.a;
/* loaded from: classes.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule() {
        this.mReactApplicationContext = null;
    }

    public ReactContextBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContext() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        a.a(reactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveCatalystInstance()) {
            return this.mReactApplicationContext;
        }
        ReactSoftException.logSoftException("ReactContextBaseJavaModule", new RuntimeException("Catalyst Instance has already disappeared: requested by " + getName()));
        return null;
    }
}
