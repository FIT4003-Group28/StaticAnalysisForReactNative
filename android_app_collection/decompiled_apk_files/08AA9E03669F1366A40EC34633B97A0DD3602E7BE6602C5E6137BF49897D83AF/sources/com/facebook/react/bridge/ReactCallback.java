package com.facebook.react.bridge;
@com.facebook.k.a.a
/* loaded from: classes.dex */
interface ReactCallback {
    @com.facebook.k.a.a
    void decrementPendingJSCalls();

    @com.facebook.k.a.a
    void incrementPendingJSCalls();

    @com.facebook.k.a.a
    void onBatchComplete();
}
