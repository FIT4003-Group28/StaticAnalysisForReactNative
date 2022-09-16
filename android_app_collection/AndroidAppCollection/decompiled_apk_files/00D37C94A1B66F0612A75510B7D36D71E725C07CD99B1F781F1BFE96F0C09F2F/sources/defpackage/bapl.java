package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: bapl  reason: default package */
/* loaded from: classes2.dex */
final class bapl implements band {
    public static final float[] a = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
    public static final float[] b = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
    public static final float[] c = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
    public float[] d;
    public float e;
    private int f;
    private int g;

    @Override // defpackage.band
    public final void a(bang bangVar) {
        this.f = bangVar.b("xUnit");
        this.g = bangVar.b("coeffs");
    }

    @Override // defpackage.band
    public final void b(float[] fArr, int i) {
        GLES20.glUniform4fv(this.g, 1, this.d, 0);
        int i2 = this.f;
        float f = this.e;
        float f2 = i;
        GLES20.glUniform2f(i2, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
    }
}
