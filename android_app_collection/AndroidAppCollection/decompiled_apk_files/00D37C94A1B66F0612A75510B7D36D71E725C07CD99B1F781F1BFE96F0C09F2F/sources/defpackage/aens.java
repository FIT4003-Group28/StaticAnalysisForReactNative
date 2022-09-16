package defpackage;
/* compiled from: PG */
/* renamed from: aens  reason: default package */
/* loaded from: classes.dex */
public final class aens {
    public final long a;
    public final long b;

    public aens() {
    }

    public aens(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static aens a(long j, long j2) {
        if (j > j2) {
            afus.b(1, 8, "start_byte_greater_than_end_byte");
        }
        return new aens(j, j2);
    }

    public final boolean b(long j) {
        return this.a <= j && this.b > j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aens) {
            aens aensVar = (aens) obj;
            if (this.a == aensVar.a && this.b == aensVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("ByteRange{start=");
        sb.append(j);
        sb.append(", end=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
