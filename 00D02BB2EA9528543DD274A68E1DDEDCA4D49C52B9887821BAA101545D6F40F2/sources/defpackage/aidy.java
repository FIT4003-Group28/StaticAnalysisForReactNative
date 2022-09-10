package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aidy  reason: default package */
/* loaded from: classes2.dex */
public final class aidy implements aidm, aiee {
    public final bvrb a;
    public final akfa b;
    @dzsi
    public bvpk c;
    @dzsi
    public btlu d;
    @dzsi
    public ahup e;
    private final akox f;
    private final btrm g;
    private final akzh h;
    private final aidl i;
    private final arbx j;
    private final cjqy k;
    private final cjqq l;
    private final aigf m;
    private final aief n;
    private final aikh o;
    private boolean p;
    private boolean q;
    @dzsi
    private PersonId r;
    private final boolean s;
    private List<aics> t;
    private dcep<PersonId> u;
    private final crzb v;
    private final aigd w;
    private final akzy x;
    private final arbw y;

    public aidy(aifb aifbVar, aiei aieiVar, dzsj<aifu> dzsjVar, akox akoxVar, dxio<akzh> dxioVar, ajsc ajscVar, btrm btrmVar, aijc aijcVar, aikh aikhVar, bvrb bvrbVar, cqat cqatVar, dzsj<araj> dzsjVar2, cjqy cjqyVar, cjqq cjqqVar, akfa akfaVar, aida aidaVar, btvo btvoVar, crzb crzbVar, aigf aigfVar, bvjj bvjjVar, ailb<aigo> ailbVar, ailb<aiik> ailbVar2, Executor executor, gce gceVar) {
        aidl aidlVar = new aidl(aifbVar, aieiVar, dzsjVar, aidaVar, akoxVar.aj().aE(), gceVar);
        aidh aidhVar = new aidh(dxioVar.a(), cqatVar, ajscVar, dxioVar.a().B(), !btvoVar.getLocationSharingParameters().z);
        arbx f = dzsjVar2.a().m().f();
        this.t = dcdc.e();
        this.u = dcmr.a;
        this.w = new aidr(this);
        new aidt(this);
        this.x = new aidu(this);
        this.y = new aidx(this);
        this.f = akoxVar;
        this.g = btrmVar;
        this.o = aikhVar;
        this.i = aidlVar;
        this.n = new aief(aijcVar, ailbVar, ailbVar2, aidhVar, executor);
        this.s = btvoVar.getLocationSharingParameters().z;
        this.m = aigfVar;
        aidlVar.j = new aidn(this, bvrbVar);
        this.a = bvrbVar;
        this.j = f;
        this.h = dxioVar.a();
        this.k = cjqyVar;
        this.l = cjqqVar;
        this.b = akfaVar;
        this.d = akfaVar.j();
        this.v = crzbVar;
    }

