package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* renamed from: bkno  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkno implements cqjb {
    static final cqjb a = new bkno();

    private bkno() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bknp.a;
        String string = context.getResources().getString(R.string.MENU_LINK_TITLE);
        String a2 = ((bknq) cqkpVar).a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.append((CharSequence) " · ");
        dbsk.s(a2);
        spannableStringBuilder.append((CharSequence) a2);
        int indexOf = spannableStringBuilder.toString().indexOf(a2);
        int length = a2.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.t().b(context)), 0, indexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.x().b(context)), indexOf, length + indexOf, 33);
        return spannableStringBuilder;
    }
}
