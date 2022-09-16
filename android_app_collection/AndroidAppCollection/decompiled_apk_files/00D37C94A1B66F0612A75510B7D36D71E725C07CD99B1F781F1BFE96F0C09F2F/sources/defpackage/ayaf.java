package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayaf  reason: default package */
/* loaded from: classes2.dex */
public final class ayaf {
    public final List a;
    public final axyb b;
    public final Object c;

    public ayaf(List list, axyb axybVar, Object obj) {
        list.getClass();
        this.a = Collections.unmodifiableList(new ArrayList(list));
        axybVar.getClass();
        this.b = axybVar;
        this.c = obj;
    }

    public static ayae a() {
        return new ayae();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayaf)) {
            return false;
        }
        ayaf ayafVar = (ayaf) obj;
        return akzj.f(this.a, ayafVar.a) && akzj.f(this.b, ayafVar.b) && akzj.f(this.c, ayafVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("addresses", this.a);
        c.b("attributes", this.b);
        c.b("loadBalancingPolicyConfig", this.c);
        return c.toString();
    }
}
