package defpackage;
/* compiled from: PG */
/* renamed from: phl  reason: default package */
/* loaded from: classes4.dex */
public final class phl {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    private long n = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public float i = 0.97f;
    public float h = 1.03f;
    public float j = 1.0f;
    public long k = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public long m = -9223372036854775807L;

    public phl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long c(long j, long j2) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final void a() {
        long j = this.c;
        if (j != -9223372036854775807L) {
            long j2 = this.n;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.d == j) {
            return;
        }
        this.d = j;
        this.g = j;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void b(long j) {
        this.n = j;
        a();
    }
}
