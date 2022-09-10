package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bguv  reason: default package */
/* loaded from: classes3.dex */
public final class bguv implements bgvd {
    private final Resources a;
    private final dxio<apup> b;

    public bguv(Resources resources, dxio<apup> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_EVENTS_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.aX;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        this.b.a().e(bwrsVar, dboe.EVENT);
    }
}
