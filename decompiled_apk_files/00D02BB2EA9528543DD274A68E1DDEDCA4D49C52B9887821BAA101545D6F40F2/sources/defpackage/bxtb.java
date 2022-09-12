package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: bxtb  reason: default package */
/* loaded from: classes4.dex */
final class bxtb extends ClickableSpan {
    final /* synthetic */ bxte a;

    public bxtb(bxte bxteVar) {
        this.a = bxteVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.h(view, dtyb.cn);
        this.a.b.a().r();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
