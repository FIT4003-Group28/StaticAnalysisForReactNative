package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bfre  reason: default package */
/* loaded from: classes3.dex */
final class bfre {
    private static final dcdc<Integer> a = dcdc.i(0, 1, 2, 3);
    private final dcep<Integer> b;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r13.h == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r8 != 6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
        if (r13.i.size() != 0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bfre(int r12, defpackage.dnnr r13, defpackage.dnnn r14) {
        /*
            r11 = this;
            r11.<init>()
            dcen r0 = defpackage.dcep.N()
            dcdc<java.lang.Integer> r1 = defpackage.bfre.a
            int r2 = r1.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L10:
            r6 = 2
            if (r4 >= r2) goto L7a
            java.lang.Object r7 = r1.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            r9 = 1
            if (r8 == 0) goto L5f
            if (r8 == r9) goto L3a
            if (r8 == r6) goto L35
            r10 = 3
            if (r8 == r10) goto L28
            goto L77
        L28:
            dsrj<dnnq> r8 = r13.i
            int r8 = r8.size()
            if (r8 == 0) goto L6c
            boolean r8 = r13.h
            if (r8 != 0) goto L6c
            goto L6d
        L35:
            boolean r9 = c(r13, r14)
            goto L6d
        L3a:
            boolean r8 = r13.g
            if (r8 == 0) goto L3f
            goto L6d
        L3f:
            dnhi r8 = r13.j
            if (r8 != 0) goto L45
            dnhi r8 = defpackage.dnhi.f
        L45:
            int r8 = r8.a
            r8 = r8 & r6
            if (r8 == 0) goto L6c
            dnhi r8 = r13.j
            if (r8 != 0) goto L50
            dnhi r8 = defpackage.dnhi.f
        L50:
            int r8 = r8.b
            int r8 = defpackage.dnhh.a(r8)
            if (r8 != 0) goto L59
            r8 = 1
        L59:
            if (r8 == r6) goto L6d
            r10 = 6
            if (r8 != r10) goto L6c
            goto L6d
        L5f:
            boolean r8 = r13.h
            if (r8 == 0) goto L6c
            dsrj<dnnq> r8 = r13.i
            int r8 = r8.size()
            if (r8 == 0) goto L6c
            goto L6d
        L6c:
            r9 = 0
        L6d:
            if (r9 == 0) goto L77
            r0.b(r7)
            int r5 = r5 + 1
            if (r5 != r12) goto L77
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L10
        L7a:
            dsrj<dqxq> r12 = r13.l
            int r12 = r12.size()
            if (r12 == 0) goto L99
            dcep r12 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r12 = r12.contains(r1)
            if (r12 != 0) goto L99
            boolean r12 = c(r13, r14)
            if (r12 == 0) goto L99
            r0.b(r1)
        L99:
            dcep r12 = r0.f()
            r11.b = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfre.<init>(int, dnnr, dnnn):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(dqxc dqxcVar, dnnn dnnnVar) {
        if ((dnnnVar.a & 4096) != 0) {
            int i = dqxcVar.b;
            dqxc dqxcVar2 = dnnnVar.j;
            if (dqxcVar2 == null) {
                dqxcVar2 = dqxc.c;
            }
            if (i != dqxcVar2.b) {
                return true;
            }
        }
        return (dnnnVar.a & 4096) == 0;
    }

    private static boolean c(dnnr dnnrVar, dnnn dnnnVar) {
        boolean z;
        if ((dnnrVar.a & 32768) != 0) {
            dqxc dqxcVar = dnnrVar.k;
            if (dqxcVar == null) {
                dqxcVar = dqxc.c;
            }
            if (b(dqxcVar, dnnnVar)) {
                z = true;
                return (dnnrVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 || z;
            }
        }
        z = false;
        if ((dnnrVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return this.b.contains(Integer.valueOf(i));
    }
}
