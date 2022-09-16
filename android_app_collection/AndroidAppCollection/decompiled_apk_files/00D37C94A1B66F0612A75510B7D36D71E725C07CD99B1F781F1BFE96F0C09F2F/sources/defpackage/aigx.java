package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aigx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aigx implements ayqb {
    public final /* synthetic */ aigz a;
    private final /* synthetic */ int b;

    public /* synthetic */ aigx(aigz aigzVar) {
        this.a = aigzVar;
    }

    public /* synthetic */ aigx(aigz aigzVar, int i) {
        this.b = i;
        this.a = aigzVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aiuf aiufVar;
        aiuf aiufVar2;
        switch (this.b) {
            case 0:
                ahhu ahhuVar = (ahhu) obj;
                aiuf aiufVar3 = this.a.t;
                if (aiufVar3 == null) {
                    return;
                }
                aiufVar3.f(ahhuVar);
                return;
            case 1:
                aigz aigzVar = this.a;
                aesr aesrVar = (aesr) obj;
                if (!agpr.q(aesrVar.b()) || (aiufVar = aigzVar.t) == null) {
                    return;
                }
                aiufVar.g(aesrVar);
                return;
            case 2:
                aigz aigzVar2 = this.a;
                ahhx ahhxVar = (ahhx) obj;
                if (aigzVar2.b(aigzVar2.u)) {
                    return;
                }
                long e = ahhxVar.e();
                if (aigzVar2.q.containsKey(aigzVar2.u)) {
                    e -= ((Long) ((Pair) aigzVar2.q.get(aigzVar2.u)).first).longValue();
                }
                long j = e;
                long f = ahhxVar.f();
                ajfp d = aigzVar2.r.d(aigzVar2.u);
                if (d != null) {
                    f = TimeUnit.SECONDS.toMillis(d.f.a());
                }
                ahhx ahhxVar2 = new ahhx(j, ahhxVar.b(), 0L, f, ahhxVar.a(), ahhxVar.d(), ahhxVar.c(), ahhxVar.j(), aigzVar2.u);
                aiuf aiufVar4 = aigzVar2.t;
                if (aiufVar4 == null) {
                    return;
                }
                aiufVar4.q(ahhxVar2);
                return;
            case 3:
                aigz aigzVar3 = this.a;
                ahia ahiaVar = (ahia) obj;
                if (aigzVar3.b(aigzVar3.u)) {
                    return;
                }
                int a = ahiaVar.a();
                if (a == 3) {
                    aiuf aiufVar5 = aigzVar3.t;
                    if (aiufVar5 == null) {
                        return;
                    }
                    aiufVar5.k();
                    return;
                } else if (a != 4) {
                    if (a != 7 || (aiufVar2 = aigzVar3.t) == null) {
                        return;
                    }
                    aiufVar2.i();
                    return;
                } else {
                    aiuf aiufVar6 = aigzVar3.t;
                    if (aiufVar6 == null) {
                        return;
                    }
                    aiufVar6.n();
                    return;
                }
            case 4:
                Boolean bool = (Boolean) obj;
                aiuf aiufVar7 = this.a.t;
                if (aiufVar7 == null) {
                    return;
                }
                aiufVar7.b();
                return;
            case 5:
                aigz aigzVar4 = this.a;
                ahgg ahggVar = (ahgg) obj;
                aiuf aiufVar8 = aigzVar4.t;
                if (aiufVar8 != null) {
                    aiufVar8.h();
                }
                aigzVar4.q.clear();
                aigzVar4.a();
                return;
            case 6:
                ahgh ahghVar = (ahgh) obj;
                aiuf aiufVar9 = this.a.t;
                if (aiufVar9 == null) {
                    return;
                }
                aiufVar9.c(ahghVar);
                return;
            case 7:
                aigz aigzVar5 = this.a;
                ahgj ahgjVar = (ahgj) obj;
                ajfp n = aigzVar5.r.n(ahgjVar.a());
                if (n == null || !n.e.equals(aigzVar5.u) || aigzVar5.b(aigzVar5.u)) {
                    return;
                }
                long a2 = ahgjVar.a();
                if (aigzVar5.q.containsKey(aigzVar5.u)) {
                    a2 = ahgjVar.a() - ((Long) ((Pair) aigzVar5.q.get(aigzVar5.u)).first).longValue();
                }
                aiuf aiufVar10 = aigzVar5.t;
                if (aiufVar10 == null) {
                    return;
                }
                aiufVar10.l(a2);
                return;
            case 8:
                ahgl ahglVar = (ahgl) obj;
                aiuf aiufVar11 = this.a.t;
                if (aiufVar11 == null) {
                    return;
                }
                aiufVar11.o();
                return;
            case 9:
                ahgn ahgnVar = (ahgn) obj;
                aiuf aiufVar12 = this.a.t;
                if (aiufVar12 == null) {
                    return;
                }
                aiufVar12.d(ahgnVar);
                return;
            case 10:
                aigz aigzVar6 = this.a;
                if (((ahhf) obj).a()) {
                    aiuf aiufVar13 = aigzVar6.t;
                    if (aiufVar13 == null) {
                        return;
                    }
                    aiufVar13.j();
                    return;
                }
                aiuf aiufVar14 = aigzVar6.t;
                if (aiufVar14 == null) {
                    return;
                }
                aiufVar14.p();
                return;
            case 11:
                final aigz aigzVar7 = this.a;
                ahhg ahhgVar = (ahhg) obj;
                if (ahhgVar.a() == null || !ahhgVar.a().c().ai()) {
                    return;
                }
                aigzVar7.a.d(aigzVar7.f.Z(new ayqb() { // from class: aigy
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        aiuf aiufVar15;
                        ahho ahhoVar;
                        aigz aigzVar8;
                        String str;
                        aigz aigzVar9 = aigz.this;
                        ahho ahhoVar2 = (ahho) obj2;
                        if (ahhoVar2.i()) {
                            if (!aigzVar9.b(ahhoVar2.e())) {
                                if (ahhoVar2.c().f().b == null) {
                                    zep.l("Missing Vss base url");
                                    return;
                                }
                                PlayerResponseModel c = ahhoVar2.c();
                                String e2 = ahhoVar2.e();
                                String str2 = aigzVar9.v;
                                long b = ahhoVar2.b();
                                if (e2.equals(aigzVar9.u)) {
                                    aigzVar8 = aigzVar9;
                                    ahhoVar = ahhoVar2;
                                } else {
                                    Pair pair = (Pair) aigzVar9.q.get(e2);
                                    aiug aiugVar = aigzVar9.p;
                                    boolean z = pair != null && ((aitu) pair.second).a;
                                    boolean z2 = pair != null && ((aitu) pair.second).b;
                                    boolean z3 = pair != null && ((aitu) pair.second).c;
                                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) aiugVar.a.get();
                                    scheduledExecutorService.getClass();
                                    afwu afwuVar = (afwu) aiugVar.b.get();
                                    afwuVar.getClass();
                                    afsw afswVar = (afsw) aiugVar.c.get();
                                    afswVar.getClass();
                                    snc sncVar = (snc) aiugVar.d.get();
                                    sncVar.getClass();
                                    yrj yrjVar = (yrj) aiugVar.e.get();
                                    yrjVar.getClass();
                                    zdl zdlVar = (zdl) aiugVar.f.get();
                                    zdlVar.getClass();
                                    afst afstVar = (afst) aiugVar.g.get();
                                    afstVar.getClass();
                                    afzo afzoVar = (afzo) aiugVar.h.get();
                                    ahhoVar = ahhoVar2;
                                    afzoVar.getClass();
                                    zah zahVar = (zah) aiugVar.i.get();
                                    ahfm ahfmVar = (ahfm) aiugVar.j.get();
                                    ahfmVar.getClass();
                                    afvn afvnVar = (afvn) aiugVar.k.get();
                                    afvnVar.getClass();
                                    aadd aaddVar = (aadd) aiugVar.l.get();
                                    aaddVar.getClass();
                                    aijf aijfVar = (aijf) aiugVar.m.get();
                                    aijfVar.getClass();
                                    aikh aikhVar = (aikh) aiugVar.n.get();
                                    aikhVar.getClass();
                                    aweg awegVar = (aweg) aiugVar.o.get();
                                    c.getClass();
                                    e2.getClass();
                                    aiuo aiuoVar = (aiuo) aiugVar.p.get();
                                    aiuoVar.getClass();
                                    ampq ampqVar = (ampq) aiugVar.q.get();
                                    ampqVar.getClass();
                                    aiuf aiufVar16 = new aiuf(scheduledExecutorService, afwuVar, afswVar, sncVar, yrjVar, zdlVar, afstVar, afzoVar, zahVar, ahfmVar, afvnVar, aaddVar, aijfVar, aikhVar, str2, awegVar, c, e2, 1, z, z2, z3, aiuoVar, ampqVar);
                                    aigzVar8 = aigzVar9;
                                    aigzVar8.t = aiufVar16;
                                    if (pair == null) {
                                        str = e2;
                                        aigzVar8.q.put(str, new Pair(Long.valueOf(b), aigzVar8.t.a()));
                                    } else {
                                        str = e2;
                                    }
                                    aigzVar8.u = str;
                                }
                                long j2 = aigzVar8.s.e;
                                Pair pair2 = (Pair) aigzVar8.q.get(ahhoVar.e());
                                if (pair2 != null) {
                                    j2 = aigzVar8.s.e - ((Long) pair2.first).longValue();
                                }
                                aiuf aiufVar17 = aigzVar8.t;
                                if (aiufVar17 == null) {
                                    return;
                                }
                                aiufVar17.m(j2);
                                return;
                            }
                            aigzVar9.a();
                        } else if (aigzVar9.b(ahhoVar2.e()) || !ahhoVar2.e().equals(aigzVar9.u) || (aiufVar15 = aigzVar9.t) == null) {
                        } else {
                            aiufVar15.o();
                            aitu a3 = aigzVar9.t.a();
                            Pair pair3 = (Pair) aigzVar9.q.get(ahhoVar2.e());
                            aigzVar9.q.put(ahhoVar2.e(), new Pair(Long.valueOf(pair3 != null ? ((Long) pair3.first).longValue() : 0L), a3));
                            aigzVar9.a();
                        }
                    }
                }));
                aigzVar7.a.d(aigzVar7.b.Z(new aigx(aigzVar7, 3)));
                aigzVar7.a.d(aigzVar7.c.Z(new aigx(aigzVar7, 2)));
                aigzVar7.a.d(aigzVar7.d.Z(new aigx(aigzVar7, 8)));
                aigzVar7.a.d(aigzVar7.e.Z(new aigx(aigzVar7, 1)));
                aigzVar7.a.d(aigzVar7.h.Z(new aigx(aigzVar7, 7)));
                aigzVar7.a.d(aigzVar7.i.S(new aigx(aigzVar7, 5)));
                aigzVar7.a.d(aigzVar7.j.Z(new aigx(aigzVar7, 10)));
                aigzVar7.a.d(aigzVar7.k.Z(new aigx(aigzVar7, 6)));
                aigzVar7.a.d(aigzVar7.l.Z(new aigx(aigzVar7)));
                aigzVar7.a.d(aigzVar7.m.Z(new aigx(aigzVar7, 9)));
                aigzVar7.a.d(aigzVar7.o.Z(new aigx(aigzVar7, 12)));
                aigzVar7.a.d(((aynx) aigzVar7.n.get()).Z(new aigx(aigzVar7, 4)));
                return;
            default:
                ahhp ahhpVar = (ahhp) obj;
                aiuf aiufVar15 = this.a.t;
                if (aiufVar15 == null) {
                    return;
                }
                aiufVar15.e(ahhpVar);
                return;
        }
    }
}
