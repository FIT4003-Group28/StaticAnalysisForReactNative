package defpackage;
/* compiled from: PG */
/* renamed from: cedg  reason: default package */
/* loaded from: classes4.dex */
final class cedg implements blhp {
    final /* synthetic */ cedh a;

    public cedg(cedh cedhVar) {
        this.a = cedhVar;
    }

    @Override // defpackage.blhp
    public final void a() {
        cedh cedhVar = this.a;
        cedhVar.b.clear();
        cqkx.p(cedhVar);
    }

    @Override // defpackage.blhp
    public final void b(blhy blhyVar) {
        cedh cedhVar = this.a;
        if (cedhVar.f == null) {
            return;
        }
        dcdc<cdjd> a = blhyVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cdjd cdjdVar = a.get(i);
            bwrs<ilo> bwrsVar = cedhVar.f;
            if (!cebu.c(cdjdVar)) {
                bllx a2 = cedhVar.d.a(cdjk.PLACESHEET_SELF_POSTS, cedh.a);
                a2.F(bwrsVar, cdjdVar);
                cedhVar.b.add(a2);
            }
        }
        cqkx.p(cedhVar);
    }
}
