package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: PG */
/* renamed from: aoin  reason: default package */
/* loaded from: classes.dex */
public class aoin extends Thread {
    public boolean f;
    public boolean g;
    protected volatile aoik i;
    public final Object h = new Object();
    protected EGLSurface j = null;
    public Handler k = null;
    protected Looper l = null;
    protected int m = 0;

    public aoin(Object obj) {
        this.i = new aoik(obj);
        setName("drishti.glutil.GlThread");
    }

    public void c() {
        this.j = this.i.d();
        aoik aoikVar = this.i;
        EGLSurface eGLSurface = this.j;
        aoikVar.a(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.m = iArr[0];
    }

    public void d() {
        int i = this.m;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.m = 0;
        }
        aoik aoikVar = this.i;
        if (aoikVar.a.eglMakeCurrent(aoikVar.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
            if (this.j == null) {
                return;
            }
            this.i.c(this.j);
            this.j = null;
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }

    public final void h(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.m);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Framebuffer not complete, status=");
            sb.append(glCheckFramebufferStatus);
            throw new RuntimeException(sb.toString());
        }
        GLES20.glViewport(0, 0, i2, i3);
        aoio.c("glViewport");
    }

    public final void i() {
        Looper looper = this.l;
        if (looper == null) {
            return;
        }
        looper.quitSafely();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Looper.prepare();
            this.k = new Handler();
            this.l = Looper.myLooper();
            String.format("Starting GL thread %s", getName());
            c();
            this.g = true;
            synchronized (this.h) {
                this.f = true;
                this.h.notify();
            }
            try {
                Looper.loop();
                this.l = null;
                d();
                this.i.b();
                String.format("Stopping GL thread %s", getName());
            } catch (Throwable th) {
                this.l = null;
                d();
                this.i.b();
                String.format("Stopping GL thread %s", getName());
                throw th;
            }
        } catch (Throwable th2) {
            synchronized (this.h) {
                this.f = true;
                this.h.notify();
                throw th2;
            }
        }
    }
}
