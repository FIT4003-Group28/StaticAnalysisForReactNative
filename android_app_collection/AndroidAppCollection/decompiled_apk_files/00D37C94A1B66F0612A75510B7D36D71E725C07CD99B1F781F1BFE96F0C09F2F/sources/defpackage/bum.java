package defpackage;
/* compiled from: PG */
/* renamed from: bum  reason: default package */
/* loaded from: classes2.dex */
public final class bum {
    public static final String a = bqf.b("WorkSpec");
    public static final acv b = new buj();
    public String c;
    public String d;
    public String e;
    public bpx f;
    public bpx g;
    public long h;
    public long i;
    public long j;
    public bpu k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public int t;

    public bum(bum bumVar) {
        this.r = 1;
        this.f = bpx.a;
        this.g = bpx.a;
        this.k = bpu.a;
        this.s = 1;
        this.m = 30000L;
        this.p = -1L;
        this.t = 1;
        this.c = bumVar.c;
        this.d = bumVar.d;
        this.r = bumVar.r;
        this.e = bumVar.e;
        this.f = new bpx(bumVar.f);
        this.g = new bpx(bumVar.g);
        this.h = bumVar.h;
        this.i = bumVar.i;
        this.j = bumVar.j;
        this.k = new bpu(bumVar.k);
        this.l = bumVar.l;
        this.s = bumVar.s;
        this.m = bumVar.m;
        this.n = bumVar.n;
        this.o = bumVar.o;
        this.p = bumVar.p;
        this.q = bumVar.q;
        this.t = bumVar.t;
    }

    public final void b(long j, long j2) {
        if (j < 900000) {
            bqf.a();
            bqf.g(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            bqf.a();
            bqf.g(a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            bqf.a();
            bqf.g(a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j)), new Throwable[0]);
            j2 = j;
        }
        this.i = j;
        this.j = j2;
    }

    public final boolean c() {
        return !bpu.a.equals(this.k);
    }

    public final boolean d() {
        return this.r == 1 && this.l > 0;
    }

    public final boolean e() {
        return this.i != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bum bumVar = (bum) obj;
            if (this.h != bumVar.h || this.i != bumVar.i || this.j != bumVar.j || this.l != bumVar.l || this.m != bumVar.m || this.n != bumVar.n || this.o != bumVar.o || this.p != bumVar.p || this.q != bumVar.q || !this.c.equals(bumVar.c) || this.r != bumVar.r || !this.d.equals(bumVar.d)) {
                return false;
            }
            String str = this.e;
            if (str == null ? bumVar.e != null : !str.equals(bumVar.e)) {
                return false;
            }
            if (this.f.equals(bumVar.f) && this.g.equals(bumVar.g) && this.k.equals(bumVar.k) && this.s == bumVar.s && this.t == bumVar.t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int i = this.r;
        adz.f(i);
        int hashCode2 = ((((hashCode * 31) + i) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.g.hashCode();
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int hashCode6 = (((((((((((((((hashCode2 + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.k.hashCode()) * 31) + this.l) * 31;
        int i2 = this.s;
        if (i2 != 0) {
            long j4 = this.m;
            long j5 = this.n;
            long j6 = this.o;
            long j7 = this.p;
            int i3 = (((((((((((hashCode6 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.q ? 1 : 0)) * 31;
            int i4 = this.t;
            if (i4 == 0) {
                throw null;
            }
            return i3 + i4;
        }
        throw null;
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + "}";
    }

    public final long a() {
        if (!d()) {
            long j = 0;
            if (!e()) {
                long j2 = this.n;
                if (j2 == 0) {
                    j2 = System.currentTimeMillis();
                }
                return j2 + this.h;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.n;
            long j4 = j3 == 0 ? currentTimeMillis + this.h : j3;
            long j5 = this.j;
            long j6 = this.i;
            if (j5 != j6) {
                if (j3 == 0) {
                    j = -j5;
                }
                return j4 + j6 + j;
            }
            if (j3 != 0) {
                j = j6;
            }
            return j4 + j;
        }
        return this.n + Math.min(18000000L, this.s == 2 ? this.m * this.l : Math.scalb((float) this.m, this.l - 1));
    }

    public bum(String str, String str2) {
        this.r = 1;
        this.f = bpx.a;
        this.g = bpx.a;
        this.k = bpu.a;
        this.s = 1;
        this.m = 30000L;
        this.p = -1L;
        this.t = 1;
        this.c = str;
        this.d = str2;
    }
}