    private final void h(List<aics> list, @dzsi btlu btluVar, @dzsi btlu btluVar2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        this.v.a();
        HashSet hashSet = new HashSet();
        akzh b = this.h.b();
        Iterator<aics> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            aics next = it.next();
            int[] n = akyx.n(b, next.c);
            bnuw A = b.A();
            if (n != null && (i = n[0]) >= 0 && i <= A.a() && (i2 = n[1]) >= 0 && i2 <= A.b()) {
                Iterator<PersonId> it2 = next.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next());
                }
            }
        }
        if (dbsd.a(btluVar, btluVar2)) {
            z2 = !dcnm.p(hashSet, this.u).isEmpty();
            if (!this.u.contains(PersonId.a) && hashSet.contains(PersonId.a)) {
                z = true;
            }
            for (PersonId personId : this.n.c(dbsg.j(btluVar2))) {
                if (hashSet.contains(personId)) {
                    this.o.v(btluVar2, personId, aikg.ON_MAP);
                } else {
                    this.o.w(btluVar2, personId, aikg.ON_MAP);
                }
            }
            dcpd<PersonId> it3 = this.u.iterator();
            while (it3.hasNext()) {
                PersonId next2 = it3.next();
                if (!hashSet.contains(next2)) {
                    this.o.w(btluVar2, next2, aikg.ON_MAP);
                }
            }
        } else {
            z2 = !hashSet.isEmpty();
            z = hashSet.contains(PersonId.a);
            for (PersonId personId2 : this.n.c(dbsg.j(btluVar))) {
                this.o.w(btluVar, personId2, aikg.ON_MAP);
            }
            for (PersonId personId3 : this.n.c(dbsg.j(btluVar2))) {
                if (hashSet.contains(personId3)) {
                    this.o.v(btluVar2, personId3, aikg.ON_MAP);
                } else {
                    this.o.w(btluVar2, personId3, aikg.ON_MAP);
                }
            }
        }
        if (z2) {
            this.l.g().d(cjtd.a(dtxu.dg));
        }
        if (z) {
            this.l.g().d(cjtd.a(dtxu.eH));
        }
        this.u = dcep.K(hashSet);
    }

    @Override // defpackage.aidm
    public final void a() {
        this.v.a();
        dbsk.l(this.p);
        this.j.q(this.y);
        this.p = false;
        if (this.n.a()) {
            dcdc e = dcdc.e();
            btlu btluVar = this.d;
            h(e, btluVar, btluVar);
        }
        this.e = null;
        aief aiefVar = this.n;
        aiefVar.e = null;
        aiefVar.c.d(aiefVar);
        aiefVar.b.d(aiefVar);
        aiefVar.a.h(aiefVar);
        this.f.ac(this.x);
        this.f.Q("SHARERS_OVERLAY");
        this.g.a(this);
        if (this.s) {
            this.m.c(this.w);
        }
        this.k.g();
    }

    @Override // defpackage.aidm
    public final void b(boolean z) {
        this.v.a();
        this.q = !z;
        btlu btluVar = this.d;
        g(btluVar, btluVar);
    }

    @Override // defpackage.aidm
    public final void c(PersonId personId) {
        this.v.a();
        this.r = personId;
        btlu btluVar = this.d;
        g(btluVar, btluVar);
    }

    @Override // defpackage.aidm
    public final void d() {
        this.v.a();
        this.r = null;
        btlu btluVar = this.d;
        g(btluVar, btluVar);
    }

    @Override // defpackage.aidm
    public final void e(String str, PrintWriter printWriter) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("MapRenderer #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        boolean z = this.p;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
        sb2.append(str);
        sb2.append("  isRendering=");
        sb2.append(z);
        printWriter.println(sb2.toString());
        boolean z2 = this.q;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 17);
        sb3.append(str);
        sb3.append("  isStopped=");
        sb3.append(z2);
        printWriter.println(sb3.toString());
        String hexString2 = Integer.toHexString(System.identityHashCode(this.r));
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString2).length());
        sb4.append(str);
        sb4.append("  selectedPerson=#");
        sb4.append(hexString2);
        printWriter.println(sb4.toString());
        printWriter.println(String.valueOf(str).concat("  currentClusters:"));
        for (aics aicsVar : this.t) {
            String concat = String.valueOf(str).concat("    ");
            String hexString3 = Integer.toHexString(System.identityHashCode(aicsVar));
            StringBuilder sb5 = new StringBuilder(String.valueOf(concat).length() + 10 + String.valueOf(hexString3).length());
            sb5.append(concat);
            sb5.append("cluster: #");
            sb5.append(hexString3);
            printWriter.println(sb5.toString());
            int i = aicsVar.d;
            StringBuilder sb6 = new StringBuilder(String.valueOf(concat).length() + 16);
            sb6.append(concat);
            sb6.append("  id=");
            sb6.append(i);
            printWriter.println(sb6.toString());
            int b = aicsVar.b();
            StringBuilder sb7 = new StringBuilder(String.valueOf(concat).length() + 18);
            sb7.append(concat);
            sb7.append("  hash=");
            sb7.append(b);
            printWriter.println(sb7.toString());
            boolean z3 = aicsVar.g;
            StringBuilder sb8 = new StringBuilder(String.valueOf(concat).length() + 23);
            sb8.append(concat);
            sb8.append("  isInterpolating=");
            sb8.append(z3);
            printWriter.println(sb8.toString());
            String hexString4 = Integer.toHexString(System.identityHashCode(aicsVar.f));
            StringBuilder sb9 = new StringBuilder(String.valueOf(concat).length() + 18 + String.valueOf(hexString4).length());
            sb9.append(concat);
            sb9.append("  representative=#");
            sb9.append(hexString4);
            printWriter.println(sb9.toString());
            boolean z4 = aicsVar.e;
            StringBuilder sb10 = new StringBuilder(String.valueOf(concat).length() + 16);
            sb10.append(concat);
            sb10.append("  selected=");
            sb10.append(z4);
            printWriter.println(sb10.toString());
            String join = TextUtils.join(",", dcft.o(aicsVar.b, aico.a));
            StringBuilder sb11 = new StringBuilder(String.valueOf(concat).length() + 12 + String.valueOf(join).length());
            sb11.append(concat);
            sb11.append("  sharers=[");
            sb11.append(join);
            sb11.append("]");
            printWriter.println(sb11.toString());
        }
    }

    @Override // defpackage.aidm
    public final void f(@dzsi ahup ahupVar) {
        this.v.a();
        dbsk.l(!this.p);
        this.j.p(this.y);
        this.p = true;
        aief aiefVar = this.n;
        aiefVar.e = this;
        aiefVar.b.c(aiefVar);
        aiefVar.c.c(aiefVar);
        aiefVar.e();
        aiefVar.a.g(aiefVar);
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(gds.class, new aiea(gds.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.f.O("SHARERS_OVERLAY", this.i);
        this.f.ab(this.x);
        this.e = ahupVar;
        if (this.s) {
            this.m.a(this.w);
        }
    }

    public final void g(@dzsi btlu btluVar, @dzsi final btlu btluVar2) {
        this.v.a();
        if (!this.n.a() || !this.p) {
            return;
        }
        bvpk bvpkVar = this.c;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.c = null;
        }
        if (this.q) {
            this.t = dcdc.e();
        } else {
            akra akraVar = new akra();
            boolean f = this.j.f(akraVar);
            aief aiefVar = this.n;
            dbsg<btlu> j = dbsg.j(btluVar2);
            dbsg j2 = dbsg.j(this.r);
            if (true != f) {
                akraVar = null;
            }
            dbsg<akra> j3 = dbsg.j(akraVar);
            aidh aidhVar = aiefVar.d;
            dbsg<aiik> b = aiefVar.c.b(j);
            dbsg<aigo> b2 = aiefVar.b.b(j);
            dccx F = dcdc.F();
            if (b.a() && b2.a()) {
                dcdc<Profile> dcdcVar = b.b().c;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    dbsg<ahvg> b3 = b2.b().b(dcdcVar.get(i));
                    if (b3.a()) {
                        F.g(b3.b());
                    }
                }
            }
            dcdc f2 = F.f();
            bvrj.UI_THREAD.c();
            final eapd eapdVar = new eapd(aidhVar.b.b());
            Iterable<aicq> o = dcft.o(f2, new dbrn(eapdVar) { // from class: aide
                private final eapd a;

                {
                    this.a = eapdVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    eapd eapdVar2 = this.a;
                    ahvg ahvgVar = (ahvg) obj;
                    return new aicm(ahvgVar.a(), ahvgVar.l(eapdVar2).c(eaow.a(30L)), ahvgVar.k(eapdVar2), aibw.a(ahvgVar, eapdVar2.a), ahvgVar.h().c(0).intValue(), ahvgVar.c(), ahvgVar.f());
                }
            });
            bvrj.UI_THREAD.c();
            akzh b4 = aidhVar.a.b();
            ArrayList arrayList = new ArrayList();
            for (aicq aicqVar : o) {
                dbsg<dhjz> d = aicqVar.d();
                if (d.a()) {
                    ArrayList arrayList2 = arrayList;
                    aidf aidfVar = new aidf(aidhVar, aicqVar, b4, d.b(), aidhVar.e, j2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            arrayList = arrayList2;
                            aidf aidfVar2 = (aidf) arrayList.get(i2);
                            i2++;
                            if (aidfVar2.b(aidfVar)) {
                                aidfVar2.c(aidfVar);
                                break;
                            }
                            arrayList2 = arrayList;
                        } else {
                            arrayList = arrayList2;
                            arrayList.add(aidfVar);
                            break;
                        }
                    }
                }
            }
            int[] n = j3.a() ? akyx.n(b4, j3.b()) : null;
            if (n != null) {
                aidg aidgVar = new aidg(new akra(n[0], n[1]), (int) (aidhVar.d * 10.0f));
                Iterator it = arrayList.iterator();
                aidf aidfVar3 = null;
                while (it.hasNext()) {
                    aidf aidfVar4 = (aidf) it.next();
                    if (aidfVar4.a(aidgVar)) {
                        it.remove();
                        if (aidfVar3 == null) {
                            aidfVar4.c = j3;
                            aidfVar4.d = aidfVar4.g.a(akyx.n(aidfVar4.a, aidfVar4.d()), aidfVar4.f);
                            aidfVar3 = aidfVar4;
                        } else {
                            aidfVar3.c(aidfVar4);
                        }
                    }
                }
                if (aidfVar3 != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        aidf aidfVar5 = (aidf) it2.next();
                        if (aidfVar5.b(aidfVar3)) {
                            aidfVar3.c(aidfVar5);
                            it2.remove();
                        }
                    }
                    arrayList.add(aidfVar3);
                } else {
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        aidf aidfVar6 = (aidf) arrayList.get(i3);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size4 = arrayList.size();
            int i4 = 0;
            while (i4 < size4) {
                aidf aidfVar7 = (aidf) arrayList.get(i4);
                List<aicq> list = aidfVar7.b;
                ajsc ajscVar = aidfVar7.g.c;
                dbsg<akra> dbsgVar = aidfVar7.c;
                arrayList3.add(new aics(list, ajscVar, j2, dbsgVar, dbsgVar.a(), aidfVar7.e));
                i4++;
                arrayList = arrayList;
            }
            this.t = arrayList3;
        }
        h(this.t, btluVar, btluVar2);
        this.i.a(this.t);
        for (aics aicsVar : this.t) {
            if (aicsVar.g) {
                bvpk a = bvpk.a(new Runnable(this, btluVar2) { // from class: aido
                    private final aidy a;
                    private final btlu b;

                    {
                        this.a = this;
                        this.b = btluVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aidy aidyVar = this.a;
                        btlu btluVar3 = this.b;
                        aidyVar.g(btluVar3, btluVar3);
                    }
                });
                this.c = a;
                this.a.a(a, bvrj.UI_THREAD, 500L);
                return;
            }
        }
    }
}
