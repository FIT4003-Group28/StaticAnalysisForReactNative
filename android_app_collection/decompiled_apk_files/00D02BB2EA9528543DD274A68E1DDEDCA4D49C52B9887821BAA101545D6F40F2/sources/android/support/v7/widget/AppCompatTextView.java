package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements qg, pu {
    private final xc b;
    private final yh c;
    private final yf d;
    private boolean e;
    private Future<alt> f;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final void a() {
        Future<alt> future = this.f;
        if (future != null) {
            try {
                this.f = null;
                future.get();
                qf.g(this);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.e();
        }
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return -1;
        }
        return yhVar.n();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return -1;
        }
        return yhVar.m();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return -1;
        }
        return yhVar.l();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        yh yhVar = this.c;
        return yhVar != null ? yhVar.o() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return 0;
        }
        return yhVar.k();
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        a();
        return super.getText();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yh.s(this, onCreateInputConnection, editorInfo);
        xk.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c == null || a || !this.c.g()) {
            return;
        }
        this.c.f();
    }

    @Override // android.widget.TextView, defpackage.pu
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return;
        }
        yhVar.i(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, defpackage.pu
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return;
        }
        yhVar.j(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return;
        }
        yhVar.h(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? sl.b(context, i) : null;
        Drawable b2 = i2 != 0 ? sl.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? sl.b(context, i3) : null;
        if (i4 != 0) {
            drawable = sl.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? sl.b(context, i) : null;
        Drawable b2 = i2 != 0 ? sl.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? sl.b(context, i3) : null;
        if (i4 != 0) {
            drawable = sl.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            qf.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            qf.e(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        qf.f(this, i);
    }

    public void setPrecomputedText(alt altVar) {
        qf.g(this);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    @Override // defpackage.qg
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.p(colorStateList);
        this.c.d();
    }

    @Override // defpackage.qg
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.q(mode);
        this.c.d();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.b(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        yf yfVar;
        if (Build.VERSION.SDK_INT >= 28 || (yfVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yfVar.a = textClassifier;
        }
    }

    public void setTextFuture(Future<alt> future) {
        this.f = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        yh yhVar = this.c;
        if (yhVar == null) {
            return;
        }
        yhVar.e(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = kh.c(getContext(), typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        yf yfVar;
        if (Build.VERSION.SDK_INT >= 28 || (yfVar = this.d) == null) {
            return super.getTextClassifier();
        }
        return yfVar.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        this.e = false;
        ael.d(this, getContext());
        xc xcVar = new xc(this);
        this.b = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.c = yhVar;
        yhVar.a(attributeSet, i);
        yhVar.d();
        this.d = new yf(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    public void setTextMetricsParamsCompat(als alsVar) {
        TextDirectionHeuristic textDirectionHeuristic = alsVar.b;
        int i = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = alsVar.a.getTextScaleX();
            getPaint().set(alsVar.a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(alsVar.a);
        setBreakStrategy(alsVar.c);
        setHyphenationFrequency(alsVar.d);
    }
}
