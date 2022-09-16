package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvg  reason: default package */
/* loaded from: classes3.dex */
public final class bgvg implements bgvd {
    private final Resources a;
    private final dxio<beii> b;

    public bgvg(Resources resources, dxio<beii> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_CALLS_PAGE_TITLE);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bc;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        beii a = this.b.a();
        gga ggaVar = a.a;
        bwqv bwqvVar = a.b;
        beix beixVar = new beix();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "MerchantCallsFragment.placemark", bwrsVar);
        bwqvVar.c(bundle, "BaseMerchantCallsFragment.merchantCallsState", bwrs.a(bvrt.b(benb.b)));
        beixVar.B(bundle);
        beixVar.aJ();
        ggaVar.D(beixVar);
    }
}
