package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aski  reason: default package */
/* loaded from: classes2.dex */
public final class aski extends ClickableSpan {
    final /* synthetic */ ddho a;
    final /* synthetic */ String b;
    final /* synthetic */ askm c;

    public aski(askm askmVar, ddho ddhoVar, String str) {
        this.c = askmVar;
        this.a = ddhoVar;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.af.i(cjtd.a(this.a));
        this.c.aJ(this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
