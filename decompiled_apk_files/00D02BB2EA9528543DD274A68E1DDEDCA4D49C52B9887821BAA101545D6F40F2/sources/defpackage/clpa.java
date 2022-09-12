package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: clpa  reason: default package */
/* loaded from: classes5.dex */
public final class clpa {
    public static final Object a = new Object();
    private static final clno q;
    public Object b = a;
    public clno c = q;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public long n;
    public long o;
    public long p;

    static {
        clnj clnjVar = new clnj();
        clnjVar.a = "com.google.android.exoplayer2.Timeline";
        clnjVar.b = Uri.EMPTY;
        q = clnjVar.a();
    }

    public final long a() {
        return cllt.a(this.n);
    }

    public final long b() {
        return cllt.a(this.o);
    }

    public final void c(Object obj, clno clnoVar, boolean z, boolean z2, boolean z3, long j) {
        this.b = obj;
        if (clnoVar == null) {
            clnoVar = q;
        }
        this.c = clnoVar;
        this.d = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.n = 0L;
        this.o = j;
        this.l = 0;
        this.m = 0;
        this.p = 0L;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            clpa clpaVar = (clpa) obj;
            if (cmny.b(this.b, clpaVar.b) && cmny.b(this.c, clpaVar.c) && cmny.b(null, null) && this.e == clpaVar.e && this.f == clpaVar.f && this.g == clpaVar.g && this.h == clpaVar.h && this.i == clpaVar.i && this.j == clpaVar.j && this.k == clpaVar.k && this.n == clpaVar.n && this.o == clpaVar.o && this.l == clpaVar.l && this.m == clpaVar.m && this.p == clpaVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.k;
        long j4 = this.n;
        long j5 = this.o;
        int i = this.l;
        int i2 = this.m;
        long j6 = this.p;
        return ((((((((((((((((((((((((((hashCode + 217) * 31) + hashCode2) * 961) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i) * 31) + i2) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
