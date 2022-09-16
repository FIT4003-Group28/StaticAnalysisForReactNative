package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cta  reason: default package */
/* loaded from: classes3.dex */
public final class cta {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private final synchronized List f(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List list = (List) this.b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<csz> list = (List) this.b.get(str);
            if (list != null) {
                for (csz cszVar : list) {
                    if (cszVar.a(cls, cls2)) {
                        arrayList.add(cszVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<csz> list = (List) this.b.get(str);
            if (list != null) {
                for (csz cszVar : list) {
                    if (cszVar.a(cls, cls2) && !arrayList.contains(cszVar.a)) {
                        arrayList.add(cszVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, cie cieVar, Class cls, Class cls2) {
        f(str).add(new csz(cls, cls2, cieVar));
    }

    public final synchronized void d(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final synchronized void e(cie cieVar, Class cls, Class cls2) {
        f("legacy_prepend_all").add(0, new csz(cls, cls2, cieVar));
    }
}
