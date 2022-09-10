package defpackage;

import android.app.Activity;
import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjcv  reason: default package */
/* loaded from: classes4.dex */
public class cjcv implements cjcu {
    private final Activity a;
    private final boolean b;
    private final dbsg<String> c;
    private final String d;
    private final cjct e;
    @dzsi
    private final cjtd f;
    private final cjcs g;

    public cjcv(Activity activity, boolean z, dbsg<String> dbsgVar, String str, cjct cjctVar, @dzsi cjtd cjtdVar, cjcs cjcsVar) {
        this.a = activity;
        this.b = z;
        this.c = dbsgVar;
        this.d = str;
        this.e = cjctVar;
        this.f = cjtdVar;
        this.g = cjcsVar;
    }

    @Override // defpackage.cjcu
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.cjcu
    public cqkl b() {
        this.g.a(!a().booleanValue());
        return cqkl.a;
    }

    @Override // defpackage.cjcu
    public CharSequence c() {
        if (this.c.a()) {
            return Html.fromHtml(this.a.getResources().getString(R.string.REVIEW_SEE_ORIGINAL_WITH_LANGUAGE, this.c.b()));
        }
        return Html.fromHtml(this.a.getResources().getString(R.string.REVIEW_SEE_ORIGINAL_WITHOUT_LANGUAGE));
    }

    @Override // defpackage.cjcu
    public CharSequence d() {
        if (this.e.equals(cjct.OWNER_RESPONSE)) {
            if (!this.b) {
                return this.a.getResources().getString(R.string.OWNER_RESPONSE_SEE_TRANSLATION_DETAILED_CONTENT_DESCRIPTION, this.d);
            }
            if (this.c.a()) {
                return this.a.getResources().getString(R.string.OWNER_RESPONSE_SEE_ORIGINAL_DETAILED_CONTENT_DESCRIPTION_WITH_LANGUAGE, this.d, this.c.b());
            }
            return this.a.getResources().getString(R.string.OWNER_RESPONSE_SEE_ORIGINAL_DETAILED_CONTENT_DESCRIPTION, this.d);
        } else if (!this.b) {
            return this.a.getResources().getString(R.string.REVIEW_SEE_TRANSLATION_DETAILED_CONTENT_DESCRIPTION, this.d);
        } else {
            if (this.c.a()) {
                return this.a.getResources().getString(R.string.REVIEW_SEE_ORIGINAL_DETAILED_CONTENT_DESCRIPTION_WITH_LANGUAGE, this.d, this.c.b());
            }
            return this.a.getResources().getString(R.string.REVIEW_SEE_ORIGINAL_DETAILED_CONTENT_DESCRIPTION, this.d);
        }
    }

    @Override // defpackage.cjcu
    public cjtd e(ddho ddhoVar, deaa deaaVar) {
        cjta c = cjtd.c(this.f);
        c.d = ddhoVar;
        ddzy bZ = deab.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        return c.a();
    }
}
