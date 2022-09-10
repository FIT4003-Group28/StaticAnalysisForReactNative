package defpackage;
/* compiled from: PG */
/* renamed from: bfxe  reason: default package */
/* loaded from: classes3.dex */
final class bfxe implements begr {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bfxf d;

    public bfxe(bfxf bfxfVar, String str, boolean z, boolean z2) {
        this.d = bfxfVar;
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        int i;
        if (!this.d.d.b()) {
            return;
        }
        bwrs<ilo> a = bwrs.a(iloVar);
        begj begjVar = new begj();
        begjVar.i = a;
        begjVar.c = jjn.EXPANDED;
        this.d.b.o(begjVar, false, null);
        bjbu bjbuVar = this.d.c;
        djan bZ = djao.i.bZ();
        djaj bZ2 = djam.m.bZ();
        String str = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djam djamVar = (djam) bZ2.b;
        str.getClass();
        djamVar.a |= 1;
        djamVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djao djaoVar = (djao) bZ.b;
        djam bK = bZ2.bK();
        bK.getClass();
        djaoVar.b = bK;
        djaoVar.a |= 1;
        bjbs h = bjbv.h();
        h.e(true);
        h.d(dqcj.AGMM_NOTIFICATION);
        bjbuVar.d(a, bZ.bK(), h.a());
        gga ggaVar = this.d.a;
        if (this.b) {
            i = dpyv.PLACE_QA_MERCHANT.dm;
        } else if (this.c) {
            i = dpyv.CITY_QA.dm;
        } else {
            i = dpyv.PLACE_QA.dm;
        }
        Integer valueOf = Integer.valueOf(i);
        bfxf bfxfVar = this.d;
        avac.bp(ggaVar, valueOf, bfxfVar.i, bfxfVar.j, bfxfVar.e);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        bttqVar.toString();
    }
}
