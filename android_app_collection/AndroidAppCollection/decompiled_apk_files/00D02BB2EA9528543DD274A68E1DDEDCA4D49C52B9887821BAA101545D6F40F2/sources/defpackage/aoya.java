package defpackage;
/* compiled from: PG */
/* renamed from: aoya  reason: default package */
/* loaded from: classes2.dex */
final class aoya implements btzi<djcq, djcu> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ aoyg b;
    final /* synthetic */ aoyd c;

    public aoya(aoyd aoydVar, bwrs bwrsVar, aoyg aoygVar) {
        this.c = aoydVar;
        this.a = bwrsVar;
        this.b = aoygVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcq> btzrVar, btzy btzyVar) {
        aoyd.k(this.a, aoyf.LOADING, "failed paged GetPlaceVisitStats");
        bwrs bwrsVar = this.a;
        aoye h = this.b.h();
        h.f(aoyf.ERROR);
        h.c(dbsg.i(btzyVar.p));
        bwrsVar.d(h.g());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcq> btzrVar, djcu djcuVar) {
        dspd dspdVar;
        djcu djcuVar2 = djcuVar;
        aoyd.k(this.a, aoyf.LOADING, "successful paged GetPlaceVisitStats");
        dcdc<aoxt> l = this.c.l(djcuVar2.b, 3);
        aoye h = this.b.h();
        dccx F = dcdc.F();
        F.i(this.b.d());
        F.i(l);
        h.d(F.f());
        if ((djcuVar2.a & 4) == 0 || l.isEmpty()) {
            h.f(aoyf.FULLY_LOADED);
            dspdVar = null;
        } else {
            h.f(aoyf.PARTIALLY_LOADED);
            dspdVar = djcuVar2.e;
        }
        h.b(dspdVar);
        this.a.d(h.g());
    }
}
