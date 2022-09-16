package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
/* compiled from: PG */
/* renamed from: wvw  reason: default package */
/* loaded from: classes7.dex */
public abstract class wvw {
    public static wvv k() {
        return new wvk();
    }

    public abstract dpjb a();

    public abstract dcdc<dpce> b();

    public abstract String c();

    public abstract dgaw d();

    public abstract String e();

    public abstract drhj f();

    public abstract String g();

    public abstract long h();

    public abstract String i();

    public abstract String j();

    public final void l(Bundle bundle) {
        if (a() != null) {
            bvrs.k(bundle, "TripAttributeParamsvehicle", a());
        }
        dcdc<dpce> b = b();
        if (b != null && !b.isEmpty()) {
            bundle.putParcelable("TripAttributeParamsline", new ProtoBufUtil$ParcelableProtoList(b));
        }
        String c = c();
        if (c != null) {
            bundle.putString("TripAttributeParamsheadsign", c);
        }
        dgaw d = d();
        if (d != null) {
            bvrs.k(bundle, "TripAttributeParamsscheduled", d);
        }
        String e = e();
        if (e != null) {
            bundle.putString("TripAttributeParamstoken", e);
        }
        drhj f = f();
        if (f != null) {
            bvrs.k(bundle, "TripAttributeParamsidentifier", f);
        }
        if (g() != null) {
            bundle.putString("TripAttributeParamsved", g());
        }
        bundle.putLong("TripAttributeParamsfirstStationTimestamp", h());
        if (i() != null) {
            bundle.putString("TripAttributeParamsdepartureFeature", i());
        }
        String j = j();
        if (j != null) {
            bundle.putString("TripAttributeParamsvehicleToken", j);
        }
    }
}
