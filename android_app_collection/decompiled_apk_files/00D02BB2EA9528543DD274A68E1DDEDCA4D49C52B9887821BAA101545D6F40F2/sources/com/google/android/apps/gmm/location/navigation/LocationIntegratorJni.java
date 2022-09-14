package com.google.android.apps.gmm.location.navigation;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationIntegratorJni implements ahqb {
    public static final dcqe b = dcqe.c("com.google.android.apps.gmm.location.navigation.LocationIntegratorJni");
    public long c;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b() {
        nativeSetRuntimeFlavor(4, false, false);
    }

    private native void nativeAddAltitudeObservation(long j, long j2, double d, double d2);

    private native void nativeAddAtmosphericPressureObservation(long j, long j2, double d);

    private native void nativeAddBeaconObservation(long j, long j2, long j3, long j4, double d, double d2);

    private native void nativeAddExpectedLocationObservation(long j, long j2, int i, int i2);

    private native void nativeAddGaussianHeadingObservation(long j, long j2, double d, double d2);

    private native void nativeAddGaussianRateOfTurnObservation(long j, long j2, double d, double d2);

    private native void nativeAddGaussianSpeedAndBearingObservation(long j, long j2, double d, double d2, double d3, double d4);

    private native void nativeAddGpsSignalObservation(long j, long j2, boolean z);

    private native void nativeAddLaneBoundaryObservation(long j, long j2, float[] fArr, float[] fArr2, float f, float f2, float f3);

    private native void nativeAddPositionObservation(long j, long j2, int i, int i2, double d, double d2);

    private native void nativeAddSpeedObservation(long j, long j2, double d, double d2);

    public static native long nativeCreateRouteLocationIntegrator(byte[] bArr, boolean z, float f);

    public static native long nativeCreateSnaptileLocationIntegrator(long j, byte[] bArr, boolean z, String str, String str2, float f, boolean z2, boolean z3, boolean z4, long j2, byte[] bArr2);

    private native void nativeDeleteLocationIntegrator(long j);

    public static native void nativeDeleteLocationIntegratorResult(long j);

    private static native boolean nativeInitClass();

    private native void nativeReplaceRoutesFromProto(long j, byte[] bArr);

    private static native void nativeSetRuntimeFlavor(int i, boolean z, boolean z2);

    public final void c() {
        long j = this.c;
        if (j != 0) {
            nativeDeleteLocationIntegrator(j);
            this.c = 0L;
        }
    }

    public final boolean d() {
        return this.c != 0;
    }

    public final long e() {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
            return 0L;
        }
        return this.c;
    }

    @Override // defpackage.ahqb
    public final void f(long j, akra akraVar, double d, double d2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddPositionObservation(this.c, j, akraVar.a, akraVar.b, d, d2);
        }
    }

    protected final void finalize() {
        if (d()) {
            bvoo.h("LocationIntegrator not closed correctly.", new Object[0]);
        }
        c();
    }

    @Override // defpackage.ahqb
    public final void g(long j, double d, double d2, double d3, double d4) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddGaussianSpeedAndBearingObservation(this.c, j, d, d2, d3, d4);
        }
    }

    @Override // defpackage.ahqb
    public final void h(long j, boolean z) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddGpsSignalObservation(this.c, j, z);
        }
    }

    @Override // defpackage.ahqb
    public final void i(long j, double d, double d2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddGaussianHeadingObservation(this.c, j, d, d2);
        }
    }

    @Override // defpackage.ahqb
    public final void j(long j, double d, double d2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddGaussianRateOfTurnObservation(this.c, j, d, d2);
        }
    }

    @Override // defpackage.ahqb
    public final void k(long j, double d, double d2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddSpeedObservation(this.c, j, d, d2);
        }
    }

    @Override // defpackage.ahqb
    public final void l(long j, long j2, long j3, double d, double d2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddBeaconObservation(this.c, j, j2, j3, d, d2);
        }
    }

    @Override // defpackage.ahqb
    public final void m(long j, double d) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddAtmosphericPressureObservation(this.c, j, d);
        }
    }

    public final void n(byte[] bArr) {
        if (!d()) {
            return;
        }
        nativeReplaceRoutesFromProto(this.c, bArr);
    }

    public native void nativeDidReroute(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public native void nativeEnableAcausalResolver(long j, boolean z);

    public native byte[] nativeGetRouteLocationAsProto(long j, long j2, boolean z);

    public native byte[] nativeGetSnaptileLocationAsProto(long j, long j2, int i, boolean z);

    public native void nativeSetInternalStateForReplay(long j, byte[] bArr);

    protected native void nativeSetPreferredOnlineSnaptileVersions(long j, int[] iArr);

    public native void nativeUpdateOfflineDiskCachePtr(long j, long j2);

    public native void nativeUpdateSnaptilePrefetchingVersion(long j, int i);

    @Override // defpackage.ahqb
    public final void o(long j, float[] fArr, float[] fArr2) {
        if (!d()) {
            bvoo.h("LocationIntegratorJni called after jni closed.", new Object[0]);
        } else {
            nativeAddLaneBoundaryObservation(this.c, j, fArr, fArr2, 0.25f, 0.0f, 1.0E-6f);
        }
    }
}
