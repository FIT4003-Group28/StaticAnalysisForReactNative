package defpackage;
/* compiled from: PG */
/* renamed from: axdi  reason: default package */
/* loaded from: classes2.dex */
public final class axdi {
    private final float[] a = {0.0f, 0.0f, 0.0f, 1.0f};

    public final synchronized void a(float[] fArr) {
        System.arraycopy(this.a, 0, fArr, 0, 4);
    }

    public final synchronized void b(float[] fArr) {
        boolean z = false;
        double d = fArr[0];
        Double.isNaN(d);
        double d2 = d + 1.0d;
        double d3 = fArr[5];
        double d4 = fArr[10];
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt = ((float) Math.sqrt(Math.max(0.0d, d2 + d3 + d4))) * 0.5f;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt2 = ((float) Math.sqrt(Math.max(0.0d, (d2 - d3) - d4))) * 0.5f;
        Double.isNaN(d);
        double d5 = 1.0d - d;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt3 = ((float) Math.sqrt(Math.max(0.0d, (d5 + d3) - d4))) * 0.5f;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt4 = ((float) Math.sqrt(Math.max(0.0d, (d5 - d3) + d4))) * 0.5f;
        float[] fArr2 = this.a;
        if ((fArr[6] - fArr[9] < 0.0f) != (sqrt2 < 0.0f)) {
            sqrt2 = -sqrt2;
        }
        fArr2[0] = sqrt2;
        if ((fArr[8] - fArr[2] < 0.0f) != (sqrt3 < 0.0f)) {
            sqrt3 = -sqrt3;
        }
        fArr2[1] = sqrt3;
        boolean z2 = fArr[1] - fArr[4] < 0.0f;
        if (sqrt4 < 0.0f) {
            z = true;
        }
        if (z2 != z) {
            sqrt4 = -sqrt4;
        }
        fArr2[2] = sqrt4;
        fArr2[3] = sqrt;
    }
}
