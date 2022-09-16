package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: adxe  reason: default package */
/* loaded from: classes2.dex */
public class adxe implements advi {
    protected final ilo a;
    public boolean b;
    private final Activity c;
    private final ahjq d;
    private final bvsl e;
    private final dxio<adyg> f;
    private final cjtd g;

    public adxe(Activity activity, ahjq ahjqVar, bvsl bvslVar, dxio<adyg> dxioVar, dvyw dvywVar, cjtd cjtdVar, boolean z) {
        this.b = false;
        this.c = activity;
        this.d = ahjqVar;
        this.e = bvslVar;
        this.f = dxioVar;
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        this.a = ilyVar.d();
        this.g = cjtdVar;
        this.b = z;
    }

    @Override // defpackage.advi
    public String a() {
        return this.a.n();
    }

    @Override // defpackage.advi
    @dzsi
    public jic b() {
        if (!this.b) {
            return null;
        }
        dwfl bJ = this.a.bJ();
        if (bJ == null || (bJ.a & 128) == 0) {
            dvyw h = this.a.h();
            if (h.ap.size() <= 0 || (h.ap.get(0).a & 1) == 0) {
                return new jic((String) null, ckqc.FULLY_QUALIFIED, (int) R.drawable.guide_no_image_blue, 250);
            }
            return adyg.c(dbsj.f(h.ap.get(0).b), ckqc.FULLY_QUALIFIED, null);
        }
        return adyg.c(bJ.h, jfv.b(bJ), null);
    }

    @Override // defpackage.advi
    @dzsi
    public String c() {
        ArrayList arrayList = new ArrayList();
        String ar = this.a.ar();
        if (!TextUtils.isEmpty(ar)) {
            arrayList.add(ar);
        }
        String Y = this.a.Y();
        if (!TextUtils.isEmpty(Y)) {
            arrayList.add(Y);
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join("  •  ", arrayList);
        }
        return null;
    }

    @Override // defpackage.advi
    @dzsi
    public String d() {
        ArrayList arrayList = new ArrayList();
        String c = c();
        if (!dbsj.d(c)) {
            arrayList.add(c);
        }
        String a = isl.a(this.d.a(), this.a.aj(), this.e);
        if (!dbsj.d(a)) {
            arrayList.add(a);
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join("  •  ", arrayList);
        }
        return null;
    }

    @Override // defpackage.advi
    @dzsi
    public Float e() {
        if (this.a.ae()) {
            return Float.valueOf(this.a.af());
        }
        return null;
    }

    @Override // defpackage.advi
    @dzsi
    public String f() {
        if (this.a.ae()) {
            return String.format(Locale.getDefault(), "%.1f", e());
        }
        return null;
    }

    @Override // defpackage.advi
    public String g() {
        Float e = e();
        return e != null ? this.c.getResources().getQuantityString(R.plurals.ACCESSIBILITY_DECIMAL_STARS, 5, e) : "";
    }

    @Override // defpackage.advi
    public String h() {
        int X = this.a.X();
        if (X > 0) {
            return this.c.getResources().getQuantityString(R.plurals.REVIEW_COUNT_SHORT, X, Integer.valueOf(X));
        }
        return this.c.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.advi
    public String i() {
        int X = this.a.X();
        if (X > 0) {
            return this.c.getResources().getQuantityString(R.plurals.REVIEW_COUNT_ACCESSIBILITY, X, Integer.valueOf(X));
        }
        return this.c.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.advi
    public cqkl j(cjqm cjqmVar) {
        this.f.a().a(this.a, jjn.COLLAPSED, null);
        return cqkl.a;
    }

    @Override // defpackage.advi
    public cjtd k() {
        return this.g;
    }

    @Override // defpackage.advi
    public cqfd l() {
        return new cqfd(this) { // from class: adxd
            private final adxe a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                adxe adxeVar = this.a;
                if (!adxeVar.b) {
                    adxeVar.b = true;
                    cqkx.p(adxeVar);
                }
                return true;
            }
        };
    }
}
