package com.facebook.react.animated;

import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
/* compiled from: InterpolationAnimatedNode.java */
/* loaded from: classes.dex */
class i extends q {
    private final double[] g;
    private final double[] h;
    private final String i;
    private final String j;
    private q k;

    private static double[] a(am amVar) {
        double[] dArr = new double[amVar.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = amVar.getDouble(i);
        }
        return dArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r23.equals("identity") != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double a(double r12, double r14, double r16, double r18, double r20, java.lang.String r22, java.lang.String r23) {
        /*
            r3 = r22
            r4 = r23
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r7 = 0
            r8 = 1
            r9 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r10 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r6 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            r11 = -1
            if (r5 >= 0) goto L60
            int r5 = r22.hashCode()
            if (r5 == r6) goto L33
            if (r5 == r10) goto L29
            if (r5 == r9) goto L1f
            goto L3d
        L1f:
            java.lang.String r5 = "clamp"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3d
            r5 = 1
            goto L3e
        L29:
            java.lang.String r5 = "identity"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3d
            r5 = 0
            goto L3e
        L33:
            java.lang.String r5 = "extend"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3d
            r5 = 2
            goto L3e
        L3d:
            r5 = -1
        L3e:
            switch(r5) {
                case 0: goto L5f;
                case 1: goto L5d;
                case 2: goto L60;
                default: goto L41;
            }
        L41:
            com.facebook.react.bridge.n r0 = new com.facebook.react.bridge.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid extrapolation type "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "for left extrapolation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            r0 = r14
            goto L61
        L5f:
            return r12
        L60:
            r0 = r12
        L61:
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 <= 0) goto Lb1
            int r3 = r23.hashCode()
            if (r3 == r6) goto L83
            if (r3 == r10) goto L7a
            if (r3 == r9) goto L70
            goto L8d
        L70:
            java.lang.String r3 = "clamp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8d
            r7 = 1
            goto L8e
        L7a:
            java.lang.String r3 = "identity"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8d
            goto L8e
        L83:
            java.lang.String r3 = "extend"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8d
            r7 = 2
            goto L8e
        L8d:
            r7 = -1
        L8e:
            switch(r7) {
                case 0: goto Lb0;
                case 1: goto Lad;
                case 2: goto Lb1;
                default: goto L91;
            }
        L91:
            com.facebook.react.bridge.n r0 = new com.facebook.react.bridge.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid extrapolation type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "for right extrapolation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lad:
            r0 = r16
            goto Lb1
        Lb0:
            return r0
        Lb1:
            r3 = 0
            double r3 = r20 - r18
            double r0 = r0 - r14
            double r3 = r3 * r0
            double r0 = r16 - r14
            double r3 = r3 / r0
            double r0 = r18 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.i.a(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static double a(double d2, double[] dArr, double[] dArr2, String str, String str2) {
        int a2 = a(d2, dArr);
        int i = a2 + 1;
        return a(d2, dArr[a2], dArr[i], dArr2[a2], dArr2[i], str, str2);
    }

    private static int a(double d2, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d2) {
            i++;
        }
        return i - 1;
    }

    public i(an anVar) {
        this.g = a(anVar.e("inputRange"));
        this.h = a(anVar.e("outputRange"));
        this.i = anVar.getString("extrapolateLeft");
        this.j = anVar.getString("extrapolateRight");
    }

    @Override // com.facebook.react.animated.b
    public void c(b bVar) {
        if (this.k != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(bVar instanceof q)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.k = (q) bVar;
    }

    @Override // com.facebook.react.animated.b
    public void d(b bVar) {
        if (bVar != this.k) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.k = null;
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        if (this.k == null) {
            return;
        }
        this.e = a(this.k.b(), this.g, this.h, this.i, this.j);
    }
}
