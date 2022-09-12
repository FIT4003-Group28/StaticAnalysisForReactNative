package defpackage;

import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: PG */
/* renamed from: bnsx  reason: default package */
/* loaded from: classes.dex */
public final class bnsx implements bnsv {
    public static final dcqe a = dcqe.c("bnsx");
    private boolean A;
    @dzsi
    private Thread B;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    @dzsi
    public bnsu n;
    public boolean o;
    public boolean r;
    @dzsi
    public EGL10 s;
    @dzsi
    public EGLDisplay t;
    @dzsi
    public EGLConfig u;
    @dzsi
    public EGLContext v;
    @dzsi
    public EGLSurface w;
    @dzsi
    public Object x;
    public final bnst y;
    private boolean z;
    public final ArrayList<Runnable> p = new ArrayList<>();
    public boolean q = true;
    public int k = 0;
    public int l = 0;
    public boolean m = true;

    public bnsx(bnst bnstVar) {
        this.y = bnstVar;
    }

    @Override // defpackage.bnsv
    public final synchronized void a() {
        if (!this.z) {
            bnsw bnswVar = new bnsw(this);
            this.B = bnswVar;
            this.z = true;
            bnswVar.start();
        }
        this.c = false;
        this.m = true;
        this.o = false;
        notifyAll();
        while (this.z && !this.A && this.d && !this.o) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.bnsv
    public final synchronized void b() {
        this.c = true;
        notifyAll();
        while (this.z && !this.A && !this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.bnsv
    public final synchronized void c() {
        if (!d()) {
            if (!this.z) {
                return;
            }
            this.b = true;
            notifyAll();
            while (this.z && !this.A) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.B = null;
        }
    }

    @Override // defpackage.bnsv
    public final synchronized boolean d() {
        return this.A;
    }

    @Override // defpackage.bnsv
    public final synchronized void e(Object obj) {
        this.x = obj;
        this.e = true;
        this.j = false;
        notifyAll();
        while (this.z && this.g && !this.j && !this.A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.bnsv
    public final synchronized void f(int i, int i2) {
        this.k = i;
        this.l = i2;
        this.q = true;
        this.m = true;
        this.o = false;
        notifyAll();
        while (this.z && !this.A && !this.d && !this.o && this.h && this.i && n()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.bnsv
    public final synchronized void g() {
        this.x = null;
        this.e = false;
        notifyAll();
        while (this.z && !this.g && !this.A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.bnsv
    public final synchronized void h() {
        this.m = true;
        notifyAll();
    }

    @Override // defpackage.bnsv
    public final synchronized void i(@dzsi bnsu bnsuVar) {
        this.n = bnsuVar;
    }

    @Override // defpackage.bnsv
    public final synchronized void j() {
        this.r = true;
        h();
    }

    @Override // defpackage.bnsv
    public final synchronized void k(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("r must not be null");
        }
        this.p.add(runnable);
        notifyAll();
    }

    public final void l() {
        if (this.i) {
            this.i = false;
            p();
        }
    }

    public final void m() {
        EGLDisplay eGLDisplay;
        EGLContext eGLContext;
        if (this.h) {
            EGL10 egl10 = this.s;
            if (egl10 != null && (eGLDisplay = this.t) != null && (eGLContext = this.v) != null) {
                if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    this.v = null;
                    this.s.eglTerminate(this.t);
                    this.t = null;
                } else {
                    int eglGetError = this.s.eglGetError();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("eglDestroyContext failed: ");
                    sb.append(eglGetError);
                    throw new RuntimeException(sb.toString());
                }
            }
            this.h = false;
        }
    }

    public final synchronized boolean n() {
        return this.n != null ? !this.d && this.e && !this.f && this.k > 0 && this.l > 0 : !this.d && this.e && !this.f && this.k > 0 && this.l > 0 && this.m;
    }

    public final EGLConfig o(int i, int i2, int i3) {
        EGL10 egl10 = this.s;
        dbsk.s(egl10);
        int[] iArr = {12324, i, 12323, i2, 12322, i3, 12321, 0, 12325, 16, 12326, 8, 12352, 4, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGLDisplay eGLDisplay = this.t;
        dbsk.s(eGLDisplay);
        egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, new int[1]);
        return eGLConfigArr[0];
    }

    public final void p() {
        EGLSurface eGLSurface;
        if (this.s == null || this.t == null || (eGLSurface = this.w) == null || eGLSurface == EGL11.EGL_NO_SURFACE) {
            return;
        }
        this.s.eglMakeCurrent(this.t, EGL11.EGL_NO_SURFACE, EGL11.EGL_NO_SURFACE, EGL11.EGL_NO_CONTEXT);
        EGL10 egl10 = this.s;
        EGLDisplay eGLDisplay = this.t;
        EGLSurface eGLSurface2 = this.w;
        dbsk.s(eGLSurface2);
        egl10.eglDestroySurface(eGLDisplay, eGLSurface2);
        this.w = null;
    }
}
