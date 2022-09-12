package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfkm  reason: default package */
/* loaded from: classes6.dex */
public final class dfkm {
    public final Executor a;
    public final Runnable b;
    public final Object c;
    public dfek d;
    private final Handler e;
    private final dfkl f;
    private final dfki g;
    @dzsi
    private dfjp h;

    public dfkm(Handler handler) {
        dfki dfkiVar = new dfki(handler);
        this.c = new Object();
        this.d = dfek.NONE;
        this.e = handler;
        this.g = dfkiVar;
        this.f = new dfkl(this);
        this.a = new Executor(this) { // from class: dfkj
            private final dfkm a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.c(runnable);
            }
        };
        this.b = new Runnable(this) { // from class: dfkk
            private final dfkm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        };
    }

    public final boolean a() {
        return Looper.myLooper() == this.g.a.getLooper();
    }

    public final void b() {
        dfjp dfjpVar;
        dfej.a(this);
        synchronized (this.c) {
            dfjpVar = this.h;
        }
        if (dfjpVar == null) {
            return;
        }
        dfjpVar.a();
        d();
    }

    public final void c(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    public final void d() {
        dfek dfekVar;
        boolean z;
        dfej.a(this);
        this.e.removeCallbacks(this.b);
        synchronized (this.c) {
            dfekVar = this.d;
            z = false;
            if (dfekVar != dfek.NONE && this.h != null) {
                z = true;
            }
        }
        Choreographer.getInstance().removeFrameCallback(this.f);
        this.e.removeCallbacks(this.f);
        if (z) {
            if (dfekVar == dfek.VSYNC) {
                Choreographer.getInstance().postFrameCallback(this.f);
            } else if (dfekVar == dfek.FOREGROUND) {
                this.e.postDelayed(this.f, 30L);
            } else if (dfekVar != dfek.BACKGROUND) {
            } else {
                this.e.postDelayed(this.f, 500L);
            }
        }
    }

    public final void e(@dzsi dfjp dfjpVar) {
        synchronized (this.c) {
            if (this.h == dfjpVar) {
                return;
            }
            this.h = dfjpVar;
            c(this.b);
        }
    }
}
