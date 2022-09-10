package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cuix  reason: default package */
/* loaded from: classes5.dex */
public final class cuix {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[EDGE_INSN: B:39:0x0082->B:24:0x0082 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(android.content.Context r15, defpackage.cukr r16, android.net.Uri r17, int r18, int r19, long r20, int r22) {
        /*
            java.lang.String r0 = "StaticImageComp"
            int r1 = java.lang.Math.max(r18, r19)
            cswe r2 = defpackage.cswe.a(r15)
            cxju<java.lang.Integer> r2 = r2.ah
            java.lang.Object r2 = r2.f()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            cswe r3 = defpackage.cswe.a(r15)
            cxju<java.lang.Double> r3 = r3.af
            java.lang.Object r3 = r3.f()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r5 = 0
            if (r1 <= r2) goto L42
            long r6 = (long) r2
            long r1 = (long) r1
            r8 = r18
            long r8 = (long) r8
            long r8 = r8 * r6
            long r8 = r8 / r1
            int r9 = (int) r8
            r10 = r19
            long r10 = (long) r10
            long r6 = r6 * r10
            long r6 = r6 / r1
            int r1 = (int) r6
            r2 = r16
            r6 = r17
            r10 = r1
            r7 = r5
            r8 = r9
            r1 = r15
            goto L4c
        L42:
            r8 = r18
            r10 = r19
            r1 = r15
            r2 = r16
            r6 = r17
            r7 = r5
        L4c:
            r9 = r7
        L4d:
            android.graphics.Bitmap r9 = r2.a(r15, r6, r8, r10)     // Catch: java.lang.OutOfMemoryError -> L57
            if (r9 != 0) goto L5a
            defpackage.cstl.a(r0)     // Catch: java.lang.OutOfMemoryError -> L57
            return r5
        L57:
            r11 = r22
            goto L61
        L5a:
            r11 = r22
            byte[] r7 = defpackage.cuiw.a(r9, r11)     // Catch: java.lang.OutOfMemoryError -> L61
            goto L64
        L61:
            defpackage.cstl.a(r0)
        L64:
            if (r7 == 0) goto L6d
            int r12 = r7.length
            long r12 = (long) r12
            int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r14 > 0) goto L6d
            goto L82
        L6d:
            double r12 = (double) r8
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r3
            int r8 = (int) r12
            double r12 = (double) r10
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r3
            int r10 = (int) r12
            r12 = 32
            if (r8 < r12) goto L82
            if (r10 < r12) goto L82
            goto L4d
        L82:
            if (r7 == 0) goto L97
            int r2 = r7.length
            long r2 = (long) r2
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 <= 0) goto L8b
            goto L97
        L8b:
            r0 = r15
            r1 = r9
            r2 = r7
            r3 = r20
            r5 = r22
            byte[] r0 = b(r0, r1, r2, r3, r5)
            return r0
        L97:
            defpackage.cstl.a(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuix.a(android.content.Context, cukr, android.net.Uri, int, int, long, int):byte[]");
    }

    private static byte[] b(Context context, Bitmap bitmap, byte[] bArr, long j, int i) {
        int intValue = cswe.a(context).ae.f().intValue();
        double doubleValue = cswe.a(context).ag.f().doubleValue();
        int i2 = intValue + 1;
        while (i2 - i > 1) {
            int i3 = (i + i2) >> 1;
            try {
                byte[] a = cuiw.a(bitmap, i3);
                if (a != null) {
                    int length = a.length;
                    if (length <= j) {
                        double d = j;
                        Double.isNaN(d);
                        if (length >= d * doubleValue) {
                            cstl.a("StaticImageComp");
                            return a;
                        }
                        i = i3;
                        bArr = a;
                    }
                }
                i2 = i3;
            } catch (OutOfMemoryError unused) {
                cstl.a("StaticImageComp");
            }
        }
        return bArr;
    }
}
