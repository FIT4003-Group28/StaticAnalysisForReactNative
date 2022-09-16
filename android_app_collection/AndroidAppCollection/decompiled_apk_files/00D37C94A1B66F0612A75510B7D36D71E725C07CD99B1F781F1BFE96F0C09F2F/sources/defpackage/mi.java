package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* compiled from: PG */
/* renamed from: mi  reason: default package */
/* loaded from: classes3.dex */
class mi extends AccessibilityNodeProvider {
    final ml a;

    public mi(ml mlVar) {
        this.a = mlVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        mh a = this.a.a(i);
        if (a == null) {
            return null;
        }
        return a.b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.c(i, i2, bundle);
    }
}
