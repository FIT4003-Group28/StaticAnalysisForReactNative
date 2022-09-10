package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqwr  reason: default package */
/* loaded from: classes2.dex */
public class aqwr extends dbrh<dgak, aqxk> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgak b(aqxk aqxkVar) {
        aqxk aqxkVar2 = aqxkVar;
        dgad bZ = dgak.f.bZ();
        dbrh<aqxj, dgaj> k = aqxd.a.k();
        aqxj b = aqxj.b(aqxkVar2.a);
        if (b == null) {
            b = aqxj.UNRECOGNIZED;
        }
        dgaj NV = k.NV(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgak dgakVar = (dgak) bZ.b;
        dgakVar.b = NV.g;
        dgakVar.a |= 1;
        dbrh<aqxh, dgaf> k2 = aqxd.b.k();
        aqxh b2 = aqxh.b(aqxkVar2.b);
        if (b2 == null) {
            b2 = aqxh.UNRECOGNIZED;
        }
        dgaf NV2 = k2.NV(b2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgak dgakVar2 = (dgak) bZ.b;
        dgakVar2.c = NV2.h;
        dgakVar2.a |= 2;
        if (aqxkVar2.c != null) {
            dbrh<aqxp, dgao> k3 = aqxd.d.k();
            aqxp aqxpVar = aqxkVar2.c;
            if (aqxpVar == null) {
                aqxpVar = aqxp.b;
            }
            dgao NV3 = k3.NV(aqxpVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgak dgakVar3 = (dgak) bZ.b;
            NV3.getClass();
            dgakVar3.d = NV3;
            dgakVar3.a |= 4;
        }
        dbrh<aqxi, dgah> k4 = aqxd.c.k();
        aqxi b3 = aqxi.b(aqxkVar2.d);
        if (b3 == null) {
            b3 = aqxi.UNRECOGNIZED;
        }
        dgah NV4 = k4.NV(b3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgak dgakVar4 = (dgak) bZ.b;
        dgakVar4.e = NV4.d;
        dgakVar4.a |= 8;
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxk c(dgak dgakVar) {
        dgak dgakVar2 = dgakVar;
        aqxg bZ = aqxk.e.bZ();
        if ((dgakVar2.a & 1) != 0) {
            dbrh<dgaj, aqxj> dbrhVar = aqxd.a;
            dgaj b = dgaj.b(dgakVar2.b);
            if (b == null) {
                b = dgaj.STATE_UNSPECIFIED;
            }
            aqxj NV = dbrhVar.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((aqxk) bZ.b).a = NV.a();
        }
        if ((dgakVar2.a & 2) != 0) {
            dbrh<dgaf, aqxh> dbrhVar2 = aqxd.b;
            dgaf b2 = dgaf.b(dgakVar2.c);
            if (b2 == null) {
                b2 = dgaf.DISABLE_REASON_UNSPECIFIED;
            }
            aqxh NV2 = dbrhVar2.NV(b2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((aqxk) bZ.b).b = NV2.a();
        }
        if ((dgakVar2.a & 4) != 0) {
            dbrh<dgao, aqxp> dbrhVar3 = aqxd.d;
            dgao dgaoVar = dgakVar2.d;
            if (dgaoVar == null) {
                dgaoVar = dgao.c;
            }
            aqxp NV3 = dbrhVar3.NV(dgaoVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            NV3.getClass();
            ((aqxk) bZ.b).c = NV3;
        }
        if ((dgakVar2.a & 8) != 0) {
            dbrh<dgah, aqxi> dbrhVar4 = aqxd.c;
            dgah b3 = dgah.b(dgakVar2.e);
            if (b3 == null) {
                b3 = dgah.UNKNOWN_MESSAGING_APP;
            }
            aqxi NV4 = dbrhVar4.NV(b3);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((aqxk) bZ.b).d = NV4.a();
        }
        return bZ.bK();
    }
}
