package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: gfi  reason: default package */
/* loaded from: classes3.dex */
final class gfi extends View.AccessibilityDelegate {
    final /* synthetic */ gfm a;

    public gfi(gfm gfmVar) {
        this.a = gfmVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        mh c = mh.c(accessibilityNodeInfo);
        RecyclerView recyclerView = this.a.a;
        if (Build.VERSION.SDK_INT >= 22) {
            c.b.setTraversalBefore(recyclerView);
        }
    }
}
