package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import c.d.l.a.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.b;
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class EventEmitterWrapper {
    @a
    private final HybridData mHybridData = initHybrid();

    static {
        b.a();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);

    public void a(String str, WritableMap writableMap) {
        invokeEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap);
    }
}
