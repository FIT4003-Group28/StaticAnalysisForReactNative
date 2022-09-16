package defpackage;
/* compiled from: PG */
/* renamed from: cllu  reason: default package */
/* loaded from: classes5.dex */
public final class cllu {
    public final long a;
    public long b = -9223372036854775807L;
    private long m = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public float h = 0.97f;
    public float g = 1.03f;
    public float i = 1.0f;
    public long j = -9223372036854775807L;
    public long c = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long k = -9223372036854775807L;
    public long l = -9223372036854775807L;

    public cllu(long j) {
        this.a = j;
    }

    public static long c(long j, long j2) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final void a(long j) {
        this.m = j;
        b();
    }

    public final void b() {
        long j = this.b;
        if (j != -9223372036854775807L) {
            long j2 = this.m;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.d;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.e;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.c == j) {
            return;
        }
        this.c = j;
        this.f = j;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }
}
