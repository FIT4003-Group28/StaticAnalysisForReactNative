package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExplorationManagerJniImpl implements dffd {
    static {
        dffa.a();
    }

    public static native long nativeAddExplorationStateObserver(long j, NativeObserver nativeObserver);

    public static native void nativeRemoveExplorationStateObserver(long j);
}
