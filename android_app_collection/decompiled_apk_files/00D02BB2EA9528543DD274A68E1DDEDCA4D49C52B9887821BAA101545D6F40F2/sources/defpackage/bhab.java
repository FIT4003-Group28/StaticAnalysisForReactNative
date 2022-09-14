package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
/* compiled from: PG */
/* renamed from: bhab  reason: default package */
/* loaded from: classes3.dex */
public final class bhab extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return new bhaa(view);
    }
}
