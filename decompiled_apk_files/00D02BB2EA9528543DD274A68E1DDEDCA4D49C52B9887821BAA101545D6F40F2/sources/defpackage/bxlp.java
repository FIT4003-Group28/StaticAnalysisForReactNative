package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bxlp  reason: default package */
/* loaded from: classes4.dex */
final class bxlp {
    public static final void a(bxlq bxlqVar, Set set, Set set2, List list) {
        set.add(bxlqVar.a);
        Long l = bxlqVar.b;
        if (l != null) {
            set2.add(l);
        }
        dcvs dcvsVar = bxlqVar.c;
        if (dcvsVar != null) {
            list.add(dcvsVar);
        }
    }

    public static final boolean b(bxlq bxlqVar, Set set, Set set2, List list) {
        if (set.contains(bxlqVar.a) || set2.contains(bxlqVar.b)) {
            return true;
        }
        if (bxlqVar.c == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (bxlqVar.c.l((dcvs) it.next()).b * 6371010.0d <= 50.0d) {
                return true;
            }
        }
        return false;
    }
}
