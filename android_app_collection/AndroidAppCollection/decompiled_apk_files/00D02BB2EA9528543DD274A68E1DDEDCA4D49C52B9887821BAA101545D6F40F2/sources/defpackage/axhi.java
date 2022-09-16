package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: axhi  reason: default package */
/* loaded from: classes3.dex */
public final class axhi {
    public final dcqe a = dcqe.b();
    public final axgk b;
    public final dzaj c;
    public final Set<String> d;
    public final dzgr<axgu> e;
    public dqas f;
    public final Map<String, crzo<axoj>> g;
    public final dyzz h;
    public final String i;
    private final dzgr<axgr> j;
    private final btvo k;
    private final axjj l;
    private final axjm m;
    private final akfa n;
    private final ckcw o;
    private final dyzu<axhd> p;

    public axhi(btvo btvoVar, axjj axjjVar, axjm axjmVar, akfa akfaVar, dyzz dyzzVar, ckcw ckcwVar, String str, dyzu<axhd> dyzuVar) {
        this.k = btvoVar;
        this.l = axjjVar;
        this.m = axjmVar;
        this.n = akfaVar;
        this.h = dyzzVar;
        this.o = ckcwVar;
        this.i = str;
        this.p = dyzuVar;
        this.b = new axgk(btvoVar.getPeopleFollowParameters().g);
        dzaj dzajVar = new dzaj();
        this.c = dzajVar;
        this.d = new LinkedHashSet();
        dzgr k = dzgn.a().k();
        dzvx.b(k, "PublishSubject.create<En…ToFetch>().toSerialized()");
        this.j = k;
        dzgr k2 = dzgn.a().k();
        dzvx.b(k2, "PublishSubject.create<Ge…oResult>().toSerialized()");
        this.e = k2;
        dzajVar.b(k2.SV(dyzzVar).SW(new axgl(this)));
        dzdn dzdnVar = new dzdn(k, new axgm(this));
        dzfy.e();
        dzajVar.b(dzdnVar.SW(new axgn(this)));
        dzajVar.b(dyzuVar.SW(new axgo(this)));
        dzdi dzdiVar = new dzdi(axjjVar.b, axgp.a);
        dzfy.e();
        dzdiVar.f(k2);
        dzajVar.b(axjmVar.b.SW(new axgq(this)));
        dchm dchmVar = new dchm();
        dchmVar.j();
        ConcurrentMap e = dchmVar.e();
        dzvx.b(e, "MapMaker().weakValues().makeMap()");
        this.g = e;
    }

    public static final dqaw n() {
        dqav bZ = dqaw.d.bZ();
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqaw dqawVar = (dqaw) bZ.b;
        dqawVar.b = dfqeVar.f;
        dqawVar.a |= 1;
        dqaw.b(dqawVar);
        dqaw bK = bZ.bK();
        dzvx.b(bK, "PeopleFolloweeInfo.newBu…TIMESTAMP)\n      .build()");
        return bK;
    }

    public final boolean a() {
        return this.c.b;
    }

    public final boolean b() {
        return this.k.getPeopleFollowParameters().h;
    }

