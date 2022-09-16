package defpackage;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: tkf  reason: default package */
/* loaded from: classes4.dex */
final class tkf {
    public final EnumSet a = EnumSet.noneOf(tke.class);
    public final EnumMap b = new EnumMap(tke.class);

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((tke) it.next()).n;
        }
        return i;
    }

    public final void b(tke tkeVar) {
        this.a.add(tkeVar);
        if (!this.b.containsKey(tkeVar)) {
            this.b.put((EnumMap) tkeVar, (tke) false);
        }
    }
}
