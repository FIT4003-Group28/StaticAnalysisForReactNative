package defpackage;
/* compiled from: PG */
/* renamed from: awox  reason: default package */
/* loaded from: classes3.dex */
public final class awox implements awov {
    public float a;
    public float b;
    public float c;
    public float d;

    @Override // defpackage.awov
    public final boolean a(float f, float f2, float f3) {
        float hypot = (float) Math.hypot(this.a, this.b);
        float atan2 = (float) Math.atan2(this.b, this.a);
        float f4 = 0.0f;
        if (hypot >= f2) {
            f4 = Math.max(0.0f, awpa.c(hypot, f, f3));
        }
        double d = f4;
        double d2 = atan2;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        this.a = (float) (cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        this.b = (float) (d * sin);
        double a = awpa.a(hypot, f, f3, f2);
        float f5 = this.c;
        double cos2 = Math.cos(d2);
        Double.isNaN(a);
        this.c = f5 + ((float) (cos2 * a));
        float f6 = this.d;
        double sin2 = Math.sin(d2);
        Double.isNaN(a);
        this.d = f6 + ((float) (a * sin2));
        return Math.hypot((double) this.a, (double) this.b) >= ((double) f2);
    }

    @Override // defpackage.awov
    public final float b() {
        return this.a;
    }

    @Override // defpackage.awov
    public final float c() {
        return this.b;
    }

    @Override // defpackage.awov
    public final float d() {
        return this.c;
    }

    @Override // defpackage.awov
    public final float e() {
        return this.d;
    }
}
