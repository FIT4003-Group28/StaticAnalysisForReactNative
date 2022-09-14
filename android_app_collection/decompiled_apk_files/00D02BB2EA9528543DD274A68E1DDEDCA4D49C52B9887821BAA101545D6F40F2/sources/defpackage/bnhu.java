package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnhu  reason: default package */
/* loaded from: classes3.dex */
public final class bnhu extends ClickableSpan {
    private final begg a;
    private final cjqy b;
    private final ilo c;
    private final cjtd d;

    public bnhu(begg beggVar, cjqy cjqyVar, String str, akqi akqiVar, cjtd cjtdVar) {
        this.a = beggVar;
        this.b = cjqyVar;
        ily ilyVar = new ily();
        ilyVar.F(str);
        ilyVar.j(akqiVar);
        ilyVar.f = false;
        ilyVar.D();
        this.c = ilyVar.d();
        this.d = cjtdVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        begj begjVar = new begj();
        begjVar.b(this.c);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        cjql e = cjqg.e(view);
        if (e != null) {
            begjVar.m = this.b.j(e, this.d);
        }
        this.a.o(begjVar, false, null);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
