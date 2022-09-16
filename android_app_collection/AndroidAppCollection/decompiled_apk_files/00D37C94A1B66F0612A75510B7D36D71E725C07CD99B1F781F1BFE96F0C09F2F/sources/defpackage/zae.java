package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
/* compiled from: PG */
/* renamed from: zae  reason: default package */
/* loaded from: classes4.dex */
public abstract class zae extends ClickableSpan {
    public int b;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.bgColor = this.b;
    }
}
