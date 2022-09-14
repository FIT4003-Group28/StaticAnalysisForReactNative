package defpackage;
/* compiled from: PG */
/* renamed from: dmvo  reason: default package */
/* loaded from: classes6.dex */
public final class dmvo extends dmvp {
    float[] a = new float[4];
    int b = 0;

    @Override // defpackage.dmvp
    public final void a(int i) {
        int i2 = this.b;
        float[] fArr = this.a;
        int length = fArr.length;
        if (i2 >= length) {
            float[] fArr2 = new float[length + length];
            this.a = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, length);
        }
        this.a[this.b] = Float.intBitsToFloat(i);
        this.b++;
    }

    public final float b(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = 0;
    }
}
