package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: absz  reason: default package */
/* loaded from: classes.dex */
public final class absz {
    public EGLContext a;
    private absa b;
    private Surface c;
    private boolean d;

    private final void i() {
        absa absaVar = this.b;
        if (absaVar != null) {
            absaVar.b();
            this.b = null;
        }
    }

    public final synchronized int a() {
        absa absaVar = this.b;
        if (absaVar == null) {
            return 0;
        }
        EGLSurface eGLSurface = absaVar.a;
        if (eGLSurface == null) {
            return 0;
        }
        return absaVar.b.a(eGLSurface, 12374);
    }

    public final synchronized int b() {
        absa absaVar = this.b;
        if (absaVar == null) {
            return 0;
        }
        EGLSurface eGLSurface = absaVar.a;
        if (eGLSurface == null) {
            return 0;
        }
        return absaVar.b.a(eGLSurface, 12375);
    }

    public final synchronized absa c() {
        return this.b;
    }

    public final synchronized void d(long j) {
        absa absaVar = this.b;
        if (absaVar == null || absaVar.c == null) {
            return;
        }
        abry abryVar = absaVar.b;
        EGLExt.eglPresentationTimeANDROID(abryVar.a, absaVar.a, j);
        absaVar.b.g(absaVar.a);
    }

    public final synchronized void e() {
        i();
        this.c = null;
        this.a = null;
    }

    public final synchronized void f(boolean z) {
        this.d = z;
    }

    public final synchronized void g(Surface surface) {
        if (this.c != surface) {
            i();
            if (surface != null) {
                this.b = new absa(surface);
            }
            this.c = surface;
        }
    }

    public final synchronized boolean h() {
        boolean z;
        Surface surface;
        absa absaVar = this.b;
        if (absaVar != null && (surface = absaVar.c) != null && surface.isValid()) {
            if (this.d) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
