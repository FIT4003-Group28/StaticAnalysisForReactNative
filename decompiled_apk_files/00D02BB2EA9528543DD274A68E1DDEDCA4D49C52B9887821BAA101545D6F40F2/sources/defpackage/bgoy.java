package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: PG */
/* renamed from: bgoy  reason: default package */
/* loaded from: classes3.dex */
final class bgoy extends CharacterStyle {
    private final int a;

    public bgoy(int i) {
        this.a = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.setUnderlineText(true);
    }
}
