package defpackage;
/* compiled from: PG */
/* renamed from: bwij  reason: default package */
/* loaded from: classes4.dex */
public class bwij implements bwhz {
    @dzsi
    private final bwhy a;
    private final bwhx b;
    private final Runnable c;
    private final gga d;
    private boolean e = true;

    public bwij(gga ggaVar, Runnable runnable, @dzsi bwhy bwhyVar, bwhx bwhxVar) {
        this.c = runnable;
        this.d = ggaVar;
        this.a = bwhyVar;
        this.b = bwhxVar;
    }

    @Override // defpackage.bwhz
    public cqkl a() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.bwhz
    public Integer b() {
        bwhy bwhyVar = this.a;
        if (bwhyVar == null || !bwhyVar.e().booleanValue()) {
            return 0;
        }
        cqtv g = cqsg.g(cqsz.d(), cqsg.d(bwgl.c, cqrp.c(this.b.f().intValue())));
        bwhy bwhyVar2 = this.a;
        dbsk.s(bwhyVar2);
        return Integer.valueOf(cqsg.k(cqsg.f(cqsg.g(g, bwhyVar2.d()), Float.valueOf(0.5f)), cqrp.c(dcyn.a)).e(this.d));
    }

    @Override // defpackage.bwhz
    public Boolean c() {
        return Boolean.valueOf(this.e);
    }
}
