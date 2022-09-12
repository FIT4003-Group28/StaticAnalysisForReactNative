package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cwol  reason: default package */
/* loaded from: classes5.dex */
final class cwol {
    public static final void a(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        cwlq k = cwls.k();
        k.b(str);
        map.put(str, k);
    }
}
