package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbbi  reason: default package */
/* loaded from: classes3.dex */
public final class bbbi extends ClickableSpan {
    final /* synthetic */ gga a;

    public bbbi(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        bszv.ba(this.a, btki.aU(1));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
