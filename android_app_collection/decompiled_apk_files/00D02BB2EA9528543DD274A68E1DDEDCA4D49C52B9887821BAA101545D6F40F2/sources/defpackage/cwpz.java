package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpz  reason: default package */
/* loaded from: classes5.dex */
final class cwpz implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ExpandableDialogView a;

    public cwpz(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableDialogView expandableDialogView = this.a;
        String str = cwql.ad;
        if (od.s(expandableDialogView) != 1) {
            i = expandableDialogView.a.right;
        } else {
            i = expandableDialogView.a.left;
        }
        expandableDialogView.setPivotX(i);
        ExpandableDialogView expandableDialogView2 = this.a;
        expandableDialogView2.setPivotY(expandableDialogView2.a.top);
        return true;
    }
}
