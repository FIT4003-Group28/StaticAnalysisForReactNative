package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asto  reason: default package */
/* loaded from: classes2.dex */
public class asto implements csao {
    public volatile int a;
    private final float[] b = new float[4];
    private final float[] c = new float[4];
    private int d;
    private float e;

    @Override // defpackage.csao
    public final void a(long j, float[] fArr) {
        dbsk.a(fArr.length == 4);
        this.b[this.d] = this.a / 100.0f;
        float[] fArr2 = this.b;
        int i = this.d;
        float f = ((fArr2[i] + fArr2[deay.d(i - 1, 4)]) + this.b[deay.d(this.d - 2, 4)]) / 3.0f;
        float f2 = this.e;
        float f3 = f > f2 ? f2 + ((f - f2) * 0.3f) : f2 * 0.92f;
        this.e = f3;
        fArr[0] = f3;
        fArr[1] = this.c[deay.d(this.d - 1, 4)];
        fArr[2] = this.c[deay.d(this.d - 2, 4)];
        fArr[3] = this.c[deay.d(this.d - 3, 4)];
        float[] fArr3 = this.c;
        int i2 = this.d;
        fArr3[i2] = this.e;
        this.d = (i2 + 1) & 3;
    }

    @Override // defpackage.csao
    public final void b() {
        Arrays.fill(this.c, 0.0f);
        Arrays.fill(this.b, 0.0f);
        this.d = 0;
        this.a = 0;
        this.e = 0.0f;
    }
}
