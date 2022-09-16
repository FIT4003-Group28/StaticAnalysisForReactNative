package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public final class b {
    public final Map<i, List<c>> a = new HashMap();
    final Map<c, i> b;

    public b(Map<c, i> map) {
        this.b = map;
        for (Map.Entry<c, i> entry : map.entrySet()) {
            i value = entry.getValue();
            List<c> list = this.a.get(value);
            if (list == null) {
                list = new ArrayList<>();
                this.a.put(value, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void a(List<c> list, m mVar, i iVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                c cVar = list.get(size);
                try {
                    int i = cVar.a;
                    if (i == 0) {
                        cVar.b.invoke(obj, new Object[0]);
                    } else if (i != 1) {
                        cVar.b.invoke(obj, mVar, iVar);
                    } else {
                        cVar.b.invoke(obj, mVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
