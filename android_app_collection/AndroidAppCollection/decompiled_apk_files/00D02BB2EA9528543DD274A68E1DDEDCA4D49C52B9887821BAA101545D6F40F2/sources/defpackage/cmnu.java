package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmnu  reason: default package */
/* loaded from: classes5.dex */
public final class cmnu<V> {
    private long[] a = new long[10];
    private V[] b = (V[]) new Object[10];
    private int c;
    private int d;

    private final V f() {
        cmmn.c(this.d > 0);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public final synchronized void a(long j, V v) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                b();
            }
        }
        int length = this.b.length;
        if (this.d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = (V[]) new Object[i2];
            int i3 = this.c;
            int i4 = length - i3;
            System.arraycopy(this.a, i3, jArr, 0, i4);
            System.arraycopy(this.b, this.c, vArr, 0, i4);
            int i5 = this.c;
            if (i5 > 0) {
                System.arraycopy(this.a, 0, jArr, i4, i5);
                System.arraycopy(this.b, 0, vArr, i4, this.c);
            }
            this.a = jArr;
            this.b = vArr;
            this.c = 0;
        }
        int i6 = this.c;
        int i7 = this.d;
        V[] vArr2 = this.b;
        int length2 = (i6 + i7) % vArr2.length;
        this.a[length2] = j;
        vArr2[length2] = v;
        this.d = i7 + 1;
    }

    public final synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final synchronized int c() {
        return this.d;
    }

    public final synchronized V d() {
        if (this.d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized V e(long j) {
        V v;
        v = null;
        while (this.d > 0 && j - this.a[this.c] >= 0) {
            v = f();
        }
        return v;
    }
}
