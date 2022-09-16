package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: afht  reason: default package */
/* loaded from: classes2.dex */
public final class afht {
    public final dqvj a;
    public final Set<afhq> b;
    private final boolean c;

    public afht(dqvj dqvjVar, boolean z, Set<afhq> set) {
        dbsk.s(dqvjVar);
        this.a = dqvjVar;
        this.c = z;
        dbsk.s(set);
        this.b = set;
    }

    public final String toString() {
        dbsb d = dbsc.d(getClass().getName());
        d.b("travelMode", this.a);
        d.h("isIndoor", this.c);
        d.b("avoidFlags", this.b);
        return d.toString();
    }
}
