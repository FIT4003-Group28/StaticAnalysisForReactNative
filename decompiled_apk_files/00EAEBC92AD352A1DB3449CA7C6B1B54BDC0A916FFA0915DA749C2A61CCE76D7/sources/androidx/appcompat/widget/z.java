package androidx.appcompat.widget;

import a.g.l.c;
import android.annotation.SuppressLint;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class z extends TextView implements a.g.m.u, androidx.core.widget.k, androidx.core.widget.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f1446b;

    /* renamed from: c  reason: collision with root package name */
    private final y f1447c;

    /* renamed from: d  reason: collision with root package name */
    private final x f1448d;

    /* renamed from: e  reason: collision with root package name */
    private Future<a.g.l.c> f1449e;

    public z(Context context) {
        this(context, null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1446b = new e(this);
        this.f1446b.a(attributeSet, i);
        this.f1447c = new y(this);
        this.f1447c.a(attributeSet, i);
        this.f1447c.a();
        this.f1448d = new x(this);
    }

    private void d() {
        Future<a.g.l.c> future = this.f1449e;
        if (future != null) {
            try {
                this.f1449e = null;
                androidx.core.widget.i.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1446b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return -1;
        }
        return yVar.c();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return -1;
        }
        return yVar.d();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return -1;
        }
        return yVar.e();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f1447c;
        return yVar != null ? yVar.f() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return 0;
        }
        return yVar.g();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.c(this);
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1446b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1446b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1447c.h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1447c.i();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1448d) == null) ? super.getTextClassifier() : xVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.a(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f1447c;
        if (yVar == null || androidx.core.widget.b.f1622a || !yVar.j()) {
            return;
        }
        this.f1447c.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f1622a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return;
        }
        yVar.a(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (androidx.core.widget.b.f1622a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return;
        }
        yVar.a(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.core.widget.b.f1622a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return;
        }
        yVar.a(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1446b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1446b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i != 0 ? a.a.k.a.a.c(context, i) : null;
        Drawable c3 = i2 != 0 ? a.a.k.a.a.c(context, i2) : null;
        Drawable c4 = i3 != 0 ? a.a.k.a.a.c(context, i3) : null;
        if (i4 != 0) {
            drawable = a.a.k.a.a.c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c2, c3, c4, drawable);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i != 0 ? a.a.k.a.a.c(context, i) : null;
        Drawable c3 = i2 != 0 ? a.a.k.a.a.c(context, i2) : null;
        Drawable c4 = i3 != 0 ? a.a.k.a.a.c(context, i3) : null;
        if (i4 != 0) {
            drawable = a.a.k.a.a.c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c2, c3, c4, drawable);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            androidx.core.widget.i.a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            androidx.core.widget.i.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        androidx.core.widget.i.c(this, i);
    }

    public void setPrecomputedText(a.g.l.c cVar) {
        androidx.core.widget.i.a(this, cVar);
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1446b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1446b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1447c.a(colorStateList);
        this.f1447c.a();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1447c.a(mode);
        this.f1447c.a();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f1447c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1448d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.a(textClassifier);
        }
    }

    public void setTextFuture(Future<a.g.l.c> future) {
        this.f1449e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.i.a(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        if (androidx.core.widget.b.f1622a) {
            super.setTextSize(i, f2);
            return;
        }
        y yVar = this.f1447c;
        if (yVar == null) {
            return;
        }
        yVar.a(i, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : a.g.f.d.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }
}
