package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxdz  reason: default package */
/* loaded from: classes5.dex */
final class cxdz {
    public final cxdy a;
    private long b = 1;

    public cxdz(cxdy cxdyVar) {
        this.a = cxdyVar;
    }

    public final void a(cxdy cxdyVar, long j, ArrayList<eaam> arrayList) {
        List<cxdy> list;
        if (cxdyVar.f != null) {
            list = cxdyVar.f;
            cxdyVar.f = null;
        } else if (cxdyVar.f == null) {
            list = Collections.emptyList();
        } else {
            list = cxdyVar.f;
        }
        if (!cxdyVar.b() || !list.isEmpty()) {
            eaak bZ = eaam.k.bZ();
            int i = cxdyVar.g;
            String str = cxdyVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaam eaamVar = (eaam) bZ.b;
            str.getClass();
            int i2 = eaamVar.a | 1;
            eaamVar.a = i2;
            eaamVar.b = str;
            long j2 = cxdyVar.c;
            eaamVar.a = i2 | 32;
            eaamVar.g = j2;
            long c = cxdyVar.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaam eaamVar2 = (eaam) bZ.b;
            int i3 = eaamVar2.a | 64;
            eaamVar2.a = i3;
            eaamVar2.h = c;
            long j3 = cxdyVar.e;
            int i4 = i3 | 256;
            eaamVar2.a = i4;
            eaamVar2.i = j3;
            long j4 = this.b;
            this.b = 1 + j4;
            int i5 = i4 | 8;
            eaamVar2.a = i5;
            eaamVar2.e = j4;
            eaamVar2.a = i5 | 16;
            eaamVar2.f = j;
            int i6 = cxdyVar.h - 1;
            if (i6 == 1) {
                eaam eaamVar3 = (eaam) bZ.b;
                eaamVar3.j = 1;
                eaamVar3.a |= 512;
            } else if (i6 == 3) {
                eaam eaamVar4 = (eaam) bZ.b;
                eaamVar4.j = 4;
                eaamVar4.a |= 512;
            } else {
                eaam eaamVar5 = (eaam) bZ.b;
                eaamVar5.j = 0;
                eaamVar5.a |= 512;
            }
            if (cxdyVar.b()) {
                long j5 = list.get(list.size() - 1).d - cxdyVar.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaam eaamVar6 = (eaam) bZ.b;
                eaamVar6.a |= 64;
                eaamVar6.h = j5;
            }
            arrayList.add(bZ.bK());
            for (cxdy cxdyVar2 : list) {
                a(cxdyVar2, ((eaam) bZ.b).e, arrayList);
            }
        }
    }
}
