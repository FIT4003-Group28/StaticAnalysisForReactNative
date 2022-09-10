package defpackage;
/* compiled from: PG */
/* renamed from: aova  reason: default package */
/* loaded from: classes2.dex */
final class aova implements btzi<duzc, duzk> {
    final /* synthetic */ eapy a;
    final /* synthetic */ aovd b;

    public aova(aovd aovdVar, eapy eapyVar) {
        this.b = aovdVar;
        this.a = eapyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duzc> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.d();
        this.b.a.f(this.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duzc> btzrVar, duzk duzkVar) {
        duzk duzkVar2 = duzkVar;
        bvrj.UI_THREAD.d();
        int a = duzj.a(duzkVar2.b);
        if (a == 0 || a != 1) {
            this.b.a.f(this.a);
            return;
        }
        eapy eapyVar = this.a;
        duzo duzoVar = duzkVar2.d;
        if (duzoVar == null) {
            duzoVar = duzo.b;
        }
        aogo aogoVar = new aogo(eapyVar, dcdc.q(dcft.i(duzoVar.a, new aogn(eapyVar))));
        if (aogoVar.b == null) {
            dcen N = dcep.N();
            dcdc<bvrt<duzn>> dcdcVar = aogoVar.a;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                duzn c = aogo.c(dcdcVar.get(i));
                dngs dngsVar = c.a;
                if (dngsVar == null) {
                    dngsVar = dngs.h;
                }
                aogb e = aogb.e(dngsVar);
                if (c.d) {
                    N.b(Integer.valueOf(((aofo) e).a));
                }
            }
            aogoVar.b = N.f();
        }
        aogoVar.a();
        this.b.a.d(this.a, aogoVar);
    }
}
