package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;
/* compiled from: PG */
/* renamed from: vqv  reason: default package */
/* loaded from: classes4.dex */
public final class vqv {
    public final Surface a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;

    public vqv(EGLContext eGLContext, Surface surface) {
        this.a = surface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.b = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (!EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                throw new RuntimeException("Choose config failed.");
            }
            b("Failed to choose config.");
            if (iArr2[0] <= 0) {
                throw new RuntimeException("No configs found.");
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
            b("Failed to create context.");
            this.c = eglCreateContext;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.b, eGLConfig, surface, new int[]{12344}, 0);
            b("Failed to create window surface.");
            this.d = eglCreateWindowSurface;
            return;
        }
        throw new RuntimeException("unable to initialize EGL14");
    }

    private static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": EGL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public final void a() {
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.c);
    }
}
