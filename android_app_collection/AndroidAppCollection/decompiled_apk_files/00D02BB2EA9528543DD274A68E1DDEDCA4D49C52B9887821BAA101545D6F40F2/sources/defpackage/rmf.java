package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.sav;
/* compiled from: PG */
/* renamed from: rmf  reason: default package */
/* loaded from: classes7.dex */
public abstract class rmf<T extends sav> extends ges {
    private static final ztc a = new ztc();
    public int ad;
    private cqkf<T> ae;
    private cqiw<T> af;
    private cqkf<jbk> ag;
    private cqkf<sav> ah;
    private boolean ai = true;
    private final View.OnLayoutChangeListener aj = new rmd(this);
    private final View.OnLayoutChangeListener ak = new rme(this);
    public efg b;
    public cqkj c;
    public T d;
    public View e;
    public View f;
    public View g;

    /* JADX INFO: Access modifiers changed from: protected */
    public final egj aJ() {
        egj egjVar = new egj(this);
        egjVar.e(new rmc(this));
        egjVar.G(this.e, 6);
        egjVar.C(new ztd(this.ag, a));
        egjVar.w(null);
        egjVar.aw(this.f, false);
        egjVar.Y(true);
        egf a2 = egf.a();
        a2.l(false);
        egjVar.A(a2);
        return egjVar;
    }

    @Override // defpackage.fd
    @dzsi
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<jbk> d = this.c.d(new hxj(), viewGroup, false);
        this.ag = d;
        View c = d.c();
        this.e = c;
        c.addOnLayoutChangeListener(this.ak);
        cqkf<sav> d2 = this.c.d(new rtu(), viewGroup, false);
        this.ah = d2;
        View c2 = d2.c();
        this.f = c2;
        c2.addOnLayoutChangeListener(this.aj);
        this.ae = this.c.d(this.af, viewGroup, false);
        this.g = w();
        return null;
    }

    protected abstract cqiw<T> g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract egu i(egj egjVar);

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        rzp k;
        if (bundle == null || !bundle.containsKey("SCREENS")) {
            k = rzp.k(this.o);
        } else {
            k = rzp.k(bundle.getBundle("SCREENS"));
        }
        T q = q(k);
        dbsk.s(q);
        this.d = q;
        cqiw<T> g = g();
        dbsk.s(g);
        this.af = g;
        super.l(bundle);
    }

    protected abstract T q(rzp rzpVar);

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.ae.e(this.d);
        this.ag.e(this.d);
        this.ah.e(this.d);
        if (this.ai) {
            this.ad = this.g.getPaddingBottom();
            this.ai = false;
        }
        this.b.a(i(aJ()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBundle("SCREENS", this.d.t().i());
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        this.ae.e(null);
        this.ag.e(null);
        this.ah.e(null);
        super.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View w() {
        dbsk.s(this.ae);
        return this.ae.c();
    }
}
