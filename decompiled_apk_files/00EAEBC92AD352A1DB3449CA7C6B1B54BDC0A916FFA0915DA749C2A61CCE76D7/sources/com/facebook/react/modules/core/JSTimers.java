package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
@c.d.l.a.a
/* loaded from: classes.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d2);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
