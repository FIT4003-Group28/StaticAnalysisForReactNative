package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ceec  reason: default package */
/* loaded from: classes4.dex */
public final class ceec extends ges implements egq, cgrd, cevz {
    private static final dcqe ar = dcqe.c("ceec");
    public gfq a;
    public cqkj ad;
    public cewd ae;
    public axjh af;
    public axhq ag;
    public axwo ah;
    public anhk ai;
    public axhs aj;
    public cese ak;
    public cebr al;
    cewc am;
    @dzsi
    diak an;
    @dzsi
    String ao;
    public buos aq;
    private cqkf<cesu> au;
    @dzsi
    private btzc av;
    @dzsi
    private dpyv aw;
    public bvrb b;
    public akfa c;
    public bvjj d;
    public auhi e;
    public btrm f;
    public efg g;
    private final cgrc as = new cgrc();
    private final crzp<btlu> at = new ceeb(this);
    private boolean ax = false;
    private boolean ay = false;
    public String ap = "";

    public static ceec g(@dzsi String str, @dzsi dpyv dpyvVar) {
        ceec ceecVar = new ceec();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("profile_obfuscated_gaia_id_key", str);
        }
        if (dpyvVar != null) {
            bundle.putInt("profile_notification_type_key", dpyvVar.dm);
            ceecVar.ax = true;
        }
        ceecVar.B(bundle);
        return ceecVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.au.e(null);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof cedv) {
            if (!((cedv) obj).a.af.t().booleanValue()) {
                return;
            }
            this.am.u();
        } else if (obj instanceof cedr) {
            ((cexk) this.am.b()).w(((cedr) obj).a.ad);
        } else if (obj instanceof axjg) {
            if (((axjg) obj).a()) {
                this.ay = true;
                this.am.u();
                return;
            }
            gga ggaVar = this.aE;
            if (!this.aD || ggaVar == null) {
                return;
            }
            ggaVar.g().f();
        } else if (!(obj instanceof baad)) {
        } else {
            gfq.k(this);
            this.ah.i((baad) obj);
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        gga ggaVar = this.aE;
        if (!this.ax || ggaVar == null) {
            return;
        }
        dpyv dpyvVar = this.aw;
        avac.bp(ggaVar, dpyvVar == null ? null : Integer.valueOf(dpyvVar.dm), this.d, this.b, this.e);
        this.ax = false;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        this.av = null;
        this.am.v();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cesu> e = this.ad.e(new ceik());
        this.au = e;
        e.e(this.am);
        return this.au.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.as.f();
        this.am.l();
        this.f.a(this.am);
    }

    @Override // defpackage.cgrd
    public final void b() {
        i();
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        diak diakVar = (diak) obj;
        this.an = diakVar;
        this.av = null;
        if (this.af.e()) {
            dqam dqamVar = diakVar.f;
            if (dqamVar == null) {
                dqamVar = dqam.g;
            }
            if (dqamVar.b == 1) {
                final dqal dqalVar = (dqal) dqamVar.c;
                if ((dqalVar.a & 4) != 0) {
                    new Handler().post(new Runnable(this, dqalVar) { // from class: cedz
                        private final ceec a;
                        private final dqal b;

                        {
                            this.a = this;
                            this.b = dqalVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ceec ceecVar = this.a;
                            dqal dqalVar2 = this.b;
                            axjh axjhVar = ceecVar.af;
                            dqaa dqaaVar = dqalVar2.d;
                            if (dqaaVar == null) {
                                dqaaVar = dqaa.d;
                            }
                            axjhVar.M(ceecVar, dqaaVar);
                        }
                    });
                }
                btlu j = this.c.j();
                if (j != null) {
                    this.ag.b(j, dqalVar);
                }
            }
            dhtc dhtcVar = diakVar.b;
            if (dhtcVar == null) {
                dhtcVar = dhtc.l;
            }
            dqkn dqknVar = dhtcVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            this.af.F(dqknVar.d, dqamVar);
            dqam dqamVar2 = diakVar.f;
            if (dqamVar2 == null) {
                dqamVar2 = dqam.g;
            }
            if ((dqamVar2.a & 4) != 0) {
                dqam dqamVar3 = diakVar.f;
                if (dqamVar3 == null) {
                    dqamVar3 = dqam.g;
                }
                dqah dqahVar = dqamVar3.d;
                if (dqahVar == null) {
                    dqahVar = dqah.e;
                }
                if ((dqahVar.a & 1) == 0) {
                    bvoo.h("People Follow is enabled but profile response does not have followee count", new Object[0]);
                }
            }
        }
        this.am.s(diakVar);
        if (this.ay) {
            this.ay = false;
            if (dfqg.a(this.d.t(bvjk.hM, this.c.j(), 0)) != 3) {
                return;
            }
            this.am.x();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        diak diakVar = this.an;
        if (diakVar == null || !this.af.e()) {
            return false;
        }
        axjh axjhVar = this.af;
        dhtc dhtcVar = diakVar.b;
        if (dhtcVar == null) {
            dhtcVar = dhtc.l;
        }
        dqkn dqknVar = dhtcVar.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        axjhVar.G(dqknVar.d);
        return false;
    }

    @Override // defpackage.cevz
    public final void i() {
        btzc btzcVar = this.av;
        if (btzcVar != null) {
            btzcVar.a();
        }
        cgrc cgrcVar = this.as;
        buos buosVar = this.aq;
        String str = this.ao;
        axjh axjhVar = this.af;
        dnwb a = this.ai.a();
        cese ceseVar = this.ak;
        cebr cebrVar = this.al;
        diah diahVar = (diah) diai.h.bZ();
        if (str != null) {
            if (diahVar.c) {
                diahVar.bF();
                diahVar.c = false;
            }
            diai diaiVar = (diai) diahVar.b;
            str.getClass();
            diaiVar.a |= 1;
            diaiVar.b = str;
        }
        if (diahVar.c) {
            diahVar.bF();
            diahVar.c = false;
        }
        diai diaiVar2 = (diai) diahVar.b;
        a.getClass();
        diaiVar2.c = a;
        diaiVar2.a |= 2;
        boolean a2 = cebrVar.a();
        if (diahVar.c) {
            diahVar.bF();
            diahVar.c = false;
        }
        diai diaiVar3 = (diai) diahVar.b;
        diaiVar3.a |= 64;
        diaiVar3.g = a2;
        dhsz bZ = dhta.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhta dhtaVar = (dhta) bZ.b;
        dhtaVar.a |= 1;
        dhtaVar.b = true;
        if (diahVar.c) {
            diahVar.bF();
            diahVar.c = false;
        }
        diai diaiVar4 = (diai) diahVar.b;
        dhta bK = bZ.bK();
        bK.getClass();
        diaiVar4.e = bK;
        diaiVar4.a |= 16;
        axjhVar.H(str, diahVar);
        if (ceseVar.b()) {
            dhtd bZ2 = dhte.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhte dhteVar = (dhte) bZ2.b;
            dhteVar.a |= 1;
            dhteVar.b = true;
            if (diahVar.c) {
                diahVar.bF();
                diahVar.c = false;
            }
            diai diaiVar5 = (diai) diahVar.b;
            dhte bK2 = bZ2.bK();
            bK2.getClass();
            diaiVar5.f = bK2;
            diaiVar5.a |= 32;
        }
        this.av = cgre.i(cgrcVar, buosVar, (diai) diahVar.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        diak diakVar;
        diak diakVar2;
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        this.as.a(bundle);
        cgre.g(this.as, diai.class, this);
        this.ao = bundle2.getString("profile_obfuscated_gaia_id_key");
        this.aw = dpyv.b(bundle2.getInt("profile_notification_type_key"));
        this.an = (diak) bvrs.b(bundle2.getByteArray("profile_response_key"), (dssr) diak.g.cu(7));
        if (this.af.e() && (diakVar2 = this.an) != null) {
            dqam dqamVar = diakVar2.f;
            if (dqamVar == null) {
                dqamVar = dqam.g;
            }
            if ((dqamVar.a & 4) != 0) {
                axhs axhsVar = this.aj;
                diak diakVar3 = this.an;
                dbsk.s(diakVar3);
                dhtc dhtcVar = diakVar3.b;
                if (dhtcVar == null) {
                    dhtcVar = dhtc.l;
                }
                dqkn dqknVar = dhtcVar.b;
                if (dqknVar == null) {
                    dqknVar = dqkn.e;
                }
                if (axhsVar.i(dqknVar.d).d.h() == null) {
                    diak diakVar4 = this.an;
                    dbsk.s(diakVar4);
                    dqam dqamVar2 = diakVar4.f;
                    if (dqamVar2 == null) {
                        dqamVar2 = dqam.g;
                    }
                    dqah dqahVar = dqamVar2.d;
                    if (dqahVar == null) {
                        dqahVar = dqah.e;
                    }
                    if ((dqahVar.a & 1) == 0) {
                        bvoo.h("De-serialized profile response does not contain followee count", new Object[0]);
                    } else if (this.ap.equals(dbsj.e(btlu.h(this.c.j())))) {
                        bvoo.h("No login change and de-serialized profile response contains followee count, butPeopleFollowController did not contain reference to matching FollowCountRepository", new Object[0]);
                    }
                }
            }
        }
        if (this.ao != null || (diakVar = this.an) == null) {
            this.ap = dbsj.e(btlu.h(this.c.j()));
        } else {
            dhtc dhtcVar2 = diakVar.b;
            if (dhtcVar2 == null) {
                dhtcVar2 = dhtc.l;
            }
            dqkn dqknVar2 = dhtcVar2.b;
            if (dqknVar2 == null) {
                dqknVar2 = dqkn.e;
            }
            this.ap = dqknVar2.d;
        }
        cewd cewdVar = this.ae;
        String str = this.ao;
        gga a = cewdVar.a.a();
        cewd.a(a, 1);
        bvrb a2 = cewdVar.b.a();
        cewd.a(a2, 2);
        cqhn a3 = cewdVar.c.a();
        cewd.a(a3, 3);
        cqhu a4 = cewdVar.d.a();
        cewd.a(a4, 4);
        ceun a5 = cewdVar.e.a();
        cewd.a(a5, 5);
        bjgl a6 = cewdVar.f.a();
        cewd.a(a6, 6);
        bwft a7 = cewdVar.g.a();
        cewd.a(a7, 7);
        axjh a8 = cewdVar.h.a();
        cewd.a(a8, 8);
        afzv a9 = cewdVar.i.a();
        cewd.a(a9, 9);
        bvnt a10 = cewdVar.j.a();
        cewd.a(a10, 10);
        akfa a11 = cewdVar.k.a();
        cewd.a(a11, 11);
        cfli a12 = cewdVar.l.a();
        cewd.a(a12, 12);
        cexl a13 = cewdVar.m.a();
        cewd.a(a13, 13);
        cetk a14 = cewdVar.n.a();
        cewd.a(a14, 14);
        cetx a15 = cewdVar.o.a();
        cewd.a(a15, 15);
        cexr a16 = cewdVar.p.a();
        cewd.a(a16, 16);
        axhs a17 = cewdVar.q.a();
        cewd.a(a17, 17);
        cjot a18 = cewdVar.r.a();
        cewd.a(a18, 18);
        acyp a19 = cewdVar.s.a();
        cewd.a(a19, 19);
        cese a20 = cewdVar.t.a();
        cewd.a(a20, 20);
        cewd.a(this, 21);
        cewc cewcVar = new cewc(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, this, str);
        this.am = cewcVar;
        diak diakVar5 = this.an;
        if (diakVar5 != null) {
            cewcVar.s(diakVar5);
        }
        btrm btrmVar = this.f;
        cewc cewcVar2 = this.am;
        dceq a21 = dcet.a();
        a21.b(bqje.class, new cewe(0, bqje.class, cewcVar2, bvrj.UI_THREAD));
        a21.b(cdjh.class, new cewe(1, cdjh.class, cewcVar2, bvrj.UI_THREAD));
        a21.b(bkpe.class, new cewe(2, bkpe.class, cewcVar2, bvrj.UI_THREAD));
        a21.b(azrb.class, new cewe(3, azrb.class, cewcVar2, bvrj.UI_THREAD));
        a21.b(azrc.class, new cewe(4, azrc.class, cewcVar2, bvrj.UI_THREAD));
        btrmVar.g(cewcVar2, a21.a());
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxl.fi;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.am.m();
        this.as.c();
        this.c.C().d(this.at, dege.a);
        efg efgVar = this.g;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.F(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.au.c());
        egjVar.e(this);
        egjVar.J(this);
        egjVar.I(2);
        efgVar.a(egjVar.a());
        if (this.an != null || cgre.k(this.as, diai.class).l()) {
            return;
        }
        i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.as.d(bundle);
        String str = this.ao;
        if (str != null) {
            bundle.putString("profile_obfuscated_gaia_id_key", str);
        }
        dpyv dpyvVar = this.aw;
        if (dpyvVar != null) {
            bundle.putInt("profile_notification_type_key", dpyvVar.dm);
        }
        diak diakVar = this.an;
        if (diakVar != null) {
            bundle.putByteArray("profile_response_key", diakVar.bS());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.as.e();
        this.c.C().c(this.at);
    }
}
