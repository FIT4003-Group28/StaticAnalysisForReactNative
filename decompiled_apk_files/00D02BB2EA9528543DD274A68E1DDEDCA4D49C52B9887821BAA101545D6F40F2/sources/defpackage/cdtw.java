package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cdtw  reason: default package */
/* loaded from: classes4.dex */
public final class cdtw extends cqiw<cebg> implements cqih {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cebg> a() {
        return cqqx.D(cqgr.cd(-1), cqgr.bp(-2), cqqx.G(), cqgr.V(cdtj.a), cqgr.an(new cqlc() { // from class: cdtk
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cebg cebgVar = (cebg) cqkpVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(cqgr.fT(new hsd(), hsd.d(cqrp.d(20.0d))));
                for (int i = 0; i < Math.min(6, cebgVar.a().intValue()); i++) {
                    cdtt cdttVar = new cdtt();
                    cebf b = cebgVar.b(i);
                    dbsk.s(b);
                    arrayList.add(cqgr.fT(cdttVar, new cdsj(cebgVar, b, i)));
                }
                arrayList.add(cqgr.fT(new hsd(), hsd.d(cqrp.d(12.0d))));
                return arrayList;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
    }
}
