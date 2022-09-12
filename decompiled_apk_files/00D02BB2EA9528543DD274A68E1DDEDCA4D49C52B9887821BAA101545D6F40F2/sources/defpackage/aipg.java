package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aipg  reason: default package */
/* loaded from: classes2.dex */
final class aipg implements cqjb<aiph, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(aiph aiphVar, Context context) {
        CharSequence a = aiphVar.a();
        if (!cqjv.v(a).booleanValue()) {
            String string = context.getResources().getString(R.string.MOD_LOCAL_TIME_ZONE);
            String a2 = ajsb.a(context.getResources(), alp.a(), R.string.MOD_LOCAL_TIME_ZONE, a);
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new StyleSpan(1), string.length() - 2, a2.length(), 33);
            return spannableString;
        }
        return "";
    }
}
