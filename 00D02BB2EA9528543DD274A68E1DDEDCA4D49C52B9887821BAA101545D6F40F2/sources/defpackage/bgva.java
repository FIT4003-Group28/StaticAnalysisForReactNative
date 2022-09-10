package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgva  reason: default package */
/* loaded from: classes3.dex */
public final class bgva implements bgvd {
    private final Resources a;
    private final dxio<boxa> b;

    public bgva(Resources resources, dxio<boxa> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_HOURS_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bg;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        if (bwrsVar.c() == null) {
            throw new IllegalArgumentException("Cannot open business editor without a placemark");
        }
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.MERCHANT_EXPERIENCE_MENU;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        this.b.a().B(bwrsVar, bZ.bK(), bomu.BUSINESS_HOURS);
    }
}
