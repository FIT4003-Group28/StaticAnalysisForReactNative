package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: aja  reason: default package */
/* loaded from: classes.dex */
public final class aja implements kj {
    final /* synthetic */ CoordinatorLayout a;

    public aja(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.f, mbVar)) {
            coordinatorLayout.f = mbVar;
            boolean z = true;
            boolean z2 = mbVar.f() > 0;
            coordinatorLayout.g = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!mbVar.x()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (lj.af(childAt) && ((ajf) childAt.getLayoutParams()).a != null && mbVar.x()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return mbVar;
    }
}
