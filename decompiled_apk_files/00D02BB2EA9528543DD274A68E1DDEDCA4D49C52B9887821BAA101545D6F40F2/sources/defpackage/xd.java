package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xd  reason: default package */
/* loaded from: classes.dex */
public class xd extends Button implements pu, qg {
    public final xc b;
    private final yh c;

    public xd(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
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
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.c(z);
        }
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

    public xd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        xc xcVar = new xc(this);
        this.b = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.c = yhVar;
        yhVar.a(attributeSet, i);
        yhVar.d();
    }
}
