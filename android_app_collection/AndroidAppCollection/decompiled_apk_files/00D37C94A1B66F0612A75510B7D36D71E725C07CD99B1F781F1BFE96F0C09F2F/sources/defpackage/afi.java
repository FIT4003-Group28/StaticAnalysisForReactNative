package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: afi  reason: default package */
/* loaded from: classes.dex */
public class afi implements aff {
    public static final Comparator a;
    protected final TreeMap b;

    static {
        fay fayVar = fay.b;
        a = fayVar;
        new afi(new TreeMap(fayVar));
    }

    public afi(TreeMap treeMap) {
        this.b = treeMap;
    }

    public static void c(aff affVar) {
        Set<afe> unmodifiableSet;
        if (afi.class.equals(affVar.getClass())) {
            return;
        }
        TreeMap treeMap = new TreeMap(a);
        afi afiVar = (afi) affVar;
        for (afd afdVar : Collections.unmodifiableSet(afiVar.b.keySet())) {
            Map map = (Map) afiVar.b.get(afdVar);
            if (map == null) {
                unmodifiableSet = Collections.emptySet();
            } else {
                unmodifiableSet = Collections.unmodifiableSet(map.keySet());
            }
            ArrayMap arrayMap = new ArrayMap();
            for (afe afeVar : unmodifiableSet) {
                Map map2 = (Map) afiVar.b.get(afdVar);
                if (map2 == null) {
                    throw new IllegalArgumentException("Option does not exist: " + afdVar);
                } else if (!map2.containsKey(afeVar)) {
                    throw new IllegalArgumentException("Option does not exist: " + afdVar + " with priority=" + afeVar);
                } else {
                    arrayMap.put(afeVar, map2.get(afeVar));
                }
            }
            treeMap.put(afdVar, arrayMap);
        }
        new afi(treeMap);
    }

    @Override // defpackage.aff
    public final Object a(afd afdVar) {
        try {
            Map map = (Map) this.b.get(afdVar);
            if (map == null) {
                throw new IllegalArgumentException("Option does not exist: " + afdVar);
            }
            return map.get((afe) Collections.min(map.keySet()));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
