package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
/* loaded from: classes.dex */
class w {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9713a = new int[SVGLength.UnitType.values().length];

        static {
            try {
                f9713a[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9713a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9713a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9713a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9713a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9713a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9713a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9713a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9713a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9713a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9713a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(SVGLength sVGLength, double d2, double d3, double d4, double d5) {
        double d6;
        if (sVGLength == null) {
            return d3;
        }
        SVGLength.UnitType unitType = sVGLength.f9526b;
        double d7 = sVGLength.f9525a;
        switch (a.f9713a[unitType.ordinal()]) {
            case 1:
            case 2:
                d5 = 1.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 3:
                d6 = (d7 / 100.0d) * d2;
                break;
            case 4:
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 5:
                d5 /= 2.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 6:
                d5 = 35.43307d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 7:
                d5 = 3.543307d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 8:
                d5 = 90.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 9:
                d5 = 1.25d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            case 10:
                d5 = 15.0d;
                d7 *= d5;
                d6 = d7 * d4;
                break;
            default:
                d6 = d7 * d4;
                break;
        }
        return d6 + d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8 A[PHI: r8 
      PHI: (r8v3 int) = (r8v1 int), (r8v4 int) binds: [B:50:0x00a4, B:51:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double a(java.lang.String r7, double r8, double r10, double r12) {
        /*
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            int r1 = r0 + (-1)
            if (r0 == 0) goto Ldb
            java.lang.String r2 = "normal"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L16
            goto Ldb
        L16:
            int r2 = r7.codePointAt(r1)
            r3 = 37
            r4 = 0
            if (r2 != r3) goto L31
            java.lang.String r7 = r7.substring(r4, r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r10 = r7.doubleValue()
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 / r12
            double r10 = r10 * r8
            return r10
        L31:
            int r8 = r0 + (-2)
            if (r8 <= 0) goto Ld2
            java.lang.String r9 = r7.substring(r8)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = -1
            int r5 = r9.hashCode()
            r6 = 3178(0xc6a, float:4.453E-42)
            if (r5 == r6) goto L99
            r6 = 3240(0xca8, float:4.54E-42)
            if (r5 == r6) goto L8f
            r6 = 3365(0xd25, float:4.715E-42)
            if (r5 == r6) goto L85
            r6 = 3488(0xda0, float:4.888E-42)
            if (r5 == r6) goto L7b
            r6 = 3571(0xdf3, float:5.004E-42)
            if (r5 == r6) goto L71
            r6 = 3588(0xe04, float:5.028E-42)
            if (r5 == r6) goto L67
            r6 = 3592(0xe08, float:5.033E-42)
            if (r5 == r6) goto L5d
            goto La3
        L5d:
            java.lang.String r5 = "px"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 0
            goto La4
        L67:
            java.lang.String r5 = "pt"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 2
            goto La4
        L71:
            java.lang.String r5 = "pc"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 3
            goto La4
        L7b:
            java.lang.String r5 = "mm"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 4
            goto La4
        L85:
            java.lang.String r5 = "in"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 6
            goto La4
        L8f:
            java.lang.String r5 = "em"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 1
            goto La4
        L99:
            java.lang.String r5 = "cm"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto La3
            r9 = 5
            goto La4
        La3:
            r9 = -1
        La4:
            switch(r9) {
                case 0: goto La8;
                case 1: goto Lc1;
                case 2: goto Lbf;
                case 3: goto Lbc;
                case 4: goto Lb6;
                case 5: goto Lb0;
                case 6: goto Laa;
                default: goto La7;
            }
        La7:
            r8 = r0
        La8:
            r12 = r1
            goto Lc1
        Laa:
            r12 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc1
        Lb0:
            r12 = 4630183578586017914(0x4041b76ed677707a, double:35.43307)
            goto Lc1
        Lb6:
            r12 = 4615161236842447043(0x400c58b1572580c3, double:3.543307)
            goto Lc1
        Lbc:
            r12 = 4624633867356078080(0x402e000000000000, double:15.0)
            goto Lc1
        Lbf:
            r12 = 4608308318706860032(0x3ff4000000000000, double:1.25)
        Lc1:
            java.lang.String r7 = r7.substring(r4, r8)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r7 = r7.doubleValue()
            double r7 = r7 * r12
        Lcf:
            double r7 = r7 * r10
            return r7
        Ld2:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r7 = r7.doubleValue()
            goto Lcf
        Ldb:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.w.a(java.lang.String, double, double, double):double");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ReadableArray readableArray, float[] fArr, float f2) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f2;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f2;
        return 6;
    }
}
