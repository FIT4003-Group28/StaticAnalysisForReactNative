package defpackage;
/* compiled from: PG */
/* renamed from: apmy  reason: default package */
/* loaded from: classes2.dex */
public final class apmy extends bvwn<dmiv> {
    private final gga b;
    private final bwqv c;

    public apmy(gga ggaVar, bwqv bwqvVar) {
        super(dmiv.d);
        this.b = ggaVar;
        this.c = bwqvVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmiv dmivVar) {
        bxko bxkoVar;
        dmiv dmivVar2 = dmivVar;
        fd K = this.b.K();
        dbsk.s(K);
        dbsk.a(K instanceof gfw);
        gfw gfwVar = (gfw) K;
        if ((dmivVar2.a & 1) != 0) {
            bxkoVar = new bxko();
            dpuq dpuqVar = dmivVar2.b;
            if (dpuqVar == null) {
                dpuqVar = dpuq.d;
            }
            bxkoVar.k(new akqs(dpuqVar));
            bxkoVar.c(bxla.ADD_A_PLACE_SUGGESTION);
        } else {
            bxkoVar = null;
        }
        gfwVar.aZ(aorz.g(this.c, K.Rn(), null, bxkoVar));
    }
}
