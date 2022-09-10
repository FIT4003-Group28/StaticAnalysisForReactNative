package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvj  reason: default package */
/* loaded from: classes3.dex */
public final class bgvj implements bgvd {
    private final Resources a;
    private final dxio<bkpi> b;

    public bgvj(Resources resources, dxio<bkpi> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_REVIEWS_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bi;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        this.b.a().b(bwrsVar, dbpy.a, dbpy.a, dbpy.a, false, dbpy.a);
    }
}
