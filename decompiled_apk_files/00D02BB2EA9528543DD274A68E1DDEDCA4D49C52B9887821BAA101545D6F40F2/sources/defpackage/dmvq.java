package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dmvq  reason: default package */
/* loaded from: classes.dex */
public final class dmvq extends dmvm {
    int b = 0;

    @Override // defpackage.dmvm
    public final void a() {
        this.b = 0;
    }

    public final void f(int i, int i2) {
        if (this.a == null) {
            this.a = new int[16];
            Arrays.fill(this.a, -1);
        }
        int i3 = this.b;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i3 + i3 == length) {
            this.a = new int[length + length];
            System.arraycopy(iArr, 0, this.a, 0, length);
            int[] iArr2 = this.a;
            Arrays.fill(iArr2, length, iArr2.length, -1);
        }
        int[] iArr3 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        iArr3[i5] = i;
        iArr3[i5 + 1] = i2;
        this.b = i4 + 1;
    }
}
