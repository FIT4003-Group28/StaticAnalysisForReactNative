package defpackage;

import android.text.TextPaint;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afnt  reason: default package */
/* loaded from: classes.dex */
public final class afnt extends djr {
    private final tcu a;
    private final awmt b;
    private final awmt c;

    public afnt(awmb awmbVar, tcu tcuVar) {
        this.a = tcuVar;
        awmt awmtVar = awmbVar.e;
        this.b = awmtVar == null ? awmt.a : awmtVar;
        awmt awmtVar2 = awmbVar.f;
        this.c = awmtVar2 == null ? awmt.a : awmtVar2;
    }

    @Override // defpackage.djr
    public final boolean a(View view) {
        awmt awmtVar = this.c;
        if (awmtVar != null) {
            tcu tcuVar = this.a;
            tcq a = tcs.a();
            a.a = view;
            tcuVar.b(awmtVar, a.a()).Q();
            return true;
        }
        return false;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        awmt awmtVar = this.b;
        if (awmtVar != null) {
            tcu tcuVar = this.a;
            tcq a = tcs.a();
            a.a = view;
            tcuVar.b(awmtVar, a.a()).Q();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
