package defpackage;
/* compiled from: PG */
/* renamed from: cjse  reason: default package */
/* loaded from: classes.dex */
public final class cjse {
    private int a = 0;
    private float b = 0.0f;
    private float c = 0.0f;

    public final void a(float f) {
        this.a++;
        this.b += f;
        this.c += f * f;
    }

    public final ddmi b() {
        ddmh bZ = ddmi.e.bZ();
        int i = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmi ddmiVar = (ddmi) bZ.b;
        int i2 = ddmiVar.a | 1;
        ddmiVar.a = i2;
        ddmiVar.b = i;
        float f = this.b;
        int i3 = i2 | 2;
        ddmiVar.a = i3;
        ddmiVar.c = f;
        float f2 = this.c;
        ddmiVar.a = i3 | 4;
        ddmiVar.d = f2;
        return bZ.bK();
    }

    public final String toString() {
        int i = this.a;
        float f = 0.0f;
        float f2 = i == 0 ? 0.0f : this.b / i;
        if (i != 0) {
            float f3 = this.c;
            float f4 = this.b;
            double sqrt = Math.sqrt((i * f3) - (f4 * f4));
            double d = this.a;
            Double.isNaN(d);
            f = (float) (sqrt / d);
        }
        dbsb d2 = dbsc.d("FLOAT_STATISTICS_TRACKER");
        d2.f("N", this.a);
        d2.e("SUM", this.b);
        d2.e("SUM_SQUARES", this.c);
        d2.e("AVG", f2);
        d2.e("DEV", f);
        return d2.toString();
    }
}
