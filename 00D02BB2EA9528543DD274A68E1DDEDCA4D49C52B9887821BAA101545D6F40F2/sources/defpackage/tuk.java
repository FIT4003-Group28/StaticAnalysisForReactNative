package defpackage;

import java.util.ArrayList;
/* renamed from: tuk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tuk implements cqlc {
    static final cqlc a = new tuk();

    private tuk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ubt ubtVar = (ubt) cqkpVar;
        ArrayList arrayList = new ArrayList();
        if (ubtVar.d().booleanValue()) {
            arrayList.add(cqgr.fT(new tsh(), cqkp.T));
        } else {
            dcdc<ubo> b = ubtVar.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(cqgr.fT(new tst(), b.get(i)));
            }
            if (ubtVar.h() != null) {
                ttq ttqVar = new ttq();
                ubs h = ubtVar.h();
                dbsk.s(h);
                arrayList.add(cqgr.fT(ttqVar, h));
            }
            if (ubtVar.i() != null) {
                ttb ttbVar = new ttb();
                ubq i2 = ubtVar.i();
                dbsk.s(i2);
                arrayList.add(cqgr.fT(ttbVar, i2));
            }
        }
        return dcdc.r(arrayList);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
