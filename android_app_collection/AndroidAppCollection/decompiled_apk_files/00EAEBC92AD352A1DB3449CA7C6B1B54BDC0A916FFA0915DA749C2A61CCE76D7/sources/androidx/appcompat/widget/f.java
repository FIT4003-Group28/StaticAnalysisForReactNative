package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public class f extends Button implements a.g.m.u, androidx.core.widget.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f1242b;

    /* renamed from: c  reason: collision with root package name */
    private final y f1243c;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1242b = new e(this);
        this.f1242b.a(attributeSet, i);
        this.f1243c = new y(this);
        this.f1243c.a(attributeSet, i);
        this.f1243c.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1242b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1243c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f1243c;
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
        y yVar = this.f1243c;
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
        y yVar = this.f1243c;
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
        y yVar = this.f1243c;
        return yVar != null ? yVar.f() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1622a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f1243c;
        if (yVar == null) {
            return 0;
        }
        return yVar.g();
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1242b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1242b;
        if (eVar != null) {
            return eVar.c();
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
        y yVar = this.f1243c;
        if (yVar != null) {
            yVar.a(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f1243c;
        if (yVar == null || androidx.core.widget.b.f1622a || !yVar.j()) {
            return;
        }
        this.f1243c.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f1622a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f1243c;
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
        y yVar = this.f1243c;
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
        y yVar = this.f1243c;
        if (yVar == null) {
            return;
        }
        yVar.a(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1242b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1242b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f1243c;
        if (yVar != null) {
            yVar.a(z);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1242b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1242b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f1243c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        if (androidx.core.widget.b.f1622a) {
            super.setTextSize(i, f2);
            return;
        }
        y yVar = this.f1243c;
        if (yVar == null) {
            return;
        }
        yVar.a(i, f2);
    }
}
