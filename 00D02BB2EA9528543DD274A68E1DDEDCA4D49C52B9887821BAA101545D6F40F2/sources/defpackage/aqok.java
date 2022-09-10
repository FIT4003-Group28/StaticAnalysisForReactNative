package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqok  reason: default package */
/* loaded from: classes2.dex */
public final class aqok extends hxf {
    public efg b;
    public cqkj c;
    public dxio<aqoo> d;
    private cqkf<aqoh> e;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqol) btsx.b(aqol.class, this)).ce(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aqoh> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.e = null;
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.i = cqrt.f(2131232205);
        a.j = cqrt.l(R.string.CLOSE_BUTTON);
        a.f(new View.OnClickListener(this) { // from class: aqoj
            private final aqok a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ff J = this.a.J();
                dbsk.s(J);
                J.onBackPressed();
            }
        });
        a.o = cjtd.a(dtxv.cg);
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        Bundle bundle2 = this.o;
        String str = "";
        if (bundle2 != null) {
            str = bundle2.getString("business_listing_id", str);
        }
        String str2 = str;
        this.e = this.c.e(new aqnt());
        aqoo a = this.d.a();
        Activity activity = (Activity) ((dxjd) a.a).a;
        aqoo.a(activity, 1);
        apzy a2 = a.b.a();
        aqoo.a(a2, 2);
        cqhn a3 = a.c.a();
        aqoo.a(a3, 3);
        aqru a4 = a.d.a();
        aqoo.a(a4, 4);
        aqci a5 = a.e.a();
        aqoo.a(a5, 5);
        dxio a6 = ((dxjh) a.f).a();
        aqoo.a(a6, 6);
        aqoo.a(str2, 7);
        aqon aqonVar = new aqon(activity, a2, a3, a4, a5, a6, str2);
        cqkf<aqoh> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        cqkfVar.e(aqonVar);
        cqkf<aqoh> cqkfVar2 = this.e;
        dbsk.s(cqkfVar2);
        return cqkfVar2.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.cf;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.j(false);
        this.b.a(egjVar.a());
    }
}
