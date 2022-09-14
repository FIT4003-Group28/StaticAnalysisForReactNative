package a.g.f;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f205a;

        /* renamed from: b  reason: collision with root package name */
        boolean f206b;

        a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f207a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f208b;

        b(char c2, float[] fArr) {
            this.f207a = c2;
            this.f208b = fArr;
        }

        b(b bVar) {
            this.f207a = bVar.f207a;
            float[] fArr = bVar.f208b;
            this.f208b = c.a(fArr, 0, fArr.length);
        }

        private static void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int ceil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d8);
            double sin = Math.sin(d8);
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double d12 = -d11;
            double d13 = d12 * cos;
            double d14 = d5 * sin;
            double d15 = (d13 * sin2) - (d14 * cos2);
            double d16 = d12 * sin;
            double d17 = d5 * cos;
            double d18 = (sin2 * d16) + (cos2 * d17);
            double d19 = d10 / ceil;
            double d20 = d6;
            double d21 = d7;
            double d22 = d18;
            double d23 = d15;
            int i = 0;
            double d24 = d9;
            while (i < ceil) {
                double d25 = d24 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d2 + ((d11 * cos) * cos3)) - (d14 * sin3);
                double d27 = d3 + (d11 * sin * cos3) + (d17 * sin3);
                double d28 = (d13 * sin3) - (d14 * cos3);
                double d29 = (sin3 * d16) + (cos3 * d17);
                double d30 = d25 - d24;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d20 + (d23 * sin4)), (float) (d21 + (d22 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
                i++;
                d19 = d19;
                ceil = i2;
                sin = sin;
                d21 = d27;
                d16 = d16;
                d24 = d25;
                d22 = d29;
                d23 = d28;
                cos = cos;
                d11 = d4;
                d20 = d26;
            }
        }

        private static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d4 = f2;
            double d5 = d4 * cos;
            double d6 = f3;
            double d7 = f6;
            double d8 = (d5 + (d6 * sin)) / d7;
            double d9 = f7;
            double d10 = (((-f2) * sin) + (d6 * cos)) / d9;
            double d11 = f5;
            double d12 = ((f4 * cos) + (d11 * sin)) / d7;
            double d13 = (((-f4) * sin) + (d11 * cos)) / d9;
            double d14 = d8 - d12;
            double d15 = d10 - d13;
            double d16 = (d8 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d18);
                float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
                a(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d19);
            double d20 = d14 * sqrt2;
            double d21 = sqrt2 * d15;
            if (z == z2) {
                d2 = d16 - d21;
                d3 = d17 + d20;
            } else {
                d2 = d16 + d21;
                d3 = d17 - d20;
            }
            double atan2 = Math.atan2(d10 - d3, d8 - d2);
            double atan22 = Math.atan2(d13 - d3, d12 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d22 = d2 * d7;
            double d23 = d3 * d9;
            a(path, (d22 * cos) - (d23 * sin), (d22 * sin) + (d23 * cos), d7, d9, d4, d6, radians, atan2, atan22);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            char c4 = c3;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i3 = 0;
            char c5 = c2;
            while (i3 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f16 = fArr2[i6];
                        float f20 = fArr2[i7];
                        float f21 = fArr2[i4];
                        float f22 = fArr2[i5];
                        f17 = f20;
                        f13 = f22;
                        f12 = f21;
                    } else if (c4 == 'H') {
                        i2 = i3;
                        int i8 = i2 + 0;
                        path.lineTo(fArr2[i8], f17);
                        f16 = fArr2[i8];
                    } else if (c4 == 'Q') {
                        i2 = i3;
                        int i9 = i2 + 0;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f23 = fArr2[i9];
                        float f24 = fArr2[i10];
                        f16 = fArr2[i11];
                        f17 = fArr2[i12];
                        f12 = f23;
                        f13 = f24;
                    } else if (c4 == 'V') {
                        i2 = i3;
                        int i13 = i2 + 0;
                        path.lineTo(f16, fArr2[i13]);
                        f17 = fArr2[i13];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                int i14 = i3 + 0;
                                path.rLineTo(fArr2[i14], 0.0f);
                                f16 += fArr2[i14];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int i15 = i3 + 0;
                                    path.rLineTo(0.0f, fArr2[i15]);
                                    f5 = fArr2[i15];
                                } else if (c4 == 'L') {
                                    int i16 = i3 + 0;
                                    int i17 = i3 + 1;
                                    path.lineTo(fArr2[i16], fArr2[i17]);
                                    f16 = fArr2[i16];
                                    f17 = fArr2[i17];
                                } else if (c4 == 'M') {
                                    int i18 = i3 + 0;
                                    f16 = fArr2[i18];
                                    int i19 = i3 + 1;
                                    f17 = fArr2[i19];
                                    if (i3 > 0) {
                                        path.lineTo(fArr2[i18], fArr2[i19]);
                                    } else {
                                        path.moveTo(fArr2[i18], fArr2[i19]);
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    float f25 = f17;
                                    int i20 = i3 + 0;
                                    int i21 = i3 + 1;
                                    int i22 = i3 + 2;
                                    int i23 = i3 + 3;
                                    path.cubicTo(f16, f25, fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f2 = fArr2[i20];
                                    f3 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f17 = fArr2[i23];
                                    f12 = f2;
                                    f13 = f3;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    int i24 = i3 + 0;
                                    int i25 = i3 + 1;
                                    path.quadTo(f16, f17, fArr2[i24], fArr2[i25]);
                                    float f26 = fArr2[i24];
                                    float f27 = fArr2[i25];
                                    f13 = f17;
                                    f12 = f16;
                                    i2 = i3;
                                    f16 = f26;
                                    f17 = f27;
                                } else if (c4 == 'l') {
                                    int i26 = i3 + 0;
                                    int i27 = i3 + 1;
                                    path.rLineTo(fArr2[i26], fArr2[i27]);
                                    f16 += fArr2[i26];
                                    f5 = fArr2[i27];
                                } else if (c4 == 'm') {
                                    int i28 = i3 + 0;
                                    f16 += fArr2[i28];
                                    int i29 = i3 + 1;
                                    f17 += fArr2[i29];
                                    if (i3 > 0) {
                                        path.rLineTo(fArr2[i28], fArr2[i29]);
                                    } else {
                                        path.rMoveTo(fArr2[i28], fArr2[i29]);
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f28 = f16 - f12;
                                        f6 = f17 - f13;
                                        f7 = f28;
                                    } else {
                                        f7 = 0.0f;
                                        f6 = 0.0f;
                                    }
                                    int i30 = i3 + 0;
                                    int i31 = i3 + 1;
                                    int i32 = i3 + 2;
                                    int i33 = i3 + 3;
                                    path.rCubicTo(f7, f6, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f2 = fArr2[i30] + f16;
                                    f3 = fArr2[i31] + f17;
                                    f16 += fArr2[i32];
                                    f4 = fArr2[i33];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f8 = f16 - f12;
                                        f9 = f17 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i34 = i3 + 0;
                                    int i35 = i3 + 1;
                                    path.rQuadTo(f8, f9, fArr2[i34], fArr2[i35]);
                                    float f29 = f8 + f16;
                                    float f30 = f9 + f17;
                                    f16 += fArr2[i34];
                                    f17 += fArr2[i35];
                                    f13 = f30;
                                    f12 = f29;
                                }
                                f17 += f5;
                            } else {
                                int i36 = i3 + 0;
                                int i37 = i3 + 1;
                                int i38 = i3 + 2;
                                int i39 = i3 + 3;
                                path.rQuadTo(fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                f2 = fArr2[i36] + f16;
                                f3 = fArr2[i37] + f17;
                                f16 += fArr2[i38];
                                f4 = fArr2[i39];
                            }
                            i2 = i3;
                        } else {
                            int i40 = i3 + 2;
                            int i41 = i3 + 3;
                            int i42 = i3 + 4;
                            int i43 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f2 = fArr2[i40] + f16;
                            f3 = fArr2[i41] + f17;
                            f16 += fArr2[i42];
                            f4 = fArr2[i43];
                        }
                        f17 += f4;
                        f12 = f2;
                        f13 = f3;
                        i2 = i3;
                    } else {
                        int i44 = i3 + 5;
                        float f31 = fArr2[i44] + f16;
                        int i45 = i3 + 6;
                        float f32 = fArr2[i45] + f17;
                        float f33 = fArr2[i3 + 0];
                        float f34 = fArr2[i3 + 1];
                        float f35 = fArr2[i3 + 2];
                        float f36 = f16;
                        boolean z = fArr2[i3 + 3] != 0.0f;
                        i2 = i3;
                        a(path, f16, f17, f31, f32, f33, f34, f35, z, fArr2[i3 + 4] != 0.0f);
                        f16 = f36 + fArr2[i44];
                        f17 += fArr2[i45];
                    }
                    i3 = i2 + i;
                    c5 = c3;
                    c4 = c5;
                } else {
                    i2 = i3;
                    int i46 = i2 + 5;
                    int i47 = i2 + 6;
                    a(path, f16, f17, fArr2[i46], fArr2[i47], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f16 = fArr2[i46];
                    f17 = fArr2[i47];
                }
                f13 = f17;
                f12 = f16;
                i3 = i2 + i;
                c5 = c3;
                c4 = c5;
            }
            fArr[0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        public static void a(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                a(path, fArr, c2, bVarArr[i].f207a, bVarArr[i].f208b);
                c2 = bVarArr[i].f207a;
            }
        }

        public void a(b bVar, b bVar2, float f2) {
            this.f207a = bVar.f207a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f208b;
                if (i < fArr.length) {
                    this.f208b[i] = (fArr[i] * (1.0f - f2)) + (bVar2.f208b[i] * f2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r2 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r8, int r9, a.g.f.c.a r10) {
        /*
            r0 = 0
            r10.f206b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L35
        L27:
            r10.f206b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = 0
            goto L35
        L31:
            r2 = 1
            goto L35
        L33:
            r2 = 0
            r4 = 1
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f205a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.f.c.a(java.lang.String, int, a.g.f.c$a):void");
    }

    private static void a(ArrayList<b> arrayList, char c2, float[] fArr) {
        arrayList.add(new b(c2, fArr));
    }

    public static boolean a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f207a != bVarArr2[i].f207a || bVarArr[i].f208b.length != bVarArr2[i].f208b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static b[] a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a2 = a(str, i);
            String trim = str.substring(i2, a2).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), c(trim));
            }
            i2 = a2;
            i = a2 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static b[] a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static Path b(String str) {
        Path path = new Path();
        b[] a2 = a(str);
        if (a2 != null) {
            try {
                b.a(a2, path);
                return path;
            } catch (RuntimeException e2) {
                throw new RuntimeException("Error in parsing " + str, e2);
            }
        }
        return null;
    }

    public static void b(b[] bVarArr, b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f207a = bVarArr2[i].f207a;
            for (int i2 = 0; i2 < bVarArr2[i].f208b.length; i2++) {
                bVarArr[i].f208b[i2] = bVarArr2[i].f208b[i2];
            }
        }
    }

    private static float[] c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                a(str, i, aVar);
                int i3 = aVar.f205a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f206b ? i3 : i3 + 1;
            }
            return a(fArr, 0, i2);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }
}
