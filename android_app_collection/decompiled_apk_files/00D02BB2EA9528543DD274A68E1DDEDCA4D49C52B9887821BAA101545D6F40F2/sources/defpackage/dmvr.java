package defpackage;
/* compiled from: PG */
/* renamed from: dmvr  reason: default package */
/* loaded from: classes.dex */
public final class dmvr extends dmvp {
    int[] a = new int[4];
    public int b = 0;

    @Override // defpackage.dmvp
    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int[] iArr2 = new int[length + length];
            this.a = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, length);
        }
        int[] iArr3 = this.a;
        int i3 = this.b;
        iArr3[i3] = i;
        this.b = i3 + 1;
    }

    public final int b(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = 0;
    }
}
