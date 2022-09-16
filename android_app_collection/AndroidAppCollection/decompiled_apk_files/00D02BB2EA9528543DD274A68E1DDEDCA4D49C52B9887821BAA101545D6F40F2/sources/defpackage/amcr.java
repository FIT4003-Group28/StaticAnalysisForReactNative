package defpackage;

import java.io.IOException;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amcr  reason: default package */
/* loaded from: classes.dex */
public final class amcr {
    private static final dcqe a = dcqe.c("amcr");
    private final dwwg b;
    private int c = -1;
    private final Map<String, amcq> d = dcjz.d();

    public amcr(dwwg dwwgVar) {
        this.b = dwwgVar;
    }

    public final synchronized void a(int i) {
        if (i != this.c) {
            this.c = i;
            b();
        }
    }

    public final synchronized void b() {
        this.d.clear();
    }

    public final synchronized boolean c(String str) {
        if (this.d.containsKey(str)) {
            if (this.d.get(str).d == 1) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d(String str) {
        boolean z;
        if (this.d.containsKey(str)) {
            if (this.d.get(str).d == 2) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:21:0x0040, B:14:0x002e, B:10:0x001d, B:12:0x0023, B:13:0x002a), top: B:27:0x0001, inners: #1 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.alxs e(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            dmwb r0 = defpackage.dmwb.MULTIZOOM_STYLE_TABLE     // Catch: java.lang.Throwable -> L48
            java.util.Map<java.lang.String, amcq> r1 = r5.d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L48
            amcq r1 = (defpackage.amcq) r1     // Catch: java.lang.Throwable -> L48
            r2 = 0
            if (r1 == 0) goto L3b
            dmwb r0 = r1.c     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L2e
            byte[] r3 = r1.a     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L48
            int r4 = r3.length     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L48
            int r1 = r1.b     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L48
            byte[] r6 = defpackage.anak.b(r3, r4, r1)     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L48
            goto L3c
        L1c:
            r1 = move-exception
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L2a
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Error in decompress for style table "
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L48
        L2a:
            defpackage.bvoo.j(r1)     // Catch: java.lang.Throwable -> L48
            goto L3b
        L2e:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r0[r1] = r6     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "styleTableFormat was null when getting cached style table %s"
            defpackage.bvoo.h(r6, r0)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r5)
            return r2
        L3b:
            r6 = r2
        L3c:
            if (r6 != 0) goto L40
            monitor-exit(r5)
            return r2
        L40:
            dwwg r1 = r5.b     // Catch: java.lang.Throwable -> L48
            alxs r6 = defpackage.alxz.g(r6, r0, r1)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r5)
            return r6
        L48:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amcr.e(java.lang.String):alxs");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:6:0x000c, B:17:0x002c, B:19:0x002f, B:25:0x006d, B:22:0x0049, B:9:0x0017, B:11:0x001d, B:12:0x0024), top: B:35:0x0001, inners: #0, #1 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.alwz f(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, amcq> r0 = r5.d     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L75
            amcq r0 = (defpackage.amcq) r0     // Catch: java.lang.Throwable -> L75
            r1 = 0
            if (r0 == 0) goto L27
            byte[] r2 = r0.a     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L75
            int r3 = r2.length     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L75
            int r0 = r0.b     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L75
            byte[] r0 = defpackage.anak.b(r2, r3, r0)     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L75
            goto L28
        L16:
            r0 = move-exception
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L24
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "Error in decompress for common style data "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L75
        L24:
            defpackage.bvoo.j(r0)     // Catch: java.lang.Throwable -> L75
        L27:
            r0 = r1
        L28:
            if (r0 != 0) goto L2c
            monitor-exit(r5)
            return r1
        L2c:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L6d
            dmnn r2 = defpackage.dmnn.c     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            r3 = 7
            java.lang.Object r2 = r2.cu(r3)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            dssr r2 = (defpackage.dssr) r2     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            r3.<init>(r0)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            java.lang.Object r2 = r2.h(r3)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            dmnn r2 = (defpackage.dmnn) r2     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            alwz r1 = defpackage.alwz.a(r2)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> L75
            goto L6b
        L48:
            r2 = move-exception
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            int r3 = r3 + 64
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "Error in parsing proto for common style data "
            r4.append(r3)     // Catch: java.lang.Throwable -> L75
            r4.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = ", size: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L75
            r4.append(r0)     // Catch: java.lang.Throwable -> L75
            r4.toString()     // Catch: java.lang.Throwable -> L75
            defpackage.bvoo.j(r2)     // Catch: java.lang.Throwable -> L75
        L6b:
            monitor-exit(r5)
            return r1
        L6d:
            dmnn r6 = defpackage.dmnn.c     // Catch: java.lang.Throwable -> L75
            alwz r6 = defpackage.alwz.a(r6)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r5)
            return r6
        L75:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amcr.f(java.lang.String):alwz");
    }

    public final synchronized void g(int i, String str, byte[] bArr, @dzsi dmwb dmwbVar) {
        amcq amcqVar;
        if (this.c == i) {
            try {
                int length = bArr.length;
                byte[] a2 = anak.a(bArr, length);
                if (dmwbVar != null) {
                    amcqVar = new amcq(a2, length, dmwbVar);
                } else {
                    amcqVar = new amcq(a2, length);
                }
                this.d.put(str, amcqVar);
            } catch (IOException e) {
                if (String.valueOf(str).length() == 0) {
                    new String("Error in compress for style table ");
                }
                bvoo.j(e);
            }
        }
    }
}
