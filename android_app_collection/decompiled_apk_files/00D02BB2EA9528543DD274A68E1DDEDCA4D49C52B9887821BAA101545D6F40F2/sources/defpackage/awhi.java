package defpackage;

import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: awhi  reason: default package */
/* loaded from: classes3.dex */
public final class awhi {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public awhi(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.d = i2;
        this.b = i3;
        this.e = i4;
        this.f = i5;
        this.c = i6;
        this.g = i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.g == 1 ? this.e : this.f;
    }

    public final RectF b(int i, int i2, double d, long j) {
        int a = a();
        RectF rectF = new RectF(this.a, this.d, i - this.b, i2 - a);
        float width = rectF.width();
        float height = rectF.height();
        double d2 = width;
        double d3 = height;
        double d4 = j;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if ((d2 / d) * (d3 / d) > d4) {
            double d5 = width / height;
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d2);
            float sqrt = ((float) (d2 - (Math.sqrt(d4 * d5) * d))) / 2.0f;
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d3);
            float sqrt2 = ((float) (d3 - (Math.sqrt(d4 / d5) * d))) / 2.0f;
            return new RectF(this.a + sqrt, this.d + sqrt2, i - (this.b + sqrt), i2 - (a + sqrt2));
        }
        return rectF;
    }
}
