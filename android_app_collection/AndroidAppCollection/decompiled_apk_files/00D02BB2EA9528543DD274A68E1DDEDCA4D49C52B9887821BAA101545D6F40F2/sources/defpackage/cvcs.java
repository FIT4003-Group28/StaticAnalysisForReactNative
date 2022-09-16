package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: cvcs  reason: default package */
/* loaded from: classes5.dex */
public final class cvcs implements cvcq {
    public final cvcr a;
    public cvcy b = null;
    public cuvb c;
    public cvel d;

    public cvcs(cvcr cvcrVar) {
        cvcrVar.setPresenter(this);
        this.a = cvcrVar;
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvcq
    public final void a() {
        cvcy cvcyVar = this.b;
        if (cvcyVar == null || !cvcyVar.a().a()) {
            return;
        }
        cvel cvelVar = this.d;
        if (cvelVar != null) {
            cugu b = this.b.a().b();
            cuxr cuxrVar = cvelVar.a.x;
            if (cuxrVar != null) {
                cuxrVar.a.j(b);
            }
        }
        if (this.b.a().b().g().equals(cugo.OUTGOING_FAILED_SEND)) {
            return;
        }
        cvcv cvcvVar = (cvcv) this.a;
        cvcvVar.setLabelViewVisibility(cvcvVar.d.getVisibility() != 0);
    }

    @Override // defpackage.cuvu
    public final void z() {
        if (this.b == null) {
            cstl.a("BubbleCellPresenter");
            return;
        }
        this.c.z();
        cvcr cvcrVar = this.a;
        cvcy cvcyVar = this.b;
        if (!cvcyVar.a().a()) {
            return;
        }
        cvcv cvcvVar = (cvcv) cvcrVar;
        cvcvVar.a = cvcyVar.a().b();
        int o = cvcvVar.a.o();
        int i = o - 1;
        if (o == 0) {
            throw null;
        }
        int i2 = 5;
        if (i == 0) {
            ((View) cvcvVar.f).setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(!cste.a(cvcvVar.getContext()) ? 1 : 0, ((View) cvcvVar.f).getId());
            layoutParams.addRule(3, cvcvVar.h.getId());
            cvcvVar.g.setLayoutParams(layoutParams);
            cvcvVar.c.setGravity(8388611);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(true != cste.a(cvcvVar.getContext()) ? 5 : 7, cvcvVar.g.getId());
            layoutParams2.addRule(3, cvcvVar.g.getId());
            cvcvVar.d.setLayoutParams(layoutParams2);
        } else if (i == 1) {
            ((View) cvcvVar.f).setVisibility(8);
            cvcvVar.h.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(true != cste.a(cvcvVar.getContext()) ? 11 : 9);
            layoutParams3.addRule(3, cvcvVar.h.getId());
            cvcvVar.g.setLayoutParams(layoutParams3);
            cvcvVar.c.setGravity(8388613);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(true != cste.a(cvcvVar.getContext()) ? 7 : 5, cvcvVar.g.getId());
            layoutParams4.addRule(3, cvcvVar.g.getId());
            cvcvVar.d.setLayoutParams(layoutParams4);
        }
        cufj b = cvcyVar.b();
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (true == cste.a(cvcvVar.getContext())) {
            i2 = 7;
        }
        layoutParams5.addRule(i2, cvcvVar.g.getId());
        cvcvVar.h.setLayoutParams(layoutParams5);
        if (b.k().a()) {
            int b2 = b.k().b().b();
            if (b2 == 0) {
                qf.a(cvcvVar.h.a, cvcvVar.i);
                cvcvVar.h.setBotIconVisibility(8);
            } else if (b2 == 1) {
                qf.a(cvcvVar.h.a, cvcvVar.j);
                cvcvVar.h.setBotIconVisibility(8);
            } else if (b2 == 2) {
                qf.a(cvcvVar.h.a, cvcvVar.k);
                if (b.b().a()) {
                    cvcvVar.h.setBotIconVisibility(0);
                }
            }
        } else {
            qf.a(cvcvVar.h.a, cvcvVar.i);
        }
        cvcvVar.h.setTopLabelText(cvcyVar.b().b().c(""));
        cvcvVar.h.a.setContentDescription(cvcyVar.b().c().c(""));
        int c = cvcyVar.c();
        int o2 = cvcvVar.a.o();
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        if (o2 == 0) {
                            throw null;
                        }
                        if (o2 == 1) {
                            ((View) cvcvVar.f).setVisibility(0);
                            cvcvVar.b.setRadii(4.0f, 20.0f, 20.0f, 20.0f);
                        } else {
                            cvcvVar.b.setRadii(20.0f, 4.0f, 20.0f, 20.0f);
                        }
                        cvcvVar.h.setVisibility(8);
                    }
                } else if (o2 == 0) {
                    throw null;
                } else {
                    if (o2 == 1) {
                        ((View) cvcvVar.f).setVisibility(4);
                        cvcvVar.b.setRadii(4.0f, 20.0f, 20.0f, 4.0f);
                    } else {
                        cvcvVar.b.setRadii(20.0f, 4.0f, 4.0f, 20.0f);
                    }
                    cvcvVar.h.setVisibility(8);
                }
            } else if (o2 == 0) {
                throw null;
            } else {
                if (o2 == 1) {
                    ((View) cvcvVar.f).setVisibility(4);
                    cvcvVar.h.setVisibility(0);
                    cvcvVar.b.setRadii(20.0f, 20.0f, 20.0f, 4.0f);
                } else {
                    cvcvVar.b.setRadii(20.0f, 20.0f, 4.0f, 20.0f);
                }
            }
        } else if (o2 == 0) {
            throw null;
        } else {
            if (o2 == 1) {
                ((View) cvcvVar.f).setVisibility(0);
                cvcvVar.h.setVisibility(0);
            }
            cvcvVar.b.setRadii(20.0f, 20.0f, 20.0f, 20.0f);
        }
        cvcvVar.d.a(cvcyVar);
        cvcvVar.e.a(cvcyVar);
    }
}
