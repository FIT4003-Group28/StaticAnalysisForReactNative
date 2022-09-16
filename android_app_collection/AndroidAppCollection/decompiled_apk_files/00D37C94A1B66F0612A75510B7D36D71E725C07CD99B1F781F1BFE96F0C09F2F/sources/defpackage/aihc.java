package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aihc  reason: default package */
/* loaded from: classes.dex */
public final class aihc {
    private aeug a = null;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private String d;

    private final synchronized void d() {
        aeug aeugVar = this.a;
        if (aeugVar != null) {
            aeugVar.b();
            this.a = null;
            this.d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r2 != 2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:10:0x0019, B:12:0x001d, B:19:0x002c, B:23:0x0034, B:25:0x003c, B:27:0x0044, B:29:0x004c, B:31:0x0050, B:34:0x0057, B:35:0x0059, B:38:0x005c, B:39:0x006c, B:40:0x006d), top: B:46:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.ahgb r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            ahfz r0 = r7.d()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L9
            monitor-exit(r6)
            return
        L9:
            aeui r1 = r0.a     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "Cuepoint-Identifier"
            java.lang.String r1 = r1.d(r2)     // Catch: java.lang.Throwable -> L72
            aeso r0 = r0.a()     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L6d
            if (r0 == 0) goto L6d
            int r2 = r0.b     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L26
            long r2 = r0.c     // Catch: java.lang.Throwable -> L72
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r2 = 0
        L26:
            r0 = 1
            if (r2 == r0) goto L2c
            r0 = 2
            if (r2 != r0) goto L6d
        L2c:
            ahga r7 = r7.e()     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L34
            monitor-exit(r6)
            return
        L34:
            java.util.Set r7 = r6.b     // Catch: java.lang.Throwable -> L72
            boolean r7 = r7.contains(r1)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L5c
            java.util.Set r7 = r6.b     // Catch: java.lang.Throwable -> L72
            boolean r7 = r7.contains(r1)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L5a
            java.lang.String r7 = r6.d     // Catch: java.lang.Throwable -> L72
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L5a
            aeug r7 = r6.a     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L5a
            boolean r7 = r7.c()     // Catch: java.lang.Throwable -> L72
            if (r7 != 0) goto L57
            goto L5a
        L57:
            aeug r7 = r6.a     // Catch: java.lang.Throwable -> L72
            throw r7     // Catch: java.lang.Throwable -> L72
        L5a:
            monitor-exit(r6)
            return
        L5c:
            java.util.Set r7 = r6.b     // Catch: java.lang.Throwable -> L72
            r7.add(r1)     // Catch: java.lang.Throwable -> L72
            aeug r7 = new aeug     // Catch: java.lang.Throwable -> L72
            r0 = 5000(0x1388, float:7.006E-42)
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L72
            r6.a = r7     // Catch: java.lang.Throwable -> L72
            r6.d = r1     // Catch: java.lang.Throwable -> L72
            throw r7     // Catch: java.lang.Throwable -> L72
        L6d:
            r6.d()     // Catch: java.lang.Throwable -> L72
            monitor-exit(r6)
            return
        L72:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihc.a(ahgb):void");
    }

    public final synchronized void b() {
        String str;
        aeug aeugVar = this.a;
        if (aeugVar != null) {
            if (!aeugVar.c() && (str = this.d) != null && this.b.contains(str)) {
                this.c.add(this.d);
            }
            d();
        }
    }

    public final synchronized boolean c(String str) {
        return this.c.contains(str);
    }
}
