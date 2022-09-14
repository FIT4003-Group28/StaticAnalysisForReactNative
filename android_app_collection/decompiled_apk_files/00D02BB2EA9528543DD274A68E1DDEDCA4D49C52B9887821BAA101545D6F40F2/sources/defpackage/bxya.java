package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bxya  reason: default package */
/* loaded from: classes4.dex */
final class bxya extends ClickableSpan {
    final /* synthetic */ bxyd a;

    public bxya(bxyd bxydVar) {
        this.a = bxydVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.h.a().m(String.format("https://myactivity.google.com/activitycontrols/webandapp?hl=%s", Locale.getDefault().getLanguage()), 1);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
