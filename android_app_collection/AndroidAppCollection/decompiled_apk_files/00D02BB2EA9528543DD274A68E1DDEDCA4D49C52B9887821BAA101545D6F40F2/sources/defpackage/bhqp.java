package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* renamed from: bhqp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhqp implements cqjb {
    static final cqjb a = new bhqp();

    private bhqp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bhsc bhscVar = (bhsc) cqkpVar;
        int i = bhrg.a;
        String string = context.getResources().getString(R.string.OFFERING_DETAILS_SUGGEST_AN_EDIT_LABEL);
        String string2 = context.getResources().getString(R.string.OFFERING_DETAILS_RAP_FOOTER_SEE_AN_ISSUE, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        int indexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.x().b(context)), indexOf, string.length() + indexOf, 33);
        return spannableStringBuilder;
    }
}
