package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
import com.google.protos.youtube.api.innertube.FlowTopBarRendererOuterClass;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: nop  reason: default package */
/* loaded from: classes3.dex */
public final class nop extends nkg implements imt, ims, imu {
    public nlw d;
    public imv e;
    private final Context f;
    private final azqb g;
    private final nlv h;
    private final imx i;
    private final acti j;
    private nlx k;
    private LoadingFrameLayout l;

    public nop(Context context, azqb azqbVar, nlv nlvVar, imx imxVar, acti actiVar, aadd aaddVar) {
        super(actiVar, aaddVar);
        this.f = context;
        this.g = azqbVar;
        this.h = nlvVar;
        this.i = imxVar;
        this.j = actiVar;
    }

    private final nlw e(aqti aqtiVar, asjj asjjVar) {
        return this.h.a(this.a, asjjVar, new nlt() { // from class: noo
            @Override // defpackage.nlt
            public final void a() {
                imv imvVar;
                nop nopVar = nop.this;
                nlw nlwVar = nopVar.d;
                if (nlwVar == null || (imvVar = nopVar.e) == null) {
                    return;
                }
                View a = imvVar.a();
                a.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), nlwVar.a().getHeight());
            }
        }, aqtiVar);
    }

    private final nnu f(aqvs aqvsVar) {
        nnu nnuVar;
        nlx nlxVar = this.k;
        if (nlxVar instanceof nnu) {
            ((nnu) nlxVar).p(aqvsVar);
            nnuVar = nlxVar;
        } else {
            nnu nnuVar2 = (nnu) this.g.get();
            nnuVar2.p(aqvsVar);
            nnuVar2.h = this.a;
            this.k = nnuVar2;
            nnuVar = nnuVar2;
        }
        return (nnu) nnuVar;
    }

    private final LoadingFrameLayout h() {
        if (this.l == null) {
            this.l = new LoadingFrameLayout(this.f);
        }
        return this.l;
    }

    private final void i(nlw nlwVar) {
        nlw nlwVar2 = this.d;
        if (nlwVar2 != null) {
            nlwVar2.pd();
        }
        this.d = nlwVar;
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        nlw nlwVar = this.d;
        if (nlwVar != null) {
            nlwVar.h();
        }
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    @Override // defpackage.ims
    public final void a(aqtb aqtbVar) {
        nlw nlwVar;
        LoadingFrameLayout loadingFrameLayout = this.l;
        if (loadingFrameLayout != null && (nlwVar = this.d) != null) {
            loadingFrameLayout.removeView(nlwVar.a());
        }
        if (aqtbVar == null) {
            i(null);
            return;
        }
        aopa createBuilder = aqti.a.createBuilder();
        aopc aopcVar = (aopc) aunb.a.createBuilder();
        aopcVar.e(ElementRendererOuterClass.elementRenderer, aqtbVar);
        aunb aunbVar = (aunb) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        aqti aqtiVar = (aqti) createBuilder.instance;
        aunbVar.getClass();
        aqtiVar.c = aunbVar;
        aqtiVar.b |= 1;
        nlw e = e((aqti) createBuilder.mo39build(), null);
        i(e);
        LoadingFrameLayout loadingFrameLayout2 = this.l;
        if (loadingFrameLayout2 == null) {
            return;
        }
        loadingFrameLayout2.addView(e.a());
        e.h();
    }

    @Override // defpackage.nmc
    public final nlx b() {
        nlx nlxVar = this.k;
        return nlxVar == null ? f(aqvs.a) : nlxVar;
    }

    @Override // defpackage.imu
    public final void c() {
        LoadingFrameLayout loadingFrameLayout = this.l;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.a();
        }
    }

    @Override // defpackage.imu
    public final void d() {
        LoadingFrameLayout loadingFrameLayout = this.l;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
    }

    @Override // defpackage.nmc
    public final void n() {
        nlw nlwVar = this.d;
        if (nlwVar != null) {
            ((nlu) nlwVar).d();
        }
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        LoadingFrameLayout h = h();
        imv imvVar = this.e;
        if (imvVar != null) {
            h.removeAllViews();
            h.addView(imvVar.a());
            nlw nlwVar = this.d;
            if (nlwVar == null) {
                return;
            }
            h.addView(nlwVar.a());
        }
    }

    @Override // defpackage.nmc
    public final View oX() {
        return h();
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
    }

    @Override // defpackage.imt
    public final void oZ(aqzi aqziVar) {
        aopa createBuilder = aqvs.a.createBuilder();
        arag aragVar = aqziVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        createBuilder.copyOnWrite();
        aqvs aqvsVar = (aqvs) createBuilder.instance;
        aragVar.getClass();
        aqvsVar.c = aragVar;
        aqvsVar.b |= 1;
        if ((aqziVar.b & 4) != 0) {
            aunb aunbVar = aqziVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            createBuilder.copyOnWrite();
            aqvs aqvsVar2 = (aqvs) createBuilder.instance;
            aunbVar.getClass();
            aqvsVar2.m = aunbVar;
            aqvsVar2.b |= 524288;
        }
        if (aqziVar.e.size() > 0) {
            aunb aunbVar2 = (aunb) aqziVar.e.get(0);
            createBuilder.copyOnWrite();
            aqvs aqvsVar3 = (aqvs) createBuilder.instance;
            aunbVar2.getClass();
            aqvsVar3.h = aunbVar2;
            aqvsVar3.b |= 32;
        }
        f((aqvs) createBuilder.mo39build());
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void p(aqvq aqvqVar, asjj asjjVar) {
        aqvs aqvsVar;
        aqza aqzaVar;
        if (aqvqVar != null) {
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            if (aqvoVar.b != 371777145) {
                return;
            }
            super.p(aqvqVar, asjjVar);
            aqvp aqvpVar = aqvqVar.f;
            if (aqvpVar == null) {
                aqvpVar = aqvp.a;
            }
            if (aqvpVar.b == 138681548) {
                aqvsVar = (aqvs) aqvpVar.c;
            } else {
                aqvsVar = aqvs.a;
            }
            f(aqvsVar);
            imv imvVar = this.e;
            if (imvVar != null) {
                this.i.a(imvVar.l);
            }
            imx imxVar = this.i;
            aqvo aqvoVar2 = aqvqVar.g;
            if (aqvoVar2 == null) {
                aqvoVar2 = aqvo.a;
            }
            if (aqvoVar2.b == 371777145) {
                aqzaVar = (aqza) aqvoVar2.c;
            } else {
                aqzaVar = aqza.a;
            }
            aqza aqzaVar2 = aqzaVar;
            Optional of = Optional.of(this);
            acti actiVar = this.j;
            imw imwVar = imxVar.a;
            aafo aafoVar = (aafo) imwVar.a.get();
            aafoVar.getClass();
            axnm axnmVar = ((axoz) imwVar.b).get();
            axnmVar.getClass();
            ajhl ajhlVar = (ajhl) imwVar.c.get();
            ajhlVar.getClass();
            aagi aagiVar = (aagi) imwVar.d.get();
            aagiVar.getClass();
            afvn afvnVar = (afvn) imwVar.e.get();
            afvnVar.getClass();
            ayor ayorVar = (ayor) imwVar.f.get();
            ayorVar.getClass();
            aqzaVar2.getClass();
            final imv imvVar2 = new imv(aafoVar, axnmVar, ajhlVar, aagiVar, afvnVar, ayorVar, aqzaVar2, this, this, of, actiVar);
            imvVar2.c();
            imvVar2.p = ayoi.m(imvVar2.d.h(imvVar2.n, true).I(ikb.l), imvVar2.k, eho.i).V(ilt.t).k(aqzd.class).X(imvVar2.e).V(ilt.u).as(new ayqb() { // from class: imr
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    imv imvVar3 = imv.this;
                    String str = ((aqzf) obj).d;
                    if (!imvVar3.j.containsKey(str) || imvVar3.j.get(str) == null) {
                        if (imvVar3.o.isPresent()) {
                            imvVar3.a.a((apzg) imvVar3.o.get());
                        }
                        if (!imvVar3.h.isPresent()) {
                            return;
                        }
                        ((imu) imvVar3.h.get()).d();
                        return;
                    }
                    aqzh aqzhVar = (aqzh) imvVar3.j.get(str);
                    aunb aunbVar = aqzhVar.d;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                        return;
                    }
                    if (imvVar3.h.isPresent()) {
                        ((imu) imvVar3.h.get()).c();
                    }
                    ajrs ajrsVar = new ajrs();
                    ajrsVar.a(imvVar3.i);
                    ajhl ajhlVar2 = imvVar3.c;
                    ajin ajinVar = (ajin) imvVar3.b.get();
                    aunb aunbVar2 = aqzhVar.d;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    ajhlVar2.oK(ajrsVar, ajhh.a((aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer)));
                    if ((aqzhVar.b & 4) == 0) {
                        imvVar3.f.oZ((aqzi) imvVar3.m.qm(FlowTopBarRendererOuterClass.flowTopBarRenderer));
                    } else {
                        imt imtVar = imvVar3.f;
                        aunb aunbVar3 = aqzhVar.e;
                        if (aunbVar3 == null) {
                            aunbVar3 = aunb.a;
                        }
                        imtVar.oZ((aqzi) aunbVar3.qm(FlowTopBarRendererOuterClass.flowTopBarRenderer));
                    }
                    if ((aqzhVar.b & 8) != 0) {
                        aunb aunbVar4 = aqzhVar.f;
                        if (aunbVar4 == null) {
                            aunbVar4 = aunb.a;
                        }
                        if (aunbVar4.qn(ElementRendererOuterClass.elementRenderer)) {
                            ims imsVar = imvVar3.g;
                            aunb aunbVar5 = aqzhVar.f;
                            if (aunbVar5 == null) {
                                aunbVar5 = aunb.a;
                            }
                            imsVar.a((aqtb) aunbVar5.qm(ElementRendererOuterClass.elementRenderer));
                            return;
                        }
                    }
                    imvVar3.g.a(null);
                }
            });
            imxVar.b.put(aqzaVar2.c, imvVar2);
            this.e = imvVar2;
            aunb aunbVar = aqvqVar.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                aunb aunbVar2 = aqvqVar.h;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                i(e((aqti) aunbVar2.qm(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer), asjjVar));
            } else {
                i(null);
            }
            LoadingFrameLayout loadingFrameLayout = this.l;
            if (loadingFrameLayout == null) {
                return;
            }
            loadingFrameLayout.removeAllViews();
            this.l.addView(imvVar2.a());
            nlw nlwVar = this.d;
            if (nlwVar == null) {
                return;
            }
            this.l.addView(nlwVar.a());
            nlwVar.h();
        }
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean u(aqvq aqvqVar, apzg apzgVar) {
        p(aqvqVar, null);
        return true;
    }

    @Override // defpackage.nmc
    public final void y() {
        imv imvVar = this.e;
        if (imvVar != null) {
            this.i.a(imvVar.l);
            this.e = null;
        }
        nlw nlwVar = this.d;
        if (nlwVar != null) {
            nlwVar.pd();
        }
    }

    @Override // defpackage.nmc
    public final void z() {
        nlw nlwVar = this.d;
        if (nlwVar != null) {
            nlwVar.d();
        }
    }
}
