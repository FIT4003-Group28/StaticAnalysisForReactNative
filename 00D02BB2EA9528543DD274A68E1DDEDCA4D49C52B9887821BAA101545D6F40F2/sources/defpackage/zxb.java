package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: zxb  reason: default package */
/* loaded from: classes7.dex */
public final class zxb extends AppCompatTextView {
    public vtl b;
    public Integer c;
    public Integer d;
    public Integer e;
    public int f;
    protected int g;
    private final vtn h;
    private boolean i;
    private zwz j;
    private int k;
    private CharSequence l;
    private float m;
    private CharSequence n;
    private int o;
    private Integer p;
    private String q;
    private int r;
    private boolean s;

    public zxb(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(zxb.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, jhk> cqlcVar) {
        return cqjv.g(ztg.DIRECTIONS_ICON, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> c(jhk jhkVar) {
        return cqjv.i(ztg.DIRECTIONS_ICON, jhkVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> d(cqtv cqtvVar) {
        return cqjv.i(ztg.DIRECTIONS_ICON_SIZE, cqtvVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> e(cqtv cqtvVar) {
        return cqjv.i(ztg.TRANSIT_LINE_NAME_MAX_WIDTH, cqtvVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> f(cqtv cqtvVar) {
        return cqjv.i(ztg.TRANSIT_LINE_NAME_MIN_WIDTH, cqtvVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> g(cqtv cqtvVar) {
        return cqjv.i(ztg.TRANSIT_LINE_NAME_MIN_HEIGHT, cqtvVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> h(zwz zwzVar) {
        return cqjv.i(ztg.TRANSIT_VEHICLE_ITEM_ELLIPSIZE_STRATEGY, zwzVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> i(cqtv cqtvVar) {
        return cqjv.i(ztg.DESIRED_COMPOUND_DRAWABLE_PADDING, cqtvVar, zth.a);
    }

    static Integer l(Integer... numArr) {
        Integer num = null;
        for (Integer num2 : numArr) {
            if (num == null || (num2 != null && num2.intValue() < num.intValue())) {
                num = num2;
            }
        }
        return num;
    }

    private final void o() {
        int i;
        Integer num;
        int i2 = this.g;
        if (i2 == 1) {
            k();
        } else if (i2 == 2) {
            int i3 = this.k;
            if (i3 != 0) {
                m(i3);
                return;
            }
            this.g = 2;
            CharSequence charSequence = this.n;
            if (!(charSequence instanceof Spanned)) {
                p();
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            alch[] alchVarArr = (alch[]) spanned.getSpans(0, spanned.length(), alch.class);
            for (alch alchVar : alchVarArr) {
                alchVar.a();
                alchVar.m = false;
                alchVar.n = true;
                alchVar.i = l(this.c, this.p);
            }
            TextPaint paint = getPaint();
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            boolean z = false;
            for (alch alchVar2 : alchVarArr) {
                alchVar2.getSize(paint, spanned, spanned.getSpanStart(alchVar2), spanned.getSpanEnd(alchVar2), fontMetricsInt);
                z = z || (alchVar2.h == 0 && ((num = alchVar2.j) == null || num.intValue() == 0));
            }
            if (!z) {
                return;
            }
            alch alchVar3 = alchVarArr[0];
            alchVar3.m = true;
            int i4 = 1;
            while (true) {
                int length = alchVarArr.length;
                if (i4 >= length) {
                    break;
                }
                alch alchVar4 = alchVarArr[i4];
                if (alchVar3.c(alchVar4)) {
                    alchVar4.n = false;
                    i = 1;
                } else {
                    int i5 = i4 + 1;
                    alch alchVar5 = alchVar4;
                    while (true) {
                        if (i5 >= length) {
                            i4 = length - 1;
                            break;
                        }
                        alch alchVar6 = alchVarArr[i5];
                        if (!alchVar6.c(alchVar4)) {
                            i4 = i5 - 1;
                            break;
                        }
                        alchVar5.n = false;
                        i5++;
                        alchVar5 = alchVar6;
                    }
                    alchVar3 = alchVarArr[i4];
                    i = 1;
                    alchVar3.m = true;
                }
                i4 += i;
            }
            if (alchVar3 != alchVarArr[0]) {
                return;
            }
            alchVar3.n = false;
        } else {
            if (i2 == 3) {
                this.k = 0;
                this.g = 3;
                p();
                return;
            }
            this.k = 0;
            p();
        }
    }

    private final void p() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        if (this.g != 3 && !TextUtils.isEmpty(this.n)) {
            spannableStringBuilder.append(this.n);
            i = this.o;
        }
        if (!TextUtils.isEmpty(this.l)) {
            super.setGravity((this.r & 7) | 80);
            if (TextUtils.isEmpty(this.n)) {
                i = (int) (this.f * (this.m - 1.0f));
            }
            CharSequence charSequence = this.l;
            dbsk.s(charSequence);
            spannableStringBuilder.append(charSequence);
        } else {
            super.setGravity(this.r);
        }
        setText(spannableStringBuilder);
        setCompoundDrawablePadding(i);
        CharSequence contentDescription = getContentDescription();
        bvsi bvsiVar = new bvsi(getContext());
        bvsiVar.c(this.q);
        bvsiVar.c(this.n);
        String bvsiVar2 = bvsiVar.toString();
        if (contentDescription == null || !bvsiVar2.contentEquals(contentDescription)) {
            setContentDescription(bvsiVar2);
        }
    }

    private final float q(Spanned spanned, alch[] alchVarArr) {
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        if (this.s) {
            paddingLeft += this.f + this.o;
        }
        if (this.j != zwz.SINGLE_LINE_SQUEEZE_LINE_NAMES) {
            return paddingLeft;
        }
        try {
            TextPaint paint = getPaint();
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            int length = alchVarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                alch alchVar = alchVarArr[i];
                int spanStart = spanned.getSpanStart(alchVar);
                int spanEnd = spanned.getSpanEnd(alchVar);
                if (spanStart >= i2) {
                    paddingLeft += r(spanned, i2, spanStart, paint, fontMetricsInt);
                }
                i++;
                i2 = spanEnd;
            }
            return paddingLeft + r(spanned, i2, spanned.length(), paint, fontMetricsInt);
        } catch (Exception unused) {
            return paddingLeft;
        }
    }

    private static float r(Spanned spanned, int i, int i2, TextPaint textPaint, Paint.FontMetricsInt fontMetricsInt) {
        ReplacementSpan[] replacementSpanArr;
        int spanStart;
        int spanEnd;
        float measureText = textPaint.measureText(spanned, i, i2);
        for (ReplacementSpan replacementSpan : (ReplacementSpan[]) spanned.getSpans(i, i2, ReplacementSpan.class)) {
            if (!(replacementSpan instanceof alch)) {
                measureText = (measureText + replacementSpan.getSize(textPaint, spanned, spanStart, spanEnd, fontMetricsInt)) - textPaint.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan));
            }
        }
        return measureText;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return super.hasOverlappingRendering() || (this.n instanceof Spanned);
    }

    public final void j(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            if (this.i && bvox.a(this)) {
                drawable = new cqlv(drawable);
            }
            int i = this.f;
            drawable.setBounds(0, 0, i, i);
        }
        if (bvox.a(this)) {
            setCompoundDrawables(null, null, drawable, null);
        } else {
            setCompoundDrawables(drawable, null, null, null);
        }
        if (drawable != null) {
            z = true;
        }
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        alch[] alchVarArr;
        this.k = 0;
        this.g = 1;
        CharSequence charSequence = this.n;
        if (!(charSequence instanceof Spanned)) {
            p();
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        for (alch alchVar : (alch[]) spanned.getSpans(0, spanned.length(), alch.class)) {
            alchVar.a();
            alchVar.n = true;
            alchVar.m = false;
            alchVar.i = l(this.c, this.p);
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i) {
        this.k = i;
        this.g = 2;
        CharSequence charSequence = this.n;
        if (!(charSequence instanceof Spanned)) {
            p();
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        alch[] alchVarArr = (alch[]) spanned.getSpans(0, spanned.length(), alch.class);
        int q = i - ((int) q(spanned, alchVarArr));
        int length = alchVarArr.length;
        if (length == 0) {
            return;
        }
        alch alchVar = alchVarArr[0];
        int i2 = alchVar.o;
        int i3 = i2 == 0 ? 0 : (int) (i2 + alchVar.g + alchVar.a);
        int max = Math.max(Math.round(getContext().getResources().getDisplayMetrics().density * 50.0f), q / length);
        boolean z = false;
        for (int i4 = 0; i4 < length; i4++) {
            alch alchVar2 = alchVarArr[i4];
            if (z) {
                alchVar2.n = false;
            } else {
                int min = Math.min(alchVar2.h + alchVar2.b(), max);
                int i5 = length - 1;
                if ((i4 >= i5 || q >= min + i3) && (i4 != i5 || q >= min)) {
                    alchVar2.m = false;
                    alchVar2.n = true;
                    alchVar2.i = l(Integer.valueOf(min), this.c, this.p);
                    q -= min;
                } else {
                    if (i4 == 0) {
                        alchVar2.n = false;
                    } else {
                        alchVar2.m = false;
                        alchVar2.n = true;
                        alchVar2.l = true;
                        alchVar2.d = true;
                        boolean z2 = alchVar2.b;
                        alchVar2.e = !z2 && !alchVar2.c;
                        alchVar2.f = z2 && !alchVar2.c;
                    }
                    z = true;
                }
            }
        }
        p();
    }

    public final boolean n() {
        if (TextUtils.isEmpty(this.n)) {
            return false;
        }
        return this.n instanceof Spanned;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        this.p = null;
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            CharSequence charSequence = this.n;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                alch[] alchVarArr = (alch[]) spanned.getSpans(0, spanned.length(), alch.class);
                int length = alchVarArr.length;
                if (length > 0) {
                    float q = q(spanned, alchVarArr);
                    if (this.j == zwz.MULTI_LINE_LINE_NAMES_ONLY) {
                        length = 1;
                    }
                    this.p = Integer.valueOf((int) ((View.MeasureSpec.getSize(i) - q) / length));
                }
            }
        }
        o();
        super.onMeasure(i, i2);
    }

    public void setDesiredCompoundDrawablePadding(int i) {
        this.o = i;
        p();
    }

    public void setDesiredText(CharSequence charSequence) {
        this.n = charSequence;
        p();
    }

    public void setDirectionsIcon(jhk jhkVar) {
        if (jhkVar == null) {
            bvrj.UI_THREAD.c();
            if (this.l != null || this.q != null) {
                this.l = null;
                this.q = null;
                p();
            }
            this.s = false;
            this.i = false;
            this.b = null;
            j(null);
            return;
        }
        setDirectionsIcon(jhkVar.a, jhkVar.b, false, jhkVar.c, jhkVar.d, jhkVar.e);
    }

    public void setDirectionsIconSize(Integer num) {
        if (dbsd.a(Integer.valueOf(this.f), num)) {
            return;
        }
        this.f = num.intValue();
        invalidate();
    }

    public void setEllipsizeStrategy(zwz zwzVar) {
        this.j = zwzVar;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        this.r = i;
        p();
    }

    public void setTransitLineNameMaxWidth(Integer num) {
        if (dbsd.a(this.c, num)) {
            return;
        }
        this.c = num;
        o();
    }

    public void setTransitLineNameMinHeight(Integer num) {
        if (dbsd.a(this.e, num)) {
            return;
        }
        this.e = num;
        invalidate();
    }

    public void setTransitLineNameMinWidth(Integer num) {
        if (dbsd.a(this.d, num)) {
            return;
        }
        this.d = num;
        o();
    }

    public zxb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zxb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 1;
        this.j = zwz.MULTI_LINE_LINE_NAMES_ONLY;
        this.k = 0;
        this.s = false;
        vtm vtmVar = (vtm) btsr.a(vtm.class);
        dbsk.s(vtmVar);
        this.h = vtmVar.qa();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pxp.b, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f = albv.c().e(context);
        setDesiredCompoundDrawablePadding(dimensionPixelSize);
    }

    public void setDirectionsIcon(String str, vtj vtjVar, boolean z, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<Float> dbsgVar3) {
        bvrj.UI_THREAD.c();
        this.m = dbsgVar3.c(Float.valueOf(0.85f)).floatValue();
        this.q = dbsgVar.f();
        if (dbsgVar2.a()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dbsgVar2.b());
            spannableStringBuilder.setSpan(new zxa(), 0, dbsgVar2.b().length(), 0);
            this.l = spannableStringBuilder;
            p();
        } else if (this.l != null) {
            this.l = null;
            p();
        }
        zwy zwyVar = new zwy(this);
        this.b = zwyVar;
        this.i = z;
        j(this.h.b(str, vtjVar, zwyVar));
    }
}
