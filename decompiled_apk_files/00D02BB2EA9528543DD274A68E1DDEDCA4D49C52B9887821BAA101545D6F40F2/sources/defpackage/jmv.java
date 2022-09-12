package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
/* compiled from: PG */
/* renamed from: jmv  reason: default package */
/* loaded from: classes7.dex */
public abstract class jmv extends ClickableSpan {
    public final int d;

    public jmv(int i) {
        this.d = i;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.d;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}
