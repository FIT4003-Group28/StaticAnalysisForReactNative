package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axje  reason: default package */
/* loaded from: classes3.dex */
public final class axje extends hxf {
    public cqkj b;
    public efg c;
    public axqn d;
    public axhs e;
    private axqo f;
    private cqkf<axot> g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((axjf) btsx.b(axjf.class, this)).cu(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.g.e(null);
        super.Qe();
    }

    @Override // defpackage.hxf
    public final jib g() {
        jhz e = jib.g(J(), J().getString(R.string.REQUESTS_LABEL)).e();
        e.F = 1;
        e.x = false;
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<axot> e = this.b.e(new axmp());
        this.g = e;
        e.e(this.f);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        axqn axqnVar = this.d;
        axgi j = this.e.j();
        dbsk.s(j);
        axqi a = axqnVar.a.a();
        dbsk.s(a);
        dbsk.s(axqnVar.b.a());
        final axqo axqoVar = new axqo(a, j);
        axqoVar.a.e.c(new aa(axqoVar) { // from class: axql
            private final axqo a;

            {
                this.a = axqoVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                final axqo axqoVar2 = this.a;
                axgh axghVar = (axgh) obj;
                axgg a2 = axghVar.a();
                axqoVar2.c.a = a2 == axgg.PARTIALLY_LOADED;
                if (a2 == axgg.LOADED || a2 == axgg.PARTIALLY_LOADED) {
                    dsrj<dqae> dsrjVar = axghVar.b().c;
                    axqoVar2.b.clear();
                    axqoVar2.b.addAll(dchl.k(dsrjVar, new dbrn(axqoVar2) { // from class: axqm
                        private final axqo a;

                        {
                            this.a = axqoVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            return this.a.a((dqae) obj2);
                        }
                    }));
                }
                cqkx.p(axqoVar2);
            }
        });
        this.f = axqoVar;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.e(this);
        this.c.a(egjVar.a());
    }
}
