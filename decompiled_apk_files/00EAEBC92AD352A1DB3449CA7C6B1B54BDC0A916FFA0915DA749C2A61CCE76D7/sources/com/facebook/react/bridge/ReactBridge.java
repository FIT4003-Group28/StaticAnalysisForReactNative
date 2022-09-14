package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.a;
/* loaded from: classes.dex */
public class ReactBridge {
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (sDidInit) {
                return;
            }
            sLoadStartTime = SystemClock.uptimeMillis();
            a.a(0L, "ReactBridge.staticInit::load:reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.a("reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            a.a(0L);
            sLoadEndTime = SystemClock.uptimeMillis();
            sDidInit = true;
        }
    }
}
