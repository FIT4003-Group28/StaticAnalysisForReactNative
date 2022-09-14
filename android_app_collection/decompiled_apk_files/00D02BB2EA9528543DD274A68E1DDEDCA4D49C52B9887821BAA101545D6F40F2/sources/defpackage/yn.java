package defpackage;
/* compiled from: PG */
/* renamed from: yn  reason: default package */
/* loaded from: classes.dex */
public final class yn {
    long a = 0;
    yn b;

    private final void h() {
        if (this.b == null) {
            this.b = new yn();
        }
    }

    public final void a(int i) {
        if (i < 64) {
            this.a |= 1 << i;
            return;
        }
        h();
        this.b.a(i - 64);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (i < 64) {
            this.a &= (1 << i) ^ (-1);
            return;
        }
        yn ynVar = this.b;
        if (ynVar == null) {
            return;
        }
        ynVar.b(i - 64);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        h();
        return this.b.c(i - 64);
    }

    public final void d() {
        this.a = 0L;
        yn ynVar = this.b;
        if (ynVar != null) {
            ynVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, boolean z) {
        if (i >= 64) {
            h();
            this.b.e(i - 64, z);
            return;
        }
        long j = this.a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        long j3 = ((-1) ^ j2) & j;
        this.a = (j & j2) | (j3 + j3);
        if (z) {
            a(i);
        } else {
            b(i);
        }
        if (!z2 && this.b == null) {
            return;
        }
        h();
        this.b.e(0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(int i) {
        if (i >= 64) {
            h();
            return this.b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ (-1));
        this.a = j3;
        long j4 = j - 1;
        this.a = Long.rotateRight((j4 ^ (-1)) & j3, 1) | (j3 & j4);
        yn ynVar = this.b;
        if (ynVar != null) {
            if (ynVar.c(0)) {
                a(63);
            }
            this.b.f(0);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(int i) {
        yn ynVar = this.b;
        return ynVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : ynVar.g(i - 64) + Long.bitCount(this.a);
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
