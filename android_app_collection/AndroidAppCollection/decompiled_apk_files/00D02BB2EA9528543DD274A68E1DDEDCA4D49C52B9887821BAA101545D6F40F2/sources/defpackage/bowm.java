package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bowm  reason: default package */
/* loaded from: classes3.dex */
final class bowm implements aket {
    @dzsi
    private final bwrs<ilo> a;
    private final bvrt<dnqe> b;

    public bowm(@dzsi bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        this.a = bwrsVar;
        this.b = bvrt.b(dnqeVar);
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ilo a;
        boolean z;
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            a = bwrsVar.c();
            z = false;
        } else {
            a = bpuo.a(dcdc.e(), null);
            z = true;
        }
        aneb z2 = anee.z();
        z2.r(ggaVar.getString(R.string.RAP_PANNABLE_TITLE));
        z2.j(4);
        dbsk.s(a);
        andx andxVar = (andx) z2;
        andxVar.c = a.aj();
        andxVar.b = ggaVar.getString(R.string.FAA_NEXT);
        andxVar.h = dbsg.i(aned.GM2_TOOLBAR);
        anee a2 = z2.a();
        anca ancaVar = new anca();
        Bundle bundle = new Bundle();
        bundle.putBoolean("shouldReverseGeocodeKey", z);
        bundle.putBoolean("openInSatelliteMode", true);
        bundle.putInt("viewportMetadataType", 6);
        bundle.putSerializable("args", a2);
        bundle.putSerializable("placemarkForFaa", a);
        bvrs.k(bundle, "clientState", this.b.e((dssr) dnqe.i.cu(7), dnqe.i));
        if (a2.g() != null) {
            ily ilyVar = new ily();
            akqq g = a2.g();
            dbsk.s(g);
            ilyVar.q(g);
            bundle.putSerializable("placemark", ilyVar.d());
        }
        ancaVar.B(bundle);
        ggaVar.D(ancaVar);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
