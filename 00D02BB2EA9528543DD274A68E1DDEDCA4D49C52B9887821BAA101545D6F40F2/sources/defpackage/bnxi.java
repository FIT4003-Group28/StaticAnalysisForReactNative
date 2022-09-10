package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnxi  reason: default package */
/* loaded from: classes3.dex */
public final class bnxi extends bfdp {
    @dzsi
    ilo a;
    public bmdb ae;
    public bnxn af;
    @dzsi
    public gga ag;
    public cqkj ah;
    public bwqv ai;
    public cpv aj;
    public bmdc ak;
    public bnxo al;
    public btrm am;
    public Executor an;
    public buqp ao;
    @dzsi
    private dnqb ap;
    private cqkf<bmcv> ar;
    private jfr as;
    @dzsi
    bmcn b;
    @dzsi
    bmcp c;
    @dzsi
    public dodk g;
    final begr ad = new bnxf(this);
    private final bnxh aq = new bnxh(this);

    @Override // defpackage.ges
    public final void Nv() {
        ((bnxj) btsx.b(bnxj.class, this)).cY(this);
    }

    public final void aJ(ilo iloVar) {
        dvzi dvziVar = (dvzi) dvzj.y.bZ();
        String o = iloVar.ai().o();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar = (dvzj) dvziVar.b;
        o.getClass();
        dvzjVar.a |= 1;
        dvzjVar.b = o;
        String y = iloVar.y();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar2 = (dvzj) dvziVar.b;
        y.getClass();
        dvzjVar2.a |= 2;
        dvzjVar2.c = y;
        dhjx ak = iloVar.ak();
        if (ak != null) {
            if (dvziVar.c) {
                dvziVar.bF();
                dvziVar.c = false;
            }
            dvzj dvzjVar3 = (dvzj) dvziVar.b;
            ak.getClass();
            dvzjVar3.e = ak;
            dvzjVar3.a |= 8;
        }
        dnyc bZ = dnzj.Z.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnzj.f((dnzj) bZ.b);
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar4 = (dvzj) dvziVar.b;
        dnzj bK = bZ.bK();
        bK.getClass();
        dvzjVar4.m = bK;
        dvzjVar4.a |= 16384;
        doba bZ2 = dobd.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dobd dobdVar = (dobd) bZ2.b;
        dobdVar.a |= 1;
        dobdVar.b = true;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar5 = (dvzj) dvziVar.b;
        dobd bK2 = bZ2.bK();
        bK2.getClass();
        dvzjVar5.q = bK2;
        dvzjVar5.a |= ImageMetadata.SHADING_MODE;
        bgej bgejVar = new bgej((dvzj) dvziVar.bK(), this.ad);
        this.ao.a(bgejVar.a, new bnxg(bgejVar), bvrj.UI_THREAD);
    }

    public final void aR() {
        dodk dodkVar = this.g;
        dbsk.s(dodkVar);
        bmcn bmcnVar = new bmcn(dodkVar, this.c);
        this.b = bmcnVar;
        bmdb bmdbVar = this.ae;
        dbsk.s(bmcnVar);
        bmdbVar.f(bmcnVar);
        this.ar.e(this.ae);
        bnxn bnxnVar = this.af;
        bmcn bmcnVar2 = this.b;
        dbsk.s(bmcnVar2);
        dnip bZ = dniu.i.bZ();
        ilo iloVar = this.a;
        dbsk.s(iloVar);
        String o = iloVar.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dniu dniuVar = (dniu) bZ.b;
        o.getClass();
        dniuVar.a |= 1;
        dniuVar.b = o;
        ilo iloVar2 = this.a;
        dbsk.s(iloVar2);
        String y = iloVar2.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dniu dniuVar2 = (dniu) bZ.b;
        y.getClass();
        dniuVar2.a |= 4;
        dniuVar2.d = y;
        ilo iloVar3 = this.a;
        dbsk.s(iloVar3);
        dhjx ak = iloVar3.ak();
        if (ak != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dniu dniuVar3 = (dniu) bZ.b;
            ak.getClass();
            dniuVar3.e = ak;
            dniuVar3.a |= 16;
        }
        ilo iloVar4 = this.a;
        dbsk.s(iloVar4);
        bnxnVar.c(bmcnVar2, bZ.bK(), iloVar4.n());
        this.as.c.e(this.af);
    }

