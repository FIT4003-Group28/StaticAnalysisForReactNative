package android.support.v4.b;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;
/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public class b {
    static float[] a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
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

    public static Path a(String str) {
        Path path = new Path();
        C0006b[] b2 = b(str);
        if (b2 != null) {
            try {
                C0006b.a(b2, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + str, e);
            }
        }
        return null;
    }

    public static C0006b[] b(String str) {
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
        return (C0006b[]) arrayList.toArray(new C0006b[arrayList.size()]);
    }

    public static C0006b[] a(C0006b[] c0006bArr) {
        if (c0006bArr == null) {
            return null;
        }
        C0006b[] c0006bArr2 = new C0006b[c0006bArr.length];
        for (int i = 0; i < c0006bArr.length; i++) {
            c0006bArr2[i] = new C0006b(c0006bArr[i]);
        }
        return c0006bArr2;
    }

    public static boolean a(C0006b[] c0006bArr, C0006b[] c0006bArr2) {
        if (c0006bArr == null || c0006bArr2 == null || c0006bArr.length != c0006bArr2.length) {
            return false;
        }
        for (int i = 0; i < c0006bArr.length; i++) {
            if (c0006bArr[i].f364a != c0006bArr2[i].f364a || c0006bArr[i].f365b.length != c0006bArr2[i].f365b.length) {
                return false;
            }
        }
        return true;
    }

    public static void b(C0006b[] c0006bArr, C0006b[] c0006bArr2) {
        for (int i = 0; i < c0006bArr2.length; i++) {
            c0006bArr[i].f364a = c0006bArr2[i].f364a;
            for (int i2 = 0; i2 < c0006bArr2[i].f365b.length; i2++) {
                c0006bArr[i].f365b[i2] = c0006bArr2[i].f365b[i2];
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

    private static void a(ArrayList<C0006b> arrayList, char c2, float[] fArr) {
        arrayList.add(new C0006b(c2, fArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PathParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f362a;

        /* renamed from: b  reason: collision with root package name */
        boolean f363b;

        a() {
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
                int i3 = aVar.f362a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f363b ? i3 : i3 + 1;
            }
            return a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r8, int r9, android.support.v4.b.b.a r10) {
        /*
            r0 = 0
            r10.f363b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.f363b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f363b = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f362a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.a(java.lang.String, int, android.support.v4.b.b$a):void");
    }

    /* compiled from: PathParser.java */
    /* renamed from: android.support.v4.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006b {

        /* renamed from: a  reason: collision with root package name */
        public char f364a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f365b;

        C0006b(char c2, float[] fArr) {
            this.f364a = c2;
            this.f365b = fArr;
        }

        C0006b(C0006b c0006b) {
            this.f364a = c0006b.f364a;
            this.f365b = b.a(c0006b.f365b, 0, c0006b.f365b.length);
        }

        public static void a(C0006b[] c0006bArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i = 0; i < c0006bArr.length; i++) {
                a(path, fArr, c2, c0006bArr[i].f364a, c0006bArr[i].f365b);
                c2 = c0006bArr[i].f364a;
            }
        }

        public void a(C0006b c0006b, C0006b c0006b2, float f) {
            for (int i = 0; i < c0006b.f365b.length; i++) {
                this.f365b[i] = (c0006b.f365b[i] * (1.0f - f)) + (c0006b2.f365b[i] * f);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
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
                case EACTags.SECURITY_SUPPORT_TEMPLATE /* 122 */:
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c4 = c2;
            while (i3 < fArr2.length) {
                float f19 = BitmapDescriptorFactory.HUE_RED;
                switch (c3) {
                    case 'A':
                        i2 = i3;
                        int i4 = i2 + 5;
                        int i5 = i2 + 6;
                        a(path, f15, f16, fArr2[i4], fArr2[i5], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != BitmapDescriptorFactory.HUE_RED, fArr2[i2 + 4] != BitmapDescriptorFactory.HUE_RED);
                        f15 = fArr2[i4];
                        f16 = fArr2[i5];
                        f12 = f16;
                        f11 = f15;
                        break;
                    case 'C':
                        i2 = i3;
                        int i6 = i2 + 2;
                        int i7 = i2 + 3;
                        int i8 = i2 + 4;
                        int i9 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f15 = fArr2[i8];
                        float f20 = fArr2[i9];
                        float f21 = fArr2[i6];
                        float f22 = fArr2[i7];
                        f16 = f20;
                        f12 = f22;
                        f11 = f21;
                        break;
                    case 'H':
                        i2 = i3;
                        int i10 = i2 + 0;
                        path.lineTo(fArr2[i10], f16);
                        f15 = fArr2[i10];
                        break;
                    case 'L':
                        i2 = i3;
                        int i11 = i2 + 0;
                        int i12 = i2 + 1;
                        path.lineTo(fArr2[i11], fArr2[i12]);
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        break;
                    case 'M':
                        i2 = i3;
                        int i13 = i2 + 0;
                        f15 = fArr2[i13];
                        int i14 = i2 + 1;
                        f16 = fArr2[i14];
                        if (i2 > 0) {
                            path.lineTo(fArr2[i13], fArr2[i14]);
                            break;
                        } else {
                            path.moveTo(fArr2[i13], fArr2[i14]);
                            f18 = f16;
                            f17 = f15;
                            break;
                        }
                    case 'Q':
                        i2 = i3;
                        int i15 = i2 + 0;
                        int i16 = i2 + 1;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        path.quadTo(fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        f = fArr2[i15];
                        f2 = fArr2[i16];
                        f15 = fArr2[i17];
                        f16 = fArr2[i18];
                        f11 = f;
                        f12 = f2;
                        break;
                    case 'S':
                        float f23 = f16;
                        float f24 = f15;
                        i2 = i3;
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f25 = (f24 * 2.0f) - f11;
                            f3 = (f23 * 2.0f) - f12;
                            f4 = f25;
                        } else {
                            f4 = f24;
                            f3 = f23;
                        }
                        int i19 = i2 + 0;
                        int i20 = i2 + 1;
                        int i21 = i2 + 2;
                        int i22 = i2 + 3;
                        path.cubicTo(f4, f3, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                        f = fArr2[i19];
                        f2 = fArr2[i20];
                        f15 = fArr2[i21];
                        f16 = fArr2[i22];
                        f11 = f;
                        f12 = f2;
                        break;
                    case 'T':
                        float f26 = f16;
                        float f27 = f15;
                        i2 = i3;
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f26 = (f26 * 2.0f) - f12;
                            f27 = (f27 * 2.0f) - f11;
                        }
                        int i23 = i2 + 0;
                        int i24 = i2 + 1;
                        path.quadTo(f27, f26, fArr2[i23], fArr2[i24]);
                        f15 = fArr2[i23];
                        f16 = fArr2[i24];
                        f11 = f27;
                        f12 = f26;
                        break;
                    case 'V':
                        i2 = i3;
                        int i25 = i2 + 0;
                        path.lineTo(f15, fArr2[i25]);
                        f16 = fArr2[i25];
                        break;
                    case 'a':
                        int i26 = i3 + 5;
                        int i27 = i3 + 6;
                        i2 = i3;
                        a(path, f15, f16, fArr2[i26] + f15, fArr2[i27] + f16, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != BitmapDescriptorFactory.HUE_RED, fArr2[i3 + 4] != BitmapDescriptorFactory.HUE_RED);
                        f15 += fArr2[i26];
                        f16 += fArr2[i27];
                        f12 = f16;
                        f11 = f15;
                        break;
                    case 'c':
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        int i30 = i3 + 4;
                        int i31 = i3 + 5;
                        path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                        f5 = fArr2[i28] + f15;
                        f6 = fArr2[i29] + f16;
                        f15 += fArr2[i30];
                        f16 += fArr2[i31];
                        f11 = f5;
                        f12 = f6;
                        i2 = i3;
                        break;
                    case 'h':
                        int i32 = i3 + 0;
                        path.rLineTo(fArr2[i32], BitmapDescriptorFactory.HUE_RED);
                        f15 += fArr2[i32];
                        i2 = i3;
                        break;
                    case 'l':
                        int i33 = i3 + 0;
                        int i34 = i3 + 1;
                        path.rLineTo(fArr2[i33], fArr2[i34]);
                        f15 += fArr2[i33];
                        f16 += fArr2[i34];
                        i2 = i3;
                        break;
                    case 'm':
                        int i35 = i3 + 0;
                        f15 += fArr2[i35];
                        int i36 = i3 + 1;
                        f16 += fArr2[i36];
                        if (i3 > 0) {
                            path.rLineTo(fArr2[i35], fArr2[i36]);
                        } else {
                            path.rMoveTo(fArr2[i35], fArr2[i36]);
                            f18 = f16;
                            f17 = f15;
                        }
                        i2 = i3;
                        break;
                    case 'q':
                        int i37 = i3 + 0;
                        int i38 = i3 + 1;
                        int i39 = i3 + 2;
                        int i40 = i3 + 3;
                        path.rQuadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                        f5 = fArr2[i37] + f15;
                        f6 = fArr2[i38] + f16;
                        f15 += fArr2[i39];
                        f16 += fArr2[i40];
                        f11 = f5;
                        f12 = f6;
                        i2 = i3;
                        break;
                    case 's':
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f28 = f15 - f11;
                            f7 = f16 - f12;
                            f19 = f28;
                        } else {
                            f7 = BitmapDescriptorFactory.HUE_RED;
                        }
                        int i41 = i3 + 0;
                        int i42 = i3 + 1;
                        int i43 = i3 + 2;
                        int i44 = i3 + 3;
                        path.rCubicTo(f19, f7, fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                        f5 = fArr2[i41] + f15;
                        f6 = fArr2[i42] + f16;
                        f15 += fArr2[i43];
                        f16 += fArr2[i44];
                        f11 = f5;
                        f12 = f6;
                        i2 = i3;
                        break;
                    case 't':
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f19 = f15 - f11;
                            f8 = f16 - f12;
                        } else {
                            f8 = BitmapDescriptorFactory.HUE_RED;
                        }
                        int i45 = i3 + 0;
                        int i46 = i3 + 1;
                        path.rQuadTo(f19, f8, fArr2[i45], fArr2[i46]);
                        float f29 = f19 + f15;
                        float f30 = f8 + f16;
                        f15 += fArr2[i45];
                        f16 += fArr2[i46];
                        f12 = f30;
                        f11 = f29;
                        i2 = i3;
                        break;
                    case 'v':
                        int i47 = i3 + 0;
                        path.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr2[i47]);
                        f16 += fArr2[i47];
                        i2 = i3;
                        break;
                    default:
                        i2 = i3;
                        break;
                }
                i3 = i2 + i;
                c4 = c3;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d4 = f;
            double d5 = f2;
            double d6 = f5;
            double d7 = ((d4 * cos) + (d5 * sin)) / d6;
            double d8 = f6;
            double d9 = (((-f) * sin) + (d5 * cos)) / d8;
            double d10 = f4;
            double d11 = ((f3 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f3) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d2 = d15 - d20;
                d3 = d16 + d19;
            } else {
                d2 = d15 + d20;
                d3 = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d3, d7 - d2);
            double atan22 = Math.atan2(d12 - d3, d11 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d21 = d2 * d6;
            double d22 = d3 * d8;
            a(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d4, d5, radians, atan2, atan22);
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
            double d15 = d12 * sin;
            double d16 = d5 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d10 / ceil;
            int i = 0;
            double d19 = d7;
            double d20 = d17;
            double d21 = (d13 * sin2) - (d14 * cos2);
            double d22 = d6;
            double d23 = d9;
            while (i < ceil) {
                double d24 = d15;
                double d25 = d23 + d18;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = d18;
                double d27 = (d2 + ((d11 * cos) * cos3)) - (d14 * sin3);
                double d28 = d3 + (d11 * sin * cos3) + (d16 * sin3);
                double d29 = (d13 * sin3) - (d14 * cos3);
                double d30 = (sin3 * d24) + (cos3 * d16);
                double d31 = d25 - d23;
                double d32 = d16;
                double tan = Math.tan(d31 / 2.0d);
                double sin4 = (Math.sin(d31) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path.cubicTo((float) (d22 + (d21 * sin4)), (float) (d19 + (d20 * sin4)), (float) (d27 - (sin4 * d29)), (float) (d28 - (sin4 * d30)), (float) d27, (float) d28);
                i++;
                d19 = d28;
                d22 = d27;
                d15 = d24;
                d20 = d30;
                d21 = d29;
                d18 = d26;
                d16 = d32;
                d23 = d25;
                ceil = ceil;
                cos = cos;
                sin = sin;
                d11 = d4;
            }
        }
    }
}
