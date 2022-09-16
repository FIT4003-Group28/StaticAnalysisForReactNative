package defpackage;
/* compiled from: PG */
/* renamed from: ve  reason: default package */
/* loaded from: classes4.dex */
public final class ve {
    long a = 0;
    ve b;

    private final void h() {
        if (this.b == null) {
            this.b = new ve();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        ve veVar = this.b;
        if (veVar == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else {
            return veVar.a(i - 64) + Long.bitCount(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (i < 64) {
            this.a &= (1 << i) ^ (-1);
            return;
        }
        ve veVar = this.b;
        if (veVar == null) {
            return;
        }
        veVar.b(i - 64);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, boolean z) {
        if (i >= 64) {
            h();
            this.b.c(i - 64, z);
            return;
        }
        long j = this.a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        long j3 = ((-1) ^ j2) & j;
        this.a = (j & j2) | (j3 + j3);
        if (z) {
            e(i);
        } else {
            b(i);
        }
        if (!z2 && this.b == null) {
            return;
        }
        h();
        this.b.c(0, z2);
    }

    public final void d() {
        this.a = 0L;
        ve veVar = this.b;
        if (veVar != null) {
            veVar.d();
        }
    }

    public final void e(int i) {
        if (i < 64) {
            this.a |= 1 << i;
            return;
        }
        h();
        this.b.e(i - 64);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        h();
        return this.b.f(i - 64);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i) {
        if (i >= 64) {
            h();
            return this.b.g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ (-1));
        this.a = j3;
        long j4 = j - 1;
        this.a = Long.rotateRight((j4 ^ (-1)) & j3, 1) | (j3 & j4);
        ve veVar = this.b;
        if (veVar != null) {
            if (veVar.f(0)) {
                e(63);
            }
            this.b.g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