    public final void aS() {
        gn gnVar = this.A;
        if (gnVar != null) {
            gnVar.f();
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        bnxo bnxoVar = this.al;
        dnqb dnqbVar = this.ap;
        dbsk.s(dnqbVar);
        bnxo.a(dnqbVar, 1);
        bnxb a = bnxoVar.a.a();
        bnxo.a(a, 2);
        gga a2 = bnxoVar.b.a();
        bnxo.a(a2, 3);
        dxio a3 = ((dxjh) bnxoVar.c).a();
        bnxo.a(a3, 4);
        cjqy a4 = bnxoVar.d.a();
        bnxo.a(a4, 5);
        this.af = new bnxn(dnqbVar, a, a2, a3, a4);
        this.as = new jfr(J(), this.af);
        bmdc bmdcVar = this.ak;
        bnxn bnxnVar = this.af;
        bmdc.a(bnxnVar, 1);
        Resources a5 = bmdcVar.a.a();
        bmdc.a(a5, 2);
        ff ffVar = (ff) ((dxjd) bmdcVar.b).a;
        bmdc.a(ffVar, 3);
        btvo a6 = bmdcVar.c.a();
        bmdc.a(a6, 4);
        this.ae = new bmdb(bnxnVar, a5, ffVar, a6);
        cqkf<bmcv> c = this.ah.c(new bmcl(), null);
        this.ar = c;
        c.e(this.ae);
        if (Build.VERSION.SDK_INT >= 28) {
            this.ar.c().setAccessibilityPaneTitle(this.af.NC().u);
        } else {
            new Handler().postDelayed(new Runnable(this) { // from class: bnxc
                private final bnxi a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bnxi bnxiVar = this.a;
                    cpv cpvVar = bnxiVar.aj;
                    gga ggaVar = bnxiVar.ag;
                    dbsk.s(ggaVar);
                    cpvVar.b(ggaVar.findViewById(16908290), bnxiVar.af.NC().u);
                }
            }, 500L);
        }
        return this.ar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.ar.e(null);
        this.am.a(this.aq);
        super.am();
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        return this.ar.c();
    }

    @Override // defpackage.bfdp, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        btrm btrmVar = this.am;
        bnxh bnxhVar = this.aq;
        dceq a = dcet.a();
        a.b(bmbt.class, new bnxk(bmbt.class, bnxhVar, bvrj.UI_THREAD));
        btrmVar.g(bnxhVar, a.a());
        try {
            this.ap = (dnqb) this.ai.d(dnqb.class, this.o, "ENTRYPOINT_TYPE_KEY");
            if (bundle != null) {
                this.c = (bmcp) this.ai.j(bwrj.SCALABLE_ATTRIBUTE_VALUES, (dssr) bmcp.b.cu(7));
                bvqd.a(this.ai.i(bwrj.SCALABLE_ATTRIBUTE_VALUES, "0"), this.an);
            }
        } catch (IOException unused) {
            dcqd dcqdVar = dcqe.b;
            dcqdVar.v(dcqz.MEDIUM);
            dcqdVar.t(5207).o();
        }
        bwrs<ilo> bwrsVar = this.f;
        if (bwrsVar != null) {
            ilo c = bwrsVar.c();
            this.a = c;
            if (c != null) {
                dnjb dnjbVar = c.cd().j;
                if (dnjbVar == null) {
                    dnjbVar = dnjb.h;
                }
                dodk dodkVar = dnjbVar.g;
                if (dodkVar == null) {
                    dodkVar = dodk.c;
                }
                this.g = dodkVar;
            }
        }
        if (this.ag == null) {
            this.ag = this.aE;
        }
    }

    @Override // defpackage.bfdp
    public final jfr q() {
        return this.as;
    }

    @Override // defpackage.bfdp, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.a == null) {
            aS();
            return;
        }
        dodk dodkVar = this.g;
        if (dodkVar == null || dodkVar.a.size() == 0) {
            ilo iloVar = this.a;
            dbsk.s(iloVar);
            aJ(iloVar);
            return;
        }
        aR();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bmcn e = this.ae.e();
        if (e != null) {
            this.c = e.a();
        }
        if (this.c != null) {
            this.ai.s(bwrj.SCALABLE_ATTRIBUTE_VALUES, this.c);
        }
        bwqv bwqvVar = this.ai;
        dnqb dnqbVar = this.ap;
        dbsk.s(dnqbVar);
        bwqvVar.c(bundle, "ENTRYPOINT_TYPE_KEY", dnqbVar);
    }
}
