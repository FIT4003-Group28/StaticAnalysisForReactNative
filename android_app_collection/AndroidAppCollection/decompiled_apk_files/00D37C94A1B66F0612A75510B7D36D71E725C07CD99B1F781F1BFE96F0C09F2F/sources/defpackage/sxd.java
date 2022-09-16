package defpackage;

import android.text.TextPaint;
import android.view.View;
/* compiled from: PG */
/* renamed from: sxd  reason: default package */
/* loaded from: classes4.dex */
final class sxd extends djr {
    private final tcu a;
    private final tdz b;
    private final tfw c;
    private final tfw d;

    public sxd(axmu axmuVar, tcu tcuVar, tfy tfyVar, tdz tdzVar) {
        this.a = tcuVar;
        this.b = tdzVar;
        this.c = tfyVar.g(axmuVar.aI());
        this.d = tfyVar.g(axmuVar.aH());
    }

    @Override // defpackage.djr
    public final boolean a(View view) {
        tfw tfwVar = this.d;
        if (tfwVar != null) {
            tcu tcuVar = this.a;
            awmt a = tfwVar.a();
            tcq a2 = tcs.a();
            a2.a = view;
            a2.h = this.b;
            tcuVar.b(a, a2.a()).Q();
            return true;
        }
        return false;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        tfw tfwVar = this.c;
        if (tfwVar != null) {
            tcu tcuVar = this.a;
            awmt a = tfwVar.a();
            tcq a2 = tcs.a();
            a2.a = view;
            a2.h = this.b;
            tcuVar.b(a, a2.a()).Q();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
