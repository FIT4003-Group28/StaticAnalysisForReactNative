package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.view.ActionMode;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
public final class qf {
    public static void a(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void b(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (!(textView instanceof pu)) {
        } else {
            ((pu) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static ActionMode.Callback c(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof qe)) ? callback : new qe(callback, textView);
    }

    public static void d(TextView textView, int i) {
        int i2;
        nb.a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i <= Math.abs(i2)) {
            return;
        }
        textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
    }

    public static void e(TextView textView, int i) {
        int i2;
        nb.a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void f(TextView textView, int i) {
        nb.a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r2 == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.widget.TextView r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 >= r2) goto L9d
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 >= r2) goto L93
            alr r0 = new alr
            android.text.TextPaint r3 = new android.text.TextPaint
            android.text.TextPaint r4 = r5.getPaint()
            r3.<init>(r4)
            r0.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L2d
            int r3 = r5.getBreakStrategy()
            r0.c = r3
            int r3 = r5.getHyphenationFrequency()
            r0.d = r3
        L2d:
            android.text.method.TransformationMethod r3 = r5.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            if (r3 != 0) goto L81
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            if (r3 < r2) goto L62
            int r2 = r5.getInputType()
            r2 = r2 & 15
            r3 = 3
            if (r2 != r3) goto L62
            java.util.Locale r5 = r5.getTextLocale()
            android.icu.text.DecimalFormatSymbols r5 = android.icu.text.DecimalFormatSymbols.getInstance(r5)
            java.lang.String[] r5 = r5.getDigitStrings()
            r2 = 0
            r5 = r5[r2]
            int r5 = r5.codePointAt(r2)
            byte r5 = java.lang.Character.getDirectionality(r5)
            if (r5 == r4) goto L5f
            r2 = 2
            if (r5 != r2) goto L7b
        L5f:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.RTL
            goto L83
        L62:
            int r2 = r5.getLayoutDirection()
            int r5 = r5.getTextDirection()
            switch(r5) {
                case 2: goto L7e;
                case 3: goto L7b;
                case 4: goto L78;
                case 5: goto L75;
                case 6: goto L72;
                case 7: goto L6f;
                default: goto L6d;
            }
        L6d:
            if (r2 != r4) goto L72
        L6f:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L83
        L72:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L83
        L75:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.LOCALE
            goto L83
        L78:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.RTL
            goto L83
        L7b:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.LTR
            goto L83
        L7e:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L83
        L81:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.LTR
        L83:
            r0.b = r5
            als r5 = new als
            android.text.TextPaint r2 = r0.a
            android.text.TextDirectionHeuristic r3 = r0.b
            int r4 = r0.c
            int r0 = r0.d
            r5.<init>(r2, r3, r4, r0)
            goto L9c
        L93:
            als r0 = new als
            android.text.PrecomputedText$Params r5 = r5.getTextMetricsParams()
            r0.<init>(r5)
        L9c:
            throw r1
        L9d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.g(android.widget.TextView):void");
    }
}
