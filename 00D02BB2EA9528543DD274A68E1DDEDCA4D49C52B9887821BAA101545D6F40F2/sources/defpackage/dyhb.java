package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyhb  reason: default package */
/* loaded from: classes6.dex */
public final class dyhb {
    public final List<dyfw> a;
    public final dyel b;
    @dzsi
    public final Object c;

    public dyhb(List<dyfw> list, dyel dyelVar, Object obj) {
        dbsk.t(list, "addresses");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        dbsk.t(dyelVar, "attributes");
        this.b = dyelVar;
        this.c = obj;
    }

    public static dyha a() {
        return new dyha();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyhb)) {
            return false;
        }
        dyhb dyhbVar = (dyhb) obj;
        return dbsd.a(this.a, dyhbVar.a) && dbsd.a(this.b, dyhbVar.b) && dbsd.a(this.c, dyhbVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("addresses", this.a);
        b.b("attributes", this.b);
        b.b("loadBalancingPolicyConfig", this.c);
        return b.toString();
    }
}
