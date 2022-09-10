package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsar  reason: default package */
/* loaded from: classes4.dex */
public final class bsar<V extends View> extends BottomSheetBehavior<V> {
    public boolean a;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.aji
    public final boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        if (motionEvent.getAction() != 1 || this.o != 4) {
            return super.c(coordinatorLayout, v, motionEvent);
        }
        y(3);
        return false;
    }
}
