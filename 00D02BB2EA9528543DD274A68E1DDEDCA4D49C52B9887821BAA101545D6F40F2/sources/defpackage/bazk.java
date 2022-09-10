package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: bazk  reason: default package */
/* loaded from: classes3.dex */
final class bazk extends ClickableSpan {
    final /* synthetic */ bazl a;

    public bazk(bazl bazlVar) {
        this.a = bazlVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        cjql e = cjqg.e(view);
        if (e != null) {
            bazl bazlVar = this.a;
            bazlVar.b.j(e, bazlVar.e());
        }
        this.a.b();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(ibm.x().b(this.a.a));
        textPaint.setTypeface(cqgm.d);
    }
}
