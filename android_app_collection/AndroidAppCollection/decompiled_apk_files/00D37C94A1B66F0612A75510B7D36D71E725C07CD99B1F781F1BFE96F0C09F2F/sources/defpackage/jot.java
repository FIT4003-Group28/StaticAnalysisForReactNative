package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jot  reason: default package */
/* loaded from: classes3.dex */
public final class jot {
    static final long a = TimeUnit.DAYS.toSeconds(30);
    static final long b = TimeUnit.DAYS.toSeconds(1);
    public static final long c = TimeUnit.MINUTES.toSeconds(10);
    public final fcl d;
    public final azqb e;
    public final azqb f;
    private final yrj g;
    private final snc h;
    private final fcu i;

    public jot(yrj yrjVar, snc sncVar, fcl fclVar, fcu fcuVar, azqb azqbVar, azqb azqbVar2) {
        this.g = yrjVar;
        this.h = sncVar;
        this.d = fclVar;
        this.i = fcuVar;
        this.e = azqbVar;
        this.f = azqbVar2;
    }

    public final void b(long j) {
        if (!this.g.o() || c(j) || !((agrf) this.e.get()).h()) {
            return;
        }
        final agxa agxaVar = (agxa) this.f.get();
        ankt anktVar = agxaVar.g;
        if (anktVar == null || anktVar.isCancelled() || agxaVar.g.isDone()) {
            agxaVar.g = anii.i(anko.q(anii.h(anii.i(anko.q(anlz.q(((agrf) agxaVar.e.get()).a())), urc.k, agxaVar.a), new ampg() { // from class: agwy
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    agxa agxaVar2 = agxa.this;
                    Collection<agqv> collection = (Collection) obj;
                    if (collection == null) {
                        return null;
                    }
                    agvk agvkVar = (agvk) agxaVar2.d.get();
                    agxaVar2.f = new agvj(agvkVar.e, agvkVar.a.c());
                    agxaVar2.f.i();
                    agxaVar2.f.b = ((agvq) agxaVar2.c.get()).o(((agrf) agxaVar2.e.get()).d());
                    for (agqv agqvVar : collection) {
                        if (!agqvVar.s()) {
                            aopa createBuilder = awac.a.createBuilder();
                            String d = aakj.d(awac.b.a(), agqvVar.m());
                            createBuilder.copyOnWrite();
                            awac awacVar = (awac) createBuilder.instance;
                            d.getClass();
                            awacVar.c |= 1;
                            awacVar.d = d;
                            String m = agqvVar.m();
                            createBuilder.copyOnWrite();
                            awac awacVar2 = (awac) createBuilder.instance;
                            m.getClass();
                            awacVar2.c |= 2;
                            awacVar2.e = m;
                            long j2 = agqvVar.h;
                            createBuilder.copyOnWrite();
                            awac awacVar3 = (awac) createBuilder.instance;
                            awacVar3.c |= 4;
                            awacVar3.f = j2;
                            agxaVar2.f.a.add((awac) createBuilder.mo39build());
                        }
                    }
                    return agxaVar2.f;
                }
            }, anjk.a)), new anir() { // from class: agwz
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    agxa agxaVar2 = agxa.this;
                    agvj agvjVar = (agvj) obj;
                    if (agvjVar == null || agvjVar.a.size() == 0) {
                        return anlz.q(null);
                    }
                    return ((agvk) agxaVar2.d.get()).b.b(agvjVar, agxaVar2.a);
                }
            }, anjk.a);
            ylx.k(agxaVar.g, anjk.a, new afsc(13), new agwx(agxaVar));
        }
        ylx.m(this.i.b.b(new fcp(this.h.c(), 1)), jou.b);
    }

    public final boolean c(long j) {
        return this.h.c() - ((fcy) this.i.b.c()).f < TimeUnit.SECONDS.toMillis(j);
    }
}
