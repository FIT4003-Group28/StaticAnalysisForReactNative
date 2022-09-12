package com.google.android.apps.gmm.base.views.fivestar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes.dex */
public class FiveStarTextView extends jef {
    private CharSequence c;
    private int d;
    private final Drawable e;
    private final Drawable f;

    public FiveStarTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = "";
        this.d = 0;
        Drawable drawable = context.getResources().getDrawable(2131231748);
        this.e = drawable;
        Drawable drawable2 = context.getResources().getDrawable(2131231747);
        this.f = drawable2;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
    }

    final void b() {
        CharSequence charSequence;
        if (this.d <= 0 || (charSequence = this.c) == null || charSequence.length() <= 0) {
            if (this.d == 0) {
                setContentDescription(this.c);
                return;
            } else {
                setContentDescription(jex.b(getResources(), this.d));
                return;
            }
        }
        String b = jex.b(getResources(), this.d);
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + String.valueOf(valueOf).length());
        sb.append(b);
        sb.append(valueOf);
        setContentDescription(sb.toString());
    }

    public void setPlainText(CharSequence charSequence) {
        this.c = charSequence;
        c();
        b();
    }

    public void setStarCount(int i) {
        boolean z = false;
        if (i >= 0 && i <= 5) {
            z = true;
        }
        dbsk.a(z);
        this.d = i;
        c();
        b();
    }

    public void setTextAndStars(int i, CharSequence charSequence) {
        boolean z = false;
        if (i >= 0 && i <= 5) {
            z = true;
        }
        dbsk.a(z);
        this.c = charSequence;
        this.d = i;
        c();
        b();
    }

    private final void c() {
        int i = this.d;
        CharSequence charSequence = this.c;
        if (i != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) dbtx.a("*", 5));
            spannableStringBuilder.append((CharSequence) "  ");
            int i2 = 0;
            while (i2 < 5) {
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(new jfe(i2 < i ? this.e : this.f), i2, i3, 18);
                i2 = i3;
            }
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        setText(charSequence);
    }
}
