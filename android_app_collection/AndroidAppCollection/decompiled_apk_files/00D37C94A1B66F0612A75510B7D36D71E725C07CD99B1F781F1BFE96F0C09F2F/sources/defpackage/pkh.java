package defpackage;
/* compiled from: PG */
/* renamed from: pkh  reason: default package */
/* loaded from: classes4.dex */
public final class pkh {
    public static final pkh a;
    public static final pkh b;
    public static final pkh c;
    public final long d;
    public final long e;

    static {
        pkh pkhVar = new pkh(0L, 0L);
        a = pkhVar;
        new pkh(Long.MAX_VALUE, Long.MAX_VALUE);
        b = new pkh(Long.MAX_VALUE, 0L);
        new pkh(0L, Long.MAX_VALUE);
        c = pkhVar;
    }

    public pkh(long j, long j2) {
        boolean z = true;
        ptx.c(j >= 0);
        ptx.c(j2 < 0 ? false : z);
        this.d = j;
        this.e = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.d;
        if (j4 == 0 && this.e == 0) {
            return j;
        }
        long an = pxi.an(j, j4);
        long ac = pxi.ac(j, this.e);
        boolean z = true;
        boolean z2 = an <= j2 && j2 <= ac;
        if (an > j3 || j3 > ac) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : an : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pkh pkhVar = (pkh) obj;
            if (this.d == pkhVar.d && this.e == pkhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.d) * 31) + ((int) this.e);
    }
}
