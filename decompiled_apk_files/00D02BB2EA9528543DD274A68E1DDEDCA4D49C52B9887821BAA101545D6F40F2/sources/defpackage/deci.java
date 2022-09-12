package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: deci  reason: default package */
/* loaded from: classes.dex */
public final class deci {
    private int[] a;
    private int b = 0;

    public deci(int i) {
        this.a = new int[i];
    }

    public final decj a() {
        int i = this.b;
        if (i == 0) {
            return decj.a;
        }
        return new decj(this.a, i);
    }

    public final void b(int i) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(iArr, i3);
        }
        int[] iArr2 = this.a;
        int i4 = this.b;
        iArr2[i4] = i;
        this.b = i4 + 1;
    }
}
