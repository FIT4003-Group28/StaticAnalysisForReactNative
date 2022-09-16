package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agwi  reason: default package */
/* loaded from: classes.dex */
public final class agwi {
    public final Map a = new HashMap();
    private final Map b = new HashMap();

    private final synchronized int g(agqf agqfVar, Collection collection) {
        String str = agqfVar.a;
        int i = agqfVar.f;
        if (collection != null) {
            i -= collection.size();
        }
        agwj a = a(str);
        if (a != null) {
            return i - a.a();
        }
        return i;
    }

    public final synchronized agwj a(String str) {
        zgh.m(str);
        return (agwj) this.a.get(str);
    }

    public final synchronized agwj b(agqf agqfVar, Collection collection) {
        agwj agwjVar;
        agqfVar.getClass();
        String str = agqfVar.a;
        agwjVar = new agwj(this, agqfVar);
        agwjVar.h(g(agqfVar, collection));
        agwjVar.g();
        agwjVar.f();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                agwjVar.e((String) it.next());
            }
        }
        agwj a = a(str);
        if (a != null) {
            Iterator it2 = a.d().iterator();
            while (it2.hasNext()) {
                agwjVar.e((String) it2.next());
            }
        }
        this.a.put(str, agwjVar);
        return agwjVar;
    }

    public final synchronized List c(String str) {
        ArrayList arrayList;
        zgh.m(str);
        arrayList = new ArrayList();
        Set<String> set = (Set) this.b.get(str);
        if (set != null) {
            for (String str2 : set) {
                agwj a = a(str2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    public final synchronized void e(String str) {
        zgh.m(str);
        this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }
}