    public final crzo<axoj> c(String str) {
        axoj axojVar;
        dzvx.c(str, "obfuscatedGaiaId");
        l("Trying to get button from FollowStateRepository when in terminal state");
        if (a()) {
            return null;
        }
        crzo<axoj> crzoVar = this.g.get(str);
        if (crzoVar != null) {
            return crzoVar;
        }
        if (this.b.c(str)) {
            return null;
        }
        dqaw a = this.b.a(str);
        synchronized (this.d) {
            if (a == null) {
                if (!this.d.contains(str)) {
                    if (b()) {
                        return null;
                    }
                    this.d.add(str);
                    this.j.c(new axgr(str, j()));
                }
            }
            if (a == null) {
                axojVar = new axoj(n());
                axojVar.a = true;
            } else {
                axojVar = new axoj(a);
            }
            crzo<axoj> crzoVar2 = new crzo<>(axojVar);
            this.g.put(str, crzoVar2);
            return crzoVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r4.d.addAll(r5);
        r6.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List<java.lang.String> r5, defpackage.dzut<defpackage.dztc> r6) {
        /*
            r4 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Set<java.lang.String> r0 = r4.d
            monitor-enter(r0)
            boolean r1 = r5 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L14
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3c
        L14:
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L3e
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3e
            axgk r3 = r4.b     // Catch: java.lang.Throwable -> L3e
            dqaw r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L18
            java.util.Set<java.lang.String> r3 = r4.d     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r3.contains(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L18
            java.util.Set<java.lang.String> r1 = r4.d     // Catch: java.lang.Throwable -> L3e
            r1.addAll(r5)     // Catch: java.lang.Throwable -> L3e
            r6.a()     // Catch: java.lang.Throwable -> L3e
        L3c:
            monitor-exit(r0)
            return
        L3e:
            r5 = move-exception
            monitor-exit(r0)
            goto L42
        L41:
            throw r5
        L42:
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhi.d(java.util.List, dzut):void");
    }

    public final void e(String str, dqaw dqawVar) {
        l("Cannot update data in FollowStateRepository when in terminal state");
        if (a()) {
            return;
        }
        axgk axgkVar = this.b;
        dzvx.c(str, "obfuscatedGaiaId");
        dzvx.c(dqawVar, "followeeInfo");
        axgkVar.b.remove(str);
        long j = dqawVar.c;
        if (j != -1) {
            dqaw a = axgkVar.a.a(str);
            if (j < (a != null ? a.c : 0L)) {
                return;
            }
        }
        axgkVar.a.Pz(str, dqawVar);
        crzo<axoj> crzoVar = this.g.get(str);
        if (crzoVar == null) {
            return;
        }
        crzoVar.a(new axoj(dqawVar));
    }

    public final void f(dqac dqacVar) {
        l("Cannot update data in FollowStateRepository when in terminal state");
        if (!a()) {
            dsrj<dqau> dsrjVar = dqacVar.b;
            dzvx.b(dsrjVar, "peopleFollowInfo.getUserList()");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (dqau dqauVar : dsrjVar) {
                dqau dqauVar2 = dqauVar;
                dzvx.b(dqauVar2, "it");
                if ((dqauVar2.a & 2) == 0) {
                    arrayList2.add(dqauVar);
                } else {
                    arrayList.add(dqauVar);
                }
            }
            dzsx dzsxVar = new dzsx(arrayList, arrayList2);
            List<dqau> list = (List) dzsxVar.b;
            for (dqau dqauVar3 : (List) dzsxVar.a) {
                dqkn dqknVar = dqauVar3.b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                String str = dqknVar.d;
                dzvx.b(str, "it.getUser().getObfuscatedGaiaId()");
                dqaw dqawVar = dqauVar3.c;
                if (dqawVar == null) {
                    dqawVar = dqaw.d;
                }
                dzvx.b(dqawVar, "it.getFolloweeInfo()");
                e(str, dqawVar);
            }
            for (dqau dqauVar4 : list) {
                axgk axgkVar = this.b;
                dqkn dqknVar2 = dqauVar4.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                String str2 = dqknVar2.d;
                dzvx.b(str2, "it.getUser().getObfuscatedGaiaId()");
                axgkVar.b(str2);
            }
            if ((dqacVar.a & 1) == 0) {
                return;
            }
            dqas dqasVar = dqacVar.c;
            if (dqasVar == null) {
                dqasVar = dqas.c;
            }
            dzvx.b(dqasVar, "peopleFollowInfo.getUserSelfContext()");
            g(dqasVar);
        }
    }

    public final void g(dqas dqasVar) {
        dzvx.c(dqasVar, "selfContext");
        l("Cannot update data in FollowStateRepository when in terminal state");
        if (a()) {
            return;
        }
        dqas dqasVar2 = this.f;
        if (dqasVar2 != null && (dqasVar2.a & 2) == 0) {
            return;
        }
        this.f = dqasVar;
    }

    public final void h(List<String> list, ckij ckijVar) {
        i(list, ckijVar, null);
    }

    public final void i(List<String> list, ckij ckijVar, dqac dqacVar) {
        ((ckco) this.o.a(ckik.a)).a(ckijVar.c);
        dzaj dzajVar = this.c;
        axjj axjjVar = this.l;
        dzvx.c(list, "obfuscatedGaiaIdList");
        dzgq i = dzgq.i();
        axis axisVar = axjjVar.c;
        deig d = deig.d();
        dicv bZ = dicy.d.bZ();
        List k = dchl.k(list, axio.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dicy dicyVar = (dicy) bZ.b;
        dsrj<dicx> dsrjVar = dicyVar.b;
        if (!dsrjVar.a()) {
            dicyVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(k, dicyVar.b);
        dnwb a = axisVar.b.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dicy dicyVar2 = (dicy) bZ.b;
        a.getClass();
        dicyVar2.c = a;
        dicyVar2.a |= 1;
        ((buqj) axisVar.j).c.e = axisVar.a.a().j();
        axisVar.b(((buqj) axisVar.j).b(), bZ.bK(), d, axip.a);
        dzaa.d(d, dzgh.a()).e(new axji(axjjVar)).f(i);
        dzci dzciVar = new dzci(i);
        dzfy.d();
        dzbt dzbtVar = new dzbt(new axhf(this, list, dqacVar), axhe.a);
        dzciVar.f(dzbtVar);
        dzajVar.b(dzbtVar);
    }

    public final synchronized void k(dqac dqacVar, List<String> list) {
        axoj axojVar;
        axoj axojVar2;
        if (dqacVar != null) {
            f(dqacVar);
        }
        this.d.removeAll(list);
        ArrayList arrayList = new ArrayList(dzti.d(list, 10));
        for (String str : list) {
            arrayList.add(this.g.get(str));
        }
        ArrayList<crzo> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            crzo crzoVar = (crzo) obj;
            if (crzoVar != null && (axojVar2 = (axoj) crzoVar.a.l()) != null && axojVar2.a) {
                arrayList2.add(obj);
            }
        }
        for (crzo crzoVar2 : arrayList2) {
            if (crzoVar2 != null && (axojVar = (axoj) crzoVar2.a.l()) != null) {
                axojVar.a = false;
                crzoVar2.a(axojVar);
            }
        }
    }

    public final void l(String str) {
        if (a() && m()) {
            bvoo.h("Error: %s while repository's viewer user matches logged-in user.", str);
        }
    }

    public final boolean m() {
        btlu j = this.n.j();
        if (j.f == btlt.GOOGLE) {
            return dzvx.d(this.i, j != null ? j.j() : null);
        }
        return this.i == null;
    }

    public final ckij j() {
        axgk axgkVar = this.b;
        if (axgkVar.a.j() < axgkVar.c) {
            return ckij.MISSING_ENTRY_CACHE_NOT_FULL;
        }
        return ckij.MISSING_ENTRY_CACHE_FULL;
    }
}
