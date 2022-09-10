package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmbd  reason: default package */
/* loaded from: classes3.dex */
public final class bmbd {
    public static dglq a(dglq dglqVar) {
        dglp bZ = dglq.d.bZ();
        dcdc<dglo> b = b(dglqVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dglq dglqVar2 = (dglq) bZ.b;
        dsrj<dglo> dsrjVar = dglqVar2.b;
        if (!dsrjVar.a()) {
            dglqVar2.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(b, dglqVar2.b);
        for (dgls dglsVar : dglqVar.c) {
            dcdc<dglo> b2 = b(dglsVar.d);
            if ((dglsVar.a & 2) != 0 && !b2.isEmpty()) {
                dglr ca = dgls.e.ca(dglsVar);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((dgls) ca.b).d = dgls.ck();
                ca.a(b2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dglq dglqVar3 = (dglq) bZ.b;
                dgls bK = ca.bK();
                bK.getClass();
                dsrj<dgls> dsrjVar2 = dglqVar3.c;
                if (!dsrjVar2.a()) {
                    dglqVar3.c = dsqw.cl(dsrjVar2);
                }
                dglqVar3.c.add(bK);
            }
        }
        return bZ.bK();
    }

    private static dcdc<dglo> b(List<dglo> list) {
        return dcbg.b(list).o(new bmbc()).z();
    }
}
