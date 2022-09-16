package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pe  reason: default package */
/* loaded from: classes7.dex */
public class pe extends pd {
    public pe(pg pgVar) {
        super(pgVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        pc c = this.a.c(i);
        if (c == null) {
            return null;
        }
        return c.a;
    }
}
