package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: aeje  reason: default package */
/* loaded from: classes2.dex */
final class aeje extends ne {
    final /* synthetic */ BottomSheetBehavior b;

    public aeje(BottomSheetBehavior bottomSheetBehavior) {
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.ne
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.b.o == 4 && accessibilityEvent.getEventType() == 1) {
            this.b.y(3);
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }
}
