package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: czbb  reason: default package */
/* loaded from: classes5.dex */
public final class czbb implements degu<cych> {
    final /* synthetic */ cyem a;
    final /* synthetic */ List b;
    final /* synthetic */ cygf c;
    final /* synthetic */ czbd d;

    public czbb(czbd czbdVar, cyem cyemVar, List list, cygf cygfVar) {
        this.d = czbdVar;
        this.a = cyemVar;
        this.b = list;
        this.c = cygfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.d.f, 9, 3, cyor.a);
        cyem cyemVar = this.a;
        czbk d = czbn.d();
        d.d(cyes.FAILED_UNKNOWN);
        cyemVar.a(d.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cych cychVar) {
        final cych cychVar2 = cychVar;
        dehp c = dehx.c(this.d.b);
        final cyem cyemVar = this.a;
        final List list = this.b;
        final cygf cygfVar = this.c;
        c.a(new Runnable(this, cyemVar, list, cygfVar, cychVar2) { // from class: czba
            private final czbb a;
            private final cyem b;
            private final List c;
            private final cygf d;
            private final cych e;

            {
                this.a = this;
                this.b = cyemVar;
                this.c = list;
                this.d = cygfVar;
                this.e = cychVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r11 = this;
                    czbb r0 = r11.a
                    cyem r1 = r11.b
                    java.util.List r2 = r11.c
                    cygf r3 = r11.d
                    cych r4 = r11.e
                    czbd r0 = r0.d
                    cyes r5 = defpackage.cyes.NONE
                    cyph r5 = r0.f
                    dbtp r5 = r5.b()
                    r6 = 0
                    cyhd r7 = r0.c     // Catch: defpackage.cylw -> L7e
                    cylx r7 = r7.b()     // Catch: defpackage.cylw -> L7e
                    if (r7 == 0) goto L78
                    cyhd r7 = r0.c     // Catch: defpackage.cylw -> L7e
                    cylx r7 = r7.b()     // Catch: defpackage.cylw -> L7e
                    cyko r8 = defpackage.cyko.c     // Catch: defpackage.cylw -> L7e
                    dsqp r8 = r8.bZ()     // Catch: defpackage.cylw -> L7e
                    cykm r8 = (defpackage.cykm) r8     // Catch: defpackage.cylw -> L7e
                    int r3 = defpackage.czbi.a(r3)     // Catch: defpackage.cylw -> L7e
                    boolean r9 = r8.c     // Catch: defpackage.cylw -> L7e
                    if (r9 == 0) goto L39
                    r8.bF()     // Catch: defpackage.cylw -> L7e
                    r9 = 0
                    r8.c = r9     // Catch: defpackage.cylw -> L7e
                L39:
                    MessageType extends dsqw<MessageType, BuilderType> r9 = r8.b     // Catch: defpackage.cylw -> L7e
                    cyko r9 = (defpackage.cyko) r9     // Catch: defpackage.cylw -> L7e
                    int r3 = defpackage.cykn.a(r3)     // Catch: defpackage.cylw -> L7e
                    r9.a = r3     // Catch: defpackage.cylw -> L7e
                    r8.a(r2)     // Catch: defpackage.cylw -> L7e
                    dsqw r2 = r8.bK()     // Catch: defpackage.cylw -> L7e
                    cyko r2 = (defpackage.cyko) r2     // Catch: defpackage.cylw -> L7e
                    cylt r3 = defpackage.cylu.e()     // Catch: defpackage.cylw -> L7e
                    com.google.android.libraries.social.populous.core.ClientConfigInternal r8 = r0.g     // Catch: defpackage.cylw -> L7e
                    r3.d(r8)     // Catch: defpackage.cylw -> L7e
                    com.google.android.libraries.social.populous.core.ClientVersion r8 = r0.e     // Catch: defpackage.cylw -> L7e
                    r9 = r3
                    cyim r9 = (defpackage.cyim) r9     // Catch: defpackage.cylw -> L7e
                    r9.a = r8     // Catch: defpackage.cylw -> L7e
                    cyhd r8 = r0.c     // Catch: defpackage.cylw -> L7e
                    cyhg r8 = r8.a()     // Catch: defpackage.cylw -> L7e
                    r3.c(r8)     // Catch: defpackage.cylw -> L7e
                    r3.b(r4)     // Catch: defpackage.cylw -> L7e
                    cylu r3 = r3.a()     // Catch: defpackage.cylw -> L7e
                    cykt r2 = r7.e(r2, r3)     // Catch: defpackage.cylw -> L7e
                    cyes r3 = r0.a(r2)     // Catch: defpackage.cylw -> L76
                    r9 = r5
                    goto L86
                L76:
                    r3 = move-exception
                    goto L81
                L78:
                    cylw r2 = new cylw     // Catch: defpackage.cylw -> L7e
                    r2.<init>()     // Catch: defpackage.cylw -> L7e
                    throw r2     // Catch: defpackage.cylw -> L7e
                L7e:
                    r2 = move-exception
                    r3 = r2
                    r2 = r6
                L81:
                    cyes r3 = r3.a()
                    r9 = r6
                L86:
                    cyph r4 = r0.f
                    r5 = 8
                    long r6 = defpackage.czbd.c(r2)
                    cyor r8 = defpackage.cyor.a
                    defpackage.cypg.d(r4, r5, r6, r8)
                    cyph r4 = r0.f
                    int r6 = defpackage.cyfa.b(r3)
                    long r7 = defpackage.czbd.d(r2)
                    cyor r10 = defpackage.cyor.a
                    defpackage.cypg.e(r4, r5, r6, r7, r9, r10)
                    if (r2 == 0) goto La9
                    czbn r0 = r0.b(r2)
                    goto Lb4
                La9:
                    czbk r0 = defpackage.czbn.d()
                    r0.d(r3)
                    czbn r0 = r0.a()
                Lb4:
                    r1.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czba.run():void");
            }
        });
    }
}
