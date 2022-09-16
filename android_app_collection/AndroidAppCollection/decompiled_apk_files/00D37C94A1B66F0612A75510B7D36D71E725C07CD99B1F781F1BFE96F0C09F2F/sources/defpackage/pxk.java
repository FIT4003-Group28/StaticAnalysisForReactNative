package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.cardboard.sdk.EglFactory;
/* compiled from: PG */
/* renamed from: pxk  reason: default package */
/* loaded from: classes4.dex */
public final class pxk extends HandlerThread implements Handler.Callback {
    public pvx a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public DummySurface e;

    public pxk() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        pvx pvxVar;
        EGLDisplay eglGetDisplay;
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        int i2 = message.what;
        boolean z = false;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    ptx.a(this.a);
                    pvx pvxVar2 = this.a;
                    pvxVar2.b.removeCallbacks(pvxVar2);
                    SurfaceTexture surfaceTexture = pvxVar2.g;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, pvxVar2.c, 0);
                    }
                    EGLDisplay eGLDisplay = pvxVar2.d;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglMakeCurrent(pvxVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface = pvxVar2.f;
                    if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(pvxVar2.d, pvxVar2.f);
                    }
                    EGLContext eGLContext = pvxVar2.e;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(pvxVar2.d, eGLContext);
                    }
                    int i3 = pxi.a;
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay2 = pvxVar2.d;
                    if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(pvxVar2.d);
                    }
                    pvxVar2.d = null;
                    pvxVar2.e = null;
                    pvxVar2.f = null;
                    pvxVar2.g = null;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                i = message.arg1;
                ptx.a(this.a);
                pvxVar = this.a;
                eglGetDisplay = EGL14.eglGetDisplay(0);
            } catch (Error e) {
                pns.e("DummySurface", "Failed to initialize dummy surface", e);
                this.c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                pns.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.d = e2;
                synchronized (this) {
                    notify();
                }
            }
            if (eglGetDisplay == null) {
                throw new pvw("eglGetDisplay failed");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new pvw("eglInitialize failed");
            }
            pvxVar.d = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(pvxVar.d, pvx.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                throw new pvw(pxi.z("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(pvxVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344} : new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new pvw("eglCreateContext failed");
            }
            pvxVar.e = eglCreateContext;
            EGLDisplay eGLDisplay3 = pvxVar.d;
            EGLContext eGLContext2 = pvxVar.e;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay3, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eglCreatePbufferSurface == null) {
                    throw new pvw("eglCreatePbufferSurface failed");
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay3, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext2)) {
                throw new pvw("eglMakeCurrent failed");
            }
            pvxVar.f = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, pvxVar.c, 0);
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            }
            pvxVar.g = new SurfaceTexture(pvxVar.c[0]);
            pvxVar.g.setOnFrameAvailableListener(pvxVar);
            SurfaceTexture surfaceTexture2 = this.a.g;
            ptx.a(surfaceTexture2);
            if (i != 0) {
                z = true;
            }
            this.e = new DummySurface(this, surfaceTexture2, z);
            synchronized (this) {
                notify();
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
