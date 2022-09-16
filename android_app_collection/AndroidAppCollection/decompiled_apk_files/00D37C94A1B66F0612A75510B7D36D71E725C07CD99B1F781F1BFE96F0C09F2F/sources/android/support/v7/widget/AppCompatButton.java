package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements my, ng {
    private final ty mBackgroundTintHelper;
    private final uz mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.mTextHelper;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.a();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.b();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return -1;
        }
        return uzVar.c();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        uz uzVar = this.mTextHelper;
        return uzVar != null ? uzVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return 0;
        }
        return uzVar.d();
    }

    public ColorStateList getSupportBackgroundTintList() {
        aab aabVar;
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar == null || (aabVar = tyVar.a) == null) {
            return null;
        }
        return aabVar.a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        aab aabVar;
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar == null || (aabVar = tyVar.a) == null) {
            return null;
        }
        return aabVar.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        aab aabVar = this.mTextHelper.a;
        if (aabVar != null) {
            return aabVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        aab aabVar = this.mTextHelper.a;
        if (aabVar != null) {
            return aabVar.b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        uz uzVar = this.mTextHelper;
        if (uzVar != null) {
            uzVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper == null || a || !this.mTextHelper.p()) {
            return;
        }
        this.mTextHelper.f();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return;
        }
        uzVar.j(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return;
        }
        uzVar.k(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return;
        }
        uzVar.l(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        uz uzVar = this.mTextHelper;
        if (uzVar != null) {
            uzVar.i(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar != null) {
            if (tyVar.a == null) {
                tyVar.a = new aab();
            }
            aab aabVar = tyVar.a;
            aabVar.a = colorStateList;
            aabVar.d = true;
            tyVar.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ty tyVar = this.mBackgroundTintHelper;
        if (tyVar != null) {
            if (tyVar.a == null) {
                tyVar.a = new aab();
            }
            aab aabVar = tyVar.a;
            aabVar.b = mode;
            aabVar.c = true;
            tyVar.a();
        }
    }

    @Override // defpackage.ng
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m(colorStateList);
        this.mTextHelper.e();
    }

    @Override // defpackage.ng
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.n(mode);
        this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        uz uzVar = this.mTextHelper;
        if (uzVar != null) {
            uzVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        uz uzVar = this.mTextHelper;
        if (uzVar == null) {
            return;
        }
        uzVar.o(i, f);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aaa.a(context);
        zy.d(this, getContext());
        ty tyVar = new ty(this);
        this.mBackgroundTintHelper = tyVar;
        tyVar.b(attributeSet, i);
        uz uzVar = new uz(this);
        this.mTextHelper = uzVar;
        uzVar.g(attributeSet, i);
        uzVar.e();
    }
}
