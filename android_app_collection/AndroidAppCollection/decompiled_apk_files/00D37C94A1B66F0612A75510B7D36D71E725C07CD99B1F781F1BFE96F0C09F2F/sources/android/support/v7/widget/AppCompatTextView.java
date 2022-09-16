package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements ng, my {
    private final ty b;
    private final uz c;
    private final uw d;
    private boolean e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.a();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.b();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.c();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        uz uzVar = this.c;
        return uzVar != null ? uzVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return 0;
        }
        return uzVar.d();
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        uz.s(this, onCreateInputConnection, editorInfo);
        le.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c == null || a || !this.c.p()) {
            return;
        }
        this.c.f();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return;
        }
        uzVar.j(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return;
        }
        uzVar.k(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return;
        }
        uzVar.l(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? po.b(context, i) : null;
        Drawable b2 = i2 != 0 ? po.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? po.b(context, i3) : null;
        if (i4 != 0) {
            drawable = po.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? po.b(context, i) : null;
        Drawable b2 = i2 != 0 ? po.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? po.b(context, i3) : null;
        if (i4 != 0) {
            drawable = po.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            kz.p(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            kz.q(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        kz.r(this, i);
    }

    @Override // defpackage.ng
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.m(colorStateList);
        this.c.e();
    }

    @Override // defpackage.ng
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.n(mode);
        this.c.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        uw uwVar;
        if (Build.VERSION.SDK_INT >= 28 || (uwVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            uwVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        uz uzVar = this.c;
        if (uzVar == null) {
            return;
        }
        uzVar.o(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = hc.a(getContext(), typeface, i);
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
        uw uwVar;
        if (Build.VERSION.SDK_INT >= 28 || (uwVar = this.d) == null) {
            return super.getTextClassifier();
        }
        return uwVar.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aaa.a(context);
        this.e = false;
        zy.d(this, getContext());
        ty tyVar = new ty(this);
        this.b = tyVar;
        tyVar.b(attributeSet, i);
        uz uzVar = new uz(this);
        this.c = uzVar;
        uzVar.g(attributeSet, i);
        uzVar.e();
        this.d = new uw(this);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }
}
