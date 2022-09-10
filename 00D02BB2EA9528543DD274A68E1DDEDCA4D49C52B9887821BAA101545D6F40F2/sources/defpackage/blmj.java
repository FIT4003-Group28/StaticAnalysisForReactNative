package defpackage;

import android.app.Activity;
import android.text.Html;
import com.google.android.apps.gmm.shared.util.IncognitoSafeURLSpan;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: blmj  reason: default package */
/* loaded from: classes3.dex */
public final class blmj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static acpa a(Activity activity, boolean z) {
        CharSequence a = IncognitoSafeURLSpan.a(Html.fromHtml(activity.getString(true != z ? R.string.REVIEWS_LEGAL_DISCLOSURE_TOOLTIP : R.string.TRUSTYOU_AND_REVIEWS_LEGAL_DISCLOSURE_TOOLTIP, new Object[]{String.format("https://support.google.com/contributionpolicy/answer/7400114?ref_topic=7422769&hl=%s", Locale.getDefault().getLanguage())})));
        return new acpc(a, a, acpc.c);
    }
}
