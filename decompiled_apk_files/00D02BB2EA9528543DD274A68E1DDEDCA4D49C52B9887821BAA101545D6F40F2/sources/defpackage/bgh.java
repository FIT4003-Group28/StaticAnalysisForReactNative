package defpackage;
/* compiled from: PG */
/* renamed from: bgh  reason: default package */
/* loaded from: classes3.dex */
public final class bgh {
    public String a;
    public String b;
    public String c;
    public bbp d;
    public bbp e;
    public long f;
    public long g;
    public long h;
    public bbl i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public int p;
    public int q;

    static {
        bbz.f("WorkSpec");
    }

    public bgh(bgh bghVar) {
        this.p = 1;
        this.d = bbp.a;
        this.e = bbp.a;
        this.i = bbl.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.a = bghVar.a;
        this.b = bghVar.b;
        this.p = bghVar.p;
        this.c = bghVar.c;
        this.d = new bbp(bghVar.d);
        this.e = new bbp(bghVar.e);
        this.f = bghVar.f;
        this.g = bghVar.g;
        this.h = bghVar.h;
        this.i = new bbl(bghVar.i);
        this.j = bghVar.j;
        this.q = bghVar.q;
        this.k = bghVar.k;
        this.l = bghVar.l;
        this.m = bghVar.m;
        this.n = bghVar.n;
        this.o = bghVar.o;
    }

    public final boolean a() {
        return this.g != 0;
    }

    public final boolean b() {
        return this.p == 1 && this.j > 0;
    }

    public final void c(long j, long j2) {
        if (j < 900000) {
            bbz.e();
            j = 900000;
        }
        if (j2 < 300000) {
            bbz.e();
            j2 = 300000;
        }
        if (j2 > j) {
            bbz.e();
            j2 = j;
        }
        this.g = j;
        this.h = j2;
    }

    public final long d() {
        if (b()) {
            return this.l + Math.min(18000000L, this.q == 2 ? this.k * this.j : Math.scalb((float) this.k, this.j - 1));
        }
        long j = 0;
        if (!a()) {
            long j2 = this.l;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return j2 + this.f;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.l;
        long j4 = j3 == 0 ? currentTimeMillis + this.f : j3;
        long j5 = this.h;
        long j6 = this.g;
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

    public final boolean e() {
        return !bbl.a.equals(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgh)) {
            return false;
        }
        bgh bghVar = (bgh) obj;
        if (this.f != bghVar.f || this.g != bghVar.g || this.h != bghVar.h || this.j != bghVar.j || this.k != bghVar.k || this.l != bghVar.l || this.m != bghVar.m || this.n != bghVar.n || this.o != bghVar.o || !this.a.equals(bghVar.a) || this.p != bghVar.p || !this.b.equals(bghVar.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? bghVar.c != null : !str.equals(bghVar.c)) {
            return false;
        }
        return this.d.equals(bghVar.d) && this.e.equals(bghVar.e) && this.i.equals(bghVar.i) && this.q == bghVar.q;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.p;
        bck.c(i);
        int hashCode2 = ((((hashCode * 31) + i) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        int hashCode6 = (((((((((((((((hashCode2 + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.i.hashCode()) * 31) + this.j) * 31;
        int i2 = this.q;
        if (i2 != 0) {
            long j4 = this.k;
            long j5 = this.l;
            long j6 = this.m;
            long j7 = this.n;
            return ((((((((((hashCode6 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.o ? 1 : 0);
        }
        throw null;
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public bgh(String str, String str2) {
        this.p = 1;
        this.d = bbp.a;
        this.e = bbp.a;
        this.i = bbl.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.a = str;
        this.b = str2;
    }
}
