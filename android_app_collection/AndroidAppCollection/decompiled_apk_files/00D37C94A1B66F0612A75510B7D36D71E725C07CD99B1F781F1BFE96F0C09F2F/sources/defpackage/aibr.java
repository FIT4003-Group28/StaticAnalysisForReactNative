package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: aibr  reason: default package */
/* loaded from: classes.dex */
public final class aibr extends View.AccessibilityDelegate {
    final /* synthetic */ aibs a;

    /* JADX INFO: Access modifiers changed from: protected */
    public aibr(aibs aibsVar) {
        this.a = aibsVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(this.a.H());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.a.H());
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096 && i != 8192) {
            return false;
        }
        long kJ = this.a.kJ() / 20;
        if (i == 4096) {
            aibs aibsVar = this.a;
            aibsVar.s = Math.min(aibsVar.r.i(), this.a.c() + kJ);
        } else {
            aibs aibsVar2 = this.a;
            aibsVar2.s = Math.max(aibsVar2.r.j(), this.a.c() - kJ);
        }
        aibs aibsVar3 = this.a;
        aibsVar3.t.a(3, aibsVar3.s);
        this.a.kL();
        this.a.invalidate();
        view.sendAccessibilityEvent(4);
        return true;
    }
}
