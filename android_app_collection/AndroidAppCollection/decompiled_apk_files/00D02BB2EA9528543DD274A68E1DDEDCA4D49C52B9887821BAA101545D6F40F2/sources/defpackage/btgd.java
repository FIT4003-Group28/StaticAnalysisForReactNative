package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: btgd  reason: default package */
/* loaded from: classes4.dex */
public final class btgd extends ges {
    private static final dcqe ag = dcqe.c("btgd");
    public auhi a;
    public ausy ad;
    private btgl ae;
    private cqkf<btgk> af;
    public cqhn b;
    public cqkj c;
    public auom d;
    public efg e;
    public cjqy f;
    public dxio<afha> g;

    public static btgd g(aujb aujbVar) {
        if (aujbVar == null || aujbVar.b() == null) {
            bvoo.h("Cannot instantiate settings leaf fragment with non-optional notification type.", new Object[0]);
        }
        btgd btgdVar = new btgd();
        Bundle bundle = new Bundle();
        bundle.putInt("notificationTypeKey", aujbVar.a);
        btgdVar.B(bundle);
        return btgdVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.af.e(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<btgk> d = this.c.d(new btgj(), viewGroup, false);
        this.af = d;
        d.e(this.ae);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        auix b;
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 == null || !bundle2.containsKey("notificationTypeKey")) {
            return;
        }
        aujb h = this.a.h(bundle2.getInt("notificationTypeKey"));
        if (h == null || (b = h.b()) == null) {
            return;
        }
        this.ae = new btgl(J(), b, this.a, h, this.d, this.b, this.f, this.g, this.ad);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.af.c());
        egjVar.ag(null);
        this.e.a(egjVar.a());
    }
}
