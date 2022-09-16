package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mj  reason: default package */
/* loaded from: classes3.dex */
public class mj extends mi {
    public mj(ml mlVar) {
        super(mlVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        mh b = this.a.b(i);
        if (b == null) {
            return null;
        }
        return b.b;
    }
}
