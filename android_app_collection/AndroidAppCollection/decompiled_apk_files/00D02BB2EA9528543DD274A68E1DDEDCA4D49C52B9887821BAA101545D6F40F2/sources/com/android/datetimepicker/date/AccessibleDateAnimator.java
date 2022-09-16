package com.android.datetimepicker.date;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AccessibleDateAnimator extends ViewAnimator {
    private long a;

    public AccessibleDateAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.a, 22));
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public void setDateMillis(long j) {
        this.a = j;
    }
}
