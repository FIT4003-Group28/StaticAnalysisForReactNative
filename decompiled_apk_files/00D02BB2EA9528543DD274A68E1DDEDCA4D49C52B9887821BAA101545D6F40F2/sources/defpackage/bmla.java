package defpackage;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: bmla  reason: default package */
/* loaded from: classes3.dex */
final class bmla extends ClickableSpan {
    final /* synthetic */ afha a;
    final /* synthetic */ Activity b;
    final /* synthetic */ dnpq c;

    public bmla(afha afhaVar, Activity activity, dnpq dnpqVar) {
        this.a = afhaVar;
        this.b = activity;
        this.c = dnpqVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.k(this.b, this.c.c, 1);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(ibm.x().b(this.b));
    }
}
