package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvc  reason: default package */
/* loaded from: classes3.dex */
public final class bgvc implements bgvd {
    private final Resources a;
    private final dxio<apus> b;

    public bgvc(Resources resources, dxio<apus> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_PERFORMANCE_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.be;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        this.b.a().e(bwrsVar, false);
    }
}
