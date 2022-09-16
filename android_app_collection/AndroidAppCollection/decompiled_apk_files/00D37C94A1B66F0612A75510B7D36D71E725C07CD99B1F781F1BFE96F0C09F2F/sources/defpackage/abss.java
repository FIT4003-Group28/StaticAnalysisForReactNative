package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
/* compiled from: PG */
/* renamed from: abss  reason: default package */
/* loaded from: classes.dex */
public final class abss {
    public final Handler a;
    public final absr b;

    public abss(byte[] bArr) {
        HandlerThread handlerThread = new HandlerThread("RenderThread", 0);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.a = handler;
        this.b = new absr(handler.getLooper());
    }

    public final abry a() {
        return this.b.b;
    }

    public final void b(absu absuVar) {
        absuVar.getClass();
        e(new abso(this, new absl(absuVar)));
    }

    public final void c(absp abspVar) {
        d(abspVar, false);
    }

    public final void d(final absp abspVar, final boolean z) {
        e(new Runnable() { // from class: absk
            @Override // java.lang.Runnable
            public final void run() {
                abss abssVar = abss.this;
                boolean z2 = z;
                absp abspVar2 = abspVar;
                absr absrVar = abssVar.b;
                if (absrVar.b == null) {
                    if (z2) {
                        absrVar.b = new abry(null, 1);
                    } else {
                        absrVar.b = new abry(null, 0);
                    }
                }
                if (abspVar2 != null) {
                    abspVar2.a();
                }
            }
        });
    }

    public final void e(Runnable runnable) {
        runnable.getClass();
        this.a.post(runnable);
    }

    public final void f() {
        k();
        e(new absn(this));
    }

    public final void g() {
        synchronized (this.b) {
            absr absrVar = this.b;
            if (absrVar.a) {
                if (absrVar.c()) {
                    this.b.b();
                } else {
                    e(this.b.g);
                }
            }
        }
    }

    public final void h(Runnable runnable, Handler handler) {
        synchronized (this.b) {
            absr absrVar = this.b;
            absrVar.d = runnable;
            absrVar.c = handler;
        }
    }

    public final void i(absw abswVar) {
        e(new abso(this, new absm(abswVar), 1));
    }

    public final void j() {
        synchronized (this.b) {
            this.b.a = true;
        }
        g();
    }

    public final void k() {
        synchronized (this.b) {
            this.b.a = false;
        }
    }

    public final void l(absz abszVar) {
        synchronized (this.b) {
            this.b.h = abszVar;
        }
    }

    public abss() {
        this(null);
    }
}
