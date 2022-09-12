package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
import com.google.android.apps.gmm.ugc.intent.ReviewIntent$MinimalPlacemark;
/* compiled from: PG */
/* renamed from: ccfn  reason: default package */
/* loaded from: classes.dex */
public final class ccfn extends afhx {
    public static final dbsl<afga> a;
    private static final dcqe b = dcqe.c("ccfn");
    private static final dnqh c;
    private final dxio<bqji> d;
    private final dxio<begg> e;
    private final dxio<befw> i;
    private final dxio<btvo> j;
    private final dxio<cafi> k;
    private final dxio<cfrt> l;
    private final dxio<chnm> m;
    private final dxio<auhi> n;

    static {
        cjsb cjsbVar = new cjsb();
        cjsbVar.h(ddda.fe.b);
        cjsbVar.d();
        c = cjsbVar.a();
        a = ccfk.a;
    }

    public ccfn(Intent intent, @dzsi String str, dxio<bqji> dxioVar, dxio<begg> dxioVar2, dxio<befw> dxioVar3, dxio<btvo> dxioVar4, dxio<cafi> dxioVar5, dxio<cfrt> dxioVar6, dxio<chnm> dxioVar7, dxio<auhi> dxioVar8) {
        super(intent, str, afid.REVIEW);
        this.d = dxioVar;
        this.e = dxioVar2;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.k = dxioVar5;
        this.l = dxioVar6;
        this.m = dxioVar7;
        this.n = dxioVar8;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 15);
        sb.append(packageName);
        sb.append(".");
        sb.append("ReviewActivity");
        intent.setComponent(new ComponentName(context, sb.toString()));
        return intent;
    }

    private final void i(ilo iloVar, blpk blpkVar, boolean z, dbsg<Integer> dbsgVar, dbsg<String> dbsgVar2) {
        dnqh c2 = bzwi.c(blpkVar);
        boolean z2 = true;
        if (!blpk.REVIEW_AT_A_PLACE_NOTIFICATION.equals(blpkVar) && !blpk.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE.equals(blpkVar)) {
            z2 = false;
        }
        bqjf r = bqjh.r();
        r.f(c2);
        r.d(z2);
        if (z) {
            bqjg b2 = ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams.b();
            b2.b(ckdw.REVIEW_EDITOR_PAGE_SEND_REVIEW_BUTTON_CLICK);
            ((bqir) r).c = dbsg.i(b2.a());
        }
        if (blpk.REVIEW_AT_A_PLACE_NOTIFICATION.equals(blpkVar) || blpk.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE.equals(blpkVar)) {
            ((bqir) r).d = dpyv.REVIEW_AT_A_PLACE;
            dbsg j = dbsg.j((dlif) bvrs.b(this.f.getByteArrayExtra("place_visit_metadata"), (dssr) dlif.d.cu(7)));
            if (j.a()) {
                r.i((dlif) j.b());
            }
        }
        if (dbsgVar.a()) {
            r.j(dbsgVar.b().intValue());
        }
        if (dbsgVar2.a()) {
            ((bqir) r).a = dbsgVar2.b();
        }
        this.d.a().b(bwrs.a(iloVar), r.o());
    }

    @Override // defpackage.afhx
    public final void a() {
        blpk blpkVar;
        int intExtra = this.f.getIntExtra("source", -1);
        blpk[] values = blpk.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                blpkVar = blpk.UNKNOWN;
                break;
            }
            blpkVar = values[i];
            if (intExtra == blpkVar.o) {
                break;
            }
            i++;
        }
        blpk blpkVar2 = blpkVar;
        if (blpk.REVIEW_AT_A_PLACE_NOTIFICATION.equals(blpkVar2)) {
            this.n.a().m(dpyv.REVIEW_AT_A_PLACE.dm);
        }
        boolean booleanExtra = this.f.getBooleanExtra("should_log_conversion_for_review_notification", true);
        dkvn dkvnVar = this.j.a().getNotificationsParameters().n;
        if (dkvnVar == null) {
            dkvnVar = dkvn.e;
        }
        dkvn dkvnVar2 = dkvnVar;
        if (this.f.hasExtra("minimal_placemark_for_launching_review_editor_page")) {
            ReviewIntent$MinimalPlacemark reviewIntent$MinimalPlacemark = (ReviewIntent$MinimalPlacemark) this.f.getParcelableExtra("minimal_placemark_for_launching_review_editor_page");
            ily ilyVar = new ily();
            ilyVar.j(akqi.b(reviewIntent$MinimalPlacemark.a()));
            ilyVar.F(reviewIntent$MinimalPlacemark.b());
            ilyVar.H(reviewIntent$MinimalPlacemark.c());
            ilo d = ilyVar.d();
            int intExtra2 = this.f.getIntExtra("num_rating_stars_for_populating_review_editor_page", 0);
            String e = dbsj.e(this.f.getStringExtra("full_review_text_for_populating_review_editor_page"));
            e(dkvnVar2, d);
            i(d, blpkVar2, booleanExtra, dbsg.i(Integer.valueOf(intExtra2)), dbsg.i(e));
            return;
        }
        String stringExtra = this.f.getStringExtra("feature_id");
        dbsk.s(stringExtra);
        String stringExtra2 = this.f.getStringExtra("place_name");
        dbsk.s(stringExtra2);
        if (!this.f.hasExtra("visit_date_required")) {
            bvoo.h("Visit Date Requirement is missing from the Intent.", new Object[0]);
        }
        boolean booleanExtra2 = this.f.getBooleanExtra("visit_date_required", false);
        int intExtra3 = this.f.getIntExtra("num_rating_stars", 0);
        String e2 = dbsj.e(this.f.getStringExtra("full_review_text"));
        ily ilyVar2 = new ily();
        ilyVar2.k(stringExtra);
        ilyVar2.F(stringExtra2);
        ilyVar2.H(booleanExtra2);
        docc bZ = docg.M.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar = (docg) bZ.b;
        int i2 = docgVar.a | 512;
        docgVar.a = i2;
        docgVar.q = intExtra3;
        e2.getClass();
        docgVar.a = i2 | 1024;
        docgVar.r = e2;
        ilyVar2.v(bZ.bK());
        ilo d2 = ilyVar2.d();
        ccfl ccflVar = new ccfl(this, dkvnVar2, blpkVar2, booleanExtra, d2);
        befu p = befv.p();
        p.j(bwrs.a(d2));
        ((befp) p).a = c;
        p.h(true);
        this.i.a().f(ccflVar, p.m());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_REVIEWS_EDITOR;
    }

    public final void e(dkvn dkvnVar, ilo iloVar) {
        if ((dkvnVar.a & 32) != 0) {
            int a2 = dkhb.a(dkvnVar.d);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 2) {
                dnqh dnqhVar = c;
                begj begjVar = new begj();
                begjVar.b(iloVar);
                begjVar.d = dnqhVar;
                this.e.a().o(begjVar, false, null);
            } else if (i != 3) {
            } else {
                if (this.m.a().n()) {
                    if (this.l.a().b()) {
                        this.l.a().a();
                    }
                    this.m.a().k();
                    return;
                }
                this.k.a().t(dkcp.CONTRIBUTE);
            }
        }
    }

    public final void h(ilo iloVar, blpk blpkVar, boolean z) {
        i(iloVar, blpkVar, z, dbpy.a, dbpy.a);
    }
}
