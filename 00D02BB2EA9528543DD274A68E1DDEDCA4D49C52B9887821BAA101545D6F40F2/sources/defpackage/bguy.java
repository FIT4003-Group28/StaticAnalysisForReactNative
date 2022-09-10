package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bguy  reason: default package */
/* loaded from: classes3.dex */
public final class bguy implements bgvd {
    private final Resources a;
    private final dxio<apup> b;

    public bguy(Resources resources, dxio<apup> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_UPDATES_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.ba;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        this.b.a().e(bwrsVar, dboe.STANDARD);
    }
}
