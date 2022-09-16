package defpackage;
/* compiled from: PG */
/* renamed from: bpm  reason: default package */
/* loaded from: classes3.dex */
public final class bpm {
    public static int a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float c = c(((i >> 16) & 255) / 255.0f);
        float c2 = c(((i >> 8) & 255) / 255.0f);
        float c3 = c((i & 255) / 255.0f);
        float c4 = c(((i2 >> 16) & 255) / 255.0f);
        float c5 = c(((i2 >> 8) & 255) / 255.0f);
        float c6 = c((i2 & 255) / 255.0f);
        return (Math.round((f2 + (f * ((((i2 >> 24) & 255) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(b(c + ((c4 - c) * f)) * 255.0f) << 16) | (Math.round(b(c2 + ((c5 - c2) * f)) * 255.0f) << 8) | Math.round(b(c3 + ((c6 - c3) * f)) * 255.0f);
    }

    private static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float c(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }
}
