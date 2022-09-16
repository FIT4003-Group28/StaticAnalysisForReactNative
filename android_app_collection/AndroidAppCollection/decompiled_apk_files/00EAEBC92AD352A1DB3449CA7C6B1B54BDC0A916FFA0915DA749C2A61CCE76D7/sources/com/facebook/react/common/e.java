package com.facebook.react.common;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private long[] f5449a;

    /* renamed from: b  reason: collision with root package name */
    private int f5450b = 0;

    private e(int i) {
        this.f5449a = new long[i];
    }

    private void b() {
        int i = this.f5450b;
        if (i == this.f5449a.length) {
            long[] jArr = new long[Math.max(i + 1, (int) (i * 1.8d))];
            System.arraycopy(this.f5449a, 0, jArr, 0, this.f5450b);
            this.f5449a = jArr;
        }
    }

    public static e c(int i) {
        return new e(i);
    }

    public int a() {
        return this.f5450b;
    }

    public void a(int i) {
        int i2 = this.f5450b;
        if (i <= i2) {
            this.f5450b = i2 - i;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.f5450b);
    }

    public void a(int i, long j) {
        if (i < this.f5450b) {
            this.f5449a[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f5450b);
    }

    public void a(long j) {
        b();
        long[] jArr = this.f5449a;
        int i = this.f5450b;
        this.f5450b = i + 1;
        jArr[i] = j;
    }

    public long b(int i) {
        if (i < this.f5450b) {
            return this.f5449a[i];
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f5450b);
    }
}
