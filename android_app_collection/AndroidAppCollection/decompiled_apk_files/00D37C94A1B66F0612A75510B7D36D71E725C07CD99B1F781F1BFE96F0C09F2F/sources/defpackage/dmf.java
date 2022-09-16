package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import com.facebook.yoga.YogaDirection;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dmf  reason: default package */
/* loaded from: classes3.dex */
final class dmf {
    protected static final ColorStateList a;
    protected static final int b;
    protected static final Typeface c;
    protected static final int d;
    private static final Typeface e;
    private static final int[][] f;
    private static final int[] g;
    private static final Path h;
    private static final Rect i;
    private static final RectF j;

    static {
        Typeface typeface = Typeface.DEFAULT;
        e = typeface;
        int[][] iArr = {new int[]{0}};
        f = iArr;
        int[] iArr2 = {-16777216};
        g = iArr2;
        a = new ColorStateList(iArr, iArr2);
        b = typeface.getStyle();
        c = typeface;
        d = 1;
        h = new Path();
        i = new Rect();
        j = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, int i3, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        if (!(charSequence instanceof Spanned)) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        Spanned spanned = (Spanned) charSequence;
        for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
            ClickableSpan clickableSpan = clickableSpanArr[i4];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            Path path = h;
            layout.getSelectionPath(spanStart, spanEnd, path);
            RectF rectF = j;
            path.computeBounds(rectF, true);
            if (rectF.contains(i2, i3)) {
                return i4;
            }
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(boolean z, ClickableSpan[] clickableSpanArr) {
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(mh mhVar, int i2, int i3, int i4, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        ClickableSpan clickableSpan = clickableSpanArr[i2];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
        Path path = h;
        layout.getSelectionPath(spanStart, lineVisibleEnd, path);
        RectF rectF = j;
        path.computeBounds(rectF, true);
        Rect rect = i;
        rect.set(((int) rectF.left) + i3, ((int) rectF.top) + i4, i3 + ((int) rectF.right), i4 + ((int) rectF.bottom));
        if (rect.isEmpty()) {
            rect.set(0, 0, 1, 1);
            mhVar.n(rect);
            mhVar.v("");
            return;
        }
        mhVar.n(rect);
        mhVar.s(true);
        mhVar.y(true);
        mhVar.x(true);
        mhVar.E(true);
        mhVar.D(spanned.subSequence(spanStart, spanEnd));
        if (clickableSpan instanceof dmy) {
            dmy dmyVar = (dmy) clickableSpan;
            throw null;
        } else {
            mhVar.r("android.widget.Button");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dlw d() {
        return new dlw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(defpackage.cyv r29, defpackage.cyz r30, java.lang.CharSequence r31, android.text.TextUtils.TruncateAt r32, boolean r33, int r34, float r35, float r36, float r37, int r38, android.content.res.ColorStateList r39, int r40, int r41, float r42, int r43, int r44, android.graphics.Typeface r45, int r46, int r47, java.lang.CharSequence r48, boolean r49, boolean r50, android.text.Layout r51, android.text.Layout r52, java.lang.Integer r53, java.lang.Integer r54, defpackage.dcz r55, defpackage.dcz r56, defpackage.dcz r57, defpackage.dcz r58, defpackage.dcz r59) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmf.f(cyv, cyz, java.lang.CharSequence, android.text.TextUtils$TruncateAt, boolean, int, float, float, float, int, android.content.res.ColorStateList, int, int, float, int, int, android.graphics.Typeface, int, int, java.lang.CharSequence, boolean, boolean, android.text.Layout, android.text.Layout, java.lang.Integer, java.lang.Integer, dcz, dcz, dcz, dcz, dcz):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(cyv cyvVar, cyz cyzVar, int i2, int i3, ddj ddjVar, CharSequence charSequence, TextUtils.TruncateAt truncateAt, boolean z, int i4, float f2, float f3, float f4, int i5, ColorStateList colorStateList, int i6, int i7, CharSequence charSequence2, float f5, int i8, Typeface typeface, int i9, int i10, dcz dczVar, dcz dczVar2, dcz dczVar3, dcz dczVar4, dcz dczVar5) {
        int j2;
        char c2;
        CharSequence charSequence3;
        int i11;
        int i12;
        if (TextUtils.isEmpty(charSequence)) {
            dczVar.a = null;
            ddjVar.a = 0;
            ddjVar.b = 0;
            return;
        }
        boolean z2 = truncateAt == null && i4 != Integer.MAX_VALUE;
        Layout n = n(cyvVar, i2, truncateAt, z, z2 ? i4 + 1 : i4, f2, f3, f4, i5, charSequence, colorStateList, i6, i7, f5, i8, typeface, m(i9), cyzVar.L(), cyvVar.b.getResources().getDisplayMetrics().density, i10);
        if (z2 && i4 > 0 && n.getLineCount() > i4) {
            n = n(cyvVar, i2, truncateAt, z, i4, f2, f3, f4, i5, charSequence.subSequence(0, n.getLineEnd(i4 - 1)), colorStateList, i6, i7, f5, i8, typeface, m(i9), cyzVar.L(), cyvVar.b.getResources().getDisplayMetrics().density, i10);
        }
        Layout layout = n;
        dczVar.a = layout;
        ddjVar.a = czu.A(i2, layout.getWidth());
        int e2 = hx.e(layout);
        layout.getLineCount();
        dczVar5.a = Float.valueOf(layout.getPaint().descent());
        if (!TextUtils.isEmpty(charSequence2) && (j2 = j(layout)) >= 0) {
            CharSequence charSequence4 = charSequence2;
            if (charSequence4 instanceof Spannable) {
                c2 = 0;
                int i13 = 0;
                for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence4).getSpans(0, charSequence2.length(), AbsoluteSizeSpan.class)) {
                    i13 = Math.max(absoluteSizeSpan.getSize(), i13);
                }
                charSequence3 = charSequence;
                i11 = i13;
            } else {
                c2 = 0;
                charSequence3 = charSequence;
                i11 = 0;
            }
            if (charSequence3 instanceof Spannable) {
                int lineStart = layout.getLineStart(j2);
                i12 = 0;
                for (AbsoluteSizeSpan absoluteSizeSpan2 : (AbsoluteSizeSpan[]) ((Spannable) charSequence3).getSpans(lineStart, (layout.getLineEnd(j2) - lineStart) + 1, AbsoluteSizeSpan.class)) {
                    i12 = Math.max(absoluteSizeSpan2.getSize(), i12);
                }
            } else {
                i12 = 0;
            }
            if (i11 > i12) {
                if (j2 > 0) {
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[c2] = "1\n";
                    charSequenceArr[1] = charSequence4;
                    charSequence4 = TextUtils.concat(charSequenceArr);
                }
                Layout n2 = n(cyvVar, View.MeasureSpec.makeMeasureSpec(layout.getWidth(), 1073741824), truncateAt, z, i4, f2, f3, f4, i5, charSequence4, colorStateList, i6, i7, f5, i8, typeface, m(i9), cyzVar.L(), cyvVar.b.getResources().getDisplayMetrics().density, i10);
                dczVar2.a = n2;
                e2 += k(layout, j2, n2);
            }
        }
        int A = czu.A(i3, e2);
        ddjVar.b = A;
        int i14 = ddjVar.a;
        if (i14 < 0 || A < 0) {
            ddjVar.a = Math.max(i14, 0);
            ddjVar.b = Math.max(ddjVar.b, 0);
            czq.a(2, "TextSpec:WrongTextSize", "Text layout measured to less than 0 pixels");
        }
        dczVar3.a = Integer.valueOf(ddjVar.a);
        dczVar4.a = Integer.valueOf(ddjVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(cyv cyvVar, dlw dlwVar, ColorStateList colorStateList, boolean z, swe sweVar, CharSequence charSequence, Layout layout, Float f2, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr) {
        float floatValue = f2 == null ? 0.0f : f2.floatValue();
        String str = cyvVar.c;
        dlwVar.a = layout;
        dlwVar.c = floatValue;
        dlwVar.d = z;
        dlwVar.f = charSequence;
        if (dlwVar.m == null && clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (clickableSpanArr[i2] instanceof djr) {
                    dlwVar.m = new Handler();
                    break;
                } else {
                    i2++;
                }
            }
        }
        dlwVar.k = null;
        dlwVar.e = clickableSpanArr != null && clickableSpanArr.length > 0;
        dlwVar.i = 0;
        dlwVar.o = sweVar;
        if (colorStateList == null) {
            colorStateList = a;
        }
        dlwVar.g = colorStateList;
        dlwVar.h = dlwVar.g.getDefaultColor();
        Layout layout2 = dlwVar.a;
        if (layout2 != null) {
            layout2.getPaint().setColor(dlwVar.g.getColorForState(dlwVar.getState(), dlwVar.h));
        }
        dlwVar.a();
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(dlwVar);
                drawable.setVisible(true, false);
            }
        }
        dlwVar.j = imageSpanArr;
        dlwVar.n = str;
        swe sweVar2 = dlwVar.o;
        if (sweVar2 != null) {
            Layout layout3 = dlwVar.a;
            CharSequence charSequence2 = dlwVar.f;
            if (charSequence2 instanceof Spanned) {
                sweVar2.a = (swd[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), swd.class);
                for (swd swdVar : sweVar2.a) {
                    swdVar.c(layout3, charSequence2);
                }
            }
        }
        dlwVar.invalidateSelf();
        if (charSequence instanceof djs) {
            ((djs) charSequence).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, mh mhVar, CharSequence charSequence) {
        if (lj.c(view) == 0) {
            lj.V(view, 1);
        }
        CharSequence e2 = mhVar.e();
        if (e2 != null) {
            charSequence = e2;
        }
        mhVar.D(charSequence);
        mhVar.v(charSequence);
        mhVar.h(256);
        mhVar.h(512);
        mhVar.b.setMovementGranularities(11);
        mhVar.b.setMultiLine(true);
    }

    private static int j(Layout layout) {
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    private static int k(Layout layout, int i2, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i2, rect);
        Rect rect2 = new Rect();
        layout2.getLineBounds(layout2.getLineCount() - 1, rect2);
        return Math.max(0, rect2.height() - rect.height());
    }

    private static alk l(alk alkVar, YogaDirection yogaDirection) {
        return alkVar == null ? yogaDirection == YogaDirection.RTL ? alq.d : alq.c : alkVar;
    }

    private static int m(int i2) {
        if (i2 != 0) {
            return i2;
        }
        return 1;
    }

    private static Layout n(cyv cyvVar, int i2, TextUtils.TruncateAt truncateAt, boolean z, int i3, float f2, float f3, float f4, int i4, CharSequence charSequence, ColorStateList colorStateList, int i5, int i6, float f5, int i7, Typeface typeface, int i8, YogaDirection yogaDirection, float f6, int i9) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        cye cyeVar = new cye();
        cyeVar.g = false;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i10 = 2;
        } else if (mode == 0) {
            i10 = 0;
        } else if (mode != 1073741824) {
            int mode2 = View.MeasureSpec.getMode(i2);
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected size mode: ");
            sb.append(mode2);
            throw new IllegalStateException(sb.toString());
        } else {
            i10 = 1;
        }
        if (cyeVar.e.a.density != f6) {
            cyeVar.e.a();
            cyeVar.e.a.density = f6;
            cyeVar.f = null;
        }
        cyd cydVar = cyeVar.e;
        if (cydVar.m != truncateAt) {
            cydVar.m = truncateAt;
            cyeVar.f = null;
        }
        if (cydVar.n != i3) {
            cydVar.n = i3;
            cyeVar.f = null;
        }
        cydVar.a();
        cyd cydVar2 = cyeVar.e;
        cydVar2.d = f2;
        cydVar2.b = f3;
        cydVar2.c = f4;
        cydVar2.e = i4;
        cydVar2.a.setShadowLayer(f2, f3, f4, i4);
        cyeVar.f = null;
        CharSequence charSequence2 = cyeVar.e.h;
        if (charSequence != charSequence2 && (charSequence == null || charSequence2 == null || !charSequence.equals(charSequence2))) {
            cyeVar.e.h = charSequence;
            cyeVar.f = null;
        }
        int size = View.MeasureSpec.getSize(i2);
        cyd cydVar3 = cyeVar.e;
        if (cydVar3.f != size || cydVar3.g != i10) {
            cydVar3.f = size;
            cydVar3.g = i10;
            cyeVar.f = null;
        }
        if (cydVar3.l != z) {
            cydVar3.l = z;
            cyeVar.f = null;
        }
        if (cydVar3.k != f5) {
            cydVar3.k = f5;
            cyeVar.f = null;
        }
        if (cydVar3.j != 1.0f) {
            cydVar3.j = 1.0f;
            cyeVar.f = null;
        }
        if (cydVar3.a.linkColor != i5) {
            cyeVar.e.a();
            cyeVar.e.a.linkColor = i5;
            cyeVar.f = null;
        }
        cyd cydVar4 = cyeVar.e;
        if (cydVar4.q != i9) {
            cydVar4.q = i9;
            cyeVar.f = null;
        }
        if (i6 == -1) {
            cyeVar.d(cyvVar.g.b(14.0f));
        } else {
            cyeVar.d(i6);
        }
        if (cyeVar.e.a.getLetterSpacing() != 0.0f) {
            cyeVar.e.a();
            cyeVar.e.a.setLetterSpacing(0.0f);
            cyeVar.f = null;
        }
        cyeVar.b = 2;
        cyeVar.c = Integer.MAX_VALUE;
        cyeVar.d = 2;
        cyeVar.e.a();
        cyd cydVar5 = cyeVar.e;
        cydVar5.i = colorStateList;
        TextPaint textPaint = cydVar5.a;
        ColorStateList colorStateList2 = cydVar5.i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        cyeVar.f = null;
        if (e.equals(typeface)) {
            cyeVar.e(Typeface.defaultFromStyle(i7));
        } else {
            cyeVar.e(typeface);
        }
        boolean z2 = false;
        alk alkVar = yogaDirection == YogaDirection.RTL ? alq.d : alq.c;
        cyeVar.c(alkVar);
        int i11 = i8 - 1;
        switch (dme.a[i11]) {
            case 3:
                if ((yogaDirection == YogaDirection.RTL) == alkVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if ((yogaDirection == YogaDirection.RTL) != alkVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!alkVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!alkVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        cyeVar.b(alignment);
        alk l = l(alkVar, yogaDirection);
        cyeVar.c(l);
        switch (dme.a[i11]) {
            case 3:
                if (yogaDirection == YogaDirection.RTL) {
                    z2 = true;
                }
                if (z2 == l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if (yogaDirection == YogaDirection.RTL) {
                    z2 = true;
                }
                if (z2 != l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment2 = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        cyeVar.b(alignment2);
        return cyeVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dlw dlwVar, CharSequence charSequence) {
        swd[] swdVarArr;
        dlwVar.a = null;
        dlwVar.c = 0.0f;
        dlwVar.f = null;
        dlwVar.e = false;
        dlwVar.i = 0;
        dlwVar.k = null;
        dlwVar.g = null;
        dlwVar.h = 0;
        swe sweVar = dlwVar.o;
        if (sweVar != null && (swdVarArr = sweVar.a) != null) {
            for (swd swdVar : swdVarArr) {
                swdVar.d();
            }
            sweVar.a = null;
        }
        dlwVar.o = null;
        ImageSpan[] imageSpanArr = dlwVar.j;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = dlwVar.j[i2].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            dlwVar.j = null;
        }
        if (charSequence instanceof djs) {
            ((djs) charSequence).b();
        }
    }
}
