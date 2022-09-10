package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxel  reason: default package */
/* loaded from: classes4.dex */
public class bxel extends ges implements egq, egs, bxma {
    private static final dcqe a = dcqe.c("bxel");
    public cqat aA;
    public cqkj aB;
    public efg aC;
    public dzsj<glj> aO;
    @dzsi
    public akpm aP;
    public btvo aQ;
    public gfq aR;
    public btrm aS;
    public bwqv aT;
    public bxen aU;
    public bxps aV;
    public bxqa aW;
    public bxqi aX;
    public cjmt aY;
    public bxoo aZ;
    public acyp az;
    public cklq ba;
    public bxem bc;
    protected bxpr bd;
    public bxqh be;
    protected bxpz bf;
    @dzsi
    private egu c;
    private bxqe d;
    @dzsi
    private bxpy e;
    @dzsi
    private bxql f;
    @dzsi
    private cqkf<bxob> g;
    public final bxko bb = new bxko();
    private final bxkt b = new bxkt();

    private final boolean aR() {
        bxeq aJ = aJ();
        if (aJ != null) {
            return aJ.aN();
        }
        return true;
    }

    public static <S extends fd & bxeq> bxel bt(bwqv bwqvVar, bxko bxkoVar, @dzsi S s) {
        bxel bxelVar = new bxel();
        bxelVar.bu(bwqvVar, bxkoVar, s);
        return bxelVar;
    }

    public static String bx(String str) {
        return dbsj.e(str).trim();
    }

    private final boolean i(@dzsi Bundle bundle) {
        bwqv bwqvVar;
        bxko bxkoVar;
        if (bundle == null || (bwqvVar = this.aT) == null) {
            return false;
        }
        try {
            bxkoVar = (bxko) bwqvVar.d(bxko.class, bundle, "suggest_fragment_state");
        } catch (IOException e) {
            bvoo.h("Corrupt storage data: %s", e);
            bxkoVar = null;
        }
        if (bxkoVar == null) {
            return false;
        }
        this.bb.a(bxkoVar);
        return true;
    }

    @dzsi
    protected View OM() {
        return null;
    }

    protected egf ON() {
        return egf.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void QC(egj egjVar) {
        egjVar.W(this.be);
    }

    protected void QD(egj egjVar) {
    }

    protected void QE(egj egjVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bxob> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.g = null;
        }
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.c = null;
    }

    @Override // defpackage.egs
    public final void Qt() {
        by();
    }

    @dzsi
    protected bxeq aJ() {
        if (!this.o.containsKey("suggest_action_listener")) {
            return null;
        }
        gn gnVar = this.A;
        dbsk.s(gnVar);
        fd o = gnVar.o(this.o, "suggest_action_listener");
        if (o != null && !(o instanceof bxeq)) {
            return null;
        }
        return (bxeq) o;
    }

    @dzsi
    protected bxnw aT() {
        return null;
    }

