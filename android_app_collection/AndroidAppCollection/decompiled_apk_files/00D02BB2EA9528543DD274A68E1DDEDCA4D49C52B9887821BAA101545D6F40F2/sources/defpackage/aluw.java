package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aluw  reason: default package */
/* loaded from: classes.dex */
public final class aluw {
    public static Set<alyh> a(alvb alvbVar, Set<alyh> set, akra akraVar) {
        LinkedHashSet h = dcnm.h();
        for (alyh alyhVar : set) {
            alyh a = alvbVar.a(alyhVar, akraVar);
            if (a != null) {
                h.add(a);
            }
        }
        return h;
    }
}
