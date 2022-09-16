package defpackage;
/* compiled from: PG */
/* renamed from: awpa  reason: default package */
/* loaded from: classes3.dex */
public final class awpa {
    public static float a(float f, float f2, float f3, float f4) {
        if (f < f4) {
            return 0.0f;
        }
        if (c(f, f2, f3) < 0.0f) {
            f2 = b(f, f3);
        }
        float f5 = f * 10.0f;
        double exp = Math.exp((-10.0f) * f2);
        double d = f3 * 10.0f * f2;
        double exp2 = Math.exp(f2 * 10.0f);
        Double.isNaN(d);
        double d2 = d * exp2;
        double d3 = f3;
        Double.isNaN(d3);
        double d4 = d2 + d3;
        double d5 = f5;
        Double.isNaN(d5);
        return Math.max(0.0f, ((-((float) (exp * (d4 + d5)))) / 100.0f) - ((-(f3 + f5)) / 100.0f));
    }

    public static float b(float f, float f2) {
        dbsk.b(f2 > 0.0f, "Coulomb friction must be greater than 0 to calculate a stopping time.");
        return (float) ((-Math.log(f2 / ((f * 10.0f) + f2))) / 10.0d);
    }

    public static float c(float f, float f2, float f3) {
        dbsk.b(true, "Viscous friction must be greater than 0.");
        double exp = Math.exp(f2 * (-10.0f));
        double d = (f * 10.0f) + f3;
        Double.isNaN(d);
        double d2 = exp * d;
        double d3 = f3;
        Double.isNaN(d3);
        return (float) ((d2 - d3) / 10.0d);
    }
}
