package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aymc  reason: default package */
/* loaded from: classes2.dex */
public final class aymc {
    public final String a;
    public final Map b;

    public aymc(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aymc) {
            aymc aymcVar = (aymc) obj;
            if (this.a.equals(aymcVar.a) && this.b.equals(aymcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("policyName", this.a);
        c.b("rawConfigValue", this.b);
        return c.toString();
    }
}
