package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqzm  reason: default package */
/* loaded from: classes4.dex */
public final class bqzm extends ges implements bwrr, aueo, brae {
    public static final dcqe a = dcqe.c("bqzm");
    public brpk aA;
    public acwt aB;
    public cklq aC;
    public dxio<brmt> aO;
    public dxio<afwr> aP;
    public bsop aQ;
    public brcc aR;
    public brze aS;
    public ckmu aT;
    public dxio<brch> aU;
    public dehp aV;
    public Executor aW;
    @dzsi
    cqkf<bssu> aY;
    @dzsi
    public cqkf<jbk> aZ;
    public dxio<akzh> ad;
    public dxio<brbk> ae;
    public brcb af;
    public braw ag;
    public brba ah;
    public jkf ai;
    public bwqv aj;
    public bvrb ak;
    public cqkj al;
    public dxio<acwo> am;
    public dxio<aehr> an;
    public bssf ao;
    public dxio<auen> ap;
    public ckmm aq;
    public bsrm ar;
    public iwh as;
    public bsoj at;
    public brad au;
    public bsrq av;
    public brck aw;
    public brme ax;
    public brat ay;
    public dzsj<brmk> az;
    public Activity b;
    @dzsi
    private dro bA;
    private bwrs<brlu> bB;
    private boolean bC;
    @dzsi
    private bsjn bD;
    private brmd bG;
    private brzd bH;
    @dzsi
    private Runnable bI;
    @dzsi
    private Runnable bJ;
    @dzsi
    private bqze bK;
    @dzsi
    public iwg ba;
    @dzsi
    public ExtendedFloatingActionButton bb;
    public bwrs<brln> bc;
    public boolean bd;
    public boolean be;
    brca bf;
    gek bg;
    @dzsi
    public brmc bh;
    public brac bi;
    @dzsi
    public brcj bj;
    @dzsi
    public bsrl bk;
    @dzsi
    public bsrp bl;
    boolean bn;
    public brmk bq;
    public bsse bs;
    public bsoi bt;
    private boolean bw;
    private boolean bx;
    private boolean by;
    private View bz;
    public eeu c;
    public dbsg<drn> d;
    public ckcw e;
    public btvo f;
    public btrm g;
    private boolean bv = false;
    public dehn<Boolean> aX = deha.c();
    @dzsi
    private jjn bE = null;
    boolean bm = true;
    final bqzl bo = new bqzl(this);
    private boolean bF = false;
    boolean bp = false;
    final cqqw br = new bqzh(this);
    protected final brci bu = new bqzk(this);

    private final jbk aT(gga ggaVar) {
        if (bo()) {
            return this.av.a(i().j());
        }
        bsrl bsrlVar = this.bk;
        CharSequence d = bsrlVar != null ? bsrlVar.d() : i().j();
        jhm jhmVar = new jhm();
        jhmVar.h = 2;
        jhmVar.d(new bqzi(this));
        jhmVar.a = ggaVar.getString(R.string.SEARCH);
        jhmVar.b = ggaVar.getString(R.string.SEARCH);
        jhmVar.c = cqrt.f(2131231736);
        jho c = jhmVar.c();
        jhz a2 = jhz.a();
        a2.a = d;
        a2.o = cjtd.a(dtyb.bf);
        a2.f(new bqzj(this, ggaVar));
        if (!i().c()) {
            a2.c(c);
        }
        if (this.bs.s().booleanValue()) {
            a2.b = ggaVar.getString(R.string.SEARCH_LIST_GAS_PRICE_STALENESS, ggaVar.getString(R.string.SEARCH_LIST_GAS_PRICE_ASTERISK));
        } else if (this.bs.t()) {
            amsz amszVar = i().c;
            String string = amszVar == null ? null : ggaVar.getString(R.string.PARKING_NEARBY_DESTINATION, amszVar.e[amszVar.c].p());
            if (string != null) {
                a2.b = string;
            }
        }
        return new iyl(a2.b());
    }

    @dzsi
    private static dnnn aU(brlu brluVar) {
        for (ilo iloVar : brluVar.c()) {
            if (iloVar != null && iloVar.bS().a()) {
                dnnn dnnnVar = iloVar.bS().b().b;
                return dnnnVar == null ? dnnn.l : dnnnVar;
            }
        }
        return null;
    }

    private final boolean aV() {
        bssq i;
        bsse bsseVar = this.bs;
        if (bsseVar == null || (i = bsseVar.i()) == null) {
            return false;
        }
        return i.b().booleanValue();
    }

    private final boolean aX() {
        return i().m();
    }

    private final boolean bn() {
        return !i().b().J.isEmpty();
    }

    private final boolean bo() {
        return i().e();
    }

