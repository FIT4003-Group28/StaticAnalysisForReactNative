package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: czak  reason: default package */
/* loaded from: classes5.dex */
public final class czak implements degu<cych> {
    final /* synthetic */ cyem a;
    final /* synthetic */ List b;
    final /* synthetic */ czam c;

    public czak(czam czamVar, cyem cyemVar, List list) {
        this.c = czamVar;
        this.a = cyemVar;
        this.b = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.c.f, 9, 3, cyor.a);
        cyem cyemVar = this.a;
        czas c = czav.c();
        c.c(cyes.FAILED_UNKNOWN);
        cyemVar.a(c.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cych cychVar) {
        final cych cychVar2 = cychVar;
        dehp c = dehx.c(this.c.b);
        final cyem cyemVar = this.a;
        final List list = this.b;
        c.a(new Runnable(this, cyemVar, list, cychVar2) { // from class: czaj
            private final czak a;
            private final cyem b;
            private final List c;
            private final cych d;

            {
                this.a = this;
                this.b = cyemVar;
                this.c = list;
                this.d = cychVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r11 = this;
                    czak r0 = r11.a
                    cyem r1 = r11.b
                    java.util.List r2 = r11.c
                    cych r3 = r11.d
                    czam r0 = r0.c
                    cyph r4 = r0.f
                    dbtp r4 = r4.b()
                    r5 = 0
                    cyhd r6 = r0.c     // Catch: defpackage.cylw -> L62
                    cylx r6 = r6.b()     // Catch: defpackage.cylw -> L62
                    if (r6 == 0) goto L5c
                    cyhd r6 = r0.c     // Catch: defpackage.cylw -> L62
                    cylx r6 = r6.b()     // Catch: defpackage.cylw -> L62
                    cyjv r7 = defpackage.cyjv.b     // Catch: defpackage.cylw -> L62
                    dsqp r7 = r7.bZ()     // Catch: defpackage.cylw -> L62
                    cyju r7 = (defpackage.cyju) r7     // Catch: defpackage.cylw -> L62
                    r7.a(r2)     // Catch: defpackage.cylw -> L62
                    dsqw r2 = r7.bK()     // Catch: defpackage.cylw -> L62
                    cyjv r2 = (defpackage.cyjv) r2     // Catch: defpackage.cylw -> L62
                    cylt r7 = defpackage.cylu.e()     // Catch: defpackage.cylw -> L62
                    com.google.android.libraries.social.populous.core.ClientConfigInternal r8 = r0.g     // Catch: defpackage.cylw -> L62
                    r7.d(r8)     // Catch: defpackage.cylw -> L62
                    com.google.android.libraries.social.populous.core.ClientVersion r8 = r0.e     // Catch: defpackage.cylw -> L62
                    r9 = r7
                    cyim r9 = (defpackage.cyim) r9     // Catch: defpackage.cylw -> L62
                    r9.a = r8     // Catch: defpackage.cylw -> L62
                    cyhd r8 = r0.c     // Catch: defpackage.cylw -> L62
                    cyhg r8 = r8.a()     // Catch: defpackage.cylw -> L62
                    r7.c(r8)     // Catch: defpackage.cylw -> L62
                    r7.b(r3)     // Catch: defpackage.cylw -> L62
                    cylu r3 = r7.a()     // Catch: defpackage.cylw -> L62
                    cyka r2 = r6.c(r2, r3)     // Catch: defpackage.cylw -> L62
                    cyes r3 = r0.a(r2)     // Catch: defpackage.cylw -> L5a
                    r9 = r4
                    goto L6a
                L5a:
                    r3 = move-exception
                    goto L65
                L5c:
                    cylw r2 = new cylw     // Catch: defpackage.cylw -> L62
                    r2.<init>()     // Catch: defpackage.cylw -> L62
                    throw r2     // Catch: defpackage.cylw -> L62
                L62:
                    r2 = move-exception
                    r3 = r2
                    r2 = r5
                L65:
                    cyes r3 = r3.a()
                    r9 = r5
                L6a:
                    cyph r4 = r0.f
                    r5 = 10
                    long r6 = defpackage.czam.c(r2)
                    cyor r8 = defpackage.cyor.a
                    defpackage.cypg.d(r4, r5, r6, r8)
                    cyph r4 = r0.f
                    int r6 = defpackage.cyfa.b(r3)
                    long r7 = defpackage.czam.d(r2)
                    cyor r10 = defpackage.cyor.a
                    defpackage.cypg.e(r4, r5, r6, r7, r9, r10)
                    if (r2 == 0) goto L8d
                    czav r0 = r0.b(r2)
                    goto L98
                L8d:
                    czas r0 = defpackage.czav.c()
                    r0.c(r3)
                    czav r0 = r0.a()
                L98:
                    r1.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czaj.run():void");
            }
        });
    }
}
