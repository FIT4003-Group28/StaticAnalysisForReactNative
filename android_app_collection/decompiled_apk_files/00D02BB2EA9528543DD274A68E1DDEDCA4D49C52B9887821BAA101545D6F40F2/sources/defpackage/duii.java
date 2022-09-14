package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: duii  reason: default package */
/* loaded from: classes6.dex */
class duii implements duhv {
    private final duhv a;
    private final long b;
    private final long c;
    private long d;

    public duii(duhv duhvVar, long j) {
        if (duhvVar.e() < Long.MAX_VALUE) {
            dbsk.a(j <= duhvVar.e() - (duhvVar.d() - duhvVar.c()));
        }
        this.a = duhvVar;
        this.b = duhvVar.d();
        this.c = j;
    }

    @Override // defpackage.duhv
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int a;
        int length = bArr.length;
        dbsk.b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - i >= i2, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min(i2, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.f();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.g(c);
            }
        }
        a = this.a.a(bArr, i, min);
        this.d += a;
        return a;
    }

    @Override // defpackage.duhv
    public final synchronized void b() {
    }

    @Override // defpackage.duhv
    public final synchronized long c() {
        throw null;
    }

    @Override // defpackage.duhv, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.duhv
    public final synchronized long d() {
        return this.d;
    }

    @Override // defpackage.duhv
    public final synchronized long e() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.duhv
    public final synchronized void f() {
        throw null;
    }

    @Override // defpackage.duhv
    public final synchronized long g(long j) {
        throw null;
    }

    @Override // defpackage.duhv
    public final synchronized long h() {
        return this.c;
    }

    @Override // defpackage.duhv
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
