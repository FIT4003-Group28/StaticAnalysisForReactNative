package com.google.android.apps.gmm.shared.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IncognitoSafeURLSpan extends URLSpan {
    private final String a;

    private IncognitoSafeURLSpan(String str) {
        super(str);
        this.a = str;
    }

    public static CharSequence a(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, charSequence.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new IncognitoSafeURLSpan(uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    private final void b(Context context) {
        if (context instanceof gga) {
            afha wc = ((afgz) btsq.b(afgz.class, (gga) context)).wc();
            dbsk.s(wc);
            wc.k(context, this.a, 4);
        } else if (context instanceof Activity) {
            btme.a(context).b(this.a);
        } else if (!(context instanceof ContextWrapper)) {
        } else {
            b(((ContextWrapper) context).getBaseContext());
        }
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        b(view.getContext());
    }
}
