package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rjv  reason: default package */
/* loaded from: classes4.dex */
public abstract class rjv {
    private static volatile Handler b;
    public volatile long a;
    private final rml c;
    private final Runnable d;

    public rjv(rml rmlVar) {
        qnm.b(rmlVar);
        this.c = rmlVar;
        this.d = new rju(this, rmlVar);
    }

    private final Handler e() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (rjv.class) {
            if (b == null) {
                b = new rfm(((rlx) this.c).a.getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = 0L;
        e().removeCallbacks(this.d);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            qyh qyhVar = ((rlx) this.c).y;
            this.a = System.currentTimeMillis();
            if (e().postDelayed(this.d, j)) {
                return;
            }
            this.c.aG().c.b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.a != 0;
    }
}
