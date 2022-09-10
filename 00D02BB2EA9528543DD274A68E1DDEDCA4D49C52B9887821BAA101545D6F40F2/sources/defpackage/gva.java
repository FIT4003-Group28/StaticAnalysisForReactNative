package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: gva  reason: default package */
/* loaded from: classes6.dex */
public final class gva {
    public static List<cqix<?>> a(List<cqix<?>> list, cqiw<cqkp> cqiwVar) {
        if (list.size() <= 1) {
            return list;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList((size + size) - 1);
        boolean z = false;
        for (cqix<?> cqixVar : list) {
            if (z) {
                arrayList.add(cqgr.fT(cqiwVar, new guy()));
            }
            arrayList.add(cqixVar);
            z = true;
        }
        return arrayList;
    }

    public static <V extends cqkp> void b(cqiv cqivVar, Iterable<? extends V> iterable, cqiw<V> cqiwVar, cqiw<cqkp> cqiwVar2) {
        boolean z = false;
        for (V v : iterable) {
            if (z) {
                cqivVar.a(cqiwVar2, v);
            }
            cqivVar.a(cqiwVar, v);
            z = true;
        }
    }

    public static <V extends cqkp, D extends cqkp> void c(cqiv cqivVar, V v, cqiw<V> cqiwVar, D d, cqiw<D> cqiwVar2) {
        if (cqivVar.i() > 0) {
            cqivVar.a(cqiwVar2, d);
        }
        cqivVar.a(cqiwVar, v);
    }
}
