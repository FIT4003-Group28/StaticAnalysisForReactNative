package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvb  reason: default package */
/* loaded from: classes3.dex */
public final class bgvb implements bgvd {
    private final Resources a;
    private final dxio<boxa> b;

    public bgvb(Resources resources, dxio<boxa> dxioVar) {
        dbsk.l(true);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MERCHANT_PANEL_BUSINESS_INFORMATION_LABEL);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bb;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            throw new IllegalArgumentException("Cannot open business editor without a placemark");
        }
        dobr cy = c.cy();
        if (cy != null) {
            for (dobk dobkVar : cy.f) {
                int a = dobj.a(dobkVar.c);
                if (a != 0 && a == 2 && dobkVar.a == 2) {
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
                    this.b.a().C(bwrsVar, bZ.bK(), dobkVar.a == 2 ? (String) dobkVar.b : "");
                    return;
                }
            }
        }
        this.b.a().F(bwrsVar);
    }
}
