package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: afki  reason: default package */
/* loaded from: classes2.dex */
final class afki extends afke {
    final /* synthetic */ afkn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afki(afkn afknVar, bunm bunmVar, Collection collection) {
        super(bunmVar, collection);
        this.a = afknVar;
    }

    @Override // defpackage.afke
    protected final void a(duqm duqmVar) {
        afkb a = this.a.h.a();
        dsrh dsrhVar = new dsrh(((duqn) duqmVar.b).c, duqn.d);
        if (dsrhVar.contains(duqi.START_PAGE_ROVER)) {
            a.h.a();
            dvto dvtoVar = a.j.a().a(dtiy.FETCH_ON_DEMAND, dcdc.f(dtja.ROVER), bwnl.a).a().a;
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar = (duqn) duqmVar.b;
            dvtoVar.getClass();
            duqnVar.k = dvtoVar;
            duqnVar.a |= 128;
        }
        if (dsrhVar.contains(duqi.OPEN_UGC_TASKS_PAGE)) {
            alad n = a.b.n();
            GmmLocation a2 = a.d.a().a();
            if (a2 != null) {
                alaa a3 = alad.a();
                a3.c(a2.B());
                a3.c = n.k;
                n = a3.a();
            }
            dwsn m = a.k.a().m(n);
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar2 = (duqn) duqmVar.b;
            m.getClass();
            duqnVar2.l = m;
            duqnVar2.a |= 256;
        }
        if (dsrhVar.contains(duqi.SEARCH)) {
            dwim bZ = dwir.R.bZ();
            dhjx Z = a.b.Z();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            Z.getClass();
            dwirVar.d = Z;
            dwirVar.a |= 2;
            a.i.a().r(bZ);
            dnqh c = cjsb.c(ddda.f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar2 = (dwir) bZ.b;
            c.getClass();
            dwirVar2.s = c;
            dwirVar2.a |= 33554432;
            dwir bK = bZ.bK();
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar3 = (duqn) duqmVar.b;
            bK.getClass();
            duqnVar3.f = bK;
            duqnVar3.a |= 2;
        }
        if (dsrhVar.contains(duqi.DIRECTIONS_DEFAULT) || dsrhVar.contains(duqi.DIRECTIONS_NAVIGATION) || dsrhVar.contains(duqi.DIRECTIONS_TRIP_DETAILS) || dsrhVar.contains(duqi.DIRECTIONS_TRANSIT_NAVIGATION) || dsrhVar.contains(duqi.DIRECTIONS_COMMUTE_IMMERSIVE)) {
            afka afkaVar = a.p;
            if (afkaVar.h.a().e().g()) {
                HashSet hashSet = new HashSet(dsrhVar);
                vun h = afkaVar.h.a().e().h(dcdc.e(), dbsg.i(afkaVar.b()), dbpy.a, dbsg.j(afkaVar.d.aa()));
                duqmVar.a(afka.a(dqvj.MIXED, h.b, dcnm.o(afka.a, hashSet)));
                dcnk o = dcnm.o(afka.b, hashSet);
                if (!o.isEmpty()) {
                    dcdc<dqvj> dcdcVar = vxx.b;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        dqvj dqvjVar = dcdcVar.get(i);
                        duqg a4 = afka.a(dqvjVar, afkaVar.g.a().c(dqvjVar, 3, vul.NAVIGATION_ONLY), o);
                        dsqp dsqpVar = (dsqp) a4.cu(5);
                        dsqpVar.bC(a4);
                        duqmVar.a(((duqf) dsqpVar).bK());
                    }
                }
                dcnk o2 = dcnm.o(afka.c, hashSet);
                if (!o2.isEmpty()) {
                    duqmVar.a(afka.a(dqvj.DRIVE, afkaVar.g.a().c(dqvj.DRIVE, 3, vul.COMMUTE_IMMERSIVE), o2));
                    duqmVar.a(afka.a(dqvj.TRANSIT, afkaVar.g.a().c(dqvj.TRANSIT, 3, vul.TRANSIT_COMMUTE_IMMERSIVE), o2));
                }
                dwaw c2 = afkaVar.c(h);
                if (duqmVar.c) {
                    duqmVar.bF();
                    duqmVar.c = false;
                }
                duqn duqnVar4 = (duqn) duqmVar.b;
                c2.getClass();
                duqnVar4.g = c2;
                duqnVar4.a |= 4;
            } else {
                vul vulVar = dsrhVar.contains(duqi.DIRECTIONS_COMMUTE_IMMERSIVE) ? vul.COMMUTE_IMMERSIVE : vul.DIRECTIONS_UI;
                for (dqvj dqvjVar2 : afkaVar.h.a().i()) {
                    duqf bZ2 = duqg.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    duqg duqgVar = (duqg) bZ2.b;
                    duqgVar.b = dqvjVar2.k;
                    duqgVar.a |= 1;
                    dwao c3 = afkaVar.g.a().c(dqvjVar2, 3, vulVar);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    duqg duqgVar2 = (duqg) bZ2.b;
                    c3.getClass();
                    duqgVar2.c = c3;
                    duqgVar2.a |= 2;
                    duqmVar.a(bZ2.bK());
                }
                dwao c4 = afkaVar.g.a().c(afkaVar.h.a().e().a(), 3, vul.DIRECTIONS_UI);
                vum vumVar = new vum();
                vumVar.a = c4;
                vumVar.e = afkaVar.d.Z();
                vumVar.g = bvsl.a(afkaVar.f);
                vumVar.p = false;
                vumVar.o = afkaVar.b();
                GmmLocation a5 = afkaVar.e.a().a();
                if (a5 != null) {
                    vumVar.f = a5.a();
                }
                dwaw c5 = afkaVar.c(vumVar.a());
                if (duqmVar.c) {
                    duqmVar.bF();
                    duqmVar.c = false;
                }
                duqn duqnVar5 = (duqn) duqmVar.b;
                c5.getClass();
                duqnVar5.g = c5;
                duqnVar5.a |= 4;
            }
        }
        if (dsrhVar.contains(duqi.PLACE_DETAILS_BASIC) || dsrhVar.contains(duqi.PLACE_DETAILS_FULL)) {
            dhjx Z2 = a.b.Z();
            if (Z2 == null) {
                Z2 = dhjx.f;
            }
            dvzj dvzjVar = (dvzj) bgej.b(a.a.getApplication(), a.b, Z2, a.g.a(), true, a.c, a.e.a(), a.f, a.l.a().a(), a.m, a.n, a.o).bK();
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar6 = (duqn) duqmVar.b;
            dvzjVar.getClass();
            duqnVar6.h = dvzjVar;
            duqnVar6.a |= 8;
        }
        if (dsrhVar.contains(duqi.MAP) || dsrhVar.contains(duqi.STREET_VIEW)) {
            dure bZ3 = durf.c.bZ();
            duqq bZ4 = duqr.g.bZ();
            dhjx Z3 = a.b.Z();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            duqr duqrVar = (duqr) bZ4.b;
            Z3.getClass();
            duqrVar.b = Z3;
            duqrVar.a |= 1;
            boolean w = a.b.w();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            duqr duqrVar2 = (duqr) bZ4.b;
            duqrVar2.a |= 16;
            duqrVar2.f = w;
            boolean s = a.b.s();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            duqr duqrVar3 = (duqr) bZ4.b;
            duqrVar3.a |= 2;
            duqrVar3.c = s;
            boolean t = a.b.t();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            duqr duqrVar4 = (duqr) bZ4.b;
            duqrVar4.a |= 4;
            duqrVar4.d = t;
            boolean u = a.b.u();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            duqr duqrVar5 = (duqr) bZ4.b;
            duqrVar5.a |= 8;
            duqrVar5.e = u;
            duqr bK2 = bZ4.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            durf durfVar = (durf) bZ3.b;
            bK2.getClass();
            durfVar.b = bK2;
            durfVar.a |= 1;
            durf bK3 = bZ3.bK();
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar7 = (duqn) duqmVar.b;
            bK3.getClass();
            duqnVar7.i = bK3;
            duqnVar7.a |= 32;
        }
        if (dsrhVar.contains(duqi.MAPS_ENGINE_MAP)) {
            dvct a6 = arhe.a(a.a, null, a.b.Z());
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar8 = (duqn) duqmVar.b;
            a6.getClass();
            duqnVar8.j = a6;
            duqnVar8.a |= 64;
        }
        if (dsrhVar.contains(duqi.DISPLAY_MAJOR_EVENT) || dsrhVar.contains(duqi.DISPLAY_EXPERIENCE)) {
            dijh a7 = a.q.a(false);
            if (duqmVar.c) {
                duqmVar.bF();
                duqmVar.c = false;
            }
            duqn duqnVar9 = (duqn) duqmVar.b;
            diji bK4 = a7.bK();
            bK4.getClass();
            duqnVar9.m = bK4;
            duqnVar9.a |= 512;
        }
    }
}
