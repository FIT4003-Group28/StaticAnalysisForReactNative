package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: eaew  reason: default package */
/* loaded from: classes6.dex */
public final class eaew {
    private static final Comparator<String> a = new eaev();

    public static Map<String, List<String>> a(eadx eadxVar, String str) {
        TreeMap treeMap = new TreeMap(a);
        int b = eadxVar.b();
        for (int i = 0; i < b; i++) {
            String c = eadxVar.c(i);
            String d = eadxVar.d(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(c);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(d);
            treeMap.put(c, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
