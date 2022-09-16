package defpackage;
/* compiled from: PG */
/* renamed from: pkr  reason: default package */
/* loaded from: classes4.dex */
public final class pkr {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public asm g = asm.a;

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b(long j) {
        return -1;
    }

    public final int c(int i) {
        return this.g.a(i).a();
    }

    public final long d(int i, int i2) {
        asl a = this.g.a(i);
        if (a.b != -1) {
            return a.e[i2];
        }
        return -9223372036854775807L;
    }

    public final void e(int i) {
        long j = this.g.a(i).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            pkr pkrVar = (pkr) obj;
            if (pxi.M(this.a, pkrVar.a) && pxi.M(this.b, pkrVar.b) && this.c == pkrVar.c && this.d == pkrVar.d && this.e == pkrVar.e && this.f == pkrVar.f && pxi.M(this.g, pkrVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        long j = this.g.b;
    }

    public final void g(int i) {
        boolean z = this.g.a(i).g;
    }

    public final void h(Object obj, Object obj2, long j, long j2, asm asmVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = 0;
        this.d = j;
        this.e = j2;
        this.g = asmVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((hashCode + i) * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final void i(Object obj, Object obj2, long j, long j2) {
        h(obj, obj2, j, j2, asm.a, false);
    }
}
