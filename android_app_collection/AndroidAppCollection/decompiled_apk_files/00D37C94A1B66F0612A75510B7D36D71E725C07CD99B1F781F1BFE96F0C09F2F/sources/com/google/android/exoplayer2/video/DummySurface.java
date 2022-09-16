package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DummySurface extends Surface {
    private static int b;
    private static boolean c;
    public final boolean a;
    private final pxk d;
    private boolean e;

    public DummySurface(pxk pxkVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = pxkVar;
        this.a = z;
    }

    public static DummySurface a(Context context, boolean z) {
        boolean z2 = false;
        ptx.e(!z || b(context));
        pxk pxkVar = new pxk();
        int i = z ? b : 0;
        pxkVar.start();
        pxkVar.b = new Handler(pxkVar.getLooper(), pxkVar);
        pxkVar.a = new pvx(pxkVar.b);
        synchronized (pxkVar) {
            pxkVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (pxkVar.e == null && pxkVar.d == null && pxkVar.c == null) {
                try {
                    pxkVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = pxkVar.d;
        if (runtimeException == null) {
            Error error = pxkVar.c;
            if (error == null) {
                DummySurface dummySurface = pxkVar.e;
                ptx.a(dummySurface);
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public static synchronized boolean b(Context context) {
        int i;
        String eglQueryString;
        synchronized (DummySurface.class) {
            if (!c) {
                int i2 = 2;
                if (pxi.a >= 24 && ((pxi.a >= 26 || (!"samsung".equals(pxi.c) && !"XT1650".equals(pxi.d))) && ((pxi.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    b = i2;
                    c = true;
                }
                i2 = 0;
                b = i2;
                c = true;
            }
            i = b;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                pxk pxkVar = this.d;
                ptx.a(pxkVar.b);
                pxkVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
