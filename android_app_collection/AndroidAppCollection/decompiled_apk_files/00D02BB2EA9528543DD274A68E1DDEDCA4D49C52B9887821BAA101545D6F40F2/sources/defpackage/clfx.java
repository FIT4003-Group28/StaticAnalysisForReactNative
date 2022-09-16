package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: clfx  reason: default package */
/* loaded from: classes5.dex */
final class clfx extends clgc {
    private final long a;
    private final long b;
    private final Set<clgd> c;

    public clfx(long j, long j2, Set<clgd> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // defpackage.clgc
    public final long a() {
        return this.a;
    }

    @Override // defpackage.clgc
    public final long b() {
        return this.b;
    }

    @Override // defpackage.clgc
    public final Set<clgd> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clgc) {
            clgc clgcVar = (clgc) obj;
            if (this.a == clgcVar.a() && this.b == clgcVar.b() && this.c.equals(clgcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 85);
        sb.append("ConfigValue{delta=");
        sb.append(j);
        sb.append(", maxAllowedDelay=");
        sb.append(j2);
        sb.append(", flags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
