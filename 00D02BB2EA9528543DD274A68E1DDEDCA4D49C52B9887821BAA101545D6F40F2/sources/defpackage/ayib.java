package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayib  reason: default package */
/* loaded from: classes3.dex */
final class ayib extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        View view2;
        GmmRecyclerView gmmRecyclerView;
        if (i != 64) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        int i2 = ayif.a;
        ViewParent parent = view.getParent();
        while (true) {
            view2 = null;
            if (parent instanceof GmmRecyclerView) {
                gmmRecyclerView = (GmmRecyclerView) parent;
                break;
            } else if (parent == null) {
                gmmRecyclerView = null;
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (gmmRecyclerView == null) {
            return super.performAccessibilityAction(view, 64, bundle);
        }
        Rect rect = new Rect();
        gmmRecyclerView.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        View rootView = view.getRootView();
        if (rootView != null) {
            view2 = rootView.findViewById(R.id.header_container);
        }
        int height = (i3 - (view2 != null ? view2.getHeight() : 0)) - rect.top;
        if (height < 0) {
            gmmRecyclerView.t(0, height);
        }
        int height2 = (i3 + view.getHeight()) - rect.bottom;
        if (height2 > 0) {
            gmmRecyclerView.t(0, height2);
        }
        return super.performAccessibilityAction(view, 64, bundle);
    }
}
