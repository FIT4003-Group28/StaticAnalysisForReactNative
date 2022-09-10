package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgux  reason: default package */
/* loaded from: classes3.dex */
public final class bgux implements bgvd {
    private final Resources a;
    private final dxio<bbut> b;

    public bgux(Resources resources, dxio<bbut> dxioVar) {
        this.a = resources;
        this.b = dxioVar;
        dbsk.l(true);
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_PHOTOS_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.aZ;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_PLACESHEET_PHOTOS_TAB_AND_MERCHANT_MODE_SNACKBAR);
        m.e(dwyd.MERCHANT_EXPERIENCE_MENU);
        ((bbsu) m).b = bwrsVar.c();
        this.b.a().j(m.a());
    }
}
