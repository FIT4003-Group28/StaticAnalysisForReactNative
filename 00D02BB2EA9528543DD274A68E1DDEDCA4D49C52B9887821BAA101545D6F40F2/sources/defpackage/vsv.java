package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: vsv  reason: default package */
/* loaded from: classes7.dex */
final class vsv implements degu<aleh> {
    final /* synthetic */ vuv a;
    final /* synthetic */ deig b;
    final /* synthetic */ boolean c;
    final /* synthetic */ amub d;
    final /* synthetic */ akvo e;
    final /* synthetic */ aktz f;
    final /* synthetic */ vtb g;
    final /* synthetic */ aldp h;

    public vsv(vtb vtbVar, vuv vuvVar, deig deigVar, aldp aldpVar, boolean z, amub amubVar, akvo akvoVar, aktz aktzVar) {
        this.g = vtbVar;
        this.a = vuvVar;
        this.b = deigVar;
        this.h = aldpVar;
        this.c = z;
        this.d = amubVar;
        this.e = akvoVar;
        this.f = aktzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.d(new vsz(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(aleh alehVar) {
        aleh alehVar2 = alehVar;
        synchronized (this.g.z) {
            if (this.a != this.g.z.a) {
                this.b.j(null);
                return;
            }
            List<akte> e = alehVar2.e(this.h, this.c);
            synchronized (this.g.o) {
                this.g.o.addAll(e);
            }
            final boolean A = this.d.d.A(2);
            e.size();
            for (final akte akteVar : e) {
                akvo akvoVar = this.e;
                if (akvoVar != null) {
                    akteVar.Pt(akvoVar);
                }
                if (this.g.i.getNavigationParameters().Q() && this.h.d != dqvj.TRANSIT && this.c && (this.a.p() || this.d.j().k())) {
                    amub amubVar = this.d;
                    amqo amqoVar = this.g.x;
                    akteVar.a(amubVar, amqoVar != null ? amqoVar.a() : null, this.h.j);
                }
                this.f.f(akteVar);
                this.g.c.b(new Runnable(this, A, akteVar) { // from class: vsu
                    private final vsv a;
                    private final boolean b;
                    private final akte c;

                    {
                        this.a = this;
                        this.b = A;
                        this.c = akteVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        vsv vsvVar = this.a;
                        boolean z = this.b;
                        akte akteVar2 = this.c;
                        cjqp g = vsvVar.g.s.g();
                        cjta b = cjtd.b();
                        b.d = z ? dtyi.cg : dtyi.ch;
                        cjql d = g.d(b.a());
                        if (d != null) {
                            ConcurrentHashMap<Integer, cjql> concurrentHashMap = vsvVar.g.y;
                            dmqg dmqgVar = (dmqg) akteVar2.k();
                            int i = dmqgVar.bC;
                            if (i == 0) {
                                i = dsst.a.b(dmqgVar).c(dmqgVar);
                                dmqgVar.bC = i;
                            }
                            concurrentHashMap.put(Integer.valueOf(i), d);
                        }
                    }
                }, bvrj.UI_THREAD);
            }
            this.b.j(null);
            if (this.g.D) {
                return;
            }
            this.g.D = true;
        }
    }
}
