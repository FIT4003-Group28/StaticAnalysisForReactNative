package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;
/* loaded from: classes.dex */
public interface c {
    void callIdleCallbacks(double d2);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
