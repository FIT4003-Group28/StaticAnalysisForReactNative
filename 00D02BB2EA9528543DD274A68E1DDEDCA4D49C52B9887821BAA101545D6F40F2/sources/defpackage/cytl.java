package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: cytl  reason: default package */
/* loaded from: classes5.dex */
final class cytl implements degu<cyts> {
    final /* synthetic */ cyuc a;
    final /* synthetic */ cytq b;
    final /* synthetic */ dbtp c;
    final /* synthetic */ cyem d;
    final /* synthetic */ dehn e;
    final /* synthetic */ cytm f;

    public cytl(cytm cytmVar, cyuc cyucVar, cytq cytqVar, dbtp dbtpVar, cyem cyemVar, dehn dehnVar) {
        this.f = cytmVar;
        this.a = cyucVar;
        this.b = cytqVar;
        this.c = dbtpVar;
        this.d = cyemVar;
        this.e = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (this.e.isCancelled() || (th instanceof CancellationException)) {
            return;
        }
        cytm cytmVar = this.f;
        cyuc cyucVar = this.a;
        cytq cytqVar = this.b;
        if (!dyaz.f()) {
            cyer b = cyucVar.b();
            cyer cyerVar = cyer.PEOPLE_API_TOP_N;
            int ordinal = b.ordinal();
            int i = 3;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        i = 4;
                    } else if (ordinal != 9) {
                        if (ordinal != 10) {
                            i = 0;
                        }
                    }
                }
                i = 6;
            }
            int a = cyos.a(th);
            if (i != 0 && a != 0) {
                cypg.c(cytmVar.b, i, a, cytqVar.k);
            }
        }
        cyem cyemVar = this.d;
        cytr c = cyts.c();
        c.b(dcdc.e());
        c.e = cyet.a(th);
        c.f = this.a.b();
        cyemVar.a(c.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    @Override // defpackage.degu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(defpackage.cyts r7) {
        /*
            r6 = this;
            cyts r7 = (defpackage.cyts) r7
            cytm r0 = r6.f
            cyuc r1 = r6.a
            cytq r2 = r6.b
            dbtp r3 = r6.c
            boolean r4 = defpackage.dyaz.f()
            if (r4 == 0) goto L11
            goto L45
        L11:
            cyer r1 = r1.b()
            cyer r4 = defpackage.cyer.PEOPLE_API_TOP_N
            int r1 = r1.ordinal()
            r4 = 9
            if (r1 == 0) goto L3a
            r5 = 1
            if (r1 == r5) goto L37
            r5 = 3
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L3a
            r4 = 10
            if (r1 == r4) goto L37
            r4 = 0
            goto L3c
        L2d:
            java.lang.String r1 = r2.b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3c
            r4 = 7
            goto L3c
        L37:
            r4 = 46
            goto L3c
        L3a:
            r4 = 45
        L3c:
            if (r4 == 0) goto L45
            cyph r0 = r0.b
            cyor r1 = r2.k
            defpackage.cypg.a(r0, r4, r3, r1)
        L45:
            cytm r0 = r6.f
            cytq r1 = r6.b
            cyts r7 = r0.d(r7, r1)
            cyem r0 = r6.d
            r0.a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cytl.b(java.lang.Object):void");
    }
}
