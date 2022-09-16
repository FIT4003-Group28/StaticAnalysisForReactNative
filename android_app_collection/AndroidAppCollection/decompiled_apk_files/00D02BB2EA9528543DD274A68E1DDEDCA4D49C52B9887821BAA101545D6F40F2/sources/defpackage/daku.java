package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daku  reason: default package */
/* loaded from: classes5.dex */
public final class daku {
    private final Map<String, Map<String, String>> a;

    public daku(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    public final Map<String, Set<String>> a(Collection<String> collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.a.keySet()) {
            if (!this.a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
