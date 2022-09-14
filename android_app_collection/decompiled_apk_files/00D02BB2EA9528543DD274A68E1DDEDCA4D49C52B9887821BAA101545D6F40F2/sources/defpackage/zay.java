package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zay  reason: default package */
/* loaded from: classes7.dex */
public final class zay {
    public static vwi a(@dzsi vwi vwiVar, vwh vwhVar) {
        if (vwiVar == null) {
            vvz bZ = vwi.b.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            vwi vwiVar2 = (vwi) bZ.b;
            vwhVar.getClass();
            vwiVar2.b();
            vwiVar2.a.add(vwhVar);
            return bZ.bK();
        }
        dsrj<vwh> dsrjVar = vwiVar.a;
        ArrayList arrayList = new ArrayList(dsrjVar.size());
        boolean z = false;
        for (vwh vwhVar2 : dsrjVar) {
            if (vwhVar.b == vwhVar2.b) {
                arrayList.add(vwhVar);
                z = true;
            } else {
                arrayList.add(vwhVar2);
            }
        }
        if (!z) {
            arrayList.add(vwhVar);
        }
        dsqp dsqpVar = (dsqp) vwiVar.cu(5);
        dsqpVar.bC(vwiVar);
        vvz vvzVar = (vvz) dsqpVar;
        if (vvzVar.c) {
            vvzVar.bF();
            vvzVar.c = false;
        }
        ((vwi) vvzVar.b).a = vwi.ck();
        vvzVar.a(arrayList);
        return vvzVar.bK();
    }

    public static vwh b(@dzsi vwi vwiVar, int i) {
        if (vwiVar != null && !vwiVar.a.isEmpty()) {
            for (int i2 = 0; i2 < vwiVar.a.size(); i2++) {
                vwh vwhVar = vwiVar.a.get(i2);
                if (vwhVar.b == i) {
                    return vwhVar;
                }
            }
            vwa bZ = vwh.n.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            vwh vwhVar2 = (vwh) bZ.b;
            vwhVar2.a |= 1;
            vwhVar2.b = i;
            return bZ.bK();
        }
        vwa bZ2 = vwh.n.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        vwh vwhVar3 = (vwh) bZ2.b;
        vwhVar3.a |= 1;
        vwhVar3.b = i;
        return bZ2.bK();
    }
}
