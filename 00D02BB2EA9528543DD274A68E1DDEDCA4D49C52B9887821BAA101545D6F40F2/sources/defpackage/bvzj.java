package defpackage;
/* compiled from: PG */
/* renamed from: bvzj  reason: default package */
/* loaded from: classes4.dex */
public final class bvzj extends bvwn<dmdt> {
    private final gga b;
    private final dzsj<axwo> c;

    public bvzj(gga ggaVar, dzsj<axwo> dzsjVar) {
        super(dmdt.c);
        this.b = ggaVar;
        this.c = dzsjVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmdt dmdtVar) {
        dccx dccxVar = new dccx();
        for (drdg drdgVar : dmdtVar.a) {
            dccxVar.g(bwam.a(drdgVar));
        }
        fd K = this.b.K();
        dbsk.s(K);
        dbsk.a(K instanceof gfw);
        this.c.a().e((gfw) K, bwrs.a(dccxVar.f()));
    }
}
