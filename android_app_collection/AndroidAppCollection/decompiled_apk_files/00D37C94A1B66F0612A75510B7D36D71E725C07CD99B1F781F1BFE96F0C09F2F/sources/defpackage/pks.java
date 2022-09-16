package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pks  reason: default package */
/* loaded from: classes4.dex */
public final class pks {
    public static final Object a = new Object();
    private static final pjc r;
    @Deprecated
    public Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    @Deprecated
    public boolean j;
    public pja k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;
    public Object b = a;
    public pjc d = r;

    static {
        pix pixVar = new pix();
        pixVar.b("com.google.android.exoplayer2.Timeline");
        pixVar.a = Uri.EMPTY;
        r = pixVar.a();
    }

    public final long a() {
        return phk.d(this.m);
    }

    public final long b() {
        return phk.d(this.n);
    }

    public final long c() {
        return phk.d(this.q);
    }

    public final boolean d() {
        ptx.e(this.j == (this.k != null));
        return this.k != null;
    }

    public final void e(Object obj, pjc pjcVar, long j, long j2, boolean z, boolean z2, pja pjaVar, long j3, long j4, long j5) {
        pjb pjbVar;
        this.b = obj;
        this.d = pjcVar != null ? pjcVar : r;
        Object obj2 = null;
        if (pjcVar != null && (pjbVar = pjcVar.b) != null) {
            obj2 = pjbVar.h;
        }
        this.c = obj2;
        this.e = j;
        this.f = j2;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = pjaVar != null;
        this.k = pjaVar;
        this.m = j3;
        this.n = j4;
        this.o = 0;
        this.p = 0;
        this.q = j5;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            pks pksVar = (pks) obj;
            if (pxi.M(this.b, pksVar.b) && pxi.M(this.d, pksVar.d) && pxi.M(null, null) && pxi.M(this.k, pksVar.k) && this.e == pksVar.e && this.f == pksVar.f && this.g == pksVar.g && this.h == pksVar.h && this.i == pksVar.i && this.l == pksVar.l && this.m == pksVar.m && this.n == pksVar.n && this.o == pksVar.o && this.p == pksVar.p && this.q == pksVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + 217) * 31) + this.d.hashCode()) * 961;
        pja pjaVar = this.k;
        int hashCode2 = pjaVar == null ? 0 : pjaVar.hashCode();
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.l;
        long j4 = this.m;
        long j5 = this.n;
        int i = this.o;
        int i2 = this.p;
        long j6 = this.q;
        return ((((((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i) * 31) + i2) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