    private final void bp() {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        djnu djnuVar;
        dbsg dbsgVar3;
        dbsg dbsgVar4;
        djmb djmbVar;
        int B;
        String string;
        if (this.bD == null) {
            return;
        }
        dbsk.s(this.bf);
        brca brcaVar = this.bf;
        bsjn bsjnVar = this.bD;
        bsjm a2 = bsjnVar.a();
        if (brcaVar.g.f()) {
            bsma bsmaVar = brcaVar.h;
            dccx F = dcdc.F();
            Set<dspd> c = a2.c(2);
            if (c.isEmpty()) {
                dbsgVar2 = dbpy.a;
            } else {
                dspd next = c.iterator().next();
                djmv djmvVar = (djmv) bvrs.c(next, (dssr) djmv.c.cu(7));
                if (djmvVar == null || djmvVar.a != 2) {
                    bvoo.h("Value of applied refinement cannot be parsed as UserRatingParams: %s", next);
                    dbsgVar = dbpy.a;
                } else {
                    dbsgVar = dbsg.i((djny) djmvVar.b);
                }
                if (dbsgVar.a() && ((djny) dbsgVar.b()).a == 2) {
                    dcdn<djnu, Double> dcdnVar = bsma.b;
                    djny djnyVar = (djny) dbsgVar.b();
                    if (djnyVar.a == 2) {
                        djnuVar = djnu.b(((Integer) djnyVar.b).intValue());
                        if (djnuVar == null) {
                            djnuVar = djnu.UNKNOWN_NUMERIC_RATING;
                        }
                    } else {
                        djnuVar = djnu.UNKNOWN_NUMERIC_RATING;
                    }
                    Double d = dcdnVar.get(djnuVar);
                    djmg bZ = djml.j.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djml djmlVar = (djml) bZ.b;
                    djmlVar.a |= 2;
                    djmlVar.c = 2;
                    String string2 = bsmaVar.c.getString(R.string.REFINEMENT_PIVOT_STAR_RATING, new Object[]{d});
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djml djmlVar2 = (djml) bZ.b;
                    string2.getClass();
                    djmlVar2.a |= 8;
                    djmlVar2.e = string2;
                    String string3 = bsmaVar.c.getString(R.string.REFINEMENT_PIVOT_STAR_RATING_ACCESSIBILITY_LABEL, new Object[]{d});
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djml djmlVar3 = (djml) bZ.b;
                    string3.getClass();
                    djmlVar3.a |= 16;
                    djmlVar3.f = string3;
                    djmk djmkVar = djmk.SHOW_ONLY_WHEN_APPLIED;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djml djmlVar4 = (djml) bZ.b;
                    djmlVar4.g = djmkVar.e;
                    int i = djmlVar4.a | 32;
                    djmlVar4.a = i;
                    next.getClass();
                    djmlVar4.a = i | 1;
                    djmlVar4.b = next;
                    dbsgVar2 = dbsg.i(bZ.bK());
                } else {
                    dbsgVar2 = dbpy.a;
                }
            }
            if (dbsgVar2.a()) {
                F.g((djml) dbsgVar2.b());
            }
            Set<dspd> c2 = a2.c(3);
            if (c2.isEmpty()) {
                dbsgVar4 = dbpy.a;
            } else {
                dspd next2 = c2.iterator().next();
                djmv djmvVar2 = (djmv) bvrs.c(next2, (dssr) djmv.c.cu(7));
                if (djmvVar2 == null || djmvVar2.a != 3) {
                    bvoo.h("Value of applied refinement cannot be parsed as OpeningHoursParams: %s", next2);
                    dbsgVar3 = dbpy.a;
                } else {
                    dbsgVar3 = dbsg.i((djmf) djmvVar2.b);
                }
                if (dbsgVar3.a() && ((djmf) dbsgVar3.b()).a == 4) {
                    djmg bZ2 = djml.j.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    djml djmlVar5 = (djml) bZ2.b;
                    djmlVar5.a |= 2;
                    djmlVar5.c = 3;
                    djmf djmfVar = (djmf) dbsgVar3.b();
                    if (djmfVar.a == 4) {
                        djmbVar = (djmb) djmfVar.b;
                    } else {
                        djmbVar = djmb.e;
                    }
                    int i2 = djmbVar.a;
                    if (i2 == 2) {
                        dpol b = dpol.b(((Integer) djmbVar.b).intValue());
                        if (b == null) {
                            b = dpol.DAY_OF_WEEK_UNSPECIFIED;
                        }
                        B = b.i;
                    } else if (i2 == 1) {
                        djjv djjvVar = (djjv) djmbVar.b;
                        B = new eaol(djjvVar.b, djjvVar.c, djjvVar.d, 12, 0).B();
                    } else {
                        B = eaol.a().B();
                    }
                    String string4 = bsmaVar.c.getString(byea.values()[B - 1].i);
                    if (djmbVar.c == 4) {
                        string = bsmaVar.c.getString(R.string.REFINEMENT_PIVOT_OPEN_ON_DAY_AND_TIME, new Object[]{string4, new eapi(((Integer) djmbVar.d).intValue(), 0).E(eato.a())});
                    } else {
                        string = bsmaVar.c.getString(R.string.REFINEMENT_PIVOT_OPEN_ON_DAY, new Object[]{string4});
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    djml djmlVar6 = (djml) bZ2.b;
                    string.getClass();
                    djmlVar6.a |= 8;
                    djmlVar6.e = string;
                    djmk djmkVar2 = djmk.SHOW_ONLY_WHEN_APPLIED;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    djml djmlVar7 = (djml) bZ2.b;
                    djmlVar7.g = djmkVar2.e;
                    int i3 = djmlVar7.a | 32;
                    djmlVar7.a = i3;
                    next2.getClass();
                    djmlVar7.a = i3 | 1;
                    djmlVar7.b = next2;
                    dbsgVar4 = dbsg.i(bZ2.bK());
                } else {
                    dbsgVar4 = dbpy.a;
                }
            }
            if (dbsgVar4.a()) {
                F.g((djml) dbsgVar4.b());
            }
            for (djml djmlVar8 : F.f()) {
                if (!a2.l(djmlVar8.c, djmlVar8.b)) {
                    a2.c.add(bvrt.b(djmlVar8));
                }
            }
        }
        ddho b2 = bsjnVar.b();
        cjqm c3 = bsjnVar.c();
        boolean d2 = bsjnVar.d();
        if (brcaVar.f.c() != null) {
            brcaVar.a(a2, d2);
            if (brcaVar.g.f()) {
                brcaVar.c(a2);
            } else {
                brce brceVar = brcaVar.d;
                djnk b3 = a2.b();
                dwix m = a2.m();
                cjsb cjsbVar = new cjsb();
                cjsbVar.i(b2);
                brceVar.g(b3, m, true, cjsbVar, c3.a().f());
            }
        }
        this.bD = null;
    }

    private final boolean bq() {
        return btpf.d(this.b.getResources().getConfiguration()).e;
    }

    private final boolean br() {
        return this.b.getResources().getConfiguration().orientation == 2;
    }

    private final boolean bs() {
        return bq() && br();
    }

    private final boolean bu() {
        return q().aF() == 12;
    }

    private final boolean bv() {
        int aF = q().aF();
        return (aF == 0 || !(aF == 8 || aF == 9)) && aX();
    }

    private final void bw() {
        bsoi bsoiVar = this.bt;
        if (bsoiVar != null) {
            bsoiVar.a(true, jjn.HIDDEN);
        }
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi Object obj) {
        cqkf<jbk> cqkfVar;
        brcj brcjVar;
        brlu brluVar = (brlu) obj;
        if (brluVar == null) {
            bvoo.h("onUpdate: received a null SearchResult", new Object[0]);
            return;
        }
        if (!brluVar.ah()) {
            if (jjn.EXPANDED == this.ai.l().L() && brluVar.d() > 0 && (brcjVar = this.bj) != null) {
                brcjVar.h(true, true);
            }
            if (this.bk != null) {
                boolean z = i().m() || (brluVar.o.g() && !aV() && !bn());
                bsrl bsrlVar = this.bk;
                dbsk.s(bsrlVar);
                bsrlVar.ar(z);
                bsrl bsrlVar2 = this.bk;
                dbsk.s(bsrlVar2);
                cqkx.p(bsrlVar2);
            }
            if (brluVar.d() == 0 && ((this.bs.k().d().booleanValue() || this.bs.k().e().booleanValue()) && !this.ai.l().L().b() && !this.bt.G && !aX())) {
                ckos.b(this.b.findViewById(16908290), R.string.RESTRICTION_NO_RESULTS_ADJUST_FILTERS, 0).c();
            }
        }
        w(brluVar);
        ArrayList arrayList = new ArrayList();
        for (ilo iloVar : brluVar.c()) {
            if (!iloVar.bc()) {
                arrayList.add(iloVar);
            }
        }
        braw brawVar = this.ag;
        brau d = brav.d();
        d.d(arrayList);
        d.c(brluVar.aC());
        ((brah) d).a = brluVar.aD();
        brawVar.a(d.a());
        if (!brluVar.ah() && this.bt != null && !aX()) {
            dkee ar = q().ar();
            if (aX() || ar == null || !new dsrh(this.f.getCategoricalSearchParameters().p().a, dhob.b).contains(ar) || this.bp) {
                this.bt.L();
            }
        }
        gga ggaVar = this.aE;
        if (ggaVar != null && (cqkfVar = this.aZ) != null) {
            cqkfVar.e(aT(ggaVar));
        }
        if (!brluVar.ah()) {
            this.aq.e(cwsv.a("SearchResultsFetchedEvent"));
        }
        if (this.bj != null && brluVar.at() && !brluVar.ah() && brluVar.T()) {
            brluVar.c = false;
            brcj brcjVar2 = this.bj;
            dbsk.s(brcjVar2);
            brce brceVar = brcjVar2.i;
            dbsk.s(brceVar);
            brceVar.f(brcjVar2.m().o.b(), brcjVar2.m().X(), false, cjqm.a, ddda.cJ);
        }
        if (ggaVar != null && !brluVar.ah() && aU(brluVar) != null) {
            this.an.a();
        }
        if (brluVar.ah() || this.bp) {
            return;
        }
        this.bp = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aY = null;
        this.aZ = null;
        bsoi bsoiVar = this.bt;
        if (bsoiVar != null) {
            bsoiVar.E = null;
        }
        brmc brmcVar = this.bh;
        if (brmcVar != null) {
            brmcVar.c = null;
            brmcVar.d = null;
        }
        brac bracVar = this.bi;
        if (bracVar != null) {
            bracVar.b = null;
            bracVar.c = null;
        }
        this.aU.a();
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bsjn) {
            this.bD = (bsjn) obj;
        }
        if (!this.aD) {
            return;
        }
        jkf jkfVar = this.ai;
        if ((obj instanceof befs) && !bs() && jkfVar != null) {
            gek gekVar = this.bg;
            dbsk.s(gekVar);
            jjn jjnVar = gekVar.c;
            if (jjnVar == null) {
                jjnVar = jjn.HIDDEN;
            }
            jjn jjnVar2 = jjn.HIDDEN;
            bsoi bsoiVar = this.bt;
            boolean z = false;
            if (bsoiVar != null && bsoiVar.G) {
                z = true;
            }
            brcj brcjVar = this.bj;
            if (brcjVar != null && !z) {
                brcjVar.i(jjnVar, jjnVar2, jkg.AUTOMATED, jkfVar.l().j());
            }
            jkfVar.B(jjnVar2);
            gek gekVar2 = this.bg;
            dbsk.s(gekVar2);
            gekVar2.c = jjnVar2;
        }
        bp();
    }

