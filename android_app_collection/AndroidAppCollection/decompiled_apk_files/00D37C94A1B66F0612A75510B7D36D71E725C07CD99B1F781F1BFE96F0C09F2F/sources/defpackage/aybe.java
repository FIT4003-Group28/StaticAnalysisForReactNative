package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aybe  reason: default package */
/* loaded from: classes2.dex */
public final class aybe {
    public final List a;
    public final axyb b;
    public final ayba c;

    public aybe(List list, axyb axybVar, ayba aybaVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        axybVar.getClass();
        this.b = axybVar;
        this.c = aybaVar;
    }

    public static aybd a() {
        return new aybd();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aybe)) {
            return false;
        }
        aybe aybeVar = (aybe) obj;
        return akzj.f(this.a, aybeVar.a) && akzj.f(this.b, aybeVar.b) && akzj.f(this.c, aybeVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("addresses", this.a);
        c.b("attributes", this.b);
        c.b("serviceConfig", this.c);
        return c.toString();
    }
}
