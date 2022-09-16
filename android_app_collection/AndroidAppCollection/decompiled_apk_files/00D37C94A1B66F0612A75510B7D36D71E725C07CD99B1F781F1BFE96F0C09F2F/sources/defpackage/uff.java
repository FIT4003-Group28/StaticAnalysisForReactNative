package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: uff  reason: default package */
/* loaded from: classes4.dex */
public final class uff {
    private final ufc a;
    private final snc b;
    private final uhz c;
    private final ues d;

    public uff(ufc ufcVar, ues uesVar, uhz uhzVar, snc sncVar) {
        this.a = ufcVar;
        this.d = uesVar;
        this.c = uhzVar;
        this.b = sncVar;
    }

    public final void a(ucp ucpVar, List list, ubz ubzVar, uer uerVar, boolean z) {
        long d = this.b.d();
        boolean z2 = false;
        if (ucpVar != null) {
            try {
                this.c.b(ucpVar.b);
            } catch (IOException unused) {
                Object[] objArr = new Object[0];
                if (uev.b.b(3)) {
                    uew.a("BlockingNotificationReceiver", "IOException getting auth token.", objArr);
                }
            } catch (Exception e) {
                uev.c("BlockingNotificationReceiver", e, "Error getting auth token.", new Object[0]);
            }
        }
        z2 = true;
        uerVar.d = Long.valueOf(this.b.d() - d);
        if (!z2) {
            uep c = this.d.c(26);
            c.d(ucpVar);
            c.f(list);
            ((ueu) c).t = uerVar;
            c.i();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aomd aomdVar = (aomd) it.next();
            aomdVar.getClass();
            uco b = ucw.b();
            b.e(aomdVar.d);
            aomq aomqVar = aomdVar.f;
            if (aomqVar == null) {
                aomqVar = aomq.a;
            }
            int J2 = akel.J(aomqVar.b);
            if (J2 == 0) {
                J2 = 1;
            }
            b.i(J2);
            aomq aomqVar2 = aomdVar.f;
            if (aomqVar2 == null) {
                aomqVar2 = aomq.a;
            }
            int K = akel.K(aomqVar2.c);
            if (K == 0) {
                K = 1;
            }
            b.h(K);
            aomq aomqVar3 = aomdVar.f;
            if (aomqVar3 == null) {
                aomqVar3 = aomq.a;
            }
            int L = akel.L(aomqVar3.d);
            if (L == 0) {
                L = 1;
            }
            b.g(L);
            aomq aomqVar4 = aomdVar.f;
            if (aomqVar4 == null) {
                aomqVar4 = aomq.a;
            }
            int G = akel.G(aomqVar4.e);
            if (G == 0) {
                G = 1;
            }
            b.k(G);
            b.a = Long.valueOf(aomdVar.h);
            b.b = Long.valueOf(aomdVar.i);
            b.c(aomdVar.b == 12 ? (aolz) aomdVar.c : aolz.a);
            b.f(aomdVar.g);
            b.c = Long.valueOf(aomdVar.e);
            b.d = aomdVar.j;
            aono aonoVar = aomdVar.k;
            if (aonoVar == null) {
                aonoVar = aono.a;
            }
            b.e = aonoVar;
            b.f = aomdVar.l;
            b.g = Long.valueOf(aomdVar.m);
            int I = akel.I(aomdVar.n);
            if (I == 0) {
                I = 1;
            }
            b.j(I);
            aomt aomtVar = aomdVar.o;
            if (aomtVar == null) {
                aomtVar = aomt.a;
            }
            b.i = aomtVar;
            if (!TextUtils.isEmpty((aomdVar.b == 12 ? (aolz) aomdVar.c : aolz.a).n)) {
                b.d((aomdVar.b == 12 ? (aolz) aomdVar.c : aolz.a).n);
            }
            aolw aolwVar = (aomdVar.b == 12 ? (aolz) aomdVar.c : aolz.a).i;
            if (aolwVar == null) {
                aolwVar = aolw.a;
            }
            if (!aolwVar.e.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                aolw aolwVar2 = (aomdVar.b == 12 ? (aolz) aomdVar.c : aolz.a).i;
                if (aolwVar2 == null) {
                    aolwVar2 = aolw.a;
                }
                for (aols aolsVar : aolwVar2.e) {
                    ampq a = uct.a(aolsVar);
                    if (a.h()) {
                        arrayList2.add((uct) a.c());
                    }
                }
                b.b(arrayList2);
            }
            arrayList.add(b.a());
        }
        this.a.a(ucpVar, arrayList, ubzVar, uerVar, z);
    }
}