    @Override // defpackage.fd
    @dzsi
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.bd == null) {
            return null;
        }
        cqkf<bxob> e = this.aB.e(new bxfg());
        this.g = e;
        e.e(this.bd);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public void am() {
        super.am();
        egu eguVar = this.c;
        if (eguVar != null) {
            eguVar.k();
        }
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.SUGGEST_PAGE;
    }

    public final <S extends fd & bxeq> void bu(bwqv bwqvVar, bxko bxkoVar, @dzsi S s) {
        this.bb.a(bxkoVar);
        if (this.bb.b() == bxla.UNKNOWN) {
            bvoo.h("InputSource should not be UNKNOWN", new Object[0]);
        }
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "suggest_fragment_state", this.bb);
        if (s != null) {
            gn gnVar = s.A;
            dbsk.s(gnVar);
            gnVar.n(bundle, "suggest_action_listener", s);
        }
        B(bundle);
    }

    @dzsi
    public final View bv() {
        ff J = J();
        if (J == null) {
            return null;
        }
        return J.findViewById(R.id.search_omnibox_text_box);
    }

    @Override // defpackage.bxma
    public final boolean bw(String str, cjqm cjqmVar) {
        if (this.bc == null) {
            return true;
        }
        String bx = bx(str);
        if (!bx.isEmpty()) {
            this.bc.b(bx, bx.length());
            if (this.bb.r()) {
                this.bc.d(bxkq.SPEECH_RECOGNITION, cjqmVar);
            }
            bxqh bxqhVar = this.be;
            if (bxqhVar != null) {
                bxqhVar.I(bx);
                cqkx.p(this.be);
            }
        }
        return true;
    }

    public final void by() {
        if (this.aD) {
            fd d = this.aR.d();
            if (d instanceof bxel) {
                gfq.l((bxel) d);
            }
            aR();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public boolean e() {
        bxlx a2 = bxlz.a(this);
        if (a2 == null || !a2.d()) {
            return aR();
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (!i(bundle)) {
            i(this.o);
        }
        this.d = new bxei(this);
        this.be = this.aX.a(new bxek(this));
        this.e = new bxeh(this);
        this.f = new bxej(this);
        bxqa bxqaVar = this.aW;
        bxkt bxktVar = this.b;
        bxeq aJ = aJ();
        bxnw aT = aT();
        bxpy bxpyVar = this.e;
        bxql bxqlVar = this.f;
        bxko bxkoVar = this.bb;
        gga a2 = bxqaVar.a.a();
        bxqa.a(a2, 1);
        bxqa.a(bxktVar, 2);
        bxqa.a(bxkoVar, 7);
        btpc a3 = bxqaVar.b.a();
        bxqa.a(a3, 8);
        bxos a4 = bxqaVar.c.a();
        bxqa.a(a4, 9);
        dxio a5 = ((dxjh) bxqaVar.d).a();
        bxqa.a(a5, 10);
        dxio a6 = ((dxjh) bxqaVar.e).a();
        bxqa.a(a6, 11);
        bxqn a7 = bxqaVar.f.a();
        bxqa.a(a7, 12);
        bxpn a8 = bxqaVar.g.a();
        bxqa.a(a8, 13);
        btvo a9 = bxqaVar.h.a();
        bxqa.a(a9, 14);
        cqhn a10 = bxqaVar.i.a();
        bxqa.a(a10, 15);
        dzsj<axws> dzsjVar = bxqaVar.j;
        dzsj<axwq> dzsjVar2 = bxqaVar.k;
        Executor a11 = bxqaVar.l.a();
        bxqa.a(a11, 18);
        bxot a12 = bxqaVar.m.a();
        bxqa.a(a12, 19);
        bxqk a13 = bxqaVar.n.a();
        bxqa.a(a13, 20);
        bxpz bxpzVar = new bxpz(a2, bxktVar, aJ, aT, bxpyVar, bxqlVar, bxkoVar, a3, a4, a5, a6, a7, a8, a9, a10, dzsjVar, dzsjVar2, a11, a12, a13);
        this.bf = bxpzVar;
        bxps bxpsVar = this.aV;
        bxko bxkoVar2 = this.bb;
        bxps.a(bxpzVar, 1);
        bxps.a(bxkoVar2, 2);
        fd fdVar = (fd) ((dxjd) bxpsVar.a).a;
        bxps.a(fdVar, 3);
        dzsj<glj> dzsjVar3 = bxpsVar.b;
        dxio a14 = ((dxjh) bxpsVar.c).a();
        bxps.a(a14, 5);
        this.bd = new bxpr(bxpzVar, bxkoVar2, fdVar, dzsjVar3, a14);
        bxen bxenVar = this.aU;
        bxeq aJ2 = aJ();
        bxkt bxktVar2 = this.b;
        bxko bxkoVar3 = this.bb;
        bxpr bxprVar = this.bd;
        bxqh bxqhVar = this.be;
        bxpz bxpzVar2 = this.bf;
        btvo a15 = bxenVar.a.a();
        bxen.a(a15, 1);
        cqat a16 = bxenVar.b.a();
        bxen.a(a16, 2);
        cqhn a17 = bxenVar.c.a();
        bxen.a(a17, 3);
        akpm a18 = bxenVar.d.a();
        bxen.a(a18, 4);
        bxer a19 = bxenVar.e.a();
        bxen.a(a19, 5);
        cjqy a20 = bxenVar.f.a();
        bxen.a(a20, 6);
        cqhu a21 = bxenVar.g.a();
        bxen.a(a21, 7);
        bxnq a22 = bxenVar.h.a();
        bxen.a(a22, 8);
        bxnt a23 = bxenVar.i.a();
        bxen.a(a23, 9);
        cklq a24 = bxenVar.j.a();
        bxen.a(a24, 10);
        bxen.a(bxktVar2, 12);
        bxen.a(bxkoVar3, 13);
        bxen.a(bxprVar, 14);
        bxen.a(bxqhVar, 15);
        bxen.a(bxpzVar2, 16);
        this.bc = new bxem(a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, aJ2, bxktVar2, bxkoVar3, bxprVar, bxqhVar, bxpzVar2);
    }

    @Override // defpackage.ges
    @dzsi
    public ddho p() {
        bxko bxkoVar = this.bb;
        if (bxkoVar.b() == bxla.START_LOCATION || bxkoVar.b() == bxla.VIA_LOCATION || bxkoVar.b() == bxla.END_LOCATION) {
            return dtxn.er;
        }
        return this.bb.b() == bxla.ADD_A_PLACE_ADDRESS_SELECTOR ? dtya.P : (this.bb.b() == bxla.CATEGORY_SELECTOR || this.bb.b() == bxla.CATEGORY_WITH_PRIVATE_LABELS_SELECTOR) ? dtya.R : dtxy.a;
    }

    protected boolean q() {
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.b.a();
        this.b.b(this.bb.E());
        this.b.d(this.aA);
        if (this.bb.j() == null) {
            akpm akpmVar = this.aP;
            akqs a2 = akpmVar == null ? null : alao.a(akpmVar);
            if (a2 != null) {
                this.bb.k(a2);
            }
        }
        bxem bxemVar = this.bc;
        boolean z = false;
        if (bxemVar != null) {
            btrm btrmVar = this.aS;
            dceq a3 = dcet.a();
            a3.b(bxev.class, new bxeo(0, bxev.class, bxemVar, bvrj.UI_THREAD));
            a3.b(bxeu.class, new bxeo(1, bxeu.class, bxemVar, bvrj.UI_THREAD));
            btrmVar.g(bxemVar, a3.a());
        }
        View view = this.P;
        egf ON = ON();
        ON.m = q();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(view);
        egjVar.x(this.bb.x() ? egr.a : egr.b);
        egjVar.I(this.bb.v());
        egjVar.a.f = jjn.FULLY_EXPANDED;
        egjVar.A(ON);
        egjVar.J(this);
        if (this.az.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        View OM = OM();
        if (OM != null) {
            egjVar.G(OM, 7);
        }
        bxqh bxqhVar = this.be;
        if (bxqhVar != null) {
            bxqe bxqeVar = this.d;
            if (bxqeVar != null) {
                bxqhVar.ai(bxqeVar);
            }
            this.be.I(dbsj.e(this.bb.d()));
            this.be.an(this.bb.y());
            this.be.ao(this.bb.A());
            if (!dbsj.d(this.bb.f())) {
                this.be.aj(this.bb.f());
            }
            bxqh bxqhVar2 = this.be;
            if (OM == null) {
                z = true;
            }
            bxqhVar2.ah(z);
            this.be.T(true);
            QC(egjVar);
        }
        egjVar.L(2);
        QD(egjVar);
        QE(egjVar);
        egu a4 = egjVar.a();
        this.c = a4;
        this.aC.a(a4);
        bxem bxemVar2 = this.bc;
        if (bxemVar2 != null) {
            bxemVar2.c(this.bb.d(), this.bb.d().length());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        bwqv bwqvVar = this.aT;
        if (bwqvVar != null) {
            bwqvVar.c(bundle, "suggest_fragment_state", this.bb);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        if (this.bb.T()) {
            this.aY.i();
        }
        bxem bxemVar = this.bc;
        if (bxemVar != null) {
            this.aS.a(bxemVar);
        }
        bxko bxkoVar = this.bb;
        int i = 1;
        if (true != jmw.c(J())) {
            i = 2;
        }
        bxkoVar.w(i);
        this.aO.a().b();
        super.u();
    }
}
