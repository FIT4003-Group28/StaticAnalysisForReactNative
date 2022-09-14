package com.facebook.react.bridge;

import android.app.Activity;
/* loaded from: classes.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ah mReactApplicationContext;

    public ReactContextBaseJavaModule(ah ahVar) {
        this.mReactApplicationContext = ahVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ah getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.i();
    }
}
