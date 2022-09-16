package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: gxj  reason: default package */
/* loaded from: classes3.dex */
final class gxj extends View.AccessibilityDelegate implements Runnable {
    public final View a;
    final /* synthetic */ gxk b;
    private boolean c = false;

    public gxj(gxk gxkVar, View view) {
        this.b = gxkVar;
        this.a = view;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!this.c && accessibilityEvent != null && accessibilityEvent.getEventType() == 32768) {
            this.c = true;
            this.a.setAccessibilityDelegate(null);
            run();
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.aO.sendAccessibilityEvent(8);
        this.b.aI();
    }
}
