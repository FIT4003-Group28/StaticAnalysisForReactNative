package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: bapw  reason: default package */
/* loaded from: classes3.dex */
final class bapw extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        ViewParent parent = view.getParent();
        while (!(parent instanceof ExpandingScrollView)) {
            if (parent != null) {
                parent = parent.getParent();
            } else {
                return super.performAccessibilityAction(view, i, bundle);
            }
        }
        ((ExpandingScrollView) parent).B(jjn.EXPANDED);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
