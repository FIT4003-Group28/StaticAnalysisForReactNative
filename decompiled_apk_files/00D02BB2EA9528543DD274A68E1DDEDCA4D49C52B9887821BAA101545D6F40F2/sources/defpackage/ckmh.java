package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ckmh  reason: default package */
/* loaded from: classes4.dex */
public final class ckmh implements ckml {
    public static final /* synthetic */ int d = 0;
    private static final dcep<afid> e = dcep.E(afid.SEARCH_ACTION, afid.DIRECTIONS_ACTION, afid.PLACE_ACTION, afid.EXTERNAL_INVOCATION);
    public final cjqy b;
    @dzsi
    private bvjz f;
    private final gga h;
    private final btrm i;
    private final Executor j;
    public boolean a = false;
    private boolean g = false;
    public final ckmg c = new ckmg(this);

    public ckmh(gga ggaVar, btrm btrmVar, cjqy cjqyVar, Executor executor) {
        this.h = ggaVar;
        this.i = btrmVar;
        this.b = cjqyVar;
        this.j = executor;
    }

    private final synchronized boolean g(@dzsi bvjz bvjzVar) {
        boolean z;
        if (bvjzVar != null) {
            if (!bvjzVar.equals(this.f)) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    private final synchronized cwsv h(ckoi ckoiVar) {
        bvjz bvjzVar = this.f;
        if (bvjzVar == null) {
            return cwsv.a("UNKNOWN_INTENT_STARTUP_TYPE");
        }
        afid a = bvjzVar.a();
        return cwsv.c(a == null ? cwsv.a("MAIN") : cwsv.b(a), cwsv.c(cwsv.a("."), cwsv.b(ckoiVar)));
    }

    private final synchronized void i() {
        if (this.a) {
            return;
        }
        if (!this.g) {
            btrm btrmVar = this.i;
            dceq a = dcet.a();
            a.b(bvka.class, new ckmi(bvka.class, this));
            btrmVar.g(this, a.a());
            this.g = true;
        }
        this.b.C(this.c);
    }

    private final synchronized void j() {
        if (this.g) {
            this.i.a(this);
            this.g = false;
        }
        this.j.execute(new Runnable(this) { // from class: ckmf
            private final ckmh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckmh ckmhVar = this.a;
                synchronized (ckmhVar) {
                    ckmhVar.b.D(ckmhVar.c);
                }
            }
        });
    }

    private final synchronized void k(ckoi ckoiVar, @dzsi bvjz bvjzVar, boolean z) {
        cwsv h = h(ckoiVar);
        String valueOf = String.valueOf(h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("PrimesAppInteractiveLoggerImpl.logAppInteractive ");
        sb.append(valueOf);
        sb.toString();
        if (this.a) {
            return;
        }
        if (z && !g(bvjzVar)) {
            return;
        }
        cxbe cxbeVar = cxbe.a;
        if (cxbeVar.h == null) {
            cxbeVar.h = h;
        }
        gga ggaVar = this.h;
        if (czhz.a() && cxbeVar.g == 0) {
            cxbeVar.g = SystemClock.elapsedRealtime();
            cxbeVar.i.e = true;
            if (ggaVar != null) {
                try {
                    ggaVar.reportFullyDrawn();
                } catch (RuntimeException unused) {
                }
            }
        }
        this.a = true;
        j();
    }

    @Override // defpackage.ckml
    public final synchronized void a(bvjz bvjzVar) {
        d(bvjzVar);
        i();
    }

    @Override // defpackage.ckml
    public final synchronized void b() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c() {
        boolean z = false;
        if (this.a) {
            return false;
        }
        bvjz bvjzVar = this.f;
        if (bvjzVar != null) {
            if (bvjzVar.a() != null) {
                if (e.contains(this.f.a())) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    final synchronized void d(bvjz bvjzVar) {
        this.f = bvjzVar;
    }

    @Override // defpackage.ckml
    public final void e(ckoi ckoiVar) {
        k(ckoiVar, null, false);
    }

    @Override // defpackage.ckml
    public final void f(ckoi ckoiVar, bvjz bvjzVar) {
        k(ckoiVar, bvjzVar, true);
    }
}
