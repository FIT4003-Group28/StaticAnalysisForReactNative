package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cpor  reason: default package */
/* loaded from: classes5.dex */
public final class cpor<T, D> extends View.AccessibilityDelegate {
    public final cpoj<T, D> b;
    public final AccessibilityManager f;
    public final AccessibilityManager.AccessibilityStateChangeListener g;
    public final float h;
    public cpoq i;
    public final Set<cpoq> j;
    public String k;
    public int l;
    public final Rect m;
    public final Rect n;
    private final View.OnHoverListener o;
    private boolean p;
    private boolean q;
    private final cppy r;
    private final cppq s;
    public final Runnable a = new cpok(this);
    public List<cpox> c = cpwi.a();
    public List<cpoy> d = cpwi.a();
    public final long e = 5000;

    public cpor(cpoj<T, D> cpojVar) {
        cpop cpopVar = new cpop(this);
        this.g = cpopVar;
        this.s = new cpom(this);
        this.r = new cpoo(this);
        this.o = new cpon(this);
        this.i = cpoq.NONE;
        this.j = EnumSet.of(cpoq.NONE);
        this.k = "";
        this.l = -1;
        this.m = new Rect();
        this.n = new Rect();
        this.b = cpojVar;
        this.h = cpqk.a(cpojVar.getContext(), 1.0f);
        AccessibilityManager accessibilityManager = (AccessibilityManager) cpojVar.getContext().getSystemService("accessibility");
        this.f = accessibilityManager;
        accessibilityManager.addAccessibilityStateChangeListener(cpopVar);
        if (accessibilityManager.isEnabled()) {
            a();
        }
    }

    public static final int e(int i, int i2) {
        return (i << 24) | i2;
    }

    public final void a() {
        this.p = this.b.isFocusable();
        this.q = this.b.isFocusableInTouchMode();
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.t(this.s);
        this.b.p(this.r);
        this.b.setOnHoverListener(this.o);
    }

    public final void b() {
        this.b.setFocusable(this.p);
        this.b.setFocusableInTouchMode(this.q);
        this.b.u(this.s);
        cpoj<T, D> cpojVar = this.b;
        cpojVar.k.b.remove(this.r);
        this.b.setOnHoverListener(null);
    }

    public final void c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(i);
        obtain.setEnabled(true);
        obtain.setClassName(this.b.getClass().getName());
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i2);
        this.b.getParent().requestSendAccessibilityEvent(this.b, obtain);
    }

    public final void d(cpoq cpoqVar) {
        if (this.i == cpoqVar) {
            return;
        }
        this.i = cpoqVar;
        cpou.a(this.b);
        cpoq cpoqVar2 = cpoq.DESCRIBE;
        int ordinal = cpoqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.l = -2;
                c(32768, -2);
                return;
            } else if (ordinal != 2) {
                return;
            }
        }
        this.l = -1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return new cpol(this);
    }
}
