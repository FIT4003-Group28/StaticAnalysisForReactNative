package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
/* compiled from: PG */
/* renamed from: fwk  reason: default package */
/* loaded from: classes3.dex */
public final class fwk {
    private final Context a;

    public fwk(Context context) {
        this.a = context;
    }

    public final CharSequence a(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, 2132083712), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence b(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, 2132083734), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
