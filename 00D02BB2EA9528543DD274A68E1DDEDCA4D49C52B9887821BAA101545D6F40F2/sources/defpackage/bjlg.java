package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjlg  reason: default package */
/* loaded from: classes3.dex */
public final class bjlg extends ges {
    private static final dcqe ae = dcqe.c("bjlg");
    public efg a;
    public bjmi ad;
    private cqkf<bjpx> af;
    private bjpx ag;
    private int ah;
    public cqkj b;
    public bwqv c;
    public akfa d;
    public Executor e;
    public bjqd f;
    public bjmj g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.getWindow().setSoftInputMode(this.ah);
        }
        super.Qd();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bjpx> cqkfVar;
        super.Qe();
        if (this.ag == null || (cqkfVar = this.af) == null) {
            return;
        }
        cqkfVar.e(null);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        bjmi bjmiVar;
        if (!(obj instanceof bjhv) || (bjmiVar = this.ad) == null) {
            return;
        }
        bjmiVar.j(((bjhv) obj).b);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        this.ah = activity.getWindow().getAttributes().softInputMode;
        activity.getWindow().setSoftInputMode(16);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkj cqkjVar = this.b;
        dbsk.s(cqkjVar);
        cqkf<bjpx> d = cqkjVar.d(new bjpw(), viewGroup, false);
        this.af = d;
        d.e(this.ag);
        return this.af.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        ilo iloVar;
        super.l(bundle);
        try {
            bwqv bwqvVar = this.c;
            dbsk.s(bwqvVar);
            bwrs e = bwqvVar.e(ilo.class, this.o, "placemark_ref");
            dbsk.s(e);
            iloVar = (ilo) e.c();
            dbsk.s(iloVar);
        } catch (IOException unused) {
            bvoo.h("TerraSingleQuestionPageFragment cannot be created without a placemark", new Object[0]);
            iloVar = null;
        }
        ilo iloVar2 = iloVar;
        bjga bjgaVar = (bjga) bvrs.e(this.o, bjga.class, (dssr) bjga.d.cu(7));
        if (bjgaVar == null) {
            bvoo.h("Unable to get questionBundle from saved bundle.", new Object[0]);
        }
        bjmj bjmjVar = this.g;
        akfa akfaVar = this.d;
        dbsk.s(akfaVar);
        btlu j = akfaVar.j();
        dbsk.s(iloVar2);
        dbsk.s(bjgaVar);
        bjmj.a(j, 1);
        bjmj.a(iloVar2, 2);
        bjmj.a(bjgaVar, 3);
        bjmj.a(this, 4);
        gga a = bjmjVar.a.a();
        bjmj.a(a, 5);
        btrm a2 = bjmjVar.b.a();
        bjmj.a(a2, 6);
        bwqv a3 = bjmjVar.c.a();
        bjmj.a(a3, 7);
        Resources a4 = bjmjVar.d.a();
        bjmj.a(a4, 8);
        bveo a5 = bjmjVar.e.a();
        bjmj.a(a5, 9);
        bvfk a6 = bjmjVar.f.a();
        bjmj.a(a6, 10);
        bvff a7 = bjmjVar.g.a();
        bjmj.a(a7, 11);
        bvfc a8 = bjmjVar.h.a();
        bjmj.a(a8, 12);
        bjgi a9 = bjmjVar.i.a();
        bjmj.a(a9, 13);
        bjhc a10 = bjmjVar.j.a();
        bjmj.a(a10, 14);
        bjlm a11 = bjmjVar.k.a();
        bjmj.a(a11, 15);
        dxio a12 = ((dxjh) bjmjVar.l).a();
        bjmj.a(a12, 16);
        dxio a13 = ((dxjh) bjmjVar.m).a();
        bjmj.a(a13, 17);
        dxio a14 = ((dxjh) bjmjVar.n).a();
        bjmj.a(a14, 18);
        dxio a15 = ((dxjh) bjmjVar.o).a();
        bjmj.a(a15, 19);
        dxio a16 = ((dxjh) bjmjVar.p).a();
        bjmj.a(a16, 20);
        dxio a17 = ((dxjh) bjmjVar.q).a();
        bjmj.a(a17, 21);
        chht a18 = bjmjVar.r.a();
        bjmj.a(a18, 22);
        Executor a19 = bjmjVar.s.a();
        bjmj.a(a19, 23);
        bjmi bjmiVar = new bjmi(j, iloVar2, bjgaVar, this, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19);
        this.ad = bjmiVar;
        bjqd bjqdVar = this.f;
        crzn<bjml> crznVar = bjmiVar.t.a;
        bjqd.a(bjmiVar, 1);
        bjqd.a(crznVar, 2);
        gga a20 = bjqdVar.a.a();
        bjqd.a(a20, 3);
        Resources a21 = bjqdVar.b.a();
        bjqd.a(a21, 4);
        bjqd.a(bjqdVar.c.a(), 5);
        dxio a22 = ((dxjh) bjqdVar.d).a();
        bjqd.a(a22, 6);
        bjph a23 = bjqdVar.e.a();
        bjqd.a(a23, 7);
        bjnh a24 = bjqdVar.f.a();
        bjqd.a(a24, 8);
        bjqd.a(bjqdVar.g.a(), 9);
        bjqd.a(bjqdVar.h.a(), 10);
        cchz a25 = bjqdVar.i.a();
        bjqd.a(a25, 11);
        Executor a26 = bjqdVar.j.a();
        bjqd.a(a26, 12);
        this.ag = new bjqc(bjmiVar, crznVar, a20, a21, a22, a23, a24, a25, a26);
        akfa akfaVar2 = this.d;
        dbsk.s(akfaVar2);
        akfaVar2.C().e(new crzp(this) { // from class: bjlf
            private final bjlg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                bjmi bjmiVar2;
                bjlg bjlgVar = this.a;
                btlu btluVar = (btlu) crzmVar.l();
                if (btluVar == null || (bjmiVar2 = bjlgVar.ad) == null) {
                    return;
                }
                bjmiVar2.o(btluVar);
            }
        }, this.e);
        bjmi bjmiVar2 = this.ad;
        if (bjmiVar2.q.a()) {
            return;
        }
        bjmiVar2.g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.a;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bwqv bwqvVar = this.c;
        dbsk.s(bwqvVar);
        bjmi bjmiVar = this.ad;
        dbsk.s(bjmiVar);
        bwqvVar.c(bundle, "placemark_ref", bwrs.a(bjmiVar.p));
        bjmi bjmiVar2 = this.ad;
        dbsk.s(bjmiVar2);
        bjfx bZ = bjga.d.bZ();
        bjfs bjfsVar = bjmiVar2.o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjga bjgaVar = (bjga) bZ.b;
        bjfsVar.getClass();
        bjgaVar.b = bjfsVar;
        int i = bjgaVar.a | 1;
        bjgaVar.a = i;
        bjfz bjfzVar = bjmiVar2.s;
        bjfzVar.getClass();
        bjgaVar.c = bjfzVar;
        bjgaVar.a = i | 2;
        bvrs.l(bundle, bZ.bK());
    }
}
