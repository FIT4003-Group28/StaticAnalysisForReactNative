package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: qqb  reason: default package */
/* loaded from: classes4.dex */
public final class qqb {
    public static final Object a;
    qpz c;
    Runnable d;
    private final long e;
    long b = -1;
    private final Handler f = new rfm(Looper.getMainLooper());

    static {
        new qpu("RequestTracker");
        a = new Object();
    }

    public qqb(long j) {
        this.e = j;
    }

    private final void g(int i, Object obj) {
        Object obj2 = a;
        synchronized (obj2) {
            qpz qpzVar = this.c;
            if (qpzVar != null) {
                qpzVar.a(this.b, i, obj);
            }
            this.b = -1L;
            this.c = null;
            synchronized (obj2) {
                Runnable runnable = this.d;
                if (runnable != null) {
                    this.f.removeCallbacks(runnable);
                    this.d = null;
                }
            }
        }
    }

    public final void a(long j, qpz qpzVar) {
        qpz qpzVar2;
        long j2;
        Object obj = a;
        synchronized (obj) {
            qpzVar2 = this.c;
            j2 = this.b;
            this.b = j;
            this.c = qpzVar;
        }
        if (qpzVar2 != null) {
            qpzVar2.b(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.d;
            if (runnable != null) {
                this.f.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: qqa
                @Override // java.lang.Runnable
                public final void run() {
                    qqb qqbVar = qqb.this;
                    synchronized (qqb.a) {
                        if (qqbVar.b == -1) {
                            return;
                        }
                        qqbVar.d(15);
                    }
                }
            };
            this.d = runnable2;
            this.f.postDelayed(runnable2, this.e);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (a) {
            z = this.b != -1;
        }
        return z;
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (a) {
            long j2 = this.b;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void d(int i) {
        synchronized (a) {
            if (this.b != -1) {
                String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.b));
                g(i, null);
            }
        }
    }

    public final void e(long j, int i) {
        f(j, i, null);
    }

    public final void f(long j, int i, Object obj) {
        synchronized (a) {
            long j2 = this.b;
            if (j2 == -1 || j2 != j) {
                return;
            }
            String.format(Locale.ROOT, "request %d completed", Long.valueOf(j));
            g(i, obj);
        }
    }
}
