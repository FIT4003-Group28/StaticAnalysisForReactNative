package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvpe  reason: default package */
/* loaded from: classes5.dex */
public final class cvpe {
    public static final dsef a(List<cvkj> list) {
        dsee bZ = dsef.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsef dsefVar = (dsef) bZ.b;
        dsefVar.d = 2;
        dsefVar.a |= 4;
        dsef dsefVar2 = (dsef) bZ.b;
        dsefVar2.b = 4;
        dsefVar2.a |= 1;
        Iterator<cvkj> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                dsce dsceVar = it.next().d().j;
                if (dsceVar == null) {
                    dsceVar = dsce.f;
                }
                if (dsceVar.e) {
                    break;
                }
            } else {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dsef dsefVar3 = (dsef) bZ.b;
                dsefVar3.e = 2;
                dsefVar3.a |= 8;
            }
        }
        return bZ.bK();
    }
}
