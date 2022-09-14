package com.facebook.react.b;
/* compiled from: LongArray.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private long[] f3176a;

    /* renamed from: b  reason: collision with root package name */
    private int f3177b = 0;

    public static e a(int i) {
        return new e(i);
    }

    private e(int i) {
        this.f3176a = new long[i];
    }

    public void a(long j) {
        b();
        long[] jArr = this.f3176a;
        int i = this.f3177b;
        this.f3177b = i + 1;
        jArr[i] = j;
    }

    public long b(int i) {
        if (i >= this.f3177b) {
            throw new IndexOutOfBoundsException("" + i + " >= " + this.f3177b);
        }
        return this.f3176a[i];
    }

    public void a(int i, long j) {
        if (i >= this.f3177b) {
            throw new IndexOutOfBoundsException("" + i + " >= " + this.f3177b);
        }
        this.f3176a[i] = j;
    }

    public int a() {
        return this.f3177b;
    }

    public void c(int i) {
        if (i > this.f3177b) {
            throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.f3177b);
        }
        this.f3177b -= i;
    }

    private void b() {
        if (this.f3177b == this.f3176a.length) {
            long[] jArr = new long[Math.max(this.f3177b + 1, (int) (this.f3177b * 1.8d))];
            System.arraycopy(this.f3176a, 0, jArr, 0, this.f3177b);
            this.f3176a = jArr;
        }
    }
}
