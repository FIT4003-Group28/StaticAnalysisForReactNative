package com.facebook.react.bridge;

import c.d.l.a.a;
@a
/* loaded from: classes.dex */
interface ReactCallback {
    @a
    void decrementPendingJSCalls();

    @a
    void incrementPendingJSCalls();

    @a
    void onBatchComplete();
}
