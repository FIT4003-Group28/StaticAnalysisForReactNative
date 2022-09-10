package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cayt  reason: default package */
/* loaded from: classes4.dex */
public final class cayt extends ges {
    public cqkj a;
    public efg b;
    public btvo c;
    private cbqk d;
    private cqkf<cbqk> e;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqk> d = this.a.d(new cbjc(), viewGroup, false);
        this.e = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.d = new cayv(this, this.c.getEventsUgcParameters().c, this.c.getEventsUgcParameters().d, bundle != null ? dprz.b(bundle.getInt("see_more_initial_category_parcel_key")) : null);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<cbqk> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(this.d);
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.I(2);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<cbqk> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }
}
