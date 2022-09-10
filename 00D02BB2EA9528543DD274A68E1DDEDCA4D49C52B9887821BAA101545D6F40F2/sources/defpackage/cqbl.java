package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: cqbl  reason: default package */
/* loaded from: classes5.dex */
final class cqbl extends ClickableSpan {
    final /* synthetic */ cqbn a;

    public cqbl(cqbn cqbnVar) {
        this.a = cqbnVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
