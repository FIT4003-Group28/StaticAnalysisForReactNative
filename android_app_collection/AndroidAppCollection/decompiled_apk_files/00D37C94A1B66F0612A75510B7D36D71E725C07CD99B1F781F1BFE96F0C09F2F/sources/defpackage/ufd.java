package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ufd  reason: default package */
/* loaded from: classes4.dex */
public final class ufd implements ufc {
    private final uhh a;
    private final snc b;
    private final axnm c;
    private final axnm d;
    private final ues e;

    public ufd(uhh uhhVar, axnm axnmVar, axnm axnmVar2, ues uesVar, snc sncVar) {
        this.a = uhhVar;
        this.c = axnmVar;
        this.d = axnmVar2;
        this.e = uesVar;
        this.b = sncVar;
    }

    private final void c(ucp ucpVar, List list, uer uerVar) {
        uep a = this.e.a(aojw.DISMISSED_REMOTE);
        a.d(ucpVar);
        a.c(list);
        ((ueu) a).t = uerVar;
        a.i();
    }

    @Override // defpackage.ufc
    public final void a(ucp ucpVar, List list, ubz ubzVar, uer uerVar, boolean z) {
        uiv uivVar;
        EnumMap enumMap = new EnumMap(uiu.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ucw ucwVar = (ucw) it.next();
            if (ucwVar.r != 3 && ucwVar.p != 3 && (ucwVar.k.longValue() <= 0 || TimeUnit.MILLISECONDS.convert(ucwVar.k.longValue(), TimeUnit.MICROSECONDS) > this.b.c())) {
                Iterator it2 = ((Set) this.c.get()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        int b = ((uih) it2.next()).b();
                        if (b == 0) {
                            throw null;
                        }
                        if (b != 1) {
                            break;
                        }
                    } else {
                        if (((ampq) this.d.get()).h()) {
                            long d = this.b.d();
                            atps atpsVar = ((agay) ((ampq) this.d.get()).c()).a.a().p;
                            if (atpsVar == null) {
                                atpsVar = atps.a;
                            }
                            boolean z2 = false;
                            if (atpsVar.o) {
                                uivVar = new uiv(false, null);
                            } else {
                                uiu uiuVar = uiu.INVALID_TARGET_STATE;
                                if (uiuVar != null) {
                                    z2 = true;
                                }
                                aqxo.q(z2, "DropReason should not be null.");
                                uivVar = new uiv(true, uiuVar);
                            }
                            long d2 = this.b.d() - d;
                            if (uivVar.a) {
                                uiu uiuVar2 = uivVar.b;
                                if (!enumMap.containsKey(uiuVar2)) {
                                    enumMap.put((EnumMap) uiuVar2, (uiu) new ArrayList());
                                }
                                ((List) enumMap.get(uiuVar2)).add(ucwVar);
                            } else {
                                uerVar.e = Long.valueOf(d2);
                                this.a.c(ucpVar, ucwVar, false, z, ubzVar, null, uerVar);
                            }
                        } else {
                            this.a.c(ucpVar, ucwVar, false, z, ubzVar, null, uerVar);
                        }
                        arrayList2.add(ucwVar);
                    }
                }
            } else {
                arrayList.add(ucwVar.a);
                arrayList2.add(ucwVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (uih uihVar : (Set) this.c.get()) {
                uihVar.f();
            }
        }
        if (!arrayList.isEmpty()) {
            List a = this.a.a(ucpVar, arrayList, uerVar, aojl.DISMISSED_REMOTE);
            if (!a.isEmpty()) {
                c(ucpVar, a, uerVar);
            }
        }
        for (uiu uiuVar3 : enumMap.keySet()) {
            uep c = this.e.c(4);
            c.d(ucpVar);
            c.c((List) enumMap.get(uiuVar3));
            ueu ueuVar = (ueu) c;
            ueuVar.w = 2;
            ueuVar.k = uiuVar3;
            ueuVar.t = uerVar;
            c.i();
        }
    }

    @Override // defpackage.ufc
    public final void b(ucp ucpVar, List list, aomr aomrVar, uec uecVar, aojl aojlVar) {
        int K;
        if (!list.isEmpty()) {
            int G = akel.G(aomrVar.f);
            if ((G != 0 && G == 3) || ((K = akel.K(aomrVar.d)) != 0 && K == 3)) {
                List a = this.a.a(ucpVar, list, null, aojlVar);
                if (uecVar == uec.SERVER && !a.isEmpty()) {
                    c(ucpVar, a, null);
                }
            }
            for (uih uihVar : (Set) this.c.get()) {
                uihVar.h();
            }
        }
    }
}