    public final void aJ() {
        if (this.bk == null) {
            return;
        }
        bsoi bsoiVar = this.bt;
        boolean z = true;
        boolean z2 = bsoiVar != null && bsoiVar.G && br();
        bsrl bsrlVar = this.bk;
        dbsk.s(bsrlVar);
        if (!bq() && z2) {
            z = false;
        }
        bsrlVar.at(z);
    }

    public final boolean aR() {
        bsoi bsoiVar = this.bt;
        boolean z = bsoiVar != null && bsoiVar.G && br();
        bsoi bsoiVar2 = this.bt;
        return (bsoiVar2 == null || !bsoiVar2.G || bsoiVar2.v.f != jjn.HIDDEN) && !z;
    }

    final <V extends cqkp> cqkf<V> aS(cqiw<V> cqiwVar) {
        return this.al.c(cqiwVar, null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        iqy iqyVar;
        if (!this.bd) {
            return null;
        }
        cqkf<bssu> aS = aS(new brky());
        this.aY = aS;
        ((RecyclerView) aS.c()).i(this.br);
        this.aZ = aS(new hxj());
        if (bundle == null && !this.bF && (iqyVar = i().a) != null) {
            dbsg<ckhf> a2 = iqyVar.a();
            if (a2.a()) {
                ((ckhe) this.e.a(a2.b())).c();
                this.bF = true;
            }
        }
        bsoi bsoiVar = this.bt;
        if (bsoiVar != null) {
            if (bsoiVar.E == null) {
                bsoiVar.E = bsoiVar.e.c(new ghj(0), null);
            }
            if (bsoiVar.n.b() && bsoiVar.L == null) {
                bsoiVar.M = bsoiVar.f.a(brax.a.a(), false, false, false, false, bsoiVar.k.getEnableFeatureParameters().aI, true, null, bsnv.a);
                bdyk bdykVar = bsoiVar.M;
                dbsk.s(bdykVar);
                bdykVar.N().Q(jjn.EXPANDED);
                bsoiVar.L = new bdwp(bsoiVar.b, null);
                bdwp bdwpVar = bsoiVar.L;
                bdyk bdykVar2 = bsoiVar.M;
                dbsk.s(bdykVar2);
                bdwpVar.setViewModel(bdykVar2, iln.UNRESOLVED);
            }
            ghw s = bsoiVar.s();
            s.s(bsoiVar.y, bsoiVar.z);
            cqkf<ghq> cqkfVar = bsoiVar.E;
            dbsk.s(cqkfVar);
            cqkfVar.e(s);
            bsoq bsoqVar = bsoiVar.v;
            cqkf<ghq> cqkfVar2 = bsoiVar.E;
            dbsk.s(cqkfVar2);
            bsoqVar.setContent(cqkfVar2.c());
            bsoiVar.b(bsoiVar.a.getResources().getConfiguration().orientation);
            if (bsoiVar.M()) {
                s.r(true);
                bsoiVar.I(jjn.HIDDEN);
            }
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        dnnn aU;
        super.aj(bundle);
        if (!this.bd) {
            return;
        }
        if (!this.bn) {
            btrm btrmVar = this.g;
            bqzl bqzlVar = this.bo;
            dceq a2 = dcet.a();
            a2.b(azre.class, new bqzn(0, azre.class, bqzlVar, bvrj.UI_THREAD));
            a2.b(bsno.class, new bqzn(1, bsno.class, bqzlVar, bvrj.UI_THREAD));
            btrmVar.g(bqzlVar, a2.a());
            this.bn = true;
        }
        brlu q = q();
        if ((q.O().a & 32) != 0 && (aU = aU(q)) != null) {
            q.o.p(aU);
        }
        brcj brcjVar = this.bj;
        if (brcjVar != null) {
            brcjVar.h = brbw.l(brcjVar.l(), brcjVar.m());
        }
        cqkf<bssu> cqkfVar = this.aY;
        if (cqkfVar != null) {
            cqkfVar.e(this.bs);
            brmc brmcVar = this.bh;
            if (brmcVar == null) {
                brmc brmcVar2 = new brmc(cqkfVar, this.bt);
                this.bh = brmcVar2;
                brmcVar2.a();
            } else {
                bsoi bsoiVar = this.bt;
                brmcVar.c = cqkfVar;
                brmcVar.d = bsoiVar;
            }
        }
        brme brmeVar = this.ax;
        brmc brmcVar3 = this.bh;
        dbsk.s(brmcVar3);
        jkf jkfVar = this.ai;
        brcj brcjVar2 = this.bj;
        dbsk.s(brcjVar2);
        bsoi bsoiVar2 = this.bt;
        boolean z = this.be;
        eeu a3 = brmeVar.a.a();
        brme.a(a3, 1);
        ff ffVar = (ff) ((dxjd) brmeVar.b).a;
        brme.a(ffVar, 2);
        brme.a(brmcVar3, 3);
        brme.a(jkfVar, 4);
        brme.a(brcjVar2, 5);
        brmd brmdVar = new brmd(a3, ffVar, brmcVar3, jkfVar, brcjVar2, bsoiVar2, z);
        this.bG = brmdVar;
        ckmu ckmuVar = this.aT;
        cwsv cwsvVar = ckmt.b;
        ckmm a4 = ckmuVar.a.a();
        ckmu.a(a4, 1);
        cqat a5 = ckmuVar.b.a();
        ckmu.a(a5, 2);
        Handler a6 = ckmuVar.c.a();
        ckmu.a(a6, 3);
        ckmu.a(cwsvVar, 4);
        brmdVar.a.add(new ckmt(a4, a5, a6, cwsvVar, null).e);
        if (this.ba == null) {
            iwh iwhVar = this.as;
            brmd brmdVar2 = this.bG;
            dbsk.s(brmdVar2);
            gga a7 = iwhVar.a.a();
            iwh.a(a7, 1);
            jkf a8 = iwhVar.b.a();
            iwh.a(a8, 2);
            btvo a9 = iwhVar.c.a();
            iwh.a(a9, 3);
            this.ba = new iwg(a7, a8, a9, brmdVar2);
        }
        cqkf c = this.al.c(new brhz(true), null);
        c.e(this.ba);
        View c2 = c.c();
        this.bz = c2;
        this.bb = c2 == null ? null : (ExtendedFloatingActionButton) cqkx.e(c2, brhz.a, ExtendedFloatingActionButton.class);
        if (bo()) {
            this.bl = this.av.a(i().j());
            this.bk = null;
        } else {
            if (this.bk == null) {
                dfzq aE = q().aE();
                this.bH = this.aS.a(aE == null);
                boolean z2 = q().o.g() && !aV() && !bn();
                bsrm bsrmVar = this.ar;
                iwg iwgVar = this.ba;
                brzd brzdVar = this.bH;
                ixq a10 = bsrmVar.a.a();
                bsrm.a(a10, 1);
                cqhn a11 = bsrmVar.b.a();
                bsrm.a(a11, 2);
                dxio a12 = ((dxjh) bsrmVar.c).a();
                bsrm.a(a12, 3);
                bsri a13 = bsrmVar.d.a();
                bsrm.a(a13, 5);
                dxio a14 = ((dxjh) bsrmVar.e).a();
                bsrm.a(a14, 6);
                bsrm.a(brzdVar, 9);
                this.bk = new bsrl(a10, a11, a12, iwgVar, a13, a14, z2, aE, brzdVar);
                aJ();
            }
            bsrl bsrlVar = this.bk;
            dbsk.s(bsrlVar);
            String str = q().a;
            if (str == null) {
                str = i().j();
            }
            bsrlVar.I(str);
            bsrlVar.j(this.bc);
            this.bk = bsrlVar;
        }
        brad bradVar = this.au;
        if (bradVar == null) {
            return;
        }
        Bundle bundle2 = this.o;
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        gek gekVar = this.bg;
        cqkf<jbk> cqkfVar2 = this.aZ;
        brmd brmdVar3 = this.bG;
        dbsk.s(brmdVar3);
        iwg iwgVar2 = this.ba;
        dbsk.s(iwgVar2);
        dro droVar = this.bA;
        bsrl bsrlVar2 = this.bk;
        View view = this.bz;
        jkf jkfVar2 = this.ai;
        brcj brcjVar3 = this.bj;
        dbsk.s(brcjVar3);
        bsoi bsoiVar3 = this.bt;
        dxio a15 = ((dxjh) bradVar.a).a();
        brad.a(a15, 1);
        bnlm a16 = bradVar.b.a();
        brad.a(a16, 2);
        bsni a17 = bradVar.c.a();
        brad.a(a17, 3);
        bsnk a18 = bradVar.d.a();
        brad.a(a18, 4);
        efg a19 = bradVar.e.a();
        brad.a(a19, 5);
        brat a20 = bradVar.f.a();
        brad.a(a20, 6);
        ckmp a21 = bradVar.g.a();
        brad.a(a21, 7);
        acyp a22 = bradVar.h.a();
        brad.a(a22, 8);
        bsos a23 = bradVar.i.a();
        brad.a(a23, 9);
        brlk a24 = bradVar.j.a();
        brad.a(a24, 10);
        brad.a(this, 11);
        brad.a(ggaVar, 13);
        brad.a(gekVar, 14);
        brad.a(brmdVar3, 17);
        brad.a(iwgVar2, 18);
        brad.a(jkfVar2, 22);
        brad.a(brcjVar3, 23);
        brad.a(bsoiVar3, 24);
        this.bi = new brac(a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, this, bundle2, ggaVar, gekVar, cqkfVar2, cqkfVar, brmdVar3, iwgVar2, droVar, bsrlVar2, view, jkfVar2, brcjVar3, bsoiVar3);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.aj.g(this.bB, this);
        this.bC = true;
        bsrl bsrlVar = this.bk;
        if (bsrlVar != null) {
            bsrlVar.av(aR());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (this.bC) {
            bwqv.t(this.bB, this);
            this.bC = false;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        if (!this.bd) {
            return;
        }
        brcj brcjVar = this.bj;
        if (brcjVar != null) {
            brcjVar.h(false, true);
        }
        this.ag.b();
        if (bv()) {
            brbk a2 = this.ae.a();
            a2.a.a().aj().aC().j(a2.b);
        }
        if (this.bn) {
            this.g.a(this.bo);
            this.bn = false;
        }
        brcj brcjVar2 = this.bj;
        if (brcjVar2 != null) {
            brcjVar2.a();
        }
        if (bu()) {
            afwo l = this.aP.a().l();
            l.c(afwm.TRANSIT, this.bw);
            l.c(afwm.TRAFFIC, this.bx);
            l.c(afwm.BICYCLING, this.by);
        }
        this.bI = null;
        this.bJ = null;
        this.bK = null;
        this.bs.C();
    }

    @Override // defpackage.aueo
    public final Uri bI() {
        alad p = this.ad.a().p();
        float f = p.k;
        akqq akqqVar = p.i;
        double d = akqqVar.a;
        double d2 = akqqVar.b;
        afhk a2 = afhk.a();
        a2.d(i().j());
        a2.c(d, d2);
        a2.e(f);
        return a2.b();
    }

    @Override // defpackage.brae
    public final brlk bt() {
        bwrs<brln> bwrsVar = this.bc;
        dbsk.s(bwrsVar);
        bwrs<brlu> bwrsVar2 = this.bB;
        dbsk.s(bwrsVar2);
        return brlk.c(bwrsVar, bwrsVar2);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bsoi bsoiVar;
        brbw brbwVar;
        gga ggaVar = this.aE;
        if (this.aD && ggaVar != null) {
            brcj brcjVar = this.bj;
            if (brcjVar != null && (brbwVar = brcjVar.f) != null) {
                brbwVar.g();
            }
            if (aX()) {
                bsoi bsoiVar2 = this.bt;
                if (bsoiVar2 == null || !bsoiVar2.G || bs()) {
                    iwg iwgVar = this.ba;
                    dbsk.s(iwgVar);
                    if (iwgVar.j()) {
                        ggaVar.z(bqzm.class);
                        ggaVar.g().f();
                    } else {
                        brmc brmcVar = this.bh;
                        dbsk.s(brmcVar);
                        if (brmcVar.e) {
                            this.bG.a();
                        } else {
                            brcj brcjVar2 = this.bj;
                            dbsk.s(brcjVar2);
                            brcjVar2.b(jjn.HIDDEN);
                        }
                    }
                } else {
                    this.bt.a(false, jjn.HIDDEN);
                }
                return true;
            }
            jjn jjnVar = this.bE;
            if (jjnVar != null && this.ai != null) {
                if (jjnVar == jjn.EXPANDED) {
                    this.be = false;
                    this.ai.setExpandingStateTransition(jkc.d, bq() ? jkc.q : jkc.j, false);
                }
                jkj l = this.ai.l();
                jjn jjnVar2 = this.bE;
                dbsk.s(jjnVar2);
                jjn z = l.z(jjnVar2);
                jjn jjnVar3 = this.bE;
                jjn jjnVar4 = jjn.HIDDEN;
                boolean z2 = jjnVar3 == jjnVar4 && (bsoiVar = this.bt) != null && bsoiVar.G;
                if ((jjnVar3 != jjnVar4 && l.L() == z) || z2) {
                    efh efhVar = (efh) this.c;
                    if (!efhVar.d || !efhVar.e) {
                        ggaVar.z(bqzm.class);
                        ggaVar.g().f();
                    } else {
                        ggaVar.finish();
                        return true;
                    }
                } else if (jjnVar3 == jjnVar4) {
                    this.bG.a();
                } else if (this.bt.G) {
                    this.bG.L(l, jjn.HIDDEN, jjn.FULLY_EXPANDED, jkg.AUTOMATED);
                } else {
                    brcj brcjVar3 = this.bj;
                    if (brcjVar3 != null) {
                        brcjVar3.b(z);
                        this.bj.h(z == jjn.EXPANDED, false);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(ilo iloVar) {
        bsoi bsoiVar;
        ghw ghwVar;
        if (this.bt == null) {
            return;
        }
        int o = q().o(iloVar);
        brmk brmkVar = this.bq;
        if (brmkVar != null) {
            brmkVar.j = iloVar.ai();
        }
        if (o < 0) {
            q().ak(true);
            bw();
            bsoi bsoiVar2 = this.bt;
            bsoiVar2.H = iloVar;
            bsoiVar2.v(iloVar);
            if (aX()) {
                bsoi bsoiVar3 = this.bt;
                bsse bsseVar = this.bs;
                bsoiVar3.R();
                bsoiVar3.Q(new ghs<>(cqgr.fT(new bsov(true), bsseVar.b()), null, true, bsob.f(0), null, null), 0);
                cqhn cqhnVar = bsoiVar3.c;
                cqkx.p(bsoiVar3.s());
                brmk brmkVar2 = this.bq;
                if (brmkVar2 == null) {
                    return;
                }
                brmkVar2.d(iloVar);
                return;
            }
            q().i = true;
            int A = this.bt.A() + 1;
            this.bt.f(A, this.bs, false);
            this.bt.e(A);
            this.aA.a(dcdc.f(iloVar.ai()), i(), this.bB, true, A, false);
            return;
        }
        if (this.bt.p(iloVar) < 0) {
            if (aX() || !this.bt.h(o)) {
                this.bt.H = iloVar;
            } else {
                this.bt.v(iloVar);
                this.bt.e(o);
                bw();
                return;
            }
        }
        bsoi bsoiVar4 = this.bt;
        int p = bsoiVar4.p(iloVar);
        if (bsoiVar4.w(p) && (ghwVar = bsoiVar4.D) != null) {
            ghwVar.p(bsoiVar4.P(p).e(), true);
        }
        brmc brmcVar = this.bh;
        if (brmcVar != null && (bsoiVar = brmcVar.d) != null) {
            bsoiVar.N();
            brmcVar.c();
            brmcVar.e();
            brmcVar.d();
        }
        bw();
    }

    public final brln i() {
        brln c = this.bc.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        brlu q;
        int aF;
        brww brwwVar;
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        try {
            bwrs<brln> e = this.aj.e(brln.class, bundle2, "SearchListFragment.searchRequestRef");
            dbsk.s(e);
            this.bc = e;
            bwrs<brlu> e2 = this.aj.e(brlu.class, bundle2, "SearchListFragment.searchResultRef");
            dbsk.s(e2);
            this.bB = e2;
            q();
            this.bd = true;
            brlu q2 = q();
            dkee ar = q2.ar() == null ? dkee.UNKNOWN_VIEW_TYPE : q2.ar();
            braw brawVar = this.ag;
            dbsk.s(ar);
            brawVar.c(ar);
            if (bv()) {
                brbk a2 = this.ae.a();
                a2.a.a().aj().aC().i(a2.b);
            }
            bsse bsseVar = this.bs;
            if (bsseVar == null) {
                this.bI = new Runnable(this) { // from class: bqzc
                    private final bqzm a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bqzm bqzmVar = this.a;
                        if (bqzmVar.aD) {
                            bqzmVar.aZ(brzg.g(bqzmVar.q().o));
                        }
                    }
                };
                this.bJ = new Runnable(this) { // from class: bqzd
                    private final bqzm a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ilo c;
                        bqzm bqzmVar = this.a;
                        if (bqzmVar.aD) {
                            gga ggaVar = bqzmVar.aE;
                            bwrs<ilo> r = bqzmVar.q().r();
                            if (!bqzmVar.aD || ggaVar == null || r == null || (c = r.c()) == null) {
                                return;
                            }
                            bqzmVar.ah.J(c, brax.a);
                        }
                    }
                };
                this.bK = new bqze(this);
                bssf bssfVar = this.ao;
                Runnable runnable = this.bJ;
                dbsk.s(runnable);
                bqze bqzeVar = this.bK;
                dbsk.s(bqzeVar);
                Runnable runnable2 = this.bI;
                dbsk.s(runnable2);
                boolean bn = bn();
                boolean e3 = i().e();
                if (this.b.getIntent().getBooleanExtra("SearchListFragment.usedPromoQueryParam", false)) {
                    brwwVar = brww.ANY;
                } else {
                    this.b.getIntent().putExtra("SearchListFragment.usedPromoQueryParam", true);
                    brwwVar = brww.ANY;
                }
                amsz amszVar = i().c;
                bsop bsopVar = this.aQ;
                Application a3 = bssfVar.a.a();
                bssf.a(a3, 1);
                bssf.a(bssfVar.b.a(), 2);
                btvo a4 = bssfVar.c.a();
                bssf.a(a4, 3);
                cqat a5 = bssfVar.d.a();
                bssf.a(a5, 4);
                ckcw a6 = bssfVar.e.a();
                bssf.a(a6, 5);
                ckmp a7 = bssfVar.f.a();
                bssf.a(a7, 6);
                cklq a8 = bssfVar.g.a();
                bssf.a(a8, 7);
                btrm a9 = bssfVar.h.a();
                bssf.a(a9, 8);
                bssf.a(runnable, 9);
                bssf.a(bqzeVar, 10);
                bssf.a(runnable2, 11);
                bssf.a(brwwVar, 14);
                bssf.a(bsopVar, 16);
                dzsj<cqg> dzsjVar = bssfVar.i;
                dxio a10 = ((dxjh) bssfVar.j).a();
                bssf.a(a10, 18);
                bnjv a11 = bssfVar.k.a();
                bssf.a(a11, 19);
                bsne a12 = bssfVar.l.a();
                bssf.a(a12, 20);
                bsrg a13 = bssfVar.m.a();
                bssf.a(a13, 21);
                bsrb a14 = bssfVar.n.a();
                bssf.a(a14, 22);
                brwl a15 = bssfVar.o.a();
                bssf.a(a15, 23);
                aeht a16 = bssfVar.p.a();
                bssf.a(a16, 24);
                bsqx a17 = bssfVar.q.a();
                bssf.a(a17, 25);
                dxio a18 = ((dxjh) bssfVar.r).a();
                bssf.a(a18, 26);
                bssf.a(((dxjh) bssfVar.s).a(), 27);
                dxio a19 = ((dxjh) bssfVar.t).a();
                bssf.a(a19, 28);
                bssf.a(bssfVar.u.a(), 29);
                jkf a20 = bssfVar.v.a();
                bssf.a(a20, 30);
                bssf.a(bssfVar.w.a(), 31);
                cvv a21 = bssfVar.x.a();
                bssf.a(a21, 32);
                brwx a22 = bssfVar.y.a();
                bssf.a(a22, 33);
                bsrd a23 = bssfVar.z.a();
                bssf.a(a23, 34);
                bsqr a24 = bssfVar.A.a();
                bssf.a(a24, 35);
                dehq a25 = bssfVar.B.a();
                bssf.a(a25, 36);
                dehq a26 = bssfVar.C.a();
                bssf.a(a26, 37);
                cjqy a27 = bssfVar.D.a();
                bssf.a(a27, 38);
                bvpz a28 = bssfVar.E.a();
                bssf.a(a28, 39);
                brlk a29 = bssfVar.F.a();
                bssf.a(a29, 40);
                bsseVar = new bsse(a3, a4, a5, a6, a7, a8, a9, runnable, bqzeVar, runnable2, bn, e3, brwwVar, amszVar, bsopVar, dzsjVar, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29);
            }
            this.bs = bsseVar;
            brck brckVar = this.aw;
            brci brciVar = this.bu;
            ff ffVar = (ff) ((dxjd) brckVar.a).a;
            brck.a(ffVar, 1);
            dxio a30 = ((dxjh) brckVar.b).a();
            brck.a(a30, 2);
            dzsj<vox> dzsjVar2 = brckVar.c;
            brck.a(brckVar.d.a(), 4);
            akpm a31 = brckVar.e.a();
            brck.a(a31, 5);
            gll a32 = brckVar.f.a();
            brck.a(a32, 6);
            brbx a33 = brckVar.g.a();
            brck.a(a33, 7);
            brcf a34 = brckVar.h.a();
            brck.a(a34, 8);
            brba a35 = brckVar.i.a();
            brck.a(a35, 9);
            cjqy a36 = brckVar.j.a();
            brck.a(a36, 10);
            brlk a37 = brckVar.k.a();
            brck.a(a37, 11);
            brck.a(brciVar, 12);
            this.bj = new brcj(ffVar, a30, dzsjVar2, a31, a32, a33, a34, a35, a36, a37, brciVar);
            if (aX()) {
                this.bq = this.az.a();
            }
            if (this.d.a() && this.d.b().a()) {
                this.bA = this.d.b().d(this);
            }
            bsoj bsojVar = this.at;
            brcj brcjVar = this.bj;
            dbsk.s(brcjVar);
            iqx iqxVar = i().a.d;
            dro droVar = this.bA;
            brmk brmkVar = this.bq;
            bsop bsopVar2 = this.aQ;
            Activity activity = (Activity) ((dxjd) bsojVar.a).a;
            bsoj.a(activity, 1);
            Application a38 = bsojVar.b.a();
            bsoj.a(a38, 2);
            cqhn a39 = bsojVar.c.a();
            bsoj.a(a39, 3);
            btrm a40 = bsojVar.d.a();
            bsoj.a(a40, 4);
            btvo a41 = bsojVar.e.a();
            bsoj.a(a41, 5);
            ghl a42 = bsojVar.f.a();
            bsoj.a(a42, 6);
            ghx a43 = bsojVar.g.a();
            bsoj.a(a43, 7);
            alhv a44 = bsojVar.h.a();
            bsoj.a(a44, 8);
            cqkj a45 = bsojVar.i.a();
            bsoj.a(a45, 9);
            cjqy a46 = bsojVar.j.a();
            bsoj.a(a46, 10);
            cjqq a47 = bsojVar.k.a();
            bsoj.a(a47, 11);
            brat a48 = bsojVar.l.a();
            bsoj.a(a48, 12);
            ckmp a49 = bsojVar.m.a();
            bsoj.a(a49, 13);
            bsod a50 = bsojVar.n.a();
            bsoj.a(a50, 14);
            bsoh a51 = bsojVar.o.a();
            bsoj.a(a51, 15);
            dxio a52 = ((dxjh) bsojVar.p).a();
            bsoj.a(a52, 16);
            dxio a53 = ((dxjh) bsojVar.q).a();
            bsoj.a(a53, 17);
            gle a54 = bsojVar.r.a();
            bsoj.a(a54, 18);
            bdyl a55 = bsojVar.s.a();
            bsoj.a(a55, 19);
            dxio a56 = ((dxjh) bsojVar.t).a();
            bsoj.a(a56, 20);
            bsoj.a(((dxjh) bsojVar.u).a(), 21);
            brlk a57 = bsojVar.v.a();
            bsoj.a(a57, 22);
            brvv a58 = bsojVar.w.a();
            bsoj.a(a58, 23);
            bsoj.a(brcjVar, 24);
            bsoj.a(iqxVar, 25);
            bsoj.a(bsopVar2, 28);
            bsoi bsoiVar = new bsoi(activity, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, a53, a54, a55, a56, a57, a58, brcjVar, iqxVar, droVar, brmkVar, bsopVar2, null);
            this.bt = bsoiVar;
            if (bundle != null) {
                bsoiVar.G = bundle.getBoolean("isTraversalVisible");
            }
            if (bundle != null) {
                this.be = bundle.getBoolean("disableTwoThirdsState");
                this.bE = (jjn) bundle.getSerializable("initialExpandingStateForBackPress");
                brmc brmcVar = this.bh;
                if (brmcVar != null) {
                    brmcVar.a = bundle.getInt("listViewFirstPosition");
                    brmcVar.b = bundle.getInt("listViewFirstPositionScroll");
                }
                brcj brcjVar2 = this.bj;
                if (brcjVar2 != null) {
                    brcjVar2.e = bundle.getBoolean("isMapInTwoThirdsViewport");
                }
            }
            if (bu()) {
                afwo l = this.aP.a().l();
                this.bw = l.d(afwm.TRANSIT);
                this.bx = l.d(afwm.TRAFFIC);
                this.by = l.d(afwm.BICYCLING);
                this.aP.a().l().c(afwm.TRANSIT, true);
            }
            if (bundle == null && (aF = (q = q()).aF()) != 0) {
                ((ckco) this.e.a(q.d ? ckjw.b : ckjw.a)).a(aF - 1);
                this.aC.b();
            }
            this.bg = new gek(J(), this, this.ai);
        } catch (IOException | NullPointerException e4) {
            this.bd = false;
            bvoo.h("Corrupt storage data: %s", e4);
            gga ggaVar = this.aE;
            if (ggaVar != null) {
                cjxu.j(ggaVar, this.ak, Rp(R.string.UNKNOWN_ERROR));
            }
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.g(bc(), 1);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        brca brcaVar = this.bf;
        if (brcaVar != null) {
            brcaVar.e.l(configuration);
        }
        bsoi bsoiVar = this.bt;
        if (bsoiVar != null) {
            bsoiVar.b(configuration.orientation);
            bsrl bsrlVar = this.bk;
            if (bsrlVar != null) {
                bsrlVar.av(aR());
            }
        }
        iwg iwgVar = this.ba;
        if (iwgVar != null) {
            iwgVar.k();
        }
        this.bs.v();
        brcj brcjVar = this.bj;
        if (brcjVar != null) {
            brcjVar.b(this.ai.l().L());
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.aM;
    }

    public final brlu q() {
        brlu c = this.bB.c();
        dbsk.s(c);
        return c;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        gga ggaVar;
        jjn jjnVar;
        bqzm bqzmVar;
        gga ggaVar2;
        ?? r2;
        gga ggaVar3;
        boolean z;
        int i;
        int i2;
        brmt a2;
        amml ammlVar;
        brcj brcjVar;
        super.s();
        if (this.bd) {
            gga ggaVar4 = this.aE;
            dbsk.s(ggaVar4);
            if (ggaVar4.I()) {
                return;
            }
            brcj brcjVar2 = this.bj;
            if (brcjVar2 != null) {
                bsrl bsrlVar = this.bk;
                brcjVar2.g = false;
                if (brcjVar2.h && brcjVar2.f == null) {
                    brcjVar2.f = brcjVar2.a.a(brcjVar2.c, brcjVar2.d, bsrlVar, brcjVar2.j);
                }
                if (brcjVar2.i == null) {
                    brcf brcfVar = brcjVar2.b;
                    bwrs<brln> bwrsVar = brcjVar2.c;
                    bwrs<brlu> bwrsVar2 = brcjVar2.d;
                    brbw brbwVar = brcjVar2.f;
                    brbo brboVar = brcjVar2.j;
                    Activity activity = (Activity) ((dxjd) brcfVar.a).a;
                    brcf.a(activity, 1);
                    btvo a3 = brcfVar.b.a();
                    brcf.a(a3, 2);
                    broq a4 = brcfVar.c.a();
                    brcf.a(a4, 3);
                    akox a5 = brcfVar.d.a();
                    brcf.a(a5, 4);
                    aehr a6 = brcfVar.e.a();
                    brcf.a(a6, 5);
                    dzsj<aeht> dzsjVar = brcfVar.f;
                    ggaVar = ggaVar4;
                    brdi a7 = brcfVar.g.a();
                    brcf.a(a7, 7);
                    brcs a8 = brcfVar.h.a();
                    brcf.a(a8, 8);
                    jkj a9 = brcfVar.i.a();
                    brcf.a(a9, 9);
                    braw a10 = brcfVar.j.a();
                    brcf.a(a10, 10);
                    brcf.a(bwrsVar, 11);
                    brcf.a(bwrsVar2, 12);
                    brcf.a(brboVar, 14);
                    brmt a11 = brcfVar.k.a();
                    brcf.a(a11, 16);
                    brce brceVar = new brce(activity, a3, a4, a5, a6, dzsjVar, a7, a8, a9, a10, bwrsVar, bwrsVar2, brbwVar, bsrlVar, a11);
                    brcjVar2 = brcjVar2;
                    brcjVar2.i = brceVar;
                } else {
                    ggaVar = ggaVar4;
                }
                brce brceVar2 = brcjVar2.i;
                brceVar2.e = true;
                if (brceVar2.e().ah()) {
                    brln d = brceVar2.d();
                    d.f = brceVar2;
                    brceVar2.a.a(d);
                }
                brcjVar2.i.d = brcjVar2.e;
            } else {
                ggaVar = ggaVar4;
            }
            gek gekVar = this.bg;
            dbsk.s(gekVar);
            jjn jjnVar2 = gekVar.c;
            if (jjnVar2 == null) {
                bsoi bsoiVar = this.bt;
                jjnVar2 = ((bsoiVar != null && bsoiVar.G) || new dsrh(this.f.getCategoricalSearchParameters().o().a, dhoe.b).contains(q().ar()) || aX()) ? jjn.HIDDEN : i().a.d == iqx.LIST ? jjn.EXPANDED : jjn.HIDDEN;
            }
            if (br() && jjnVar2 == jjn.EXPANDED) {
                jjnVar2 = jjn.FULLY_EXPANDED;
            }
            jjn jjnVar3 = jjnVar2;
            if (this.bE == null) {
                this.bE = jjnVar3;
            }
            gek gekVar2 = this.bg;
            dbsk.s(gekVar2);
            gekVar2.c = jjnVar3;
            bsrl bsrlVar2 = this.bk;
            if (bsrlVar2 != null) {
                if ((bsrlVar2.as() || aX()) && this.bf == null && (brcjVar = this.bj) != null) {
                    brcb brcbVar = this.af;
                    brce brceVar3 = brcjVar.i;
                    dbsk.s(brceVar3);
                    brzd brzdVar = this.bH;
                    bsoi bsoiVar2 = this.bt;
                    brat a12 = brcbVar.a.a();
                    brcb.a(a12, 1);
                    gga a13 = brcbVar.b.a();
                    brcb.a(a13, 2);
                    bwqv a14 = brcbVar.c.a();
                    brcb.a(a14, 3);
                    aehr a15 = brcbVar.d.a();
                    brcb.a(a15, 4);
                    dzsj<aeht> dzsjVar2 = brcbVar.e;
                    bsma a16 = brcbVar.f.a();
                    brcb.a(a16, 6);
                    dxio a17 = ((dxjh) brcbVar.g).a();
                    brcb.a(a17, 7);
                    dxio a18 = ((dxjh) brcbVar.h).a();
                    brcb.a(a18, 8);
                    dxio a19 = ((dxjh) brcbVar.i).a();
                    brcb.a(a19, 9);
                    brlk a20 = brcbVar.j.a();
                    brcb.a(a20, 10);
                    brcb.a(brceVar3, 11);
                    brcb.a(brzdVar, 12);
                    brcb.a(bsoiVar2, 13);
                    brcb.a(this, 14);
                    jjnVar = jjnVar3;
                    ggaVar2 = ggaVar;
                    brca brcaVar = new brca(a12, a13, a14, a15, dzsjVar2, a16, a17, a18, a19, a20, brceVar3, brzdVar, bsoiVar2, this);
                    bqzmVar = this;
                    bqzmVar.bf = brcaVar;
                    bqzmVar.bs.c(brcaVar);
                } else {
                    jjnVar = jjnVar3;
                    bqzmVar = this;
                    ggaVar2 = ggaVar;
                }
                brca brcaVar2 = bqzmVar.bf;
                if (brcaVar2 != null) {
                    brcaVar2.c.g(brcaVar2.f, brcaVar2.a);
                    brcaVar2.e.g(brcaVar2);
                    r2 = 1;
                    brcaVar2.b = true;
                    bp();
                } else {
                    r2 = 1;
                }
            } else {
                jjnVar = jjnVar3;
                bqzmVar = this;
                ggaVar2 = ggaVar;
                r2 = 1;
            }
            iwg iwgVar = bqzmVar.ba;
            if (iwgVar != null) {
                iwgVar.k();
            }
            if (bqzmVar.bm) {
                ggaVar3 = ggaVar2;
                brla.a(bqzmVar.bb, ggaVar3);
            } else {
                ggaVar3 = ggaVar2;
                brla.b(bqzmVar.bb, ggaVar3);
            }
            if (bqzmVar.am.a() != null) {
                bqzmVar.am.a().i(dvum.SEARCH_MAP, i().e.N());
            }
            brmc brmcVar = bqzmVar.bh;
            if (brmcVar != null) {
                brmcVar.a();
            }
            brcj brcjVar3 = bqzmVar.bj;
            if (brcjVar3 != null) {
                brcjVar3.b(jjnVar);
            }
            cqkf<jbk> cqkfVar = bqzmVar.aZ;
            if (cqkfVar != null) {
                cqkfVar.e(bqzmVar.aT(ggaVar3));
            }
            bqzmVar.ap.a().e(bqzmVar);
            bsoi bsoiVar3 = bqzmVar.bt;
            if (bsoiVar3 != null) {
                btrm btrmVar = bsoiVar3.j;
                dceq a21 = dcet.a();
                z = false;
                z = false;
                a21.b(bsnp.class, new bsok(0, bsnp.class, bsoiVar3, bvrj.UI_THREAD));
                bvrj bvrjVar = bvrj.UI_THREAD;
                int i3 = r2 == true ? 1 : 0;
                int i4 = r2 == true ? 1 : 0;
                int i5 = r2 == true ? 1 : 0;
                a21.b(ardp.class, new bsok(i3, ardp.class, bsoiVar3, bvrjVar));
                i = 2;
                a21.b(alhl.class, new bsok(2, alhl.class, bsoiVar3, bvrj.UI_THREAD));
                i2 = 3;
                a21.b(alhx.class, new bsok(3, alhx.class, bsoiVar3, bvrj.UI_THREAD));
                a21.b(alhw.class, new bsok(4, alhw.class, bsoiVar3, bvrj.UI_THREAD));
                btrmVar.g(bsoiVar3, a21.a());
                bsoiVar3.g.b(bsoiVar3.J);
                dbsg<ilo> dbsgVar = i().a.h;
                if (dbsgVar.a()) {
                    bqzmVar.g(dbsgVar.b());
                    i().a.h = dbpy.a;
                }
            } else {
                z = false;
                i = 2;
                i2 = 3;
            }
            if (aX()) {
                bqzmVar.aB.b();
                brmk brmkVar = bqzmVar.bq;
                if (brmkVar != null) {
                    btrm btrmVar2 = brmkVar.b;
                    dceq a22 = dcet.a();
                    bvrj bvrjVar2 = bvrj.UI_THREAD;
                    int i6 = z ? 1 : 0;
                    int i7 = z ? 1 : 0;
                    int i8 = z ? 1 : 0;
                    a22.b(ardp.class, new brml(i6, ardp.class, brmkVar, bvrjVar2));
                    a22.b(alhl.class, new brml(r2, alhl.class, brmkVar, bvrj.UI_THREAD));
                    a22.b(alhw.class, new brml(i, alhw.class, brmkVar, bvrj.UI_THREAD));
                    a22.b(alhx.class, new brml(i2, alhx.class, brmkVar, bvrj.UI_THREAD));
                    btrmVar2.g(brmkVar, a22.a());
                    brmkVar.a.T().d(brmkVar, brmkVar.c);
                    bqzmVar.bq.b().a(bqzmVar.aO.a(), bqzmVar.aW);
                    bqzmVar.bq.b().a(bqzmVar.aR, bqzmVar.aW);
                }
                brmt a23 = bqzmVar.aO.a();
                brln i9 = i();
                bsrl bsrlVar3 = bqzmVar.bk;
                dbsk.s(bsrlVar3);
                a23.g = bsrlVar3;
                a23.f = bqzmVar.aU.a();
                brat bratVar = a23.c;
                dfpo l = i9.l();
                dbsk.s(l);
                a23.b(l);
                a23.d();
                final brca brcaVar3 = bqzmVar.bf;
                if (brcaVar3 != null && brcaVar3.l) {
                    cryz<dhym> cryzVar = brcaVar3.n;
                    if (cryzVar != null) {
                        cryzVar.c();
                    }
                    brcaVar3.n = new cryz<>(bvqj.b(new bvqg(brcaVar3) { // from class: brby
                        private final brca a;

                        {
                            this.a = brcaVar3;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            djnk djnkVar;
                            brca brcaVar4 = this.a;
                            dhym dhymVar = (dhym) obj;
                            if (dhymVar == null) {
                                return;
                            }
                            bsjm bsjmVar = new bsjm();
                            for (dhyl dhylVar : dhymVar.b) {
                                if (dhylVar.a == 14) {
                                    djnkVar = (djnk) dhylVar.b;
                                } else {
                                    djnkVar = djnk.f;
                                }
                                bsjmVar.a(djnkVar);
                            }
                            brlu c = brcaVar4.f.c();
                            if (c != null) {
                                c.o = bsjmVar;
                                brcaVar4.f.d(c);
                            }
                            brcaVar4.e.k(bsjmVar);
                        }
                    }));
                    dhnu bZ = dhnv.c.bZ();
                    dpvf dpvfVar = brcaVar3.m;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = z;
                    }
                    dhnv dhnvVar = (dhnv) bZ.b;
                    dhnvVar.b = dpvfVar.an;
                    int i10 = dhnvVar.a;
                    int i11 = r2 == true ? 1 : 0;
                    char c = r2 == true ? 1 : 0;
                    char c2 = r2 == true ? 1 : 0;
                    dhnvVar.a = i10 | i11;
                    dhnv bK = bZ.bK();
                    abfg a24 = brcaVar3.i.a();
                    dhjx aa = brcaVar3.j.a().aa();
                    dhyg bZ2 = dhyh.k.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = z;
                    }
                    dhyh dhyhVar = (dhyh) bZ2.b;
                    dhyhVar.d = 9;
                    int i12 = dhyhVar.a | 8;
                    dhyhVar.a = i12;
                    aa.getClass();
                    dhyhVar.b = aa;
                    dhyhVar.a = i12 | 2;
                    dnwb a25 = a24.a.a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = z;
                    }
                    dhyh dhyhVar2 = (dhyh) bZ2.b;
                    a25.getClass();
                    dhyhVar2.e = a25;
                    int i13 = dhyhVar2.a | 16;
                    dhyhVar2.a = i13;
                    bK.getClass();
                    dhyhVar2.j = bK;
                    dhyhVar2.a = i13 | 2048;
                    deha.q(a24.a(bZ2.bK()), brcaVar3.n, brcaVar3.k.a());
                }
            }
            if (bqzmVar.ay.a() && (ammlVar = (a2 = bqzmVar.aO.a()).h) != null) {
                a2.b.P("DARK_LAUNCH_LAYER", ammlVar, z);
            }
            bqzmVar.bv = r2;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.aj.c(bundle, "SearchListFragment.searchRequestRef", this.bc);
        this.aj.c(bundle, "SearchListFragment.searchResultRef", this.bB);
        bundle.putBoolean("disableTwoThirdsState", this.be);
        bsoi bsoiVar = this.bt;
        if (bsoiVar != null) {
            bundle.putBoolean("isTraversalVisible", bsoiVar.G);
        }
        jjn jjnVar = this.bE;
        if (jjnVar != null) {
            bundle.putSerializable("initialExpandingStateForBackPress", jjnVar);
        }
        brmc brmcVar = this.bh;
        if (brmcVar != null) {
            bundle.putInt("listViewFirstPosition", brmcVar.a);
            bundle.putInt("listViewFirstPositionScroll", brmcVar.b);
        }
        brcj brcjVar = this.bj;
        if (brcjVar != null) {
            bundle.putBoolean("isMapInTwoThirdsViewport", brcjVar.e);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jjn L;
        bsoi bsoiVar;
        if (!this.bd || !this.bv) {
            super.u();
            return;
        }
        this.aX.cancel(false);
        bsoi bsoiVar2 = this.bt;
        boolean z = bsoiVar2 != null && bsoiVar2.G && !bs();
        gek gekVar = this.bg;
        dbsk.s(gekVar);
        if (z) {
            L = jjn.HIDDEN;
        } else {
            L = this.ai.l().L();
        }
        gekVar.c = L;
        iwg iwgVar = this.ba;
        dbsk.s(iwgVar);
        boolean j = iwgVar.j();
        brmc brmcVar = this.bh;
        if (brmcVar != null) {
            if (!j || (bsoiVar = brmcVar.d) == null || !bsoiVar.G) {
                brmcVar.a = brmcVar.h();
            } else {
                brmcVar.c();
            }
        }
        brcj brcjVar = this.bj;
        if (brcjVar != null) {
            brcjVar.a();
        }
        brca brcaVar = this.bf;
        if (brcaVar != null && brcaVar.b) {
            bwqv.t(brcaVar.f, brcaVar.a);
            brcaVar.e.g(null);
            brcaVar.b = false;
        }
        bsoi bsoiVar3 = this.bt;
        if (bsoiVar3 != null) {
            bsoiVar3.g.c(bsoiVar3.J);
            bsoiVar3.j.a(bsoiVar3);
        }
        this.ap.a().f(this);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.bb;
        if (extendedFloatingActionButton != null) {
            this.bm = extendedFloatingActionButton.l;
        }
        if (aX()) {
            this.aB.a();
            brmk brmkVar = this.bq;
            if (brmkVar != null) {
                brmkVar.b.a(brmkVar);
                brmkVar.a.T().c(brmkVar);
                this.bq.b().c(this.aO.a());
                this.bq.b().c(this.aR);
            }
            this.aO.a().c();
        }
        if (this.ay.a()) {
            brmt a2 = this.aO.a();
            if (a2.h != null) {
                a2.b.Q("DARK_LAUNCH_LAYER");
            }
        }
        this.bv = false;
        super.u();
    }

    public final void w(final brlu brluVar) {
        if (aX()) {
            dehn<Boolean> c = this.aV.c(new Callable(this, brluVar) { // from class: bqzf
                private final bqzm a;
                private final brlu b;

                {
                    this.a = this;
                    this.b = brluVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bqzm bqzmVar = this.a;
                    brlu brluVar2 = this.b;
                    bsse bsseVar = bqzmVar.bs;
                    brln c2 = bqzmVar.bc.c();
                    dbsk.s(c2);
                    bsseVar.a(c2, brluVar2, bqzmVar.bt);
                    bsoi bsoiVar = bqzmVar.bt;
                    if (bsoiVar != null) {
                        bsoiVar.m(bqzmVar.bs, brluVar2);
                    }
                    return true;
                }
            });
            this.aX = c;
            bvqj.c(c, new bvqg(this) { // from class: bqzg
                private final bqzm a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    bqzm bqzmVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (bqzmVar.ai.l().L().b()) {
                        cqkx.p(bqzmVar.bs);
                        return;
                    }
                    bsoi bsoiVar = bqzmVar.bt;
                    if (bsoiVar == null) {
                        return;
                    }
                    bsoiVar.j();
                    if (bsoiVar.G) {
                        ghw ghwVar = bsoiVar.D;
                        dbsk.s(ghwVar);
                        cqkx.p(ghwVar);
                    }
                    bsoiVar.r();
                    if (!bqzmVar.ay.b()) {
                        return;
                    }
                    bqzmVar.bt.k();
                }
            }, this.aW);
            return;
        }
        bsse bsseVar = this.bs;
        brln c2 = this.bc.c();
        dbsk.s(c2);
        bsseVar.a(c2, brluVar, this.bt);
        if (this.bt != null && this.ay.b()) {
            this.bt.k();
        }
        iwg iwgVar = this.ba;
        if (iwgVar == null) {
            return;
        }
        iwgVar.H(brluVar.d() > 0);
    }
}
