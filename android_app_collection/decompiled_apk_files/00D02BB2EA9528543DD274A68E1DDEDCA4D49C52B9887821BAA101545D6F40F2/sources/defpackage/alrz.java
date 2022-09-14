package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alrz  reason: default package */
/* loaded from: classes.dex */
public final class alrz {
    public static final dcqe a = dcqe.c("alrz");
    private static final alry b = new alry(amgj.a, null);
    private final akpq c;
    private final amfi d;
    private final AtomicInteger e = new AtomicInteger(0);
    private final btnc<amgj, alry> f = new btnc<>(2048);

    public alrz(akpq akpqVar, amfi amfiVar) {
        this.c = akpqVar;
        this.d = amfiVar;
    }

    private final synchronized alry g(amgj amgjVar) {
        alry n = this.f.n(amgjVar);
        if (n != null) {
            return n;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized bnva a(amgj amgjVar) {
        return g(amgjVar).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(amgj amgjVar) {
        alry g = g(amgjVar);
        if (g != b) {
            g.c(this.d, amgjVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized amgj c(amgk amgkVar, bnrd bnrdVar) {
        amgj c;
        int andIncrement = this.e.getAndIncrement();
        StringBuilder sb = new StringBuilder(33);
        sb.append("ClientProvidedTexture_");
        sb.append(andIncrement);
        c = amgj.c(sb.toString(), amgkVar);
        alry alryVar = new alry(c, this.c);
        alryVar.d(bnrdVar);
        this.f.Pz(c, alryVar);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized amgj d(amgj amgjVar, bnrd bnrdVar) {
        alry g = g(amgjVar);
        if (g != b) {
            g.b();
            return amgjVar;
        }
        int andIncrement = this.e.getAndIncrement();
        StringBuilder sb = new StringBuilder(33);
        sb.append("ClientProvidedTexture_");
        sb.append(andIncrement);
        amgj c = amgj.c(sb.toString(), amgjVar.b());
        alry alryVar = new alry(amgjVar, this.c);
        alryVar.d(bnrdVar);
        this.f.Pz(amgjVar, alryVar);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(amgj amgjVar) {
        alry g = g(amgjVar);
        if (g != b) {
            if (g.d) {
                bvoo.h("Attempted to release to a destroyed TextureNode", new Object[0]);
            }
            if (g.c.decrementAndGet() != 0) {
                return false;
            }
            g.d = true;
            this.f.o(amgjVar);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 != 2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(defpackage.amgj r7, defpackage.alro r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            alry r0 = r6.g(r7)     // Catch: java.lang.Throwable -> L6a
            alry r1 = defpackage.alrz.b     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L16
            alry r0 = new alry     // Catch: java.lang.Throwable -> L6a
            akpq r1 = r6.c     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L6a
            btnc<amgj, alry> r1 = r6.f     // Catch: java.lang.Throwable -> L6a
            r1.Pz(r7, r0)     // Catch: java.lang.Throwable -> L6a
            goto L19
        L16:
            r0.b()     // Catch: java.lang.Throwable -> L6a
        L19:
            amfi r7 = r6.d     // Catch: java.lang.Throwable -> L6a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6a
            int r1 = r0.e     // Catch: java.lang.Throwable -> L67
            int r2 = r1 + (-1)
            if (r1 == 0) goto L65
            r1 = 2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            if (r2 == r1) goto L5b
        L2b:
            r3 = 0
            goto L5b
        L2d:
            java.util.List<alro> r7 = r0.a     // Catch: java.lang.Throwable -> L67
            r7.add(r8)     // Catch: java.lang.Throwable -> L67
            goto L2b
        L33:
            amgj r2 = r0.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = ""
            amfu r7 = r7.h(r2, r5, r0)     // Catch: java.lang.Throwable -> L67
            boolean r2 = r7.a()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L53
            android.graphics.Bitmap r7 = r7.h()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L2b
            bnrd r7 = defpackage.bnrh.a(r7)     // Catch: java.lang.Throwable -> L67
            r0.d(r7)     // Catch: java.lang.Throwable -> L67
            goto L5b
        L53:
            r0.e = r1     // Catch: java.lang.Throwable -> L67
            java.util.List<alro> r7 = r0.a     // Catch: java.lang.Throwable -> L67
            r7.add(r8)     // Catch: java.lang.Throwable -> L67
            goto L2b
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L63
            r8.a()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)
            return
        L63:
            monitor-exit(r6)
            return
        L65:
            r7 = 0
            throw r7     // Catch: java.lang.Throwable -> L67
        L67:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r7     // Catch: java.lang.Throwable -> L6a
        L6a:
            r7 = move-exception
            monitor-exit(r6)
            goto L6e
        L6d:
            throw r7
        L6e:
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alrz.f(amgj, alro):void");
    }
}
