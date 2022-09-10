package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: bars  reason: default package */
/* loaded from: classes3.dex */
final class bars extends View.AccessibilityDelegate {
    final /* synthetic */ bart a;

    public bars(bart bartVar) {
        this.a = bartVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        View o;
        View o2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 22) {
            List<baqg> Pd = this.a.a.Pd();
            int indexOf = Pd.indexOf(this.a);
            if (indexOf > 0 && (o2 = cqkx.o(Pd.get(indexOf - 1))) != null) {
                accessibilityNodeInfo.setTraversalAfter(o2);
            }
            int i = indexOf + 1;
            if (i >= Pd.size() || (o = cqkx.o(Pd.get(i))) == null) {
                return;
            }
            accessibilityNodeInfo.setTraversalBefore(o);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 64) {
            cqkp i2 = cqkx.i(view);
            if (i2 instanceof baqg) {
                this.a.a.b((baqg) i2);
            }
            i = 64;
        }
        List<baqg> Pd = this.a.a.Pd();
        int indexOf = Pd.indexOf(this.a) - 1;
        if (indexOf >= 0) {
            bart.j(cqkx.o(Pd.get(indexOf)), 2);
        }
        bart.j(view, 1);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
