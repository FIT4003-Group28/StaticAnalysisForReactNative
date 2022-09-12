package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: ahbz  reason: default package */
/* loaded from: classes2.dex */
final class ahbz extends ClickableSpan {
    final /* synthetic */ ahcc a;

    public ahbz(ahcc ahccVar) {
        this.a = ahccVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.c.a().l();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
