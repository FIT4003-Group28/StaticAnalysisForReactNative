package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: pin  reason: default package */
/* loaded from: classes7.dex */
public final class pin extends ges {
    public efg a;
    public cqkj b;
    public dzsj<pja> c;
    @dzsi
    cqkf<piu> d;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<piu> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<piu> c = this.b.c(new pip(), null);
        this.d = c;
        dbsk.s(c);
        c.e(this.c.a());
        cqkf<piu> cqkfVar = this.d;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egf a = egf.a();
        a.n();
        egjVar.A(a);
        egjVar.e(this);
        this.a.a(egjVar.a());
    }
}
