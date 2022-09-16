package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: ubz  reason: default package */
/* loaded from: classes4.dex */
public final class ubz {
    private final Long a;
    private final long b;

    public ubz() {
    }

    public ubz(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    public static ubz b() {
        ubv e = e();
        e.a = null;
        e.b(SystemClock.uptimeMillis());
        return e.a();
    }

    public static ubv e() {
        return new ubv();
    }

    public final long a() {
        Long l = this.a;
        l.getClass();
        return Math.max(0L, l.longValue() - (SystemClock.uptimeMillis() - this.b));
    }

    public final ubz c(long j) {
        if (d()) {
            return this;
        }
        ubv e = e();
        e.a = Long.valueOf(Math.max(0L, this.a.longValue() - j));
        e.b(this.b);
        return e.a();
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ubz) {
            ubz ubzVar = (ubz) obj;
            Long l = this.a;
            if (l != null ? l.equals(ubzVar.a) : ubzVar.a == null) {
                if (this.b == ubzVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Timeout{value=");
        sb.append(valueOf);
        sb.append(", startTime=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
