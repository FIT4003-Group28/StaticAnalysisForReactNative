package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
/* compiled from: PG */
/* renamed from: yyu  reason: default package */
/* loaded from: classes4.dex */
public final class yyu extends jo {
    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.r(Button.class.getName());
    }
}
