package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bjfj;
/* compiled from: PG */
/* renamed from: bjfi  reason: default package */
/* loaded from: classes3.dex */
public abstract class bjfi<T extends bjfj> extends ges {
    private final bjfh a = new bjfh(this);
    public cqkj ad;
    public dehq ae;
    public cqkf<T> af;
    protected T ag;
    @dzsi
    public String ah;
    public dxio<akfa> f;
    public efg g;

    @Override // defpackage.fd
    @dzsi
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkj cqkjVar = this.ad;
        dbsk.s(cqkjVar);
        cqkf<T> e = cqkjVar.e(g());
        this.af = e;
        e.e(this.ag);
        return this.af.c();
    }

    protected abstract cqiw<T> g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T i();

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        this.ag = i();
        if (bundle == null) {
            dxio<akfa> dxioVar = this.f;
            dbsk.s(dxioVar);
            this.ah = btlu.h(dxioVar.a().j());
        } else {
            this.ah = bundle.getString("account_id_key");
            T t = this.ag;
            dbsk.s(t);
            t.i(bundle);
        }
        super.l(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        dxio<akfa> dxioVar = this.f;
        dbsk.s(dxioVar);
        crzm<btlu> C = dxioVar.a().C();
        bjfh bjfhVar = this.a;
        dehq dehqVar = this.ae;
        dbsk.s(dehqVar);
        C.d(bjfhVar, dehqVar);
        efg efgVar = this.g;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        T t = this.ag;
        dbsk.s(t);
        t.j(bundle);
        bundle.putString("account_id_key", this.ah);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        dxio<akfa> dxioVar = this.f;
        dbsk.s(dxioVar);
        dxioVar.a().C().c(this.a);
        super.u();
    }
}
