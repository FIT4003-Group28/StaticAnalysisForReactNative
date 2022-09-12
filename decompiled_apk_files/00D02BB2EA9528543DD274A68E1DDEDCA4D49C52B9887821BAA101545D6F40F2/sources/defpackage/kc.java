package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: kc  reason: default package */
/* loaded from: classes.dex */
public final class kc {
    private static final ThreadLocal<double[]> a = new ThreadLocal<>();

    private kc() {
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, h(Color.red(i), alpha2, Color.red(i2), alpha, i3), h(Color.green(i), alpha2, Color.green(i2), alpha, i3), h(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static double b(int i) {
        ThreadLocal<double[]> threadLocal = a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = red;
            Double.isNaN(d);
            double d2 = d / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green;
            Double.isNaN(d3);
            double d4 = d3 / 255.0d;
            double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            double d5 = blue;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double c(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = a(i, i2);
        }
        double b = b(i) + 0.05d;
        double b2 = b(i2) + 0.05d;
        return Math.max(b, b2) / Math.min(b, b2);
    }

    public static void d(int i, float[] fArr) {
        float f;
        float abs;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f2 = max - min;
        float f3 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == red ? ((green - blue) / f2) % 6.0f : max == green ? ((blue - red) / f2) + 2.0f : ((red - green) / f2) + 4.0f;
            abs = f2 / (1.0f - Math.abs((f3 + f3) - 1.0f));
        }
        float f4 = (f * 60.0f) % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        fArr[0] = i(f4, 360.0f);
        fArr[1] = i(abs, 1.0f);
        fArr[2] = i(f3, 1.0f);
    }

    public static int e(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 + f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(j(i), j(round), j(round2));
    }

    public static int f(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static int g(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static float i(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    private static int j(int i) {
        if (i < 0) {
            return 0;
        }
        if (i <= 255) {
            return i;
        }
        return 255;
    }
}
