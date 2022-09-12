package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bguz  reason: default package */
/* loaded from: classes3.dex */
public final class bguz implements bgvd {
    private final Resources a;
    private final dxio<bhje> b;

    public bguz(Resources resources, dxio<bhje> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_ADS_CREATION_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bd;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar != null) {
            dvwi dvwiVar = iloVar.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            dnpq dnpqVar = dvwiVar.h;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            this.b.a().a(dnpqVar.c);
        }
    }
}
