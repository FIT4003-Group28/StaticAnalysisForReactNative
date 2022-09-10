package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceyr  reason: default package */
/* loaded from: classes4.dex */
public class ceyr implements jay {
    public final cdjd a;
    public final boolean b;
    public final bwrs<ilo> c;
    public final Activity d;
    public final bqji e;
    public final cdjj f;
    public final cqkj g;
    private final String h;
    private final String i;
    private int j;

    public ceyr(cdjd cdjdVar, boolean z, bwrs<ilo> bwrsVar, String str, String str2, Activity activity, bqji bqjiVar, cdjj cdjjVar, cqkj cqkjVar) {
        this.a = cdjdVar;
        this.b = z;
        this.c = bwrsVar;
        this.h = str;
        this.i = str2;
        this.d = activity;
        this.e = bqjiVar;
        this.f = cdjjVar;
        this.g = cqkjVar;
    }

    private static boolean e(cdjd cdjdVar) {
        return !cdjdVar.c().b().a() || cdjdVar.c().b().b().a().isEmpty();
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    public void c(int i) {
        this.j = i;
    }

    public final void d(boolean z) {
        Toast.makeText(this.d, true != z ? R.string.DELETE_REVIEW_FAILED : R.string.DELETE_REVIEW_SUCCESS, 1).show();
    }

    @Override // defpackage.jay
    @dzsi
    public jht b() {
        int i = this.j;
        String string = i > 0 ? this.d.getString(R.string.ACCESSIBILITY_OVERFLOW_BUTTON_FOR_REVIEW_WITH_ORDINAL, new Object[]{Integer.valueOf(i), this.h, this.i}) : this.d.getString(R.string.ACCESSIBILITY_OVERFLOW_BUTTON_FOR_REVIEW_WITH_DETAILS, new Object[]{this.h, this.i});
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = string;
        jhiVar.c = Integer.valueOf((int) R.drawable.ic_overflow_selector);
        jhm a = jhm.a();
        a.a = this.d.getString(true != e(this.a) ? R.string.EDIT_REVIEW : R.string.EDIT_RATING);
        a.g = new jhn(this) { // from class: ceym
            private final ceyr a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                ceyr ceyrVar = this.a;
                dnqg bZ = dnqh.p.bZ();
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.l = dnmuVar.ap;
                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                String c = cjqmVar.a().c("");
                if (!c.isEmpty()) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh dnqhVar2 = (dnqh) bZ.b;
                    c.getClass();
                    dnqhVar2.a |= 2;
                    dnqhVar2.c = c;
                }
                if (ceyrVar.b) {
                    cdjj cdjjVar = ceyrVar.f;
                    bwrs<ilo> bwrsVar = ceyrVar.c;
                    cdje e = cdjf.e();
                    e.b(bZ.bK());
                    e.c(chbv.NEVER_SHOW);
                    ((cdit) e).b = ceyrVar.a;
                    cdjjVar.a(bwrsVar, e.a());
                    return;
                }
                bqji bqjiVar = ceyrVar.e;
                bwrs<ilo> bwrsVar2 = ceyrVar.c;
                bqjf r = bqjh.r();
                r.f(bZ.bK());
                r.n(chbv.NEVER_SHOW);
                bqjiVar.b(bwrsVar2, r.o());
            }
        };
        a.f = cjtd.a(this.b ? dtxl.fp : dtxl.fy);
        jho c = a.c();
        jhm a2 = jhm.a();
        a2.a = this.d.getString(true != e(this.a) ? R.string.DELETE_REVIEW : R.string.DELETE_RATING);
        a2.g = new jhn(this) { // from class: ceyn
            private final ceyr a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                String string2;
                final ceyr ceyrVar = this.a;
                final dnqg bZ = dnqh.p.bZ();
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                boolean z = false;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.l = dnmuVar.ap;
                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                String c2 = cjqmVar.a().c("");
                if (!c2.isEmpty()) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh dnqhVar2 = (dnqh) bZ.b;
                    c2.getClass();
                    dnqhVar2.a |= 2;
                    dnqhVar2.c = c2;
                }
                if (!ceyrVar.a.c().b().a() || ceyrVar.a.c().b().b().a().isEmpty()) {
                    z = true;
                }
                iii iiiVar = new iii();
                if (z) {
                    string2 = ceyrVar.d.getString(R.string.CONFIRM_DELETE_PUBLISHED_RATING_AND_MEDIA);
                } else {
                    string2 = ceyrVar.d.getString(R.string.CONFIRM_DELETE_PUBLISHED_REVIEW_AND_MEDIA);
                }
                iiiVar.b = string2;
                iiiVar.d(ceyrVar.d.getString(R.string.YES_BUTTON), new View.OnClickListener(ceyrVar, bZ) { // from class: ceyo
                    private final ceyr a;
                    private final dnqg b;

                    {
                        this.a = ceyrVar;
                        this.b = bZ;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ceyr ceyrVar2 = this.a;
                        dnqg dnqgVar = this.b;
                        if (ceyrVar2.b) {
                            ceyrVar2.f.b(ceyrVar2.a.a().g(), dnqgVar.bK(), ceyrVar2.c, new ceyp(ceyrVar2));
                        } else {
                            ceyrVar2.e.e(ceyrVar2.a.a().g(), cdja.PUBLISHED, dnqgVar.bK(), ceyrVar2.c, new ceyq(ceyrVar2));
                        }
                    }
                }, null);
                iiiVar.c(ceyrVar.d.getString(R.string.NO_BUTTON), null, null);
                iiiVar.a(ceyrVar.d, ceyrVar.g).k();
            }
        };
        a2.f = cjtd.a(this.b ? dtxl.fo : dtxl.fx);
        h.e(dcdc.g(c, a2.c()));
        return h.b();
    }
}
