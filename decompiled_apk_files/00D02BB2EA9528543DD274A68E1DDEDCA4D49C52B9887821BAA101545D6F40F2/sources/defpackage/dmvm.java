package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dmvm  reason: default package */
/* loaded from: classes.dex */
public class dmvm {
    protected int[] a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dmvm() {
        this.a = null;
    }

    public dmvm(int i) {
        int[] iArr = new int[i + i];
        this.a = iArr;
        Arrays.fill(iArr, -1);
    }

    public void a() {
        Arrays.fill(this.a, -1);
    }

    public final boolean b(int i) {
        return this.a[i + i] != -1;
    }

    public final int c(int i) {
        return this.a[i + i];
    }

    public final int d(int i) {
        return this.a[i + i + 1];
    }

    public final void e(int i, int i2, int i3) {
        int[] iArr = this.a;
        int i4 = i + i;
        iArr[i4] = i2;
        iArr[i4 + 1] = i3;
    }
}
