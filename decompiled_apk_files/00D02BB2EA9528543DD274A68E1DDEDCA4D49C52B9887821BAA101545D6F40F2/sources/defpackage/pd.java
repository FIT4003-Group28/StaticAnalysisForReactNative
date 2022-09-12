package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* compiled from: PG */
/* renamed from: pd  reason: default package */
/* loaded from: classes7.dex */
class pd extends AccessibilityNodeProvider {
    final pg a;

    public pd(pg pgVar) {
        this.a = pgVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        pc a = this.a.a(i);
        if (a == null) {
            return null;
        }
        return a.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.b(i, i2, bundle);
    }
}
