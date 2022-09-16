package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
/* compiled from: PG */
/* renamed from: nqi  reason: default package */
/* loaded from: classes3.dex */
public final class nqi extends nkg {
    private final azqb d;
    private nlx e;
    private final axnm f;
    private final aagi g;
    private final afvn h;
    private final ajhl i;
    private final acti j;
    private final noi k;

    public nqi(ajhl ajhlVar, axnm axnmVar, azqb azqbVar, aagi aagiVar, afvn afvnVar, acti actiVar, aadd aaddVar, noj nojVar) {
        super(actiVar, aaddVar);
        this.d = azqbVar;
        this.f = axnmVar;
        this.g = aagiVar;
        this.h = afvnVar;
        this.i = ajhlVar;
        this.j = actiVar;
        this.k = nojVar.a(actiVar);
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        this.k.e(apzgVar);
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    @Override // defpackage.nmc
    public final nlx b() {
        return this.e;
    }

    @Override // defpackage.nmc
    public final void n() {
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        this.k.b();
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.i.a();
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void p(aqvq aqvqVar, asjj asjjVar) {
        if (aqvqVar == null) {
            return;
        }
        aqvo aqvoVar = aqvqVar.g;
        if (aqvoVar == null) {
            aqvoVar = aqvo.a;
        }
        aunb aunbVar = (aqvoVar.b == 154115041 ? (avkd) aqvoVar.c : avkd.a).b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            return;
        }
        aqvp aqvpVar = aqvqVar.f;
        if (aqvpVar == null) {
            aqvpVar = aqvp.a;
        }
        if (aqvpVar.b != 138681548) {
            return;
        }
        super.p(aqvqVar, asjjVar);
        aqvp aqvpVar2 = aqvqVar.f;
        if (aqvpVar2 == null) {
            aqvpVar2 = aqvp.a;
        }
        if (aqvpVar2.b == 138681548) {
            nlx nlxVar = this.e;
            if (nlxVar instanceof nnu) {
                ((nnu) nlxVar).p((aqvs) aqvpVar2.c);
            } else {
                nnu nnuVar = (nnu) this.d.get();
                nnuVar.p(aqvpVar2.b == 138681548 ? (aqvs) aqvpVar2.c : aqvs.a);
                nnuVar.h = this.a;
                this.e = nnuVar;
            }
        }
        aqvo aqvoVar2 = aqvqVar.g;
        if (aqvoVar2 == null) {
            aqvoVar2 = aqvo.a;
        }
        aunb aunbVar2 = (aqvoVar2.b == 154115041 ? (avkd) aqvoVar2.c : avkd.a).b;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ElementRendererOuterClass.elementRenderer)) {
            ajin ajinVar = (ajin) this.f.get();
            aunb aunbVar3 = (aqvoVar2.b == 154115041 ? (avkd) aqvoVar2.c : avkd.a).b;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            ajhh a = ajhh.a((aqtb) aunbVar3.qm(ElementRendererOuterClass.elementRenderer));
            ajrs ajrsVar = new ajrs();
            ajrsVar.a(this.j);
            this.i.oK(ajrsVar, a);
        }
        this.k.g(aqvqVar, asjjVar);
    }

    @Override // defpackage.nmc
    public final void z() {
        this.k.d();
    }

    @Override // defpackage.nmc
    public final void y() {
        avkd avkdVar;
        aqvq aqvqVar = this.b;
        if (aqvqVar != null) {
            aajs c = this.g.a(this.h.c()).c();
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            if (aqvoVar.b == 154115041) {
                avkdVar = (avkd) aqvoVar.c;
            } else {
                avkdVar = avkd.a;
            }
            avkc avkcVar = avkdVar.c;
            if (avkcVar == null) {
                avkcVar = avkc.a;
            }
            if ((avkcVar.b & 1) != 0) {
                c.g(avkcVar.c);
            }
            if ((avkcVar.b & 2) != 0) {
                c.g(avkcVar.d);
            }
            if ((avkcVar.b & 4) != 0) {
                c.g(avkcVar.e);
            }
            c.b().T();
        }
        this.k.c();
    }
}
