package defpackage;
/* compiled from: PG */
/* renamed from: pjg  reason: default package */
/* loaded from: classes4.dex */
final class pjg {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ppz i;

    public pjg(ppz ppzVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        ptx.c(!z3 || z);
        ptx.c(!z2 || z);
        ptx.c(true);
        this.i = ppzVar;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = false;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final pjg a(long j) {
        return j == this.b ? this : new pjg(this.i, this.a, j, this.c, this.d, this.f, this.g, this.h);
    }

    public final pjg b(long j) {
        return j == this.a ? this : new pjg(this.i, j, this.b, this.c, this.d, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pjg pjgVar = (pjg) obj;
            if (this.a == pjgVar.a && this.b == pjgVar.b && this.c == pjgVar.c && this.d == pjgVar.d && this.f == pjgVar.f && this.g == pjgVar.g && this.h == pjgVar.h && pxi.M(this.i, pjgVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.i.hashCode() + 527) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
