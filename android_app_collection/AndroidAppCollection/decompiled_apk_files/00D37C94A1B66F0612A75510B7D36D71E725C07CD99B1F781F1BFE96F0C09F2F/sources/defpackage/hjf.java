package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: hjf  reason: default package */
/* loaded from: classes3.dex */
public final class hjf extends View.AccessibilityDelegate {
    final /* synthetic */ hjh a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hjf(hjh hjhVar) {
        this.a = hjhVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        int width = this.a.d.getWidth() / 5;
        if (i == 4096) {
            this.a.b.a(width);
            return true;
        } else if (i == 8192) {
            this.a.b.a(-width);
            return true;
        } else {
            return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
