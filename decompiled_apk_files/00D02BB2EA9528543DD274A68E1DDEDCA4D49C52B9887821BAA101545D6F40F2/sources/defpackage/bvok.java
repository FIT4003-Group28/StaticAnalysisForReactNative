package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bvok  reason: default package */
/* loaded from: classes.dex */
public final class bvok {
    public int[] a;
    public int b;

    public bvok() {
        this(16);
    }

    public bvok(int i) {
        this.a = new int[i];
    }

    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int[] iArr2 = new int[length + length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.a = iArr2;
        }
        int[] iArr3 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int[] c() {
        int i = this.b;
        int[] iArr = new int[i];
        System.arraycopy(this.a, 0, iArr, 0, i);
        return iArr;
    }

    public final void d() {
        this.b = 0;
    }

    public final int[] e(int i) {
        while (true) {
            int i2 = this.b;
            int[] iArr = this.a;
            int length = iArr.length;
            if (i2 + i > length) {
                this.a = Arrays.copyOf(iArr, length + length);
            } else {
                return iArr;
            }
        }
    }
}
