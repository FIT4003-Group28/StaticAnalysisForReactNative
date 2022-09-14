package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
/* loaded from: classes.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    static float f9697a;

    /* renamed from: b  reason: collision with root package name */
    private static int f9698b;

    /* renamed from: c  reason: collision with root package name */
    private static int f9699c;

    /* renamed from: d  reason: collision with root package name */
    private static String f9700d;

    /* renamed from: e  reason: collision with root package name */
    private static Path f9701e;

    /* renamed from: f  reason: collision with root package name */
    static ArrayList<C0205r> f9702f;

    /* renamed from: g  reason: collision with root package name */
    private static float f9703g;

    /* renamed from: h  reason: collision with root package name */
    private static float f9704h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static boolean m;

    private static double a(double d2) {
        double pow = Math.pow(10.0d, 4.0d);
        return Math.round(d2 * pow) / pow;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Path a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.s.a(java.lang.String):android.graphics.Path");
    }

    private static void a() {
        if (m) {
            f9703g = k;
            f9704h = l;
            m = false;
            f9701e.close();
            f9702f.add(new C0205r(f.kCGPathElementCloseSubpath, new v[]{new v(f9703g, f9704h)}));
        }
    }

    private static void a(float f2, float f3) {
        b(f2 + f9703g, f3 + f9704h);
    }

    private static void a(float f2, float f3, float f4, float f5) {
        float f6 = f9703g;
        float f7 = f9704h;
        b(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }

    private static void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        f();
        f9703g = f6;
        f9704h = f7;
        Path path = f9701e;
        float f8 = f9697a;
        path.cubicTo(f2 * f8, f3 * f8, f4 * f8, f5 * f8, f6 * f8, f7 * f8);
        f9702f.add(new C0205r(f.kCGPathElementAddCurveToPoint, new v[]{new v(f2, f3), new v(f4, f5), new v(f6, f7)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[LOOP:0: B:12:0x0067->B:13:0x0069, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.s.a(float, float, float, float, float, float, boolean, float):void");
    }

    private static void a(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        b(f2, f3, f4, z, z2, f5 + f9703g, f6 + f9704h);
    }

    private static boolean a(char c2) {
        return Character.isUpperCase(c2);
    }

    private static void b(float f2, float f3) {
        f();
        f9703g = f2;
        i = f2;
        f9704h = f3;
        j = f3;
        Path path = f9701e;
        float f4 = f9697a;
        path.lineTo(f2 * f4, f4 * f3);
        f9702f.add(new C0205r(f.kCGPathElementAddLineToPoint, new v[]{new v(f2, f3)}));
    }

    private static void b(float f2, float f3, float f4, float f5) {
        i = f2;
        j = f3;
        float f6 = f2 * 2.0f;
        float f7 = f3 * 2.0f;
        float f8 = (f9703g + f6) / 3.0f;
        float f9 = (f9704h + f7) / 3.0f;
        a(f8, f9, (f4 + f6) / 3.0f, (f5 + f7) / 3.0f, f4, f5);
    }

    private static void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f9703g;
        float f9 = f9704h;
        c(f2 + f8, f3 + f9, f4 + f8, f5 + f9, f6 + f8, f7 + f9);
    }

    private static void b(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13 = f9703g;
        float f14 = f9704h;
        float abs = Math.abs(f3 == 0.0f ? f2 == 0.0f ? f6 - f14 : f2 : f3);
        float abs2 = Math.abs(f2 == 0.0f ? f5 - f13 : f2);
        if (abs2 == 0.0f || abs == 0.0f || (f5 == f13 && f6 == f14)) {
            b(f5, f6);
            return;
        }
        float radians = (float) Math.toRadians(f4);
        double d2 = radians;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f15 = f5 - f13;
        float f16 = f6 - f14;
        float f17 = ((cos * f15) / 2.0f) + ((sin * f16) / 2.0f);
        float f18 = -sin;
        float f19 = ((f18 * f15) / 2.0f) + ((cos * f16) / 2.0f);
        float f20 = abs2 * abs2;
        float f21 = abs * abs * f17 * f17;
        if ((((f20 * abs) * abs) - ((f20 * f19) * f19)) - f21 < 0.0f) {
            f10 = f18;
            float sqrt = (float) Math.sqrt(1.0f - (f9 / f7));
            abs2 *= sqrt;
            abs *= sqrt;
            f12 = f16 / 2.0f;
            f11 = f15 / 2.0f;
        } else {
            f10 = f18;
            float sqrt2 = (float) Math.sqrt(f9 / (f8 + f21));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f22 = (((-sqrt2) * f19) * abs2) / abs;
            float f23 = ((sqrt2 * f17) * abs) / abs2;
            f11 = ((cos * f22) - (sin * f23)) + (f15 / 2.0f);
            f12 = (f16 / 2.0f) + (f22 * sin) + (f23 * cos);
        }
        float f24 = cos / abs2;
        float f25 = sin / abs2;
        float f26 = f10 / abs;
        float f27 = cos / abs;
        float f28 = -f11;
        float f29 = -f12;
        float f30 = abs;
        float f31 = abs2;
        float atan2 = (float) Math.atan2((f26 * f28) + (f27 * f29), (f28 * f24) + (f29 * f25));
        float f32 = f15 - f11;
        float f33 = f16 - f12;
        float atan22 = (float) Math.atan2((f26 * f32) + (f27 * f33), (f24 * f32) + (f25 * f33));
        float f34 = f11 + f13;
        float f35 = f12 + f14;
        float f36 = f15 + f13;
        float f37 = f16 + f14;
        f();
        i = f36;
        f9703g = f36;
        j = f37;
        f9704h = f37;
        if (f31 != f30 || radians != 0.0f) {
            a(f34, f35, f31, f30, atan2, atan22, z2, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z2) {
            abs3 = -abs3;
        }
        float f38 = f9697a;
        f9701e.arcTo(new RectF((f34 - f31) * f38, (f35 - f31) * f38, (f34 + f31) * f38, (f35 + f31) * f38), degrees, abs3);
        f9702f.add(new C0205r(f.kCGPathElementAddCurveToPoint, new v[]{new v(f36, f37)}));
    }

    private static boolean b() {
        h();
        char charAt = f9700d.charAt(f9698b);
        if (charAt == '0' || charAt == '1') {
            f9698b++;
            int i2 = f9698b;
            if (i2 < f9699c && f9700d.charAt(i2) == ',') {
                f9698b++;
            }
            h();
            return charAt == '1';
        }
        throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f9698b), f9700d));
    }

    private static boolean b(char c2) {
        switch (c2) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static float c() {
        if (f9698b != f9699c) {
            float e2 = e();
            h();
            d();
            return e2;
        }
        throw new Error(String.format("Unexpected end (s=%s)", f9700d));
    }

    private static void c(float f2, float f3) {
        d(f2 + f9703g, f3 + f9704h);
    }

    private static void c(float f2, float f3, float f4, float f5) {
        float f6 = f9703g;
        float f7 = f9704h;
        d(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }

    private static void c(float f2, float f3, float f4, float f5, float f6, float f7) {
        i = f4;
        j = f5;
        a(f2, f3, f4, f5, f6, f7);
    }

    private static boolean c(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '.' || c2 == '-' || c2 == '+';
    }

    private static void d() {
        int i2 = f9698b;
        if (i2 >= f9699c || f9700d.charAt(i2) != ',') {
            return;
        }
        f9698b++;
    }

    private static void d(float f2, float f3) {
        f9703g = f2;
        i = f2;
        k = f2;
        f9704h = f3;
        j = f3;
        l = f3;
        Path path = f9701e;
        float f4 = f9697a;
        path.moveTo(f2 * f4, f4 * f3);
        f9702f.add(new C0205r(f.kCGPathElementMoveToPoint, new v[]{new v(f2, f3)}));
    }

    private static void d(float f2, float f3, float f4, float f5) {
        i = f2;
        j = f3;
        a((f9703g * 2.0f) - i, (f9704h * 2.0f) - j, f2, f3, f4, f5);
    }

    private static float e() {
        char charAt;
        h();
        int i2 = f9698b;
        if (i2 != f9699c) {
            char charAt2 = f9700d.charAt(i2);
            if (charAt2 == '-' || charAt2 == '+') {
                f9698b++;
                charAt2 = f9700d.charAt(f9698b);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                g();
                int i3 = f9698b;
                if (i3 < f9699c) {
                    charAt2 = f9700d.charAt(i3);
                }
            } else if (charAt2 != '.') {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f9698b), f9700d));
            }
            if (charAt2 == '.') {
                f9698b++;
                g();
                int i4 = f9698b;
                if (i4 < f9699c) {
                    charAt2 = f9700d.charAt(i4);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i5 = f9698b;
                if (i5 + 1 < f9699c && (charAt = f9700d.charAt(i5 + 1)) != 'm' && charAt != 'x') {
                    f9698b++;
                    char charAt3 = f9700d.charAt(f9698b);
                    if (charAt3 == '+' || charAt3 == '-') {
                        f9698b++;
                    } else if (charAt3 < '0' || charAt3 > '9') {
                        throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f9698b), f9700d));
                    }
                    g();
                }
            }
            String substring = f9700d.substring(i2, f9698b);
            float parseFloat = Float.parseFloat(substring);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i2), Integer.valueOf(f9698b), f9700d));
        }
        throw new Error(String.format("Unexpected end (s=%s)", f9700d));
    }

    private static void e(float f2, float f3) {
        f(f2 + f9703g, f3 + f9704h);
    }

    private static void f() {
        if (!m) {
            k = f9703g;
            l = f9704h;
            m = true;
        }
    }

    private static void f(float f2, float f3) {
        b((f9703g * 2.0f) - i, (f9704h * 2.0f) - j, f2, f3);
    }

    private static void g() {
        while (true) {
            int i2 = f9698b;
            if (i2 >= f9699c || !Character.isDigit(f9700d.charAt(i2))) {
                return;
            }
            f9698b++;
        }
    }

    private static void h() {
        while (true) {
            int i2 = f9698b;
            if (i2 >= f9699c || !Character.isWhitespace(f9700d.charAt(i2))) {
                return;
            }
            f9698b++;
        }
    }
}
