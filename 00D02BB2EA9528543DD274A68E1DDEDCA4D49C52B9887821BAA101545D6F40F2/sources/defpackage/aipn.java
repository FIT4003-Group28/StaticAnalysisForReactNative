package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aipn  reason: default package */
/* loaded from: classes2.dex */
final class aipn implements cqjb<aipo, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(aipo aipoVar, Context context) {
        CharSequence a = aipoVar.a();
        if (!cqjv.v(a).booleanValue()) {
            String string = context.getResources().getString(R.string.MOD_CAN_SEE_TRIP_PROGRESS);
            String a2 = ajsb.a(context.getResources(), alp.a(), R.string.MOD_CAN_SEE_TRIP_PROGRESS, a);
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new StyleSpan(1), string.length() - 2, a2.length(), 0);
            return spannableString;
        }
        return "";
    }
}
