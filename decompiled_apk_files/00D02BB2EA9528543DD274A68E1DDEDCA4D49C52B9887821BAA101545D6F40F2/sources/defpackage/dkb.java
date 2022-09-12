package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: dkb  reason: default package */
/* loaded from: classes6.dex */
final class dkb extends ClickableSpan {
    final /* synthetic */ Runnable a;

    public dkb(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
