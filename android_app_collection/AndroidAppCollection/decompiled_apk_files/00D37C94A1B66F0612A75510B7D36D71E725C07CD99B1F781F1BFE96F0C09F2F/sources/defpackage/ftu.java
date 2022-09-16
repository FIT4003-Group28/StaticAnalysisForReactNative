package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: ftu  reason: default package */
/* loaded from: classes3.dex */
public final class ftu extends View.AccessibilityDelegate {
    final /* synthetic */ BottomUiContainer a;

    public ftu(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    private final void a(AccessibilityEvent accessibilityEvent) {
        synchronized (this.a.l) {
            if (accessibilityEvent.getEventType() == 32768) {
                this.a.k = 1;
            } else if (accessibilityEvent.getEventType() == 65536) {
                BottomUiContainer bottomUiContainer = this.a;
                if (bottomUiContainer.k == 2) {
                    bottomUiContainer.getHandler().postDelayed(new Runnable() { // from class: ftt
                        @Override // java.lang.Runnable
                        public final void run() {
                            ftu.this.a.i(2);
                        }
                    }, ftj.a);
                }
                this.a.k = 0;
            }
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a(accessibilityEvent);
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a(accessibilityEvent);
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
