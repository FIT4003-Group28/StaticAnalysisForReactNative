package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gks */
/* loaded from: classes3.dex */
public final class gks implements aafl, eoy {
    public static final /* synthetic */ int e = 0;
    public final gin a;
    public final Executor b;
    public final fce c;
    public final agss d;
    private final Executor f;
    private final azqb g;

    public gks(gin ginVar, Executor executor, Executor executor2, fce fceVar, azqb azqbVar, agss agssVar) {
        this.a = ginVar;
        this.b = executor;
        this.f = executor2;
        this.c = fceVar;
        this.g = azqbVar;
        this.d = agssVar;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        ankt i;
        if (!apzgVar.qn(attg.a)) {
            throw new aafy("Command is not an OfflineWatchEndpoint.");
        }
        final attf attfVar = (attf) apzgVar.qm(attg.a);
        if (attfVar.c.isEmpty()) {
            i = anlz.q(gkr.a(amon.a, true));
        } else {
            i = anii.i(anko.q(((agrf) this.g.get()).a().m().h(attfVar.c)), new anir() { // from class: gkq
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    gks gksVar = gks.this;
                    ampq ampqVar = (ampq) obj;
                    ankt d = gksVar.d.d((agqv) ampqVar.f());
                    return anii.h(anko.q(d), new advq(ampqVar, 1), gksVar.b);
                }
            }, this.b);
        }
        ylx.k(i, this.f, dzl.t, new ylw() { // from class: gkp
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                gks gksVar = gks.this;
                apzg apzgVar2 = apzgVar;
                Map map2 = map;
                attf attfVar2 = attfVar;
                gkr gkrVar = (gkr) obj;
                if (gkrVar.b) {
                    gksVar.a.kD(apzgVar2, map2);
                } else {
                    gksVar.c.a(attfVar2.c, (agqv) gkrVar.a.f(), attfVar2.d);
                }
            }
        });
    }
}
