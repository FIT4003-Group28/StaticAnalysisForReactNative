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
import com.google.android.exoplayer2.video.DummySurface;
/* compiled from: PG */
/* renamed from: cmod  reason: default package */
/* loaded from: classes5.dex */
public final class cmod extends HandlerThread implements Handler.Callback {
    public cmmv a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public DummySurface e;

    public cmod() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        cmmv cmmvVar;
        EGLDisplay eglGetDisplay;
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    cmmn.f(this.a);
                    cmmv cmmvVar2 = this.a;
                    cmmvVar2.b.removeCallbacks(cmmvVar2);
                    SurfaceTexture surfaceTexture = cmmvVar2.g;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, cmmvVar2.c, 0);
                    }
                    EGLDisplay eGLDisplay = cmmvVar2.d;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglMakeCurrent(cmmvVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface = cmmvVar2.f;
                    if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(cmmvVar2.d, cmmvVar2.f);
                    }
                    EGLContext eGLContext = cmmvVar2.e;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(cmmvVar2.d, eGLContext);
                    }
                    if (cmny.a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay2 = cmmvVar2.d;
                    if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(cmmvVar2.d);
                    }
                    cmmvVar2.d = null;
                    cmmvVar2.e = null;
                    cmmvVar2.f = null;
                    cmmvVar2.g = null;
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
                cmmn.f(this.a);
                cmmvVar = this.a;
                eglGetDisplay = EGL14.eglGetDisplay(0);
            } catch (Error e) {
                cmna.a("Failed to initialize dummy surface", e);
                this.c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                cmna.a("Failed to initialize dummy surface", e2);
                this.d = e2;
                synchronized (this) {
                    notify();
                }
            }
            if (eglGetDisplay == null) {
                throw new cmmu("eglGetDisplay failed");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new cmmu("eglInitialize failed");
            }
            cmmvVar.d = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(cmmvVar.d, cmmv.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                throw new cmmu(cmny.z("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(cmmvVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new cmmu("eglCreateContext failed");
            }
            cmmvVar.e = eglCreateContext;
            EGLDisplay eGLDisplay3 = cmmvVar.d;
            EGLContext eGLContext2 = cmmvVar.e;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay3, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eglCreatePbufferSurface == null) {
                    throw new cmmu("eglCreatePbufferSurface failed");
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay3, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext2)) {
                throw new cmmu("eglMakeCurrent failed");
            }
            cmmvVar.f = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, cmmvVar.c, 0);
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                } else if (String.valueOf(GLU.gluErrorString(glGetError)).length() == 0) {
                    new String("glError ");
                }
            }
            cmmvVar.g = new SurfaceTexture(cmmvVar.c[0]);
            cmmvVar.g.setOnFrameAvailableListener(cmmvVar);
            SurfaceTexture surfaceTexture2 = this.a.g;
            cmmn.f(surfaceTexture2);
            this.e = new DummySurface(this, surfaceTexture2);
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
