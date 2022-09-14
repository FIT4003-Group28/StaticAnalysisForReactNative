package a.i.b;

import a.e.h;
import a.g.m.e0.d;
import a.g.m.e0.e;
import a.g.m.v;
import a.g.m.y;
import a.i.b.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a extends a.g.m.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    private static final b.a<a.g.m.e0.c> o = new C0019a();
    private static final b.InterfaceC0020b<h<a.g.m.e0.c>, a.g.m.e0.c> p = new b();

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f421h;
    private final View i;
    private c j;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f417d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f418e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f419f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f420g = new int[2];
    int k = RecyclerView.UNDEFINED_DURATION;
    int l = RecyclerView.UNDEFINED_DURATION;
    private int m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a.i.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0019a implements b.a<a.g.m.e0.c> {
        C0019a() {
        }

        @Override // a.i.b.b.a
        public void a(a.g.m.e0.c cVar, Rect rect) {
            cVar.a(rect);
        }
    }

    /* loaded from: classes.dex */
    static class b implements b.InterfaceC0020b<h<a.g.m.e0.c>, a.g.m.e0.c> {
        b() {
        }

        @Override // a.i.b.b.InterfaceC0020b
        public int a(h<a.g.m.e0.c> hVar) {
            return hVar.b();
        }

        @Override // a.i.b.b.InterfaceC0020b
        public a.g.m.e0.c a(h<a.g.m.e0.c> hVar, int i) {
            return hVar.e(i);
        }
    }

    /* loaded from: classes.dex */
    private class c extends d {
        c() {
        }

        @Override // a.g.m.e0.d
        public a.g.m.e0.c a(int i) {
            return a.g.m.e0.c.a(a.this.b(i));
        }

        @Override // a.g.m.e0.d
        public boolean a(int i, int i2, Bundle bundle) {
            return a.this.b(i, i2, bundle);
        }

        @Override // a.g.m.e0.d
        public a.g.m.e0.c b(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.f421h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (v.n(view) != 0) {
                return;
            }
            v.h(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private void a(int i, Rect rect) {
        b(i).a(rect);
    }

    private boolean a(int i, Bundle bundle) {
        return v.a(this.i, i, bundle);
    }

    private boolean a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.i;
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private AccessibilityEvent b(int i, int i2) {
        return i != -1 ? c(i, i2) : e(i2);
    }

    private boolean b(int i, Rect rect) {
        Object a2;
        h<a.g.m.e0.c> f2 = f();
        int i2 = this.l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        a.g.m.e0.c a3 = i2 == Integer.MIN_VALUE ? null : f2.a(i2);
        if (i == 1 || i == 2) {
            a2 = a.i.b.b.a(f2, p, o, a3, i, v.p(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.i, i, rect2);
            }
            a2 = a.i.b.b.a(f2, p, o, a3, rect2, i);
        }
        a.g.m.e0.c cVar = (a.g.m.e0.c) a2;
        if (cVar != null) {
            i3 = f2.c(f2.a((h<a.g.m.e0.c>) cVar));
        }
        return c(i3);
    }

    private AccessibilityEvent c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        a.g.m.e0.c b2 = b(i);
        obtain.getText().add(b2.h());
        obtain.setContentDescription(b2.e());
        obtain.setScrollable(b2.s());
        obtain.setPassword(b2.r());
        obtain.setEnabled(b2.n());
        obtain.setChecked(b2.l());
        a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b2.d());
            e.a(obtain, this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private boolean c(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? a(i, i2, bundle) : d(i) : h(i) : a(i) : c(i);
    }

    private boolean d() {
        int i = this.l;
        return i != Integer.MIN_VALUE && a(i, 16, (Bundle) null);
    }

    private boolean d(int i) {
        if (this.k == i) {
            this.k = RecyclerView.UNDEFINED_DURATION;
            this.i.invalidate();
            a(i, 65536);
            return true;
        }
        return false;
    }

    private a.g.m.e0.c e() {
        a.g.m.e0.c f2 = a.g.m.e0.c.f(this.i);
        v.a(this.i, f2);
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        if (f2.c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f2.a(this.i, ((Integer) arrayList.get(i)).intValue());
            }
            return f2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private AccessibilityEvent e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private h<a.g.m.e0.c> f() {
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        h<a.g.m.e0.c> hVar = new h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.c(i, f(i));
        }
        return hVar;
    }

    private a.g.m.e0.c f(int i) {
        a.g.m.e0.c A = a.g.m.e0.c.A();
        A.g(true);
        A.h(true);
        A.a("android.view.View");
        A.c(n);
        A.d(n);
        A.b(this.i);
        a(i, A);
        if (A.h() == null && A.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        A.a(this.f418e);
        if (this.f418e.equals(n)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int b2 = A.b();
        if ((b2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((b2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        A.e(this.i.getContext().getPackageName());
        A.c(this.i, i);
        if (this.k == i) {
            A.a(true);
            A.a(128);
        } else {
            A.a(false);
            A.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            A.a(2);
        } else if (A.o()) {
            A.a(1);
        }
        A.i(z);
        this.i.getLocationOnScreen(this.f420g);
        A.b(this.f417d);
        if (this.f417d.equals(n)) {
            A.a(this.f417d);
            if (A.f347b != -1) {
                a.g.m.e0.c A2 = a.g.m.e0.c.A();
                for (int i2 = A.f347b; i2 != -1; i2 = A2.f347b) {
                    A2.b(this.i, -1);
                    A2.c(n);
                    a(i2, A2);
                    A2.a(this.f418e);
                    Rect rect = this.f417d;
                    Rect rect2 = this.f418e;
                    rect.offset(rect2.left, rect2.top);
                }
                A2.w();
            }
            this.f417d.offset(this.f420g[0] - this.i.getScrollX(), this.f420g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f419f)) {
            this.f419f.offset(this.f420g[0] - this.i.getScrollX(), this.f420g[1] - this.i.getScrollY());
            if (this.f417d.intersect(this.f419f)) {
                A.d(this.f417d);
                if (a(this.f417d)) {
                    A.p(true);
                }
            }
        }
        return A;
    }

    private static int g(int i) {
        if (i != 19) {
            if (i == 21) {
                return 17;
            }
            return i != 22 ? 130 : 66;
        }
        return 33;
    }

    private boolean h(int i) {
        int i2;
        if (!this.f421h.isEnabled() || !this.f421h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            d(i2);
        }
        this.k = i;
        this.i.invalidate();
        a(i, 32768);
        return true;
    }

    private void i(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        a(i, 128);
        a(i2, 256);
    }

    protected abstract int a(float f2, float f3);

    @Override // a.g.m.a
    public d a(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    protected abstract void a(int i, a.g.m.e0.c cVar);

    protected void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void a(int i, boolean z) {
    }

    protected void a(a.g.m.e0.c cVar) {
    }

    @Override // a.g.m.a
    public void a(View view, a.g.m.e0.c cVar) {
        super.a(view, cVar);
        a(cVar);
    }

    protected void a(AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void a(List<Integer> list);

    public final void a(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (z) {
            b(i, rect);
        }
    }

    public final boolean a(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        a(i, false);
        a(i, 8);
        return true;
    }

    public final boolean a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f421h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return y.a(parent, this.i, b(i, i2));
    }

    protected abstract boolean a(int i, int i2, Bundle bundle);

    public final boolean a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return b(2, (Rect) null);
                }
                if (!keyEvent.hasModifiers(1)) {
                    return false;
                }
                return b(1, (Rect) null);
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g2 = g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && b(g2, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            d();
            return true;
        }
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!this.f421h.isEnabled() || !this.f421h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a2 = a(motionEvent.getX(), motionEvent.getY());
            i(a2);
            return a2 != Integer.MIN_VALUE;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            i(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    public final int b() {
        return this.k;
    }

    a.g.m.e0.c b(int i) {
        return i == -1 ? e() : f(i);
    }

    @Override // a.g.m.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    boolean b(int i, int i2, Bundle bundle) {
        return i != -1 ? c(i, i2, bundle) : a(i2, bundle);
    }

    public final int c() {
        return this.l;
    }

    public final boolean c(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                a(i2);
            }
            this.l = i;
            a(i, true);
            a(i, 8);
            return true;
        }
        return false;
    }
}
