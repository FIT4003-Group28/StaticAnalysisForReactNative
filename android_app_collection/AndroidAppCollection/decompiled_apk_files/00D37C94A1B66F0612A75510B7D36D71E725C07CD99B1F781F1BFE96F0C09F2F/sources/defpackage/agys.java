package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agys  reason: default package */
/* loaded from: classes.dex */
public final class agys {
    private final Map a = new LinkedHashMap();
    private final yne b = new yne(new agsf(2));

    public final synchronized agxe a(String str) {
        return (agxe) this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agxe b(String str) {
        this.b.b(str);
        return (agxe) this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            agxe agxeVar = (agxe) this.a.get((String) it.next());
            if (agxeVar != null) {
                arrayList.add(agxeVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Map d() {
        HashMap hashMap;
        hashMap = new HashMap(this.a.size());
        for (agxe agxeVar : this.a.values()) {
            hashMap.put(agxeVar.a, agxeVar.a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(agxe agxeVar) {
        this.a.put(agxeVar.a, agxeVar);
        yne yneVar = this.b;
        String str = agxeVar.a;
        Iterator it = yneVar.a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((LinkedList) it.next()).contains(str)) {
                    this.b.b(agxeVar.a);
                    break;
                }
            } else {
                break;
            }
        }
        this.b.a(new Pair(Integer.valueOf(agxeVar.h), Long.valueOf(agxg.k(agxeVar.e))), agxeVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.a.clear();
        this.b.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(String str) {
        return this.a.containsKey(str);
    }
}
