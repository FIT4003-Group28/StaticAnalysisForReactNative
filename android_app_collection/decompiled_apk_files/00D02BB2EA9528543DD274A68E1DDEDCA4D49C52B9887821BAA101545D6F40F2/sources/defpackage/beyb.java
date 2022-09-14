package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beyb  reason: default package */
/* loaded from: classes3.dex */
public final class beyb {
    private final Activity a;
    private final cklf b;

    public beyb(Activity activity, cklf cklfVar) {
        this.a = activity;
        this.b = cklfVar;
    }

    public final SpannableStringBuilder a(int i, cjtd cjtdVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = this.a.getString(R.string.LEARN_MORE);
        spannableStringBuilder.append((CharSequence) this.a.getString(i, new Object[]{string}));
        ClickableSpan h = this.b.h("follow_businesses", ibm.x().b(this.a), cjtdVar);
        int indexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(h, indexOf, string.length() + indexOf, 33);
        return spannableStringBuilder;
    }
}
