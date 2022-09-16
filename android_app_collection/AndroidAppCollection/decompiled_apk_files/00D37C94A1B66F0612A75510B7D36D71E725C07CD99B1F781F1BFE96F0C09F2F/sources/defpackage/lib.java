package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: lib  reason: default package */
/* loaded from: classes3.dex */
final class lib extends ClickableSpan {
    final /* synthetic */ lic a;

    public lib(lic licVar) {
        this.a = licVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
