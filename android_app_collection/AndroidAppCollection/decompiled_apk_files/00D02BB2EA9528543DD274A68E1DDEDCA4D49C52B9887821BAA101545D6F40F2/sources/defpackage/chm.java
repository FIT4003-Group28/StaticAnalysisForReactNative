package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: chm  reason: default package */
/* loaded from: classes.dex */
public final class chm {
    private final List<String> a = new ArrayList();
    private final Map<String, List<chl<?, ?>>> b = new HashMap();

    private final synchronized List<chl<?, ?>> e(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List<chl<?, ?>> list = this.b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public final synchronized void a(List<String> list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        for (String str : list) {
            this.a.add(str);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (!list.contains(str2)) {
                this.a.add(str2);
            }
        }
    }

    public final synchronized <T, R> List<buc<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<chl<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (chl<?, ?> chlVar : list) {
                    if (chlVar.a(cls, cls2)) {
                        arrayList.add(chlVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> List<Class<R>> c(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<chl<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (chl<?, ?> chlVar : list) {
                    if (chlVar.a(cls, cls2) && !arrayList.contains(chlVar.a)) {
                        arrayList.add(chlVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> void d(String str, buc<T, R> bucVar, Class<T> cls, Class<R> cls2) {
        e(str).add(new chl<>(cls, cls2, bucVar));
    }
}
