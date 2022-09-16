package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.saj;
/* compiled from: PG */
/* renamed from: rmi  reason: default package */
/* loaded from: classes7.dex */
public abstract class rmi<T extends saj> extends ges {
    public efg a;
    private cqkf<jbk> ad;
    private cqkf<T> ae;
    private final View.OnLayoutChangeListener af = new rmh(this);
    public cqkj b;
    public T c;
    public View d;
    public View e;
    public View f;
    private cqkf<T> g;

    @Override // defpackage.fd
    @dzsi
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqiw<T> g = g();
        dbsk.s(g);
        cqkf<jbk> d = this.b.d(new hxj(), viewGroup, false);
        this.ad = d;
        this.d = d.c();
        cqkf<T> d2 = this.b.d(new rxy(), viewGroup, false);
        this.ae = d2;
        View c = d2.c();
        this.e = c;
        c.addOnLayoutChangeListener(this.af);
        cqkf<T> d3 = this.b.d(g, viewGroup, false);
        this.g = d3;
        dbsk.s(d3);
        this.f = d3.c();
        return null;
    }

    protected abstract cqiw<T> g();

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        T q = q();
        dbsk.s(q);
        this.c = q;
    }

    protected abstract T q();

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.g.e(this.c);
        this.ad.e(this.c);
        this.ae.e(this.c);
        this.c.b();
        aljk aljkVar = new aljk();
        aljkVar.a(true);
        aljkVar.l = false;
        egj egjVar = new egj(this);
        egjVar.e(new ecs(this) { // from class: rmg
            private final rmi a;

            {
                this.a = this;
            }

            @Override // defpackage.ecs
            public final void Qf() {
                rmi rmiVar = this.a;
                if (rmiVar.aE != null) {
                    rmiVar.d.announceForAccessibility(rmiVar.c.NC().u);
                }
            }
        });
        egjVar.G(this.d, 6);
        egjVar.w(null);
        egjVar.aw(this.e, false);
        egjVar.ag(null);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.z(aljkVar);
        egjVar.ak(jkc.q, jkc.q);
        this.a.a(w(egjVar));
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        this.g.e(null);
        this.ad.e(null);
        this.ae.e(null);
        this.c.c();
        super.u();
    }

    protected abstract egu w(egj egjVar);
}
