package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DummySurface extends Surface {
    private static int a;
    private static boolean b;
    private final cmod c;
    private boolean d;

    public DummySurface(cmod cmodVar, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.c = cmodVar;
    }

    public static synchronized boolean a(Context context) {
        int i;
        String eglQueryString;
        String eglQueryString2;
        synchronized (DummySurface.class) {
            if (!b) {
                int i2 = 2;
                if (cmny.a >= 24 && ((cmny.a >= 26 || (!"samsung".equals(cmny.c) && !"XT1650".equals(cmny.d))) && ((cmny.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (cmny.a >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    a = i2;
                    b = true;
                }
                i2 = 0;
                a = i2;
                b = true;
            }
            i = a;
        }
        return i != 0;
    }

    public static DummySurface b(Context context, boolean z) {
        boolean z2 = false;
        cmmn.c(!z || a(context));
        cmod cmodVar = new cmod();
        int i = z ? a : 0;
        cmodVar.start();
        cmodVar.b = new Handler(cmodVar.getLooper(), cmodVar);
        cmodVar.a = new cmmv(cmodVar.b);
        synchronized (cmodVar) {
            cmodVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (cmodVar.e == null && cmodVar.d == null && cmodVar.c == null) {
                try {
                    cmodVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = cmodVar.d;
        if (runtimeException == null) {
            Error error = cmodVar.c;
            if (error == null) {
                DummySurface dummySurface = cmodVar.e;
                cmmn.f(dummySurface);
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            if (!this.d) {
                cmod cmodVar = this.c;
                cmmn.f(cmodVar.b);
                cmodVar.b.sendEmptyMessage(2);
                this.d = true;
            }
        }
    }
}
