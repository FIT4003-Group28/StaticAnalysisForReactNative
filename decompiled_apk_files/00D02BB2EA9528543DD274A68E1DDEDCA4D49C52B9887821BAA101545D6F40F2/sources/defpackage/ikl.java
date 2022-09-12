package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikl  reason: default package */
/* loaded from: classes6.dex */
public final class ikl extends ne {
    public final iki b;
    public final AccessibilityManager c;
    public final AccessibilityManager.AccessibilityStateChangeListener d;
    public final ikb e;
    public int f = -1;
    public String g = "";
    public String h = "";
    public String i = "";
    public final Rect j = new Rect();
    public final Rect k = new Rect();
    @dzsi
    public ikd l;
    private boolean m;
    private boolean n;

    public ikl(iki ikiVar) {
        this.b = ikiVar;
        AccessibilityManager accessibilityManager = (AccessibilityManager) ikiVar.getContext().getSystemService("accessibility");
        this.c = accessibilityManager;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener(this) { // from class: ikj
            private final ikl a;

            {
                this.a = this;
            }

            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                ikl iklVar = this.a;
                if (z) {
                    iklVar.o();
                } else {
                    iklVar.p();
                }
            }
        };
        this.d = accessibilityStateChangeListener;
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        this.e = new ikb(ikiVar);
        if (accessibilityManager.isEnabled()) {
            o();
        }
    }

    @Override // defpackage.ne
    public final pg h(View view) {
        return new ikk(this);
    }

    public final void k(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(i);
        obtain.setEnabled(true);
        obtain.setClassName(this.b.getClass().getName());
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i2);
        if (i == 4) {
            obtain.getText().add(this.g);
        }
        this.b.getParentForAccessibility().requestSendAccessibilityEvent(this.b, obtain);
    }

    public final Rect l() {
        return new Rect(0, 0, this.b.getWidth(), this.b.getHeight());
    }

    public final Rect m() {
        Rect rect = new Rect(l());
        int[] iArr = new int[2];
        this.b.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect;
    }

    public final Rect n(Rect rect) {
        Rect m = m();
        m.offset(rect.left, rect.top);
        return new Rect(m.left, m.top, m.left + rect.width(), m.top + rect.height());
    }

    public final void o() {
        this.m = this.b.isFocusable();
        this.n = this.b.isFocusableInTouchMode();
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
    }

    public final void p() {
        this.b.setFocusable(this.m);
        this.b.setFocusableInTouchMode(this.n);
    }
}
