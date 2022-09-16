package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: altf  reason: default package */
/* loaded from: classes.dex */
public final class altf {
    public final Map a;

    public altf() {
        this.a = new HashMap();
    }

    public altf(Map map) {
        this.a = map;
    }

    private static String d(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("imageprefetch_");
        sb.append(str);
        return sb.toString();
    }

    public final Map a(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.a.keySet()) {
            if (!this.a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }

    public final boolean b(cyr cyrVar) {
        String d = d(cyrVar.m);
        return this.a.containsKey(d) && ((Integer) this.a.get(d)).intValue() == 1;
    }

    public final void c(cyr cyrVar, int i) {
        this.a.put(d(cyrVar.m), Integer.valueOf(i));
    }
}
