package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
/* compiled from: PG */
/* renamed from: dapl  reason: default package */
/* loaded from: classes5.dex */
public final class dapl extends ClickableSpan {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.dapk
            if (r0 == 0) goto Ld
            r0 = r3
            dapk r0 = (defpackage.dapk) r0
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L29
        Ld:
            android.content.Context r0 = r3.getContext()
        L11:
            boolean r1 = r0 instanceof defpackage.dapj
            if (r1 == 0) goto L18
            dapj r0 = (defpackage.dapj) r0
            goto L24
        L18:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L23
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L11
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L2c
            r0.a()
        L29:
            r3.cancelPendingInputEvents()
        L2c:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L40
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            boolean r0 = r3 instanceof android.text.Spannable
            if (r0 == 0) goto L40
            android.text.Spannable r3 = (android.text.Spannable) r3
            r0 = 0
            android.text.Selection.setSelection(r3, r0)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dapl.onClick(android.view.View):void");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
