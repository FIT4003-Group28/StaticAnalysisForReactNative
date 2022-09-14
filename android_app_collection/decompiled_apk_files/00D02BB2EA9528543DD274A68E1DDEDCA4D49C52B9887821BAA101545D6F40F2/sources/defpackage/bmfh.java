package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.io.IOException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bmfh  reason: default package */
/* loaded from: classes3.dex */
public final class bmfh extends gen {
    private static final dcqe e = dcqe.c("bmfh");
    public bwqv a;
    @dzsi
    private bwrs<ilo> ad;
    private String ae;
    private String af;
    private bmfa ag;
    public cqkj b;
    public bmgm c;
    @dzsi
    Locale d;
    @dzsi
    private bmgi g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bmfi) btsx.b(bmfi.class, this)).cW(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf c = this.b.c(new bmgh(), null);
        bmgm bmgmVar = this.c;
        bwrs<ilo> bwrsVar = this.ad;
        dbsk.s(bwrsVar);
        String str = this.ae;
        String str2 = this.af;
        Locale locale = this.d;
        bmgw a = bmgmVar.a.a();
        bmgm.a(a, 1);
        bmgm.a(bmgmVar.b.a(), 2);
        gga a2 = bmgmVar.c.a();
        bmgm.a(a2, 3);
        ckmc a3 = bmgmVar.d.a();
        bmgm.a(a3, 4);
        afha a4 = bmgmVar.e.a();
        bmgm.a(a4, 5);
        cqhn a5 = bmgmVar.f.a();
        bmgm.a(a5, 6);
        bvrb a6 = bmgmVar.g.a();
        bmgm.a(a6, 7);
        bmgm.a(bwrsVar, 8);
        bmgm.a(str, 9);
        bmgm.a(str2, 10);
        bmgl bmglVar = new bmgl(a, a2, a3, a4, a5, a6, bwrsVar, str, str2, locale);
        this.g = bmglVar;
        c.e(bmglVar);
        View c2 = c.c();
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.a = false;
        gdfVar.getWindow().requestFeature(1);
        gdfVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        gdfVar.setContentView(c2);
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            bwrs<ilo> e2 = this.a.e(ilo.class, bundle, "placemark");
            dbsk.s(e2);
            this.ad = e2;
        } catch (IOException unused) {
            bvoo.h("IOException", new Object[0]);
        }
        this.ae = bundle.getString("placeName");
        this.af = bundle.getString("address");
        String string = bundle.getString("locale");
        String string2 = bundle.getString("autoplay");
        this.d = dbsj.d(string) ? null : new Locale(string);
        dbsk.s(string2);
        this.ag = bmfa.a(string2);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxy.ik;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.g != null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) J().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                return;
            }
            if (this.ag == bmfa.PLACE) {
                bmgi bmgiVar = this.g;
                dbsk.s(bmgiVar);
                bmgiVar.j();
                return;
            }
            bmgi bmgiVar2 = this.g;
            dbsk.s(bmgiVar2);
            bmgiVar2.k();
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("placeName", this.ae);
        bundle.putString("address", this.af);
        Locale locale = this.d;
        bundle.putString("locale", locale == null ? "" : locale.getLanguage());
        bundle.putString("autoplay", this.ag.toString());
        this.a.c(bundle, "placemark", this.ad);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        bmgi bmgiVar = this.g;
        if (bmgiVar != null) {
            bmgiVar.o();
        }
        super.u();
    }
}
