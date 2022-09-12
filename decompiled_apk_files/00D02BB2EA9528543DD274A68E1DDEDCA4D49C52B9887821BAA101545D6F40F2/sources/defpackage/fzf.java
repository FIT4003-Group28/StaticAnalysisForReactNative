package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: fzf  reason: default package */
/* loaded from: classes6.dex */
final class fzf extends View.AccessibilityDelegate {
    final /* synthetic */ fzg a;

    public fzf(fzg fzgVar) {
        this.a = fzgVar;
    }

    private final int a(View view) {
        fzj b = this.a.b();
        if (b == null) {
            return -1;
        }
        fzh fzhVar = b.W;
        acl X = b.X(view);
        if (fzhVar != null && X != null) {
            return X.e();
        }
        return -1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        fzg fzgVar = this.a;
        if (fzgVar.a == null) {
            return;
        }
        fzj b = fzgVar.b();
        int a = a(view);
        if (b == null || a == -1) {
            return;
        }
        if (a > 0) {
            accessibilityNodeInfo.addAction(fze.a(R.id.a11y_action_drag_waypoint_up, this.a.getContext().getResources().getString(R.string.ACCESSIBILITY_WAYPOINT_MOVE_UP)));
        }
        if (a >= b.getChildCount() - 1) {
            return;
        }
        accessibilityNodeInfo.addAction(fze.a(R.id.a11y_action_drag_waypoint_down, this.a.getContext().getResources().getString(R.string.ACCESSIBILITY_WAYPOINT_MOVE_DOWN)));
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        fzj b = this.a.b();
        if (b == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        fzh fzhVar = b.W;
        if (fzhVar == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        int a = a(view);
        if (i == R.id.a11y_action_drag_waypoint_down) {
            fzhVar.d(b, a, Math.min(a + 1, b.getChildCount() - 1), this.a.c(dead.DOWN));
        } else if (i == R.id.a11y_action_drag_waypoint_up) {
            fzhVar.d(b, a, Math.max(a - 1, 0), this.a.c(dead.UP));
            i = R.id.a11y_action_drag_waypoint_up;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
