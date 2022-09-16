package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: buj  reason: default package */
/* loaded from: classes2.dex */
final class buj implements acv {
    @Override // defpackage.acv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bpx bpxVar;
        List<bul> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (bul bulVar : list) {
            List list2 = bulVar.e;
            if (list2 == null || list2.isEmpty()) {
                bpxVar = bpx.a;
            } else {
                bpxVar = (bpx) bulVar.e.get(0);
            }
            arrayList.add(new bqn(UUID.fromString(bulVar.a), bulVar.f, bulVar.b, bulVar.d, bpxVar, bulVar.c));
        }
        return arrayList;
    }
}
