package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: abun  reason: default package */
/* loaded from: classes2.dex */
public class abun implements abms {
    protected final ilo b;
    private final Activity c;
    private final dxio<begg> d;
    private final cjtd e;
    @dzsi
    private final acwt f;

    public abun(Activity activity, dxio<begg> dxioVar, dvyw dvywVar, @dzsi acwt acwtVar, ddho ddhoVar, @dzsi ddet ddetVar) {
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        ilo d = ilyVar.d();
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = d.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar2 = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar2.c = bK;
        ddetVar2.a |= 1;
        if (ddetVar != null) {
            bZ.bC(ddetVar);
        }
        cjta c = cjtd.c(d.bZ());
        c.d = ddhoVar;
        c.s(bZ.bK());
        cjtd a = c.a();
        this.c = activity;
        this.d = dxioVar;
        this.f = acwtVar;
        ily ilyVar2 = new ily();
        ilyVar2.E(dvywVar);
        this.b = ilyVar2.d();
        this.e = a;
    }

    @dzsi
    private final String a(String str) {
        ArrayList arrayList = new ArrayList();
        String ar = this.b.ar();
        if (!TextUtils.isEmpty(ar)) {
            arrayList.add(ar);
        }
        String Y = this.b.Y();
        if (!TextUtils.isEmpty(Y)) {
            arrayList.add(Y);
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join(str, arrayList);
        }
        return null;
    }

    @Override // defpackage.abms
    public jic d(int i) {
        dwfl bJ = this.b.bJ();
        if (bJ == null || (bJ.a & 128) == 0) {
            dvyw h = this.b.h();
            if (h.ap.size() <= 0 || (h.ap.get(0).a & 1) == 0) {
                return new jic((String) null, ckqc.FULLY_QUALIFIED, (int) R.drawable.guide_no_image_blue, 250);
            }
            return new jic(dbsj.f(h.ap.get(0).b), ckqc.FULLY_QUALIFIED, cqrt.c(R.color.quantum_grey300), 250);
        }
        return new jic(bJ.h, jfv.b(bJ), cqrt.c(R.color.quantum_grey300), 250);
    }

    @Override // defpackage.abms
    public String e() {
        return this.b.n();
    }

    @Override // defpackage.abms
    public Integer f() {
        return 1;
    }

    @Override // defpackage.abms
    @dzsi
    public String g() {
        return a("  •  ");
    }

    @Override // defpackage.abms
    @dzsi
    public String h() {
        return a(" · ");
    }

    @Override // defpackage.abms
    @dzsi
    public Float i() {
        if (this.b.ae()) {
            return Float.valueOf(this.b.af());
        }
        return null;
    }

    @Override // defpackage.abms
    @dzsi
    public String j() {
        if (this.b.ae()) {
            return String.format(Locale.getDefault(), "%.1f", i());
        }
        return null;
    }

    @Override // defpackage.abms
    public String k() {
        int X = this.b.X();
        if (X > 0) {
            return this.c.getResources().getQuantityString(R.plurals.REVIEW_COUNT_SHORT, X, Integer.valueOf(X));
        }
        return this.c.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.abms
    public String l() {
        int X = this.b.X();
        if (X > 0) {
            return this.c.getResources().getQuantityString(R.plurals.REVIEW_COUNT_ACCESSIBILITY, X, Integer.valueOf(X));
        }
        return this.c.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.abms
    public cqkl m(cjqm cjqmVar) {
        acwt acwtVar = this.f;
        if (acwtVar != null) {
            acwtVar.a();
        }
        begj begjVar = new begj();
        begjVar.b(this.b);
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        begjVar.c(false);
        this.d.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.abms
    public cjtd n() {
        return this.e;
    }
}
