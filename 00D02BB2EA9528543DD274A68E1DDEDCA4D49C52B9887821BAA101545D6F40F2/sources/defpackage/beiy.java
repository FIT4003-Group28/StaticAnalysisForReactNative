package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beiy  reason: default package */
/* loaded from: classes3.dex */
public final class beiy extends beiv<benp> {
    public cqkj ah;
    public beoy ai;
    private beox aj;

    public beiy() {
        super(true);
    }

    @Override // defpackage.beiv
    protected final String aR() {
        return this.b.getString(R.string.MERCHANT_PANEL_CALLS_HISTORY);
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        aS();
        this.af = this.ah.e(new bekk());
        this.af.e(this.aj);
        return this.af.c();
    }

    @Override // defpackage.beiv, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bwrs<bvrt<benb>> bwrsVar;
        bwrs<ilo> bwrsVar2;
        cqtd a;
        super.l(bundle);
        try {
            Bundle bundle2 = this.o;
            String string = bundle2.getString("MerchantCallsHistoryFragment.displayName");
            dgfy dgfyVar = (dgfy) bvrs.f(bundle2, "MerchantCallsHistoryFragment.phoneNumber", (dssr) dgfy.f.cu(7));
            this.ae = this.d.e(ilo.class, bundle2, "MerchantCallsHistoryFragment.placemark");
            Bitmap bitmap = (Bitmap) bundle2.getParcelable("MerchantCallsHistoryFragment.profileImagePlaceholder");
            int i = bundle2.getInt("MerchantCallsHistoryFragment.profileImagePlaceholderAvatarColor");
            String string2 = bundle2.getString("MerchantCallsHistoryFragment.profileImageUrl");
            if (string == null || (bwrsVar = this.ad) == null || dgfyVar == null || (bwrsVar2 = this.ae) == null) {
                return;
            }
            beoy beoyVar = this.ai;
            ckqc ckqcVar = ckqc.FIFE_MONOGRAM_CIRCLE_CROP;
            if (bitmap == null) {
                a = cqrt.g(2131232133, cqta.d(i));
            } else {
                a = cqtt.a(bitmap);
            }
            jic jicVar = new jic(string2, ckqcVar, a, 0);
            ff ffVar = (ff) ((dxjd) beoyVar.a).a;
            beoy.a(ffVar, 1);
            cqhn a2 = beoyVar.b.a();
            beoy.a(a2, 2);
            bgyb a3 = beoyVar.c.a();
            beoy.a(a3, 3);
            beot a4 = beoyVar.d.a();
            beoy.a(a4, 4);
            beoh a5 = beoyVar.e.a();
            beoy.a(a5, 5);
            bepv a6 = beoyVar.f.a();
            beoy.a(a6, 6);
            beid a7 = beoyVar.g.a();
            beoy.a(a7, 7);
            Executor a8 = beoyVar.h.a();
            beoy.a(a8, 8);
            beoy.a(string, 9);
            beoy.a(bwrsVar, 10);
            beoy.a(dgfyVar, 11);
            beoy.a(bwrsVar2, 12);
            beoy.a(jicVar, 13);
            beox beoxVar = new beox(ffVar, a2, a3, a4, a5, a6, a7, a8, string, bwrsVar, dgfyVar, bwrsVar2, jicVar);
            this.aj = beoxVar;
            beoxVar.n();
            this.ag = this.aj;
            aT();
        } catch (IOException e) {
            bvoo.j(e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.aE;
    }
}
