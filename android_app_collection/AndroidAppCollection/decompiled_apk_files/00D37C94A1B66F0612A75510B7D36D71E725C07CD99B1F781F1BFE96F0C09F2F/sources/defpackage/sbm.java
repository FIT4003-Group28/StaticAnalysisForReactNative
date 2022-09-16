package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: sbm  reason: default package */
/* loaded from: classes4.dex */
final class sbm {
    public int[] a;
    public int b;
    public int c;

    public sbm(int i) {
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
