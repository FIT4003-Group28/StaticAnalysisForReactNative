package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static final baii a = baii.g(61);
    private final Executor b;
    private baia c;
    private ankt d;
    private boolean e;
    private final h f;

    public b(h hVar, Executor executor) {
        this.f = hVar;
        this.b = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1.g < r2.g) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.ankt a() {
        /*
            r4 = this;
            monitor-enter(r4)
            ankt r0 = r4.d     // Catch: java.lang.Throwable -> L54
            baia r1 = r4.c     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L8
            goto L1f
        L8:
            baia r2 = defpackage.baia.c()     // Catch: java.lang.Throwable -> L54
            baii r1 = defpackage.baii.h(r2, r1)     // Catch: java.lang.Throwable -> L54
            baii r2 = com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b.a     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L19
            int r1 = r1.g     // Catch: java.lang.Throwable -> L54
            if (r1 < 0) goto L1f
            goto L4f
        L19:
            int r1 = r1.g     // Catch: java.lang.Throwable -> L54
            int r2 = r2.g     // Catch: java.lang.Throwable -> L54
            if (r1 >= r2) goto L4f
        L1f:
            boolean r1 = r4.e     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L4a
            r0 = 1
            r4.e = r0     // Catch: java.lang.Throwable -> L54
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.h r1 = r4.f     // Catch: java.lang.Throwable -> L54
            ankt r1 = r1.a()     // Catch: java.lang.Throwable -> L54
            anko r1 = defpackage.anko.q(r1)     // Catch: java.lang.Throwable -> L54
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a r2 = new com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a     // Catch: java.lang.Throwable -> L54
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L54
            ankt r1 = defpackage.anii.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L54
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a r2 = new com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a     // Catch: java.lang.Throwable -> L54
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L54
            java.lang.Class<com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e> r0 = com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e.class
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L54
            ankt r0 = defpackage.anhq.i(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L54
            r4.d = r0     // Catch: java.lang.Throwable -> L54
        L4a:
            r0.getClass()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)
            return r0
        L4f:
            r0.getClass()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)
            return r0
        L54:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b.a():ankt");
    }

    public final synchronized ankt b(e eVar) {
        this.e = false;
        this.d = null;
        this.c = null;
        return anlz.p(eVar);
    }

    public final synchronized ankt c(aotu aotuVar) {
        aotw aotwVar;
        String str;
        aotw aotwVar2;
        this.e = false;
        aorw aorwVar = aotuVar.e;
        if (aorwVar == null) {
            aorwVar = aorw.a;
        }
        this.c = new baia(aosw.b(aorwVar));
        c cVar = new c();
        cVar.a(aotw.a);
        String str2 = aotuVar.d;
        if (str2 != null) {
            cVar.a = str2;
            if (aotuVar.b == 4) {
                aotwVar = (aotw) aotuVar.c;
            } else {
                aotwVar = aotw.a;
            }
            cVar.a(aotwVar);
            str = cVar.a;
            if (str != null && (aotwVar2 = cVar.b) != null) {
            }
            StringBuilder sb = new StringBuilder();
            if (cVar.a == null) {
                sb.append(" token");
            }
            if (cVar.b == null) {
                sb.append(" apiAccess");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        throw new NullPointerException("Null token");
        return anlz.q(new d(str, aotwVar2));
    }
}
