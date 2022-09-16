package defpackage;

import android.opengl.GLSurfaceView;
import com.google.cardboard.sdk.EglFactory;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: PG */
/* renamed from: sjg  reason: default package */
/* loaded from: classes4.dex */
final class sjg implements GLSurfaceView.EGLContextFactory {
    final /* synthetic */ aoik a;

    public sjg(aoik aoikVar) {
        this.a = aoikVar;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        aoik aoikVar = this.a;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, aoikVar.c, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, aoikVar.d, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        throw new RuntimeException("eglDestroyContext failed");
    }
}
