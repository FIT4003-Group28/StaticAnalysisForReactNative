package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvi  reason: default package */
/* loaded from: classes3.dex */
public final class bgvi implements bgvd {
    private final Resources a;
    private final dxio<bjbu> b;

    public bgvi(Resources resources, dxio<bjbu> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_PLACE_QA_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bh;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        this.b.a().a(bwrsVar);
    }
}
