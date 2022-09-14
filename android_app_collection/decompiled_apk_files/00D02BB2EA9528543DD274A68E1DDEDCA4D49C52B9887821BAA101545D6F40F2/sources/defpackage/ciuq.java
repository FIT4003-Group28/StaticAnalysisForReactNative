package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ciuq  reason: default package */
/* loaded from: classes4.dex */
public final class ciuq extends cqiw<ciur> {
    public static final /* synthetic */ int a = 0;

    public static CharSequence e(ciur ciurVar, Context context) {
        Resources resources = context.getResources();
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        switch (ciurVar.a().ordinal()) {
            case 0:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_CHECK_BACK_LATER);
            case 1:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_GOOGLE_PHOTO_AUTO_BACKUP);
            case 2:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_RATE_BEFORE_REVIEW_WITHOUT_LINK);
            case 3:
                String string = context.getString(R.string.CZ_ZERO_STATE_SUBHEADING_UPLOAD_PHOTO_BEFORE_TAG_LINK_TEXT);
                String string2 = context.getString(R.string.CZ_ZERO_STATE_SUBHEADING_UPLOAD_PHOTO_BEFORE_TAG, string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                if (string2.contains(string)) {
                    int indexOf = spannableStringBuilder.toString().indexOf(string);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.y().b(context)), indexOf, string.length() + indexOf, 17);
                }
                return spannableStringBuilder;
            case 4:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_CREATE_NEW_LIST);
            case 5:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_UPLOAD_PHOTO_BEFORE_TAG_V2);
            case 6:
                return resources.getText(R.string.CZ_ZERO_STATE_SUBHEADING_MODERATE_EDIT);
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ciur> a() {
        return ijd.a(cqgr.x(ibm.b()), cqgr.gd(cqgr.cd(-1), cqgr.aJ(1), cqgr.dr(1), cqgr.dz(cqrp.d(20.0d), cqrp.d(40.0d), cqrp.d(20.0d), cqrp.d(40.0d)), cqgr.x(ibm.b()), cqgr.gc(cqgr.aJ(17), cqgr.ce(cqrp.d(166.0d)), cqgr.bq(cqrp.d(135.0d)), cqgr.dD(ciud.a), cqgr.dP(ciue.a), cqgr.eF(ciuf.a), iue.b(cjtd.a(dtxl.ib))), cqgr.gq(cqgr.eK(ciug.a), ibq.e(), cqgr.co(cqrp.d(8.0d), false), cqgr.dU(cqrp.d(4.0d)), cqgr.eN(4)), cqgr.gq(cqgr.aE(cqjv.w(ciuh.a)), cqgr.dU(cqrp.d(20.0d)), cqgr.eK(ciui.a), ibq.p(), cqgr.eN(4), cqgr.cJ(ciuj.a), cqgr.J(B().c()), cqgr.cU(B().b()), iue.b(B().d())), cqgr.fQ(new ciup(), B().e(), new cqmp[0])));
    }
}
