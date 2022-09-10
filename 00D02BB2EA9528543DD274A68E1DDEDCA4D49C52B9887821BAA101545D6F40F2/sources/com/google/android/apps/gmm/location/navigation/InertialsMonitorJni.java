package com.google.android.apps.gmm.location.navigation;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InertialsMonitorJni {
    public static final dcqe a = dcqe.c("com.google.android.apps.gmm.location.navigation.InertialsMonitorJni");
    public long b;
    public ahqd c;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public static native long nativeCreateInertialsMonitor(byte[] bArr, boolean z, boolean z2);

    private native void nativeDeleteInertialsMonitor(long j);

    private native byte[] nativeGetInertialState(long j);

    private static native boolean nativeInitClass();

    private native void nativeOnSnappedLocationForDebug(long j, double d, double d2);

    public final boolean a() {
        return this.b != 0;
    }

    public final void b() {
        if (!a()) {
            bvoo.h("InertialsMonitorJni called onStop() when stopped", new Object[0]);
            return;
        }
        nativeDeleteInertialsMonitor(this.b);
        this.b = 0L;
    }

    protected final void finalize() {
        if (a()) {
            bvoo.h("InertialsMonitorJni not stopped properly", new Object[0]);
            b();
        }
    }

    public native byte[] nativeOnInertialsSummary(long j, long j2, long j3, long j4, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j5);

    public native byte[] nativeOnLocation(long j, long j2, long j3, float f, float f2, float f3, float f4, float f5, float f6);

    public native void nativeOnWheelSpeed(long j, long j2, float f);
}
