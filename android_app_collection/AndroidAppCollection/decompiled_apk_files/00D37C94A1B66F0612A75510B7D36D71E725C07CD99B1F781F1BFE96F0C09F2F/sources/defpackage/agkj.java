package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agkj  reason: default package */
/* loaded from: classes.dex */
public final class agkj {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agkk a(agqq agqqVar, Collection collection) {
        agkk agkkVar;
        String str = agqqVar.a;
        agkkVar = new agkk(this, agqqVar);
        agkkVar.e();
        agkkVar.d();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                agkkVar.c((String) it.next());
            }
        }
        this.a.put(str, agkkVar);
        return agkkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agkk b(String str) {
        zgh.m(str);
        return (agkk) this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c(String str) {
        LinkedList linkedList;
        zgh.m(str);
        linkedList = new LinkedList();
        Set<String> set = (Set) this.b.get(str);
        if (set != null) {
            for (String str2 : set) {
                agkk b = b(str2);
                if (b != null) {
                    linkedList.add(b);
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str, String str2) {
        zgh.m(str);
        zgh.m(str2);
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(String str, String str2) {
        zgh.m(str);
        zgh.m(str2);
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(String str) {
        zgh.m(str);
        this.a.remove(str);
    }
}
