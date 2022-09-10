package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: czbw  reason: default package */
/* loaded from: classes5.dex */
public final class czbw extends czcj {
    public final ExecutorService a;
    public final cyhd b;
    public final ClientVersion c;
    public final cyph d;
    private final Context e;
    private final cyuj f;
    private final dehn<cych> g;

    public czbw(Context context, ClientVersion clientVersion, dehn<cych> dehnVar, Locale locale, cyhd cyhdVar, ExecutorService executorService, cyph cyphVar) {
        dbsk.s(context);
        this.e = context;
        dbsk.s(dehnVar);
        this.g = dehnVar;
        this.a = executorService;
        this.f = new cyuj(locale);
        this.b = cyhdVar;
        this.c = clientVersion;
        dbsk.s(cyphVar);
        this.d = cyphVar;
    }

    public static final long e(@dzsi cyit cyitVar) {
        cylg cylgVar;
        if (cyitVar == null || (cylgVar = cyitVar.c) == null) {
            return 0L;
        }
        return cylgVar.b;
    }

    public static final long f(@dzsi cyit cyitVar) {
        cylg cylgVar;
        if (cyitVar == null || (cylgVar = cyitVar.c) == null) {
            return 0L;
        }
        return cylgVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.czcl a(java.lang.String r9, com.google.android.libraries.social.populous.core.ClientConfigInternal r10, defpackage.cych r11, defpackage.cyor r12) {
        /*
            r8 = this;
            boolean r0 = defpackage.dbsj.d(r9)
            if (r0 == 0) goto L9
            r0 = 2
            r2 = 2
            goto Lb
        L9:
            r0 = 3
            r2 = 3
        Lb:
            cyph r0 = r8.d
            dbtp r0 = r0.b()
            r1 = 0
            cyhd r3 = r8.b     // Catch: defpackage.cylw -> L88
            cylx r3 = r3.b()     // Catch: defpackage.cylw -> L88
            if (r3 == 0) goto L82
            cyhd r3 = r8.b     // Catch: defpackage.cylw -> L88
            cylx r3 = r3.b()     // Catch: defpackage.cylw -> L88
            cyip r4 = defpackage.cyip.d     // Catch: defpackage.cylw -> L88
            dsqp r4 = r4.bZ()     // Catch: defpackage.cylw -> L88
            cyio r4 = (defpackage.cyio) r4     // Catch: defpackage.cylw -> L88
            boolean r5 = r4.c     // Catch: defpackage.cylw -> L88
            r6 = 0
            if (r5 == 0) goto L32
            r4.bF()     // Catch: defpackage.cylw -> L88
            r4.c = r6     // Catch: defpackage.cylw -> L88
        L32:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r4.b     // Catch: defpackage.cylw -> L88
            cyip r5 = (defpackage.cyip) r5     // Catch: defpackage.cylw -> L88
            r9.getClass()     // Catch: defpackage.cylw -> L88
            r5.a = r9     // Catch: defpackage.cylw -> L88
            dhdj r9 = r10.g     // Catch: defpackage.cylw -> L88
            java.lang.String r9 = r9.name()     // Catch: defpackage.cylw -> L88
            boolean r5 = r4.c     // Catch: defpackage.cylw -> L88
            if (r5 == 0) goto L4a
            r4.bF()     // Catch: defpackage.cylw -> L88
            r4.c = r6     // Catch: defpackage.cylw -> L88
        L4a:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r4.b     // Catch: defpackage.cylw -> L88
            cyip r5 = (defpackage.cyip) r5     // Catch: defpackage.cylw -> L88
            r9.getClass()     // Catch: defpackage.cylw -> L88
            r5.b = r9     // Catch: defpackage.cylw -> L88
            dsqw r9 = r4.bK()     // Catch: defpackage.cylw -> L88
            cyip r9 = (defpackage.cyip) r9     // Catch: defpackage.cylw -> L88
            cylt r4 = defpackage.cylu.e()     // Catch: defpackage.cylw -> L88
            r4.d(r10)     // Catch: defpackage.cylw -> L88
            com.google.android.libraries.social.populous.core.ClientVersion r5 = r8.c     // Catch: defpackage.cylw -> L88
            r6 = r4
            cyim r6 = (defpackage.cyim) r6     // Catch: defpackage.cylw -> L88
            r6.a = r5     // Catch: defpackage.cylw -> L88
            cyhd r5 = r8.b     // Catch: defpackage.cylw -> L88
            cyhg r5 = r5.a()     // Catch: defpackage.cylw -> L88
            r4.c(r5)     // Catch: defpackage.cylw -> L88
            r4.b(r11)     // Catch: defpackage.cylw -> L88
            cylu r11 = r4.a()     // Catch: defpackage.cylw -> L88
            cyit r9 = r3.a(r9, r11)     // Catch: defpackage.cylw -> L88
            cyes r11 = r8.c(r9)     // Catch: defpackage.cylw -> L80
            goto L90
        L80:
            r11 = move-exception
            goto L8b
        L82:
            cylw r9 = new cylw     // Catch: defpackage.cylw -> L88
            r9.<init>()     // Catch: defpackage.cylw -> L88
            throw r9     // Catch: defpackage.cylw -> L88
        L88:
            r9 = move-exception
            r11 = r9
            r9 = r1
        L8b:
            cyes r11 = r11.a()
            r0 = r1
        L90:
            cyes r3 = defpackage.cyes.SUCCESS
            if (r11 == r3) goto L96
            r6 = r1
            goto L97
        L96:
            r6 = r0
        L97:
            cyph r0 = r8.d
            long r3 = e(r9)
            defpackage.cypg.d(r0, r2, r3, r12)
            cyph r1 = r8.d
            int r3 = defpackage.cyfa.b(r11)
            long r4 = f(r9)
            r7 = r12
            defpackage.cypg.e(r1, r2, r3, r4, r6, r7)
            cyes r12 = defpackage.cyes.SUCCESS
            if (r11 != r12) goto Ld0
            czck r12 = defpackage.czcl.d()
            r12.d(r11)
            dcdc r10 = r8.d(r10, r9)
            r12.c(r10)
            cyis r9 = r9.b
            if (r9 != 0) goto Lc6
            cyis r9 = defpackage.cyis.c
        Lc6:
            boolean r9 = r9.a
            r12.b(r9)
            czcl r9 = r12.a()
            return r9
        Ld0:
            czck r9 = defpackage.czcl.d()
            r9.d(r11)
            czcl r9 = r9.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czbw.a(java.lang.String, com.google.android.libraries.social.populous.core.ClientConfigInternal, cych, cyor):czcl");
    }

    public final dehn<czcl> b(final String str, final ClientConfigInternal clientConfigInternal, final cych cychVar, cyor cyorVar) {
        if (this.b.b() != null) {
            int i = dbsj.d(str) ? 2 : 3;
            dbtp b = this.d.b();
            dehn f = deha.f(new deff(this, str, clientConfigInternal, cychVar) { // from class: czbp
                private final czbw a;
                private final String b;
                private final ClientConfigInternal c;
                private final cych d;

                {
                    this.a = this;
                    this.b = str;
                    this.c = clientConfigInternal;
                    this.d = cychVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    czbw czbwVar = this.a;
                    String str2 = this.b;
                    ClientConfigInternal clientConfigInternal2 = this.c;
                    cych cychVar2 = this.d;
                    cylx b2 = czbwVar.b.b();
                    cyio bZ = cyip.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    str2.getClass();
                    ((cyip) bZ.b).a = str2;
                    String name = clientConfigInternal2.g.name();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    name.getClass();
                    ((cyip) bZ.b).b = name;
                    cylt e = cylu.e();
                    e.d(clientConfigInternal2);
                    ((cyim) e).a = czbwVar.c;
                    e.c(czbwVar.b.a());
                    e.b(cychVar2);
                    return b2.b(bZ.bK(), e.a());
                }
            }, this.a);
            deha.q(f, new czbv(this, i, cyorVar, b), dege.a);
            return deee.g(deew.h(f, new dbrn(this, clientConfigInternal) { // from class: czbq
                private final czbw a;
                private final ClientConfigInternal b;

                {
                    this.a = this;
                    this.b = clientConfigInternal;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    czbw czbwVar = this.a;
                    ClientConfigInternal clientConfigInternal2 = this.b;
                    cyit cyitVar = (cyit) obj;
                    cyes c = czbwVar.c(cyitVar);
                    czck d = czcl.d();
                    d.d(c);
                    d.c(czbwVar.d(clientConfigInternal2, cyitVar));
                    cyis cyisVar = cyitVar.b;
                    if (cyisVar == null) {
                        cyisVar = cyis.c;
                    }
                    d.b(cyisVar.a);
                    return d.a();
                }
            }, dege.a), cylw.class, czbr.a, dege.a);
        }
        return deha.b(new cylw());
    }

    public final cyes c(@dzsi Object obj) {
        if (!cyui.a(this.e)) {
            return cyes.FAILED_NETWORK;
        }
        if (obj == null) {
            return cyes.FAILED_PEOPLE_API_RESPONSE_EMPTY;
        }
        return cyes.SUCCESS;
    }

    public final dcdc<cywi> d(ClientConfigInternal clientConfigInternal, cyit cyitVar) {
        dccx F = dcdc.F();
        for (cymg cymgVar : cyitVar.a) {
            cywi a = cymy.a(cymgVar, clientConfigInternal, 3, this.f);
            if (a != null) {
                F.g(a);
            }
        }
        return F.f();
    }

    @Override // defpackage.czcj
    public final void g(ClientConfigInternal clientConfigInternal, cyem<czcl> cyemVar, String str, cyor cyorVar) {
        deha.q(this.g, new czbu(this, cyemVar, str, clientConfigInternal, cyorVar), dege.a);
    }

    @Override // defpackage.czcj
    public final dehn<czcl> h(final ClientConfigInternal clientConfigInternal, final String str, final cyor cyorVar) {
        if (!cyui.a(this.e)) {
            czck d = czcl.d();
            d.d(cyes.FAILED_NETWORK);
            return deha.a(d.a());
        }
        return deew.g(this.g, new defg(this, str, clientConfigInternal, cyorVar) { // from class: czbo
            private final czbw a;
            private final String b;
            private final ClientConfigInternal c;
            private final cyor d;

            {
                this.a = this;
                this.b = str;
                this.c = clientConfigInternal;
                this.d = cyorVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czbw czbwVar = this.a;
                String str2 = this.b;
                ClientConfigInternal clientConfigInternal2 = this.c;
                cyor cyorVar2 = this.d;
                cych cychVar = (cych) obj;
                if (dyaw.d()) {
                    if (cychVar.c == cycg.SUCCESS_LOGGED_IN) {
                        return czbwVar.b(str2, clientConfigInternal2, cychVar, cyorVar2);
                    }
                    czck d2 = czcl.d();
                    d2.d(cyes.SKIPPED);
                    return deha.a(d2.a());
                }
                return czbwVar.b(str2, clientConfigInternal2, cychVar, cyorVar2);
            }
        }, this.a);
    }
}
