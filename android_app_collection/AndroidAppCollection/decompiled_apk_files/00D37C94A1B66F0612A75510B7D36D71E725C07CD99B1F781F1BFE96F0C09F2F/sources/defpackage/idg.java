package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: idg  reason: default package */
/* loaded from: classes3.dex */
final class idg extends aaft {
    public idg(aafo aafoVar, apzg apzgVar, boolean z) {
        super(aafoVar, null, apzgVar, z);
    }

    @Override // defpackage.aaft, defpackage.zae, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
