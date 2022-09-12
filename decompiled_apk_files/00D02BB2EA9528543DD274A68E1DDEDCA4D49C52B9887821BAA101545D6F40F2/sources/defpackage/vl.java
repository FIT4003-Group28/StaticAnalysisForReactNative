package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: vl  reason: default package */
/* loaded from: classes7.dex */
final class vl extends FrameLayout implements ue {
    final CollapsibleActionView a;

    public vl(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.ue
    public final void a() {
        this.a.onActionViewExpanded();
    }

    @Override // defpackage.ue
    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
