package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoxx  reason: default package */
/* loaded from: classes2.dex */
public final class aoxx implements btzi<djcq, djcu> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ aoyg b;
    final /* synthetic */ aoyd c;

    public aoxx(aoyd aoydVar, bwrs bwrsVar, aoyg aoygVar) {
        this.c = aoydVar;
        this.a = bwrsVar;
        this.b = aoygVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcq> btzrVar, btzy btzyVar) {
        aoyd.k(this.a, aoyf.INITIAL_LOADING, "failed initial GetPlaceVisitStats()");
        bwrs bwrsVar = this.a;
        aoye h = this.b.h();
        h.f(aoyf.INITIAL_LOADING_ERROR);
        h.c(dbsg.i(btzyVar.p));
        bwrsVar.d(h.g());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcq> btzrVar, djcu djcuVar) {
        aoyd.k(this.a, aoyf.INITIAL_LOADING, "successful initial GetPlaceVisitStats()");
        dcdc<aoxt> l = this.c.l(djcuVar.b, 3);
        bwrs bwrsVar = this.a;
        aoye h = this.b.h();
        h.f(aoyf.PARTIALLY_LOADED);
        h.e(dcdc.r(l));
        bwrsVar.d(h.g());
    }
}
