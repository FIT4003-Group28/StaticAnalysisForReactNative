package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: bycx  reason: default package */
/* loaded from: classes4.dex */
final class bycx extends ClickableSpan {
    final /* synthetic */ byda a;

    public bycx(byda bydaVar) {
        this.a = bydaVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.j();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
