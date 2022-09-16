package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: uvb  reason: default package */
/* loaded from: classes4.dex */
abstract class uvb {
    public abstract aoqu a(String str, Object obj);

    public abstract aoqu b(aoqu aoquVar, aoqu aoquVar2);

    public abstract String c(aoqu aoquVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d(Map map) {
        aoqu a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(List list, List list2) {
        aoqu aoquVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoqu aoquVar2 = (aoqu) it.next();
            String c = c(aoquVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aoquVar = null;
                    break;
                }
                aoquVar = (aoqu) it2.next();
                if (c.equals(c(aoquVar))) {
                    break;
                }
            }
            aoqu b = b(aoquVar2, aoquVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
