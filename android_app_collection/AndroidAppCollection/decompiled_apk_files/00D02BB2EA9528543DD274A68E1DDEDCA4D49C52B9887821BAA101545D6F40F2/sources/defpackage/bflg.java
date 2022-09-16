package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bflg  reason: default package */
/* loaded from: classes3.dex */
final class bflg extends ClickableSpan {
    final /* synthetic */ List a;
    final /* synthetic */ cjql b;
    final /* synthetic */ bflh c;

    public bflg(bflh bflhVar, List list, cjql cjqlVar) {
        this.c = bflhVar;
        this.a = list;
        this.b = cjqlVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.b.a(this.a);
        this.c.a.j(this.b, cjtd.a(dtxr.s));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
