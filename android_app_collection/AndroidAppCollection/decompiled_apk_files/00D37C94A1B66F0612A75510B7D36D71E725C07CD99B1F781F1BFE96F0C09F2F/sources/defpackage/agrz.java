package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agrz  reason: default package */
/* loaded from: classes.dex */
public final class agrz {
    private final Map a;
    private final snc b;

    public agrz(Map map, snc sncVar) {
        this.a = map;
        this.b = sncVar;
    }

    private final agrv b(atrf atrfVar, agrv agrvVar) {
        int a = aakj.a(atrfVar.d);
        if (!this.a.containsKey(Integer.valueOf(a))) {
            StringBuilder sb = new StringBuilder(63);
            sb.append("Couldn't find registered controller for entityType: ");
            sb.append(a);
            throw new agse(sb.toString());
        }
        String o = zhn.o();
        return new agrv(o, atrfVar, a, this.b.c(), agrvVar != null ? agrvVar.g : o, agrvVar != null ? agrvVar.a : null);
    }

    private final List c(agrv agrvVar, String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atrf atrfVar = (atrf) it.next();
            try {
                agrv b = b(atrfVar, agrvVar);
                b.h = str;
                arrayList.add(b);
                if (!atrfVar.f.isEmpty()) {
                    arrayList2.add(b);
                }
            } catch (agse e) {
                String valueOf = String.valueOf(e.getMessage());
                zep.b(valueOf.length() != 0 ? "[Offline] One of the chained actions couldn't be created: ".concat(valueOf) : new String("[Offline] One of the chained actions couldn't be created: "));
            }
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            agrv agrvVar2 = (agrv) arrayList2.get(i);
            arrayList.addAll(c(agrvVar, agrvVar2.a, agrvVar2.c.f));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List a(atrf atrfVar, agrv agrvVar) {
        ArrayList arrayList = new ArrayList();
        agrv b = b(atrfVar, agrvVar);
        arrayList.add(b);
        if (!atrfVar.f.isEmpty()) {
            arrayList.addAll(c(agrvVar, b.a, atrfVar.f));
        }
        return arrayList;
    }
}
