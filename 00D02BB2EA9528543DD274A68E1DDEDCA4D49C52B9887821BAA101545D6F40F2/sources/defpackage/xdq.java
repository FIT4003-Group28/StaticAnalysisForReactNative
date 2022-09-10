package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xdq  reason: default package */
/* loaded from: classes7.dex */
public final class xdq extends ges {
    @dzsi
    public cqkj a;
    @dzsi
    cqkf<zcu> ad;
    @dzsi
    zrq ae;
    @dzsi
    private CharSequence af;
    @dzsi
    private SavedTrip ag;
    @dzsi
    private ddho ah;
    @dzsi
    public efg b;
    @dzsi
    public wia c;
    @dzsi
    public whm d;
    @dzsi
    public zrt e;
    @dzsi
    public acwo f;
    @dzsi
    cqkf<jbk> g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        this.af = bundle2.getCharSequence("title");
        this.ag = (SavedTrip) bundle2.getParcelable("saved_trip");
        List parcelableArrayList = bundle2.getParcelableArrayList("notices");
        if (parcelableArrayList == null) {
            parcelableArrayList = dcdc.e();
        }
        zrt zrtVar = this.e;
        dbsk.s(zrtVar);
        dcdc<zcv> t = zrs.t(zrtVar, parcelableArrayList, null, cjtd.a(dtyc.eE));
        this.ah = (ddho) bundle2.getSerializable("page_ve");
        this.ae = zrq.d(t, null);
        super.l(bundle);
        cqkj cqkjVar = this.a;
        dbsk.s(cqkjVar);
        this.ad = cqkjVar.c(new xek(), null);
        cqkj cqkjVar2 = this.a;
        dbsk.s(cqkjVar2);
        this.g = cqkjVar2.c(new hxj(), null);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        ddho ddhoVar = this.ah;
        return ddhoVar != null ? ddhoVar : dtxy.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        String string;
        jbk jbkVar;
        super.s();
        cqkf<zcu> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ae);
        cqkf<jbk> cqkfVar2 = this.g;
        dbsk.s(cqkfVar2);
        ff J = J();
        if (J == null) {
            jbkVar = null;
        } else {
            if (!TextUtils.isEmpty(this.af)) {
                string = this.af;
                dbsk.s(string);
            } else {
                ff J2 = J();
                string = J2 == null ? "" : J2.getString(R.string.TRANSIT_RADAR_ALERTS_PAGE_TITLE);
            }
            jhz e = jib.g(J, string).e();
            e.x = false;
            final jib b = e.b();
            if (this.ag != null) {
                wia wiaVar = this.c;
                dbsk.s(wiaVar);
                ddho ddhoVar = dtyb.ae;
                ddho ddhoVar2 = dtyb.ad;
                whm whmVar = this.d;
                dbsk.s(whmVar);
                whl a = whmVar.a(this.ag.b());
                cqhn a2 = wiaVar.a.a();
                wia.a(a2, 1);
                Executor a3 = wiaVar.b.a();
                wia.a(a3, 2);
                gga a4 = wiaVar.c.a();
                wia.a(a4, 3);
                cpv a5 = wiaVar.d.a();
                wia.a(a5, 4);
                wia.a(b, 5);
                wia.a(ddhoVar, 6);
                wia.a(ddhoVar2, 7);
                wia.a(a, 8);
                jbkVar = new whz(a2, a3, a4, a5, b, ddhoVar, ddhoVar2, a);
            } else {
                jbkVar = new jbk(b) { // from class: xdp
                    private final jib a;

                    {
                        this.a = b;
                    }

                    @Override // defpackage.jbk
                    public jib NC() {
                        return this.a;
                    }
                };
            }
        }
        cqkfVar2.e(jbkVar);
        efg efgVar = this.b;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        cqkf<jbk> cqkfVar3 = this.g;
        dbsk.s(cqkfVar3);
        egjVar.G(cqkfVar3.c(), 6);
        egjVar.C(null);
        egjVar.w(null);
        cqkf<zcu> cqkfVar4 = this.ad;
        dbsk.s(cqkfVar4);
        egjVar.ag(cqkfVar4.c());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        egjVar.e(this);
        efgVar.a(egjVar.a());
        ddho ddhoVar3 = this.ah;
        if (ddhoVar3 == null || !ddhoVar3.equals(dtxn.cG)) {
            return;
        }
        acwo acwoVar = this.f;
        dbsk.s(acwoVar);
        acwoVar.j(dvum.DIRECTIONS_TOP_LEVEL_ALERT_DETAILS, null, new acwn(this) { // from class: xdo
            private final xdq a;

            {
                this.a = this;
            }

            @Override // defpackage.acwn
            public final boolean a() {
                return this.a.aD;
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<jbk> cqkfVar = this.g;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        cqkf<zcu> cqkfVar2 = this.ad;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
        super.u();
    }
}
