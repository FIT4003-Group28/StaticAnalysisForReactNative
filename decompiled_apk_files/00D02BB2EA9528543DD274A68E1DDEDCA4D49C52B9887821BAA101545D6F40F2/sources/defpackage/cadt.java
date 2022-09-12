package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: cadt  reason: default package */
/* loaded from: classes4.dex */
final class cadt extends ClickableSpan {
    final /* synthetic */ cadx a;

    public cadt(cadx cadxVar) {
        this.a = cadxVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.o();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(ibm.x().b(this.a.c));
    }
}
