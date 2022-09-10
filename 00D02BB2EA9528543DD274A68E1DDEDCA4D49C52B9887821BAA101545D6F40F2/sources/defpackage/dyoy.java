package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dyoy  reason: default package */
/* loaded from: classes6.dex */
final class dyoy {
    final int a;
    final long b;
    final Set<dyiy> c;

    public dyoy(int i, long j, Set<dyiy> set) {
        this.a = i;
        this.b = j;
        this.c = dcep.K(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyoy dyoyVar = (dyoy) obj;
            if (this.a == dyoyVar.a && this.b == dyoyVar.b && dbsd.a(this.c, dyoyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("maxAttempts", this.a);
        b.g("hedgingDelayNanos", this.b);
        b.b("nonFatalStatusCodes", this.c);
        return b.toString();
    }
}
