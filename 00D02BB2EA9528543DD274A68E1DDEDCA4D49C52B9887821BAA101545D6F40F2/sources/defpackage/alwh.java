package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alwh  reason: default package */
/* loaded from: classes.dex */
public final class alwh {
    public static <T> void a(T t, @dzsi altw altwVar, Map<altv, List<T>> map) {
        if (altwVar == null || altwVar.a.isEmpty()) {
            return;
        }
        altv altvVar = altwVar.a.get(0);
        List<T> list = map.get(altvVar);
        if (list == null) {
            list = new ArrayList<>();
            map.put(altvVar, list);
        }
        list.add(t);
    }
}
