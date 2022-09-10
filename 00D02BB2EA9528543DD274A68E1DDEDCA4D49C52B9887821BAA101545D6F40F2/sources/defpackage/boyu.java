package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: boyu  reason: default package */
/* loaded from: classes3.dex */
public final class boyu {
    /* JADX WARN: Incorrect return type in method signature: (Lcfll;Ljava/util/List<Lakqs;>;Z)Ljava/lang/Object; */
    public static int a(cfll cfllVar, List list, boolean z) {
        List list2 = list;
        while (!list2.isEmpty() && !cfllVar.b(list2)) {
            list2 = list.subList(0, list2.size() - 1);
        }
        if (cfllVar.a(list2).isEmpty()) {
            return z ? 1 : 3;
        }
        return 2;
    }

    public static boolean b(cflq cflqVar, Iterable<Long> iterable) {
        for (Long l : iterable) {
            if (!cflqVar.b(l.longValue()).a()) {
                return false;
            }
        }
        return true;
    }

    public static List<akqs> c(cflq cflqVar, Iterable<Long> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Long l : iterable) {
            dbsg<cflx> b = cflqVar.b(l.longValue());
            if (b.a()) {
                akrk b2 = b.b().b();
                if (b2.l() > 0) {
                    arrayList.add(akqo.k(b2.m(0).S(), 350.0d));
                    arrayList.add(akqo.k(b2.p().S(), 350.0d));
                }
            }
        }
        return arrayList;
    }
}
