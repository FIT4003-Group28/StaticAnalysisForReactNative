package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: ajg  reason: default package */
/* loaded from: classes2.dex */
public final class ajg implements nq {
    final /* synthetic */ CoordinatorLayout a;

    public ajg(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.nq
    public final ow a(View view, ow owVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.g, owVar)) {
            coordinatorLayout.g = owVar;
            boolean z = true;
            boolean z2 = owVar.d() > 0;
            coordinatorLayout.h = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!owVar.g()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (od.M(childAt) && ((ajl) childAt.getLayoutParams()).a != null && owVar.g()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return owVar;
    }
}
