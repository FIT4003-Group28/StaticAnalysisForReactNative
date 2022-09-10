package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* renamed from: bddd  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bddd implements View.OnClickListener {
    static final View.OnClickListener a = new bddd();

    private bddd() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GmmRecyclerView gmmRecyclerView;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == view.getRootView()) {
                gmmRecyclerView = null;
                break;
            } else if (!(parent instanceof GmmRecyclerView)) {
                parent = parent.getParent();
            } else {
                gmmRecyclerView = (GmmRecyclerView) parent;
                break;
            }
        }
        if (gmmRecyclerView != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] >= gmmRecyclerView.getBottom() - 300) {
                gmmRecyclerView.n(gmmRecyclerView.getChildCount());
            } else {
                gmmRecyclerView.n(0);
            }
        }
    }
}
