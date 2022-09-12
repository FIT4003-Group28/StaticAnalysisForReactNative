package defpackage;
/* compiled from: PG */
/* renamed from: clnr  reason: default package */
/* loaded from: classes5.dex */
final class clnr {
    public final cmeh a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public clnr(cmeh cmehVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.a = cmehVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final clnr a(long j) {
        return j == this.b ? this : new clnr(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clnr clnrVar = (clnr) obj;
            if (this.b == clnrVar.b && this.c == clnrVar.c && this.d == clnrVar.d && this.e == clnrVar.e && this.f == clnrVar.f && this.g == clnrVar.g && this.h == clnrVar.h && cmny.b(this.a, clnrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
