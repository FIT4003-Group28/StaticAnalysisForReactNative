package defpackage;
/* compiled from: PG */
/* renamed from: bnwg  reason: default package */
/* loaded from: classes.dex */
final class bnwg implements alht {
    final /* synthetic */ bnwi a;

    public bnwg(bnwi bnwiVar) {
        this.a = bnwiVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        akqq S = alhrVar.a.S();
        String z = this.a.b.z(bvjk.aq, "fake_my_location_disabled");
        if (z.equals("fake_my_location_latest_tap")) {
            this.a.a(S);
            return true;
        } else if (z.equals("fake_my_location_next_tap")) {
            this.a.b.ac(bvjk.aq, S.a());
            return true;
        } else if (!z.equals("fake_my_location_move_to_latest_tap")) {
            return false;
        } else {
            bnwi bnwiVar = this.a;
            srv a = bnwiVar.c.a();
            vum vumVar = new vum();
            amvg P = amvh.P();
            P.d = S;
            vumVar.c(dchl.b(amvh.i(bnwiVar.d), P.a()));
            dwal bZ = dwao.R.bZ();
            dphm bZ2 = dphq.m.bZ();
            dqvj dqvjVar = dqvj.DRIVE;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dphq dphqVar = (dphq) bZ2.b;
            dphqVar.b = dqvjVar.k;
            dphqVar.a |= 1;
            dphq dphqVar2 = (dphq) bZ2.b;
            dphqVar2.c = 3;
            dphqVar2.a = 2 | dphqVar2.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwao dwaoVar = (dwao) bZ.b;
            dphq bK = bZ2.bK();
            bK.getClass();
            dwaoVar.e = bK;
            dwaoVar.a |= 1;
            vumVar.a = bZ.bK();
            a.k(vumVar.a(), false);
            return true;
        }
    }
}
