package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajae  reason: default package */
/* loaded from: classes2.dex */
public final class ajae {
    private final cklf a;

    public ajae(cklf cklfVar) {
        this.a = cklfVar;
    }

    public final void a(Activity activity, cqkj cqkjVar) {
        iii iiiVar = new iii();
        iiiVar.a = activity.getString(R.string.LOCATION_SHARING_FEATURE_TITLE_VARIANT_LOCATION_SHARING);
        String string = activity.getString(R.string.MOD_LEARN_MORE_ABOUT_LOCATION_SHARING_ACTION_TEXT);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) activity.getString(R.string.MOD_LEARN_MORE_TEXT, new Object[]{string}));
        ClickableSpan f = this.a.f("share_location_others_android", cjtd.a(dtxu.ea));
        int indexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(f, indexOf, string.length() + indexOf, 33);
        iiiVar.b = spannableStringBuilder;
        iiiVar.d(activity.getResources().getString(17039370), null, cjtd.a(dtxu.dZ));
        iiiVar.d = LinkMovementMethod.getInstance();
        iiiVar.a(activity, cqkjVar).k();
    }
}
