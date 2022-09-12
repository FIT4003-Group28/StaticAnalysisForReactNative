package com.google.android.apps.gmm.base.views.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UiHelper$URLSpanNoUnderline extends URLSpan {
    public final int a;

    public UiHelper$URLSpanNoUnderline(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.a;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}
