package com.google.android.apps.gmm.offline.instance;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes.dex */
public class OfflineInstanceNativeImpl implements avsb {
    private static final dcqe a = dcqe.c("com.google.android.apps.gmm.offline.instance.OfflineInstanceNativeImpl");
    private final avop b;
    private final avpo c;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public OfflineInstanceNativeImpl(avop avopVar, avpo avpoVar) {
        this.b = avopVar;
        this.c = avpoVar;
    }

    private final void k(String str, Exception exc) {
        if (exc instanceof anam) {
            this.b.c(((anam) exc).b);
        } else {
            this.b.b();
        }
        bvoo.h("Unexpected exception from the native instance in %s: %s", str, exc);
        this.c.b(Boolean.TRUE);
    }

    private native boolean nativeClearUnusedInstanceFromDatabase(byte[] bArr, String str, String str2);

    private native void nativeDestroyInstance(long j);

    private native long nativeGetInfrastructureController(long j);

    private native long nativeGetPaintClient(long j);

    private native long nativeGetRoutingController(long j);

    private native long nativeGetSearchController(long j);

    private static native boolean nativeInitClass();

    private native long nativeInitInstance(byte[] bArr);

    private native void nativePerformExpensiveInitialization(long j);

    private native void nativeSetNavigationParameters(long j, byte[] bArr);

    private native void nativeSetOfflineParameters(long j, byte[] bArr);

    @Override // defpackage.avsb
    public final long a(byte[] bArr) {
        try {
            return nativeInitInstance(bArr);
        } catch (RuntimeException e) {
            k("OfflineInstance constructor", e);
            return 0L;
        }
    }

    @Override // defpackage.avsb
    public final void b(long j) {
        try {
            nativeDestroyInstance(j);
        } catch (RuntimeException e) {
            k("OfflineInstance destructor", e);
        }
    }

    @Override // defpackage.avsb
    public final boolean c(byte[] bArr, String str, String str2) {
        try {
            return nativeClearUnusedInstanceFromDatabase(bArr, str, str2);
        } catch (RuntimeException e) {
            k("clearUnusedInstanceFromDatabase", e);
            return false;
        }
    }

    @Override // defpackage.avsb
    public final void d(long j, byte[] bArr) {
        if (j == 0) {
            return;
        }
        try {
            nativeSetOfflineParameters(j, bArr);
        } catch (RuntimeException e) {
            k("setOfflineParameters", e);
        }
    }

    @Override // defpackage.avsb
    public final void e(long j, byte[] bArr) {
        if (j == 0) {
            return;
        }
        try {
            nativeSetNavigationParameters(j, bArr);
        } catch (RuntimeException e) {
            k("setNavigationParameters", e);
        }
    }

    @Override // defpackage.avsb
    public final void f(long j) {
        if (j == 0) {
            return;
        }
        try {
            nativePerformExpensiveInitialization(j);
        } catch (RuntimeException e) {
            k("performExpensiveInitialization", e);
        }
    }

    @Override // defpackage.avsb
    public final long g(long j) {
        if (j == 0) {
            return 0L;
        }
        try {
            return nativeGetInfrastructureController(j);
        } catch (RuntimeException e) {
            k("getInfrastructureController", e);
            return 0L;
        }
    }

    @Override // defpackage.avsb
    public final long h(long j) {
        if (j == 0) {
            return 0L;
        }
        try {
            return nativeGetPaintClient(j);
        } catch (RuntimeException e) {
            k("getPaintClient", e);
            return 0L;
        }
    }

    @Override // defpackage.avsb
    public final long i(long j) {
        if (j == 0) {
            return 0L;
        }
        try {
            return nativeGetRoutingController(j);
        } catch (RuntimeException e) {
            k("getRoutingController", e);
            return 0L;
        }
    }

    @Override // defpackage.avsb
    public final long j(long j) {
        if (j == 0) {
            return 0L;
        }
        try {
            return nativeGetSearchController(j);
        } catch (RuntimeException e) {
            k("getSearchController", e);
            return 0L;
        }
    }
}
