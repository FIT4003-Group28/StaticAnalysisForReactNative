package defpackage;

import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: bsor  reason: default package */
/* loaded from: classes4.dex */
public final class bsor implements jkh {
    private final bsoi a;
    private final brcj b;
    private final brat c;
    private final cjqy d;
    private final cjqq e;
    private final brlk f;
    private boolean g;

    public bsor(cjqy cjqyVar, brat bratVar, cjqq cjqqVar, brlk brlkVar, bsoi bsoiVar, brcj brcjVar) {
        this.b = brcjVar;
        this.c = bratVar;
        this.d = cjqyVar;
        this.a = bsoiVar;
        this.e = cjqqVar;
        this.f = brlkVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        deaf deafVar;
        this.a.H(jjnVar2 == jjn.HIDDEN);
        this.b.c();
        if (jjnVar2 == jjn.COLLAPSED) {
            this.b.e();
            if (this.f.f()) {
                bsoi bsoiVar = this.a;
                bsoiVar.t(bsoiVar.A(), true, false);
            }
        }
        dead deadVar = jjnVar2.c(jjnVar) ? dead.UP : dead.DOWN;
        if (jkgVar == jkg.SWIPE || this.g) {
            deafVar = deaf.SWIPE;
        } else {
            deafVar = deaf.AUTOMATED;
        }
        this.d.n(this.e.g().d(cjtd.a(dtyb.ca)), new cjte(deafVar, deadVar), cjtd.a(dtyb.ca));
        this.g = false;
        if (this.c.b()) {
            if (jjnVar2 == jjn.EXPANDED) {
                bsoi bsoiVar2 = this.a;
                ilo y = bsoiVar2.y(bsoiVar2.A());
                if (y != null) {
                    bsoiVar2.i.a().J(y, brax.a);
                }
            } else {
                this.a.F(false);
            }
            this.a.G(1.0f);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        this.g = true;
        this.a.N();
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        float f2 = 0.0f;
        float min = f < 0.0f ? 0.0f : Math.min(1.0f, f);
        float interpolation = irf.c.getInterpolation(min);
        float f3 = jjnVar == jjn.HIDDEN ? (-1.0f) + interpolation : 0.0f;
        float f4 = jjnVar == jjn.COLLAPSED ? 1.0f - (interpolation / 0.33f) : 1.0f;
        if (min >= 0.33f && min <= 0.6f) {
            f2 = 1.0f - (((-0.33f) + min) / 0.27f);
        }
        float f5 = jjnVar == jjn.HIDDEN ? min : 1.0f - min;
        bsoi bsoiVar = this.a;
        Configuration configuration = bsoiVar.a.getResources().getConfiguration();
        boolean z = false;
        if (brwu.aB(bsoiVar.w) && brwu.aN(Math.max(0.5f, Math.min(configuration.fontScale, 2.0f)), configuration.screenHeightDp, bsoiVar.k.getSearchParameters().j())) {
            dcdc<ghs<?>> O = this.a.O();
            int size = O.size();
            for (int i = 0; i < size; i++) {
                ghs<?> ghsVar = O.get(i);
                bsoi.U(ghsVar, f3);
                cqkx.p(ghsVar);
            }
        }
        bsoi bsoiVar2 = this.a;
        brwu i2 = bsoiVar2.i(bsoiVar2.A());
        if (i2 != null && i2.as().booleanValue()) {
            i2.aL(f5);
        }
        if (!this.c.b() || !this.g || jjnVar != jjn.COLLAPSED) {
            return;
        }
        this.a.G(f4);
        bsoi bsoiVar3 = this.a;
        if (min > 0.33f) {
            z = true;
        }
        bsoiVar3.F(z);
        bsoi bsoiVar4 = this.a;
        bdwp bdwpVar = bsoiVar4.L;
        if (bdwpVar == null) {
            return;
        }
        bdwpVar.setTranslationY(Math.abs(f2 * bsoiVar4.N));
    }
}
