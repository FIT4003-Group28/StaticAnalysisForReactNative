package defpackage;

import defpackage.dssj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cwvr  reason: default package */
/* loaded from: classes5.dex */
abstract class cwvr<S, P extends dssj> {
    public abstract String a(P p);

    public abstract P b(P p, P p2);

    public abstract P c(String str, S s);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<P> d(List<P> list, List<P> list2) {
        P p;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (P p2 : list) {
            String a = a(p2);
            Iterator<P> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    p = null;
                    break;
                }
                p = it.next();
                if (a.equals(a(p))) {
                    break;
                }
            }
            P b = b(p2, p);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<P> e(Map<String, S> map) {
        P c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, S> entry : map.entrySet()) {
            if (entry.getValue() != null && (c = c(entry.getKey(), entry.getValue())) != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }
}
