package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
/* compiled from: PG */
/* renamed from: wvu  reason: default package */
/* loaded from: classes7.dex */
public final class wvu extends ges {
    public cqkj a;
    wvw ad;
    public wzx b;
    public efg c;
    public bvjj d;
    cqkf<wyr> e;
    wzw f;
    wvy g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkj cqkjVar = this.a;
        dbsk.s(cqkjVar);
        cqkf<wyr> c = cqkjVar.c(new wyg(), null);
        this.e = c;
        c.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        wzw wzwVar = this.f;
        if (wzwVar != null) {
            return wzwVar.d();
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        cqkf<wyr> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        egjVar.w(cqkfVar.c());
        egjVar.e(this);
        efg efgVar = this.c;
        dbsk.s(efgVar);
        efgVar.a(egjVar.a());
        gn R = R();
        bvjj bvjjVar = this.d;
        dbsk.s(bvjjVar);
        if (bvjjVar.m(bvjk.kh, false) || D() || R.H("TRANSIT_TRIP_ATTRIBUTES_BANNER_TAG") != null) {
            return;
        }
        gz b = R.b();
        b.y(wvt.w(), "TRANSIT_TRIP_ATTRIBUTES_BANNER_TAG");
        b.g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        wvy e;
        wvw wvwVar = this.ad;
        dbsk.s(wvwVar);
        wvwVar.l(bundle);
        wzw wzwVar = this.f;
        if (wzwVar != null && (e = wzwVar.e()) != null) {
            drhn b = e.b();
            if (b != null) {
                bvrs.k(bundle, "AttributeBeingReported", b);
            }
            drhj a = e.a();
            if (a != null) {
                bvrs.k(bundle, "IdBeingReported", a);
            }
        }
        super.t(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        wvw a;
        Bundle bundle2 = bundle == null ? this.o : bundle;
        if (bundle2 == null) {
            a = null;
        } else {
            wvv k = wvw.k();
            dpjb dpjbVar = (dpjb) bvrs.f(bundle2, "TripAttributeParamsvehicle", (dssr) dpjb.e.cu(7));
            if (dpjbVar != null) {
                k.i(dpjbVar);
            }
            ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle2.getParcelable("TripAttributeParamsline");
            if (protoBufUtil$ParcelableProtoList != null) {
                k.e(dcdc.r(protoBufUtil$ParcelableProtoList.a((dssr) dpce.f.cu(7))));
            }
            String string = bundle2.getString("TripAttributeParamsheadsign");
            if (string != null) {
                k.d(string);
            }
            String string2 = bundle2.getString("TripAttributeParamstoken");
            if (string2 != null) {
                k.g(string2);
            }
            dgaw dgawVar = (dgaw) bvrs.f(bundle2, "TripAttributeParamsscheduled", (dssr) dgaw.g.cu(7));
            if (dgawVar != null) {
                k.f(dgawVar);
            }
            drhj drhjVar = (drhj) bvrs.f(bundle2, "TripAttributeParamsidentifier", (dssr) drhj.c.cu(7));
            if (drhjVar != null) {
                ((wvk) k).a = drhjVar;
            }
            String string3 = bundle2.getString("TripAttributeParamsved");
            if (string3 != null) {
                k.h(string3);
            }
            k.c(bundle2.getLong("TripAttributeParamsfirstStationTimestamp"));
            String string4 = bundle2.getString("TripAttributeParamsdepartureFeature");
            if (string4 != null) {
                k.b(string4);
            }
            String string5 = bundle2.getString("TripAttributeParamsvehicleToken");
            if (string5 != null) {
                ((wvk) k).b = string5;
            }
            a = k.a();
        }
        this.ad = a;
        if (a != null) {
            wvx c = wvy.c();
            wvm wvmVar = (wvm) c;
            wvmVar.b = (drhn) bvrs.f(bundle2, "AttributeBeingReported", (dssr) drhn.g.cu(7));
            wvmVar.a = (drhj) bvrs.f(bundle2, "IdBeingReported", (dssr) drhj.c.cu(7));
            wvy a2 = c.a();
            this.g = a2;
            if (a2 == null) {
                this.g = wvy.c().a();
            }
            wzx wzxVar = this.b;
            dbsk.s(wzxVar);
            wvy wvyVar = this.g;
            wvw wvwVar = this.ad;
            dbsk.s(wvwVar);
            Activity activity = (Activity) ((dxjd) wzxVar.a).a;
            wzx.a(activity, 1);
            cqhn a3 = wzxVar.b.a();
            wzx.a(a3, 2);
            vtn a4 = wzxVar.c.a();
            wzx.a(a4, 3);
            wzj a5 = wzxVar.d.a();
            wzx.a(a5, 4);
            wyy a6 = wzxVar.e.a();
            wzx.a(a6, 5);
            wvi a7 = wzxVar.f.a();
            wzx.a(a7, 6);
            wzx.a(wvyVar, 7);
            wzx.a(wvwVar, 8);
            this.f = new wzw(activity, a3, a4, a5, a6, a7, wvyVar, wvwVar);
            super.l(bundle);
        }
    }
}
