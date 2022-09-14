package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: blkd  reason: default package */
/* loaded from: classes3.dex */
final class blkd implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ blkh a;

    public blkd(blkh blkhVar) {
        this.a = blkhVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        blkh.a(view2, new dbrn(this) { // from class: blkc
            private final blkd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ((View) obj).setAccessibilityDelegate(this.a.a.h);
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
