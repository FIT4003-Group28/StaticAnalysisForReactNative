package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahla  reason: default package */
/* loaded from: classes.dex */
public final class ahla implements GLSurfaceView.EGLWindowSurfaceFactory {
    private static final int[] c = {13121, 13122, 13123, 13124, 13125, 13126, 13127, 13128};
    public final int a;
    public boolean b;
    private boolean d;
    private boolean e;
    private boolean f;
    private ahkz g;
    private ahkz h;
    private String i;
    private int j = 3;
    private int k = 3;

    public ahla(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        this.d = Build.VERSION.SDK_INT >= 26 && context.getResources().getConfiguration().isScreenWideColorGamut();
        ahkz ahkzVar = new ahkz(0);
        this.h = ahkzVar;
        ahkzVar.a(12344, 12344);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int i = 500;
        if (windowManager != null && Build.VERSION.SDK_INT >= 24 && (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) != null) {
            i = Math.max((int) hdrCapabilities.getDesiredMaxLuminance(), 500);
        }
        this.a = i;
    }

    public final void a() {
        if (!this.b) {
            return;
        }
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
        if (this.e) {
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13152, this.a * 50000);
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13153, (this.a * 50000) / 3);
        }
        if (!this.f) {
            return;
        }
        EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13129, this.a * 50000);
        EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13130, 0);
        int i = 8;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, c[i2], (int) (ahou.a[i2] * 50000.0f));
            i = i2;
        }
    }

    public final void b(boolean z) {
        int i;
        this.b = z;
        if (z && this.i == null) {
            String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            this.i = eglQueryString;
            String valueOf = String.valueOf(eglQueryString);
            if (valueOf.length() != 0) {
                "Extensions:".concat(valueOf);
            }
            if (this.d) {
                if (this.i.contains("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    this.k = 1;
                    this.j = 1;
                    i = 13120;
                } else if (!this.i.contains("EGL_EXT_gl_colorspace_display_p3") || Build.VERSION.SDK_INT > 28) {
                    this.d = false;
                    this.b = false;
                    this.j = 3;
                    this.k = 3;
                    StringBuilder sb = new StringBuilder(13);
                    sb.append("BT709 ");
                    sb.append("GAMMA22");
                    zep.c("GlWindowFactory", sb.toString());
                    return;
                } else {
                    this.k = 2;
                    this.j = 3;
                    i = 13155;
                }
                ahkz ahkzVar = new ahkz(1);
                this.g = ahkzVar;
                ahkzVar.a(12445, i);
                this.g.a(12344, 12344);
                ahkz ahkzVar2 = new ahkz(1);
                this.h = ahkzVar2;
                ahkzVar2.a(12445, 12426);
                this.h.a(12344, 12344);
                this.e = this.i.contains("EGL_EXT_surface_CTA861_3_metadata");
                this.f = this.i.contains("EGL_EXT_surface_SMPTE2086_metadata");
            } else {
                this.j = 3;
                this.k = 2;
            }
            String a = aear.a(this.k);
            String a2 = aeas.a(this.j);
            StringBuilder sb2 = new StringBuilder(a.length() + 1 + a2.length());
            sb2.append(a);
            sb2.append(" ");
            sb2.append(a2);
            zep.c("GlWindowFactory", sb2.toString());
        }
    }

    public final int c() {
        if (this.b) {
            return this.k;
        }
        return 3;
    }

    public final int d() {
        if (this.b) {
            return this.j;
        }
        return 3;
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final void destroySurface(EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final javax.microedition.khronos.egl.EGLSurface createWindowSurface(EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, ((!this.b || !this.d) ? this.h : this.g).a);
    }
}
