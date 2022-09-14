package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
/* compiled from: AppCompatTextView.java */
/* loaded from: classes.dex */
public class r extends TextView implements android.support.v4.j.r, android.support.v4.widget.b {

    /* renamed from: b  reason: collision with root package name */
    private final g f1009b;

    /* renamed from: c  reason: collision with root package name */
    private final p f1010c;

    public r(Context context) {
        this(context, null);
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public r(Context context, AttributeSet attributeSet, int i) {
        super(aj.a(context), attributeSet, i);
        this.f1009b = new g(this);
        this.f1009b.a(attributeSet, i);
        this.f1010c = p.a(this);
        this.f1010c.a(attributeSet, i);
        this.f1010c.a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1009b != null) {
            this.f1009b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1009b != null) {
            this.f1009b.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1009b != null) {
            this.f1009b.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1009b != null) {
            return this.f1009b.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1009b != null) {
            this.f1009b.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1009b != null) {
            return this.f1009b.b();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1010c != null) {
            this.f1010c.a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1009b != null) {
            this.f1009b.c();
        }
        if (this.f1010c != null) {
            this.f1010c.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1010c != null) {
            this.f1010c.a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (f628a) {
            super.setTextSize(i, f);
        } else if (this.f1010c == null) {
        } else {
            this.f1010c.a(i, f);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1010c == null || f628a || !this.f1010c.c()) {
            return;
        }
        this.f1010c.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f628a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f1010c == null) {
        } else {
            this.f1010c.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f628a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f1010c == null) {
        } else {
            this.f1010c.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f628a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f1010c == null) {
        } else {
            this.f1010c.a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f628a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        } else if (this.f1010c == null) {
            return 0;
        } else {
            return this.f1010c.d();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f628a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f1010c == null) {
            return -1;
        }
        return this.f1010c.e();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f628a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f1010c == null) {
            return -1;
        }
        return this.f1010c.f();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f628a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f1010c == null) {
            return -1;
        }
        return this.f1010c.g();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f628a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f1010c != null) {
            return this.f1010c.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
