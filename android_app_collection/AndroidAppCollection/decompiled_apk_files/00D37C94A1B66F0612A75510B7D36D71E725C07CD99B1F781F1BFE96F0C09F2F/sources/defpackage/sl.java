package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: sl  reason: default package */
/* loaded from: classes4.dex */
final class sl extends FrameLayout implements rf {
    final CollapsibleActionView a;

    public sl(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.rf
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.rf
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
