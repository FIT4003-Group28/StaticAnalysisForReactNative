package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckle  reason: default package */
/* loaded from: classes4.dex */
public final class ckle extends ClickableSpan {
    final /* synthetic */ cklf a;
    private final String b;
    private final int c;
    private final boolean d;
    private final boolean e;
    @dzsi
    private cjtd f;

    public ckle(cklf cklfVar, String str, int i, cjtd cjtdVar) {
        this(cklfVar, str, i, true, false);
        this.f = cjtdVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        cjtd cjtdVar = this.f;
        if (cjtdVar != null) {
            this.a.a.i(cjtdVar);
        }
        this.a.a(this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.e);
        if (this.d) {
            textPaint.setColor(this.c);
        }
    }

    public ckle(cklf cklfVar, String str, int i, boolean z, boolean z2) {
        this.a = cklfVar;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    public ckle(cklf cklfVar, String str, cjtd cjtdVar) {
        this(cklfVar, str, 0, false, false);
        this.f = cjtdVar;
    }
}
