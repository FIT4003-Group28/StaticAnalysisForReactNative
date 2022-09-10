package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: nto  reason: default package */
/* loaded from: classes7.dex */
public final class nto extends cqro {
    @dzsi
    private CharSequence b;
    @dzsi
    private CharSequence c;

    public nto(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r3.measureText(r2, 0, r2.length()) <= r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r12 != false) goto L28;
     */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            java.lang.CharSequence r2 = r0.c
            if (r2 == 0) goto L95
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto Ld
            goto L8f
        Ld:
            int r9 = android.view.View.MeasureSpec.getMode(r17)
            int r10 = r15.getMaxLines()
            if (r10 > 0) goto L19
            if (r9 == 0) goto L8f
        L19:
            int r1 = android.view.View.MeasureSpec.getSize(r16)
            int r3 = r15.getCompoundPaddingStart()
            int r1 = r1 - r3
            int r3 = r15.getCompoundPaddingEnd()
            int r4 = r1 - r3
            int r1 = android.view.View.MeasureSpec.getSize(r17)
            int r3 = r15.getCompoundPaddingTop()
            int r1 = r1 - r3
            int r3 = r15.getCompoundPaddingBottom()
            int r11 = r1 - r3
            android.text.TextPaint r3 = new android.text.TextPaint
            android.text.TextPaint r1 = r15.getPaint()
            r3.<init>(r1)
            android.graphics.Typeface r1 = r15.getTypeface()
            r3.setTypeface(r1)
            if (r9 == 0) goto L53
            float r1 = (float) r11
            float r5 = r3.getFontSpacing()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L53
            goto L95
        L53:
            r12 = 0
            r13 = 1
            if (r10 != r13) goto L65
            int r1 = r2.length()
            float r1 = r3.measureText(r2, r12, r1)
            float r2 = (float) r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L95
            goto L8f
        L65:
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r6 = r15.getLineSpacingMultiplier()
            float r7 = r15.getLineSpacingExtra()
            r8 = 1
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L81
            int r1 = r14.getHeight()
            if (r1 > r11) goto L7f
            goto L81
        L7f:
            r1 = 0
            goto L82
        L81:
            r1 = 1
        L82:
            if (r10 <= 0) goto L8a
            int r2 = r14.getLineCount()
            if (r2 > r10) goto L8b
        L8a:
            r12 = 1
        L8b:
            if (r1 == 0) goto L95
            if (r12 == 0) goto L95
        L8f:
            java.lang.CharSequence r1 = r0.c
            super.setText(r1)
            goto L9a
        L95:
            java.lang.CharSequence r1 = r0.b
            super.setText(r1)
        L9a:
            super.onMeasure(r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nto.onMeasure(int, int):void");
    }

    public void setLongText(@dzsi CharSequence charSequence) {
        this.c = charSequence;
        requestLayout();
    }

    public void setShortText(@dzsi CharSequence charSequence) {
        this.b = charSequence;
        requestLayout();
    }

    public nto(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nto(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
