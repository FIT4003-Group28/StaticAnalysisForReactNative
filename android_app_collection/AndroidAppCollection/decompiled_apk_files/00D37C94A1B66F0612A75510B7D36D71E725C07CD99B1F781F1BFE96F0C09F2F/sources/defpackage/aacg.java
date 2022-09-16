package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aacg  reason: default package */
/* loaded from: classes.dex */
public final class aacg {
    public final ces a;
    public final Executor b;
    public boolean c;
    private final afvn d;
    private final snc e;
    private final aaci f;
    private final aaqp g;

    public aacg(afvn afvnVar, ces cesVar, snc sncVar, Executor executor, aaci aaciVar, aaqp aaqpVar) {
        this.d = afvnVar;
        this.a = cesVar;
        this.e = sncVar;
        this.b = executor;
        this.f = aaciVar;
        this.g = aaqpVar;
    }

    public final void a(final String str) {
        if (!b()) {
            zep.l("Couldn't remove entry due to uninitialized disk cache");
        } else {
            this.b.execute(new Runnable() { // from class: aace
                @Override // java.lang.Runnable
                public final void run() {
                    aacg aacgVar = aacg.this;
                    String str2 = str;
                    synchronized (aacgVar) {
                        aacgVar.a.e(str2);
                    }
                }
            });
        }
    }

    public final synchronized boolean b() {
        if (this.c) {
            return true;
        }
        try {
            this.a.c();
            this.c = true;
            return true;
        } catch (RuntimeException e) {
            afus.c(2, 5, "Couldn't initialize disk cache", e);
            zep.d("Couldn't initialize disk cache", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.aacj c() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L14
            java.lang.String r0 = "Couldn't fetch browse response due to uninitialized disk cache"
            defpackage.zep.l(r0)     // Catch: java.lang.Throwable -> La1
            arlt r0 = defpackage.arlt.a     // Catch: java.lang.Throwable -> La1
            aacj r0 = defpackage.aacj.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L14:
            java.lang.String r0 = "FElibrary"
            ces r1 = r6.a     // Catch: java.lang.Throwable -> La1
            cer r1 = r1.a(r0)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto L26
            arlt r0 = defpackage.arlt.a     // Catch: java.lang.Throwable -> La1
            aacj r0 = defpackage.aacj.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L26:
            java.util.Map r2 = r1.g     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "Identity-Id"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La1
            afvn r3 = r6.d     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.t()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L49
            afvn r3 = r6.d     // Catch: java.lang.Throwable -> La1
            afvm r3 = r3.c()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> La1
            boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L4f
            goto L57
        L49:
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto L57
        L4f:
            arlt r0 = defpackage.arlt.a     // Catch: java.lang.Throwable -> La1
            aacj r0 = defpackage.aacj.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L57:
            arlt r2 = defpackage.arlt.a     // Catch: java.lang.Throwable -> La1
            aaqp r3 = r6.g     // Catch: java.lang.Throwable -> La1
            byte[] r4 = r1.a     // Catch: java.lang.Throwable -> La1
            aoqu r3 = r3.a(r4, r2)     // Catch: java.lang.Throwable -> La1
            r4 = 1
            if (r3 != 0) goto L80
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La1
            r1 = 0
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> La1
            r0[r1] = r2     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Failed to deserialize %s from cache"
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> La1
            defpackage.zep.b(r0)     // Catch: java.lang.Throwable -> La1
            aacj r0 = defpackage.aacj.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L80:
            aaci r2 = r6.f     // Catch: java.lang.Throwable -> La1
            aach r1 = r2.a(r1)     // Catch: java.lang.Throwable -> La1
            r2 = r1
            aack r2 = (defpackage.aack) r2     // Catch: java.lang.Throwable -> La1
            aacm r2 = r2.b     // Catch: java.lang.Throwable -> La1
            aacm r5 = defpackage.aacm.EXPIRED     // Catch: java.lang.Throwable -> La1
            if (r2 != r5) goto L9a
            r6.a(r0)     // Catch: java.lang.Throwable -> La1
            r0 = r1
            aack r0 = (defpackage.aack) r0     // Catch: java.lang.Throwable -> La1
            ankt r0 = r0.a     // Catch: java.lang.Throwable -> La1
            r0.cancel(r4)     // Catch: java.lang.Throwable -> La1
        L9a:
            aacj r0 = new aacj     // Catch: java.lang.Throwable -> La1
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        La1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacg.c():aacj");
    }

    public final synchronized void d(aoqu aoquVar) {
        if (!TextUtils.isEmpty("FElibrary")) {
            if (aoquVar == null) {
                return;
            }
            if (b()) {
                if (((arlt) aoquVar).t <= 0 && ((arlt) aoquVar).u <= 0) {
                    a("FElibrary");
                    return;
                }
                HashMap hashMap = new HashMap();
                if (this.d.t()) {
                    hashMap.put("Identity-Id", this.d.c().d());
                }
                byte[] byteArray = aoquVar.toByteArray();
                arpa arpaVar = ((arlt) aoquVar).c;
                if (arpaVar == null) {
                    arpaVar = arpa.a;
                }
                final cer f = abga.f(byteArray, hashMap, arpaVar);
                if (f == null) {
                    f = null;
                } else {
                    long c = this.e.c() + TimeUnit.SECONDS.toMillis(((arlt) aoquVar).t);
                    f.e = TimeUnit.SECONDS.toMillis(((arlt) aoquVar).u) + c;
                    f.f = c;
                    f.d = this.e.c();
                }
                if (f == null) {
                    zep.l("Failed to generate cache entry for browse response");
                    return;
                } else {
                    this.b.execute(new Runnable() { // from class: aacf
                        @Override // java.lang.Runnable
                        public final void run() {
                            aacg aacgVar = aacg.this;
                            cer cerVar = f;
                            synchronized (aacgVar) {
                                aacgVar.a.d("FElibrary", cerVar);
                            }
                        }
                    });
                    return;
                }
            }
            zep.l("Couldn't store browse response due to uninitialized disk cache");
            return;
        }
        throw new IllegalArgumentException("Invalid cache key: FElibrary");
    }
}
