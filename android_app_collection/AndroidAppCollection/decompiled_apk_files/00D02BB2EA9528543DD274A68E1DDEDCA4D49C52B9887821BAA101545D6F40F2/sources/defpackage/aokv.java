package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aokv  reason: default package */
/* loaded from: classes2.dex */
public final class aokv implements dbty<NavigableMap<Long, List<aola>>> {
    final /* synthetic */ aokw a;

    public aokv(aokw aokwVar) {
        this.a = aokwVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ NavigableMap<Long, List<aola>> a() {
        aolc aolcVar;
        aokw aokwVar = this.a;
        aokwVar.b = true;
        TreeMap treeMap = new TreeMap();
        try {
            aolcVar = (aolc) ((dssr) aolc.b.cu(7)).j(Base64.decode(aokwVar.a.getString("pendingReceiptUploadDetails", ""), 1));
        } catch (dsrm unused) {
            aolcVar = aolc.b;
        }
        dcdc r = dcdc.r(aolcVar.a);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            aola aolaVar = (aola) r.get(i);
            List list = (List) treeMap.get(Long.valueOf(aolaVar.b));
            if (list == null) {
                list = new ArrayList();
                treeMap.put(Long.valueOf(aolaVar.b), list);
            }
            list.add(aolaVar);
        }
        return treeMap;
    }
}
