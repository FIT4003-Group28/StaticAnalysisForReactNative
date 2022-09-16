package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cppk  reason: default package */
/* loaded from: classes5.dex */
final class cppk {
    public int[] a;
    public int b;
    public int c;

    public cppk(int i) {
        this.b = 0;
        this.c = 0;
        int[] iArr = new int[i];
        this.a = iArr;
        Arrays.fill(iArr, 1);
        int length = this.a.length;
        this.c = i >= length ? length : i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c; i3++) {
            i2 += this.a[i3];
        }
        this.b = i2;
    }
}
