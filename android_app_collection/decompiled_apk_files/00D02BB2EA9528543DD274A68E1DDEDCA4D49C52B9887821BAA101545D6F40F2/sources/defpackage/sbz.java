package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sbz  reason: default package */
/* loaded from: classes7.dex */
public class sbz {
    public final ckcw a;
    public final qro b;
    public final qjk c;
    public final axwe d;
    public final sic e;
    public final axwq f;
    public final dxio<axwy> g;
    private final axvy h;
    private final dehp i;
    private final Executor j;

    public sbz(ckcw ckcwVar, qro qroVar, axvy axvyVar, qjk qjkVar, axwe axweVar, sic sicVar, axwq axwqVar, dxio<axwy> dxioVar, dehp dehpVar, Executor executor) {
        this.a = ckcwVar;
        this.b = qroVar;
        this.h = axvyVar;
        this.c = qjkVar;
        this.d = axweVar;
        this.e = sicVar;
        this.f = axwqVar;
        this.g = dxioVar;
        this.i = dehpVar;
        this.j = executor;
    }

    public final void a(Runnable runnable) {
        b(runnable, true);
    }

    public final void b(final Runnable runnable, final boolean z) {
        bvqd.a(deha.k(this.h.g(domw.UNKNOWN_COMMUTE_TIME_MIXING_POLICY), this.i.a(new Runnable(this, z) { // from class: sbx
            private final sbz a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sbz sbzVar = this.a;
                boolean z2 = this.b;
                bvrj.UI_THREAD.d();
                try {
                    synchronized (sbzVar.d) {
                        dcpe<azwc> listIterator = sbzVar.d.a().listIterator();
                        while (listIterator.hasNext()) {
                            sbzVar.d.c(listIterator.next());
                        }
                    }
                } catch (axxc unused) {
                }
                if (z2) {
                    sbzVar.c.v();
                }
            }
        })).c(new Runnable(this, runnable) { // from class: sby
            private final sbz a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sbz sbzVar = this.a;
                Runnable runnable2 = this.b;
                sbzVar.b.b();
                ((ckcn) sbzVar.a.a(ckeo.g)).a();
                sbzVar.f.s(null);
                runnable2.run();
            }
        }, this.j), this.j);
    }
}
