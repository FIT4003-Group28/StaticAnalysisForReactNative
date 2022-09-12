package defpackage;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmys  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmys implements jbk, bega {
    private final bhat a;
    private jib b;
    @dzsi
    private bwrs<ilo> c;
    @dzsi
    private jjn d;
    public final gga f;
    final bhtr g;
    @dzsi
    final bmyp h;
    final bmza i;
    bmlh j = null;

    public bmys(gga ggaVar, btvo btvoVar, bhtr bhtrVar, dzsj<bmyp> dzsjVar, bmza bmzaVar, bhat bhatVar) {
        cqtd N;
        bmyp bmypVar = null;
        this.f = ggaVar;
        this.g = bhtrVar;
        this.h = btvoVar.getMapsActivitiesParameters().b ? dzsjVar.a() : bmypVar;
        this.i = bmzaVar;
        this.a = bhatVar;
        jhz jhzVar = new jhz();
        jhzVar.q = cqta.f();
        jhzVar.g = k() ? ibm.p() : ibl.b();
        jhzVar.u = ibm.t();
        jhzVar.s = true != k() ? 0 : 255;
        jhzVar.e = l() ? cqrt.f(R.drawable.action_icon_background) : cqtt.c();
        if (l()) {
            N = gdj.b();
        } else if (k()) {
            N = m();
        } else {
            N = irn.N();
        }
        jhzVar.d = N;
        jhzVar.h = true;
        jhzVar.E = 2;
        jhzVar.j = cqrt.m(R.string.BACK_TO, ggaVar.getString(R.string.SEARCH));
        jhzVar.o = cjtd.a(dtxy.hw);
        jhzVar.f(new View.OnClickListener(this) { // from class: bmyq
            private final bmys a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bmys bmysVar = this.a;
                if (bmysVar.f.g().J()) {
                    return;
                }
                bmysVar.f.s();
            }
        });
        this.b = jhzVar.b();
    }

    private final void c(boolean z) {
        cqtd N;
        jhz e = this.b.e();
        e.g = k() ? ibm.p() : ibl.b();
        e.e = e(z);
        if (l()) {
            N = gdj.b();
        } else if (k()) {
            N = m();
        } else {
            N = irn.N();
        }
        e.d = N;
        e.s = true != k() ? 0 : 255;
        this.b = e.b();
    }

    private final cqtd e(boolean z) {
        if (z) {
            return new bmyr(this, new Object[0]);
        }
        if (l()) {
            return cqrt.f(R.drawable.action_icon_background);
        }
        return cqtt.c();
    }

    static cqtd m() {
        return cqrt.f(R.drawable.transparent_background_selector_ripple);
    }

    private final boolean o() {
        return this.a.c(btpf.c(this.f), (ilo) bwrs.b(this.c));
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.b;
    }

    public abstract void b(jhz jhzVar, Context context, @dzsi bwrs<ilo> bwrsVar);

    public void d(bmlh bmlhVar) {
        this.j = bmlhVar;
    }

    public void f(bmoe bmoeVar) {
        bmyp bmypVar = this.h;
        if (bmypVar != null) {
            bmypVar.a(bmoeVar);
        }
    }

    public void g(jjn jjnVar) {
        jjn jjnVar2 = this.d;
        boolean z = false;
        if (jjnVar != jjnVar2) {
            if (jjnVar2 != null && !o()) {
                z = true;
            }
            jjn jjnVar3 = jjn.HIDDEN;
            bmlh bmlhVar = this.j;
            if (bmlhVar != null) {
                bmlhVar.e();
            }
            this.d = jjnVar;
            n();
            c(z);
            cqkx.p(this);
            return;
        }
        cqtd cqtdVar = this.b.e;
        if (!((cqtdVar != null ? cqtdVar.a(this.f) : null) instanceof TransitionDrawable)) {
            return;
        }
        jhz e = this.b.e();
        e.e = e(false);
        this.b = e.b();
        cqkx.p(this);
    }

    public void h() {
        n();
        c(false);
        cqkx.p(this);
    }

    public void i(bwrs<ilo> bwrsVar, boolean z) {
        t(bwrsVar);
        jhz e = this.b.e();
        e.x = !z;
        this.b = e.b();
        c(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        jhz e = this.b.e();
        e.e();
        b(e, this.f, this.c);
        this.b = e.b();
    }

    final boolean k() {
        return jjn.FULLY_EXPANDED.equals(this.d) || o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return jjn.EXPANDED.equals(this.d) && !o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        String q;
        ilo iloVar = (ilo) bwrs.b(this.c);
        if (iloVar == null) {
            return;
        }
        if (!o() || this.d == jjn.FULLY_EXPANDED) {
            q = iloVar.q();
        } else {
            q = this.f.getString(R.string.MERCHANT_YOUR_BUSINESS_TITLE);
        }
        jhz e = this.b.e();
        e.a = q;
        e.l = this.f.getString(R.string.OVERFLOW_CONTENT_DESCRIPTION, new Object[]{q});
        this.b = e.b();
    }

    public void t(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
        this.g.t(bwrsVar);
        this.i.s = bwrsVar;
        n();
        j();
    }

    public void u() {
        this.i.a();
    }

    public Boolean w() {
        return true;
    }
}
