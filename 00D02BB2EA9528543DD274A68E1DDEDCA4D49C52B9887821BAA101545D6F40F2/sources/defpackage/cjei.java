package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cjei  reason: default package */
/* loaded from: classes4.dex */
public final class cjei extends ges {
    public gga a;
    public efg b;
    public dxio<afwp> c;
    public cqkj d;
    public cjeg e;
    @dzsi
    cqkf<cjev> f;
    private cjef g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((cjej) btsx.b(cjej.class, this)).du(this);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cjev> c = this.d.c(new cjen(), null);
        this.f = c;
        if (c != null) {
            c.e(this.g);
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        cjeg cjegVar = this.e;
        cjeg.a(cjegVar.a.a(), 1);
        cjec a = cjegVar.b.a();
        cjeg.a(a, 2);
        Activity activity = (Activity) ((dxjd) cjegVar.c).a;
        cjeg.a(activity, 3);
        this.g = new cjef(a, activity);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.t(this.g);
        cqkf<cjev> cqkfVar = this.f;
        dbsk.s(cqkfVar);
        egjVar.az(cqkfVar.c(), new Callable(this) { // from class: cjeh
            private final cjei a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cqrp.d(52.0d).e(this.a.a));
            }
        });
        egjVar.d(true);
        egjVar.ao(true);
        egjVar.ai(jjn.COLLAPSED);
        egjVar.ak(jkc.l, jkc.l);
        egjVar.e(this);
        egjVar.c(this.c.a().e());
        this.b.a(egjVar.a());
    }
}
