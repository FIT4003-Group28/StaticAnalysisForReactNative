package defpackage;
/* compiled from: PG */
/* renamed from: bnvq  reason: default package */
/* loaded from: classes.dex */
public final class bnvq {
    public final float[] a;

    public bnvq() {
        this.a = r0;
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final void a(int i, int i2, float f) {
        this.a[(i * 3) + i2] = f;
    }

    public final void b() {
        float[] fArr = this.a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public final void c() {
        float[] fArr = this.a;
        fArr[0] = 0.0f;
        fArr[4] = 0.0f;
    }

    public final void d() {
        float[] fArr = this.a;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            float[] fArr = this.a;
            float f = fArr[i];
            float f2 = fArr[i + 1];
            float f3 = fArr[i + 2];
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(f);
            sb2.append(", ");
            sb2.append(f2);
            sb2.append(", ");
            sb2.append(f3);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
