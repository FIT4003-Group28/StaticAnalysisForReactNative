package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ayhg  reason: default package */
/* loaded from: classes2.dex */
final class ayhg {
    final int a;
    final long b;
    final Set c;

    public ayhg(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = amvn.p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayhg ayhgVar = (ayhg) obj;
            if (this.a == ayhgVar.a && this.b == ayhgVar.b && akzj.f(this.c, ayhgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.e("maxAttempts", this.a);
        c.f("hedgingDelayNanos", this.b);
        c.b("nonFatalStatusCodes", this.c);
        return c.toString();
    }
}
