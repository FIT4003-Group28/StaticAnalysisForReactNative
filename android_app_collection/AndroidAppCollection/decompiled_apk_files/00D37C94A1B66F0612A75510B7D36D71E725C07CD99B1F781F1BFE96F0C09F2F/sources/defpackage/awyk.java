package defpackage;
/* compiled from: PG */
/* renamed from: awyk  reason: default package */
/* loaded from: classes2.dex */
final class awyk implements awxx {
    private final awxx a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public awyk(awxx awxxVar, int i) {
        boolean z = true;
        aqxo.q(i > 0, "Chunk granularity must be greater than 0.");
        long j = i;
        aqxo.q(j < awxxVar.d(), "Chunk granularity must be smaller than the read ahead limit.");
        long e = awxxVar.e();
        long a = awxxVar.a();
        if (a < 0) {
            while (awxxVar.i() && awxxVar.e() - awxxVar.c() < awxxVar.d()) {
                awxxVar.f(awxxVar.d());
            }
            a = awxxVar.e();
            awxxVar.h();
            awxxVar.f(e - awxxVar.c());
        } else {
            long c = awxxVar.c() + awxxVar.d();
            if (c > 0 && c < a) {
                a = c;
            }
        }
        long j2 = ((a - e) / j) * j;
        if (awxxVar.d() < Long.MAX_VALUE) {
            aqxo.p(j2 > awxxVar.d() - (awxxVar.e() - awxxVar.c()) ? false : z);
        }
        this.a = awxxVar;
        this.b = awxxVar.e();
        this.c = j2;
    }

    @Override // defpackage.awxx
    public final synchronized long a() {
        return this.c;
    }

    @Override // defpackage.awxx
    public final synchronized int b(byte[] bArr, int i, int i2) {
        int b;
        aqxo.q(bArr.length - i >= i2, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min(i2, this.c - this.d);
        if (this.b + this.d != this.a.e()) {
            this.a.h();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.f(c);
            }
        }
        b = this.a.b(bArr, i, min);
        this.d += b;
        return b;
    }

    @Override // defpackage.awxx
    public final synchronized long c() {
        return this.e;
    }

    @Override // defpackage.awxx, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.awxx
    public final synchronized long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awxx
    public final synchronized long e() {
        return this.d;
    }

    @Override // defpackage.awxx
    public final synchronized long f(long j) {
        long f;
        long min = Math.min(j, this.c - this.d);
        if (this.b + this.d != this.a.e()) {
            this.a.h();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.f(c);
            }
        }
        f = this.a.f(min);
        this.d += f;
        return f;
    }

    @Override // defpackage.awxx
    public final synchronized void g() {
        this.e = this.d;
    }

    @Override // defpackage.awxx
    public final synchronized void h() {
        this.d = this.e;
    }

    @Override // defpackage.awxx
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
