package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;
/* compiled from: PG */
/* renamed from: jgl  reason: default package */
/* loaded from: classes7.dex */
public final class jgl extends LinearLayout implements Checkable {
    private static final int[] b = {16842912};
    boolean a;

    public jgl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgl.class, cqmpVarArr);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.a);
        accessibilityEvent.setClassName(RadioButton.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
    }

    @Override // android.view.View
    public final boolean performClick() {
        setChecked(true);
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!this.a) {
            setChecked(true);
        }
    }
}
