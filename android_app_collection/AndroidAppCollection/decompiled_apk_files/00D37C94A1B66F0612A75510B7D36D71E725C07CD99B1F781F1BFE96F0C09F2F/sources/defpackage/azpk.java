package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azpk  reason: default package */
/* loaded from: classes2.dex */
public final class azpk {
    public final Object a;
    public final long b;
    final TimeUnit c;

    public azpk(Object obj, long j, TimeUnit timeUnit) {
        this.a = obj;
        this.b = j;
        ayrd.b(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azpk) {
            azpk azpkVar = (azpk) obj;
            if (ayrd.a(this.a, azpkVar.a) && this.b == azpkVar.b && ayrd.a(this.c, azpkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("Timed[time=");
        sb.append(j);
        sb.append(", unit=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
