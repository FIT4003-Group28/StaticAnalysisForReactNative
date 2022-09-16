package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: decg  reason: default package */
/* loaded from: classes6.dex */
public final class decg {
    public double[] a;
    public int b = 0;

    public decg(int i) {
        this.a = new double[i];
    }

    public final void a(double d) {
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i > length) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        double[] dArr2 = this.a;
        int i3 = this.b;
        dArr2[i3] = d;
        this.b = i3 + 1;
    }
}
