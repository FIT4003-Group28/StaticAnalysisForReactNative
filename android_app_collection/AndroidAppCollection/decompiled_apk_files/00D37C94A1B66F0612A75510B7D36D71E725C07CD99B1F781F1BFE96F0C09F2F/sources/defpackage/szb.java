package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: szb  reason: default package */
/* loaded from: classes4.dex */
public final class szb {
    public static final amuk a = amuk.w(syb.class, syw.class, syy.class, szc.class, szd.class, syu.class);

    public static Collection a(Map map) {
        return araa.p(((amup) map).values(), mem.s);
    }

    public static Collection b(Map map) {
        ArrayList arrayList = new ArrayList(araa.p(((amup) map).values(), mem.t));
        Collections.sort(arrayList, fay.p);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List c(Map map, Set set) {
        amuf amufVar = new amuf();
        for (Pair pair : ((amup) map).values()) {
            amufVar.h((tej) pair.first);
        }
        amufVar.j(set);
        return amufVar.g();
    }
}
