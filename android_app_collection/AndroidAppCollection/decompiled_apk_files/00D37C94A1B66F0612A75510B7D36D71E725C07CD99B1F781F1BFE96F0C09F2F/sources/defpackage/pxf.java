package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pxf  reason: default package */
/* loaded from: classes4.dex */
public final class pxf {
    private long[] a = new long[10];
    private Object[] b = new Object[10];
    private int c;
    private int d;

    private final Object g(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = h();
            j2 = j3;
        }
        return obj;
    }

    private final Object h() {
        ptx.e(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public final synchronized int a() {
        return this.d;
    }

    public final synchronized Object b(long j) {
        return g(j, false);
    }

    public final synchronized Object c() {
        if (this.d == 0) {
            return null;
        }
        return h();
    }

    public final synchronized Object d(long j) {
        return g(j, true);
    }

    public final synchronized void e(long j, Object obj) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                f();
            }
        }
        int length = this.b.length;
        if (this.d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.c;
            int i4 = length - i3;
            System.arraycopy(this.a, i3, jArr, 0, i4);
            System.arraycopy(this.b, this.c, objArr, 0, i4);
            int i5 = this.c;
            if (i5 > 0) {
                System.arraycopy(this.a, 0, jArr, i4, i5);
                System.arraycopy(this.b, 0, objArr, i4, this.c);
            }
            this.a = jArr;
            this.b = objArr;
            this.c = 0;
        }
        int i6 = this.c;
        int i7 = this.d;
        Object[] objArr2 = this.b;
        int length2 = (i6 + i7) % objArr2.length;
        this.a[length2] = j;
        objArr2[length2] = obj;
        this.d = i7 + 1;
    }

    public final synchronized void f() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }
}
