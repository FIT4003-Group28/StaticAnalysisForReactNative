package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: armu  reason: default package */
/* loaded from: classes2.dex */
public class armu implements armz, arka {
    private static final String a = String.valueOf(armu.class.getCanonicalName()).concat(".ARRIVED_AT_PLACEMARK_REF_BUNDLE_KEY");
    private final bwqv b;
    private final dxio<begg> c;
    private final Activity d;
    @dzsi
    private ilo e = null;
    @dzsi
    private bwrs<ilo> f;

    public armu(Activity activity, bwqv bwqvVar, dxio<begg> dxioVar) {
        this.d = activity;
        this.b = bwqvVar;
        this.c = dxioVar;
    }

    @Override // defpackage.arka
    public void a(@dzsi Bundle bundle) {
        if (bundle != null) {
            String str = a;
            if (!bundle.containsKey(str)) {
                return;
            }
            try {
                this.f = this.b.e(ilo.class, bundle, str);
            } catch (IOException e) {
                bvoo.j(e);
                this.f = null;
            }
        }
    }

    @Override // defpackage.arka
    public void b() {
    }

    @Override // defpackage.arka
    public void c() {
    }

    @Override // defpackage.arka
    public void d(Bundle bundle) {
        bwrs<ilo> bwrsVar = this.f;
        if (bwrsVar != null) {
            this.b.c(bundle, a, bwrsVar);
        }
    }

    @Override // defpackage.arka
    public void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public void f() {
    }

    @Override // defpackage.arka
    public void g(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (atlqVar.b()) {
            if (this.f != null) {
                return;
            }
            ily ilyVar = new ily();
            crqf crqfVar = atlqVar.m;
            dbsk.s(crqfVar);
            ilyVar.I(crqfVar.g().a.l());
            this.f = bwrs.a(ilyVar.d());
            bwrs<ilo> bwrsVar = this.f;
            dbsk.s(bwrsVar);
            this.c.a().q(bwrsVar, false);
            return;
        }
        ilo iloVar = atlqVar.q;
        if (iloVar == null) {
            return;
        }
        iloVar.toString();
        bwrs<ilo> bwrsVar2 = this.f;
        if (bwrsVar2 != null) {
            iloVar = bwrsVar2.c();
            dbsk.s(iloVar);
        }
        ilo iloVar2 = this.e;
        if (iloVar2 != null && iloVar2.cr(iloVar)) {
            return;
        }
        this.e = iloVar;
        cqkx.p(this);
    }

    @Override // defpackage.armz
    public Boolean h() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.armz
    public jic i() {
        dwfl bJ;
        ilo iloVar = this.e;
        if (iloVar != null) {
            dwgn bF = iloVar.bF();
            if (bF.a.size() > 0) {
                bJ = bF.a.get(0);
            } else {
                bJ = iloVar.bJ();
            }
            if (bJ != null && (bJ.a & 128) != 0) {
                return new jic(bJ.h, jfv.b(bJ), cqrt.c(R.color.qu_grey_300), 250);
            }
        }
        return new jic((String) null, ckqc.FULLY_QUALIFIED, (int) R.drawable.guide_no_image_blue, 250);
    }

    @Override // defpackage.armz
    public String j() {
        ilo iloVar = this.e;
        return iloVar == null ? "" : iloVar.n();
    }

    @Override // defpackage.armz
    @dzsi
    public String k() {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String ar = iloVar.ar();
        if (!TextUtils.isEmpty(ar)) {
            arrayList.add(ar);
        }
        String Y = iloVar.Y();
        if (!TextUtils.isEmpty(Y)) {
            arrayList.add(Y);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("  •  ", arrayList);
    }

    @Override // defpackage.armz
    public Boolean l() {
        ilo iloVar = this.e;
        boolean z = false;
        if (iloVar != null && iloVar.ae()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.armz
    @dzsi
    public Float m() {
        ilo iloVar = this.e;
        if (iloVar == null || !iloVar.ae()) {
            return null;
        }
        return Float.valueOf(iloVar.af());
    }

    @Override // defpackage.armz
    @dzsi
    public String n() {
        ilo iloVar = this.e;
        if (iloVar == null || !iloVar.ae()) {
            return null;
        }
        return String.format(Locale.getDefault(), "%.1f", m());
    }

    @Override // defpackage.armz
    public String o() {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return "";
        }
        int X = iloVar.X();
        if (X > 0) {
            return this.d.getResources().getQuantityString(R.plurals.REVIEW_COUNT_SHORT, X, Integer.valueOf(X));
        }
        return this.d.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.armz
    public cqkl p() {
        ilo iloVar = this.e;
        if (iloVar != null) {
            begj begjVar = new begj();
            begjVar.b(iloVar);
            begjVar.c = jjn.COLLAPSED;
            begjVar.n = false;
            begjVar.c(true);
            this.c.a().n(begjVar, true, null);
        }
        return cqkl.a;
    }
}
