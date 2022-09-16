package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: c  reason: default package */
/* loaded from: classes2.dex */
public final class c {
    public final Map a = new HashMap();
    final Map b;

    public c(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            aps apsVar = (aps) entry.getValue();
            List list = (List) this.a.get(apsVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(apsVar, list);
            }
            list.add((d) entry.getKey());
        }
    }

    public static void a(List list, apy apyVar, aps apsVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                d dVar = (d) list.get(size);
                try {
                    int i = dVar.a;
                    if (i == 0) {
                        dVar.b.invoke(obj, new Object[0]);
                    } else if (i != 1) {
                        dVar.b.invoke(obj, apyVar, apsVar);
                    } else {
                        dVar.b.invoke(obj, apyVar);
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
