package defpackage;
/* compiled from: PG */
/* renamed from: aoyc  reason: default package */
/* loaded from: classes2.dex */
final class aoyc implements btzi<djcq, djcu> {
    final /* synthetic */ aoyd a;
    private final bwrs<aoyg> b;
    private final aoyg c;

    public aoyc(aoyd aoydVar, bwrs<aoyg> bwrsVar) {
        this.a = aoydVar;
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        boolean z = true;
        if (c.a().e() != 2) {
            aoyg c2 = bwrsVar.c();
            dbsk.s(c2);
            if (c2.a().e() != 1) {
                z = false;
            }
        }
        dbsk.l(z);
        this.b = bwrsVar;
        aoyg c3 = bwrsVar.c();
        dbsk.s(c3);
        this.c = c3;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcq> btzrVar, btzy btzyVar) {
        aoyd.k(this.b, aoyf.INITIAL_LOADING, "failed getCitiesOrCountriesList()");
        bwrs<aoyg> bwrsVar = this.b;
        aoye h = this.c.h();
        h.f(aoyf.INITIAL_LOADING_ERROR);
        h.c(dbsg.i(btzyVar.p));
        bwrsVar.d(h.g());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcq> btzrVar, djcu djcuVar) {
        c(djcuVar);
    }

    public final void c(djcu djcuVar) {
        aoyd.k(this.b, aoyf.INITIAL_LOADING, "successful getCitiesOrCountriesList()");
        dcdc<aoxt> l = this.a.l(this.c.a().e() == 2 ? djcuVar.c : djcuVar.d, this.c.a().e());
        bwrs<aoyg> bwrsVar = this.b;
        aoye h = this.c.h();
        h.f(aoyf.FULLY_LOADED);
        h.d(dcdc.r(l));
        h.e(dcdc.r(l));
        bwrsVar.d(h.g());
    }
}
