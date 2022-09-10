package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ikx  reason: default package */
/* loaded from: classes6.dex */
public final class ikx extends xe {
    private static final int[] a = {16842912};
    private static final int[] b = {R.attr.state_indeterminate};
    private static final int[] c = {-16842912};
    private int d;
    @dzsi
    private Drawable e;
    @dzsi
    private iku f;
    @dzsi
    private ColorStateList g;
    @dzsi
    private PorterDuff.Mode h;

    public ikx(Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return ikx.class.getName();
    }

    @Override // android.widget.CompoundButton
    @dzsi
    public final Drawable getButtonDrawable() {
        return this.e;
    }

    @Override // android.widget.CompoundButton
    @dzsi
    public final ColorStateList getButtonTintList() {
        return this.g;
    }

    @Override // android.widget.CompoundButton
    @dzsi
    public final PorterDuff.Mode getButtonTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (super.isChecked() && (length = onCreateDrawableState.length) >= 2) {
            onCreateDrawableState[length - 2] = 0;
        }
        int i2 = this.d;
        if (i2 == 1) {
            mergeDrawableStates(onCreateDrawableState, b);
        } else if (i2 == 2) {
            mergeDrawableStates(onCreateDrawableState, a);
        } else {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ikx.class.getName());
        accessibilityEvent.setChecked(this.d == 2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ikx.class.getName());
        accessibilityNodeInfo.setCheckable(false);
    }

    @Override // defpackage.xe, android.widget.CompoundButton
    public void setButtonDrawable(@dzsi Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        super.setButtonDrawable(drawable);
        this.e = drawable;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@dzsi ColorStateList colorStateList) {
        this.g = colorStateList;
        super.setButtonTintList(colorStateList);
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@dzsi PorterDuff.Mode mode) {
        this.h = mode;
        super.setButtonTintMode(mode);
    }

    public void setCheckBoxState(int i) {
        if (this.d != i) {
            this.d = i;
            refreshDrawableState();
            iku ikuVar = this.f;
            if (ikuVar != null) {
                ikuVar.a();
            }
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(iku ikuVar) {
        this.f = ikuVar;
    }

    public ikx(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ikx(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        setButtonDrawable(ss.f(context));
        setButtonTintMode(PorterDuff.Mode.SRC_ATOP);
        setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910, R.attr.state_indeterminate}, new int[]{-16842910}, a, b, c}, new int[]{kc.f(akm.c(context, R.color.mod_daynight_blue600), 97), kc.f(akm.c(context, R.color.mod_daynight_grey800), 97), akm.c(context, R.color.mod_daynight_blue600), akm.c(context, R.color.mod_daynight_blue600), akm.c(context, R.color.mod_daynight_grey600)}));
        setCheckBoxState(0);
    }
}
