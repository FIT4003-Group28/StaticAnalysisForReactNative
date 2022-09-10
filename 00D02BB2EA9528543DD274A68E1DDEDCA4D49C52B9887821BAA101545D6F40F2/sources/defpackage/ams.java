package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ams  reason: default package */
/* loaded from: classes2.dex */
public abstract class ams extends ne {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final amp m = new amp();
    public final AccessibilityManager b;
    public final View c;
    private amr k;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    public ams(View view) {
        if (view != null) {
            this.c = view;
            this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (od.l(view) != 0) {
                return;
            }
            od.m(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean B(int i, Rect rect) {
        Object obj;
        pc pcVar;
        ArrayList arrayList = new ArrayList();
        v(arrayList);
        ain ainVar = new ain();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ainVar.e(arrayList.get(i3).intValue(), E(arrayList.get(i3).intValue()));
        }
        int i4 = this.e;
        int i5 = Integer.MIN_VALUE;
        pc pcVar2 = i4 == Integer.MIN_VALUE ? null : (pc) ainVar.b(i4);
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = od.s(this.c) == 1;
            int f2 = ainVar.f();
            ArrayList arrayList2 = new ArrayList(f2);
            while (i2 < f2) {
                arrayList2.add(amq.a(ainVar, i2));
                i2++;
            }
            Collections.sort(arrayList2, new amt(z));
            if (i == 1) {
                int size = arrayList2.size();
                if (pcVar2 != null) {
                    size = arrayList2.indexOf(pcVar2);
                }
                int i7 = size - 1;
                if (i7 >= 0) {
                    obj = arrayList2.get(i7);
                    pcVar = (pc) obj;
                }
                obj = null;
                pcVar = (pc) obj;
            } else if (i == 2) {
                int size2 = arrayList2.size();
                if (pcVar2 != null) {
                    i6 = arrayList2.lastIndexOf(pcVar2);
                }
                int i8 = i6 + 1;
                if (i8 < size2) {
                    obj = arrayList2.get(i8);
                    pcVar = (pc) obj;
                }
                obj = null;
                pcVar = (pc) obj;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i9 = this.e;
            if (i9 != Integer.MIN_VALUE) {
                q(i9).j(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.c;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else if (i == 130) {
                rect3.offset(0, -(rect2.height() + 1));
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int f3 = ainVar.f();
            Rect rect4 = new Rect();
            pcVar = null;
            while (i2 < f3) {
                pc a = amq.a(ainVar, i2);
                if (a != pcVar2) {
                    a.j(rect4);
                    if (amu.c(rect2, rect4, i) && (!amu.c(rect2, rect3, i) || amu.a(i, rect2, rect4, rect3) || (!amu.a(i, rect2, rect3, rect4) && amu.b(amu.d(i, rect2, rect4), amu.e(i, rect2, rect4)) < amu.b(amu.d(i, rect2, rect3), amu.e(i, rect2, rect3))))) {
                        rect3.set(rect4);
                        pcVar = a;
                    }
                }
                i2++;
            }
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        pc pcVar3 = pcVar;
        if (pcVar3 != null) {
            i5 = ainVar.g(ainVar.i(pcVar3));
        }
        return s(i5);
    }

    private final void C(int i) {
        int i2 = this.l;
        if (i2 == i) {
            return;
        }
        this.l = i;
        A(i, 128);
        A(i2, 256);
    }

    private final AccessibilityEvent D(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            pc q = q(i);
            obtain.getText().add(q.C());
            obtain.setContentDescription(q.F());
            obtain.setScrollable(q.x());
            obtain.setPassword(q.w());
            obtain.setEnabled(q.u());
            obtain.setChecked(q.o());
            w(i, obtain);
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(q.A());
                obtain.setSource(this.c, i);
                obtain.setPackageName(this.c.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.c.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    private final pc E(int i) {
        pc c = pc.c();
        c.v(true);
        c.q(true);
        c.B("android.view.View");
        Rect rect = f;
        c.k(rect);
        c.m(rect);
        c.i(this.c);
        x(i, c);
        if (c.C() != null || c.F() != null) {
            c.j(this.h);
            if (!this.h.equals(rect)) {
                int actions = c.a.getActions();
                if ((actions & 64) != 0) {
                    throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                }
                if ((actions & 128) != 0) {
                    throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                }
                c.z(this.c.getContext().getPackageName());
                View view = this.c;
                c.c = i;
                c.a.setSource(view, i);
                if (this.d == i) {
                    c.s(true);
                    c.f(128);
                } else {
                    c.s(false);
                    c.f(64);
                }
                boolean z = this.e == i;
                if (z) {
                    c.f(2);
                } else if (c.p()) {
                    c.f(1);
                }
                c.r(z);
                this.c.getLocationOnScreen(this.j);
                c.l(this.g);
                if (this.g.equals(rect)) {
                    c.j(this.g);
                    if (c.b != -1) {
                        pc c2 = pc.c();
                        for (int i2 = c.b; i2 != -1; i2 = c2.b) {
                            View view2 = this.c;
                            c2.b = -1;
                            c2.a.setParent(view2, -1);
                            c2.k(f);
                            x(0, c2);
                            c2.j(this.h);
                            this.g.offset(this.h.left, this.h.top);
                        }
                        c2.a.recycle();
                    }
                    this.g.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                }
                if (this.c.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                    if (this.g.intersect(this.i)) {
                        c.m(this.g);
                        Rect rect2 = this.g;
                        if (rect2 != null && !rect2.isEmpty() && this.c.getWindowVisibility() == 0) {
                            ViewParent parent = this.c.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view3 = (View) parent;
                                    if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view3.getParent();
                                } else if (parent != null) {
                                    c.T();
                                }
                            }
                        }
                    }
                }
                return c;
            }
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    }

    public final void A(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(this.c, D(i, i2));
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        y(pcVar);
    }

    @Override // defpackage.ne
    public final pg h(View view) {
        if (this.k == null) {
            this.k = new amr(this);
        }
        return this.k;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (this.b.isEnabled() && this.b.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int u = u(motionEvent.getX(), motionEvent.getY());
                C(u);
                if (u != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.l == Integer.MIN_VALUE) {
                return false;
            } else {
                C(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean l(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return B(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return B(1, null);
                }
                return false;
            }
            int i2 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        if (keyCode == 19) {
                            i2 = 33;
                        } else if (keyCode == 21) {
                            i2 = 17;
                        } else if (keyCode != 22) {
                            i2 = 130;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && B(i2, null)) {
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
            int i3 = this.e;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, 16);
            }
            return true;
        }
        return false;
    }

    public final void m(boolean z, int i, Rect rect) {
        int i2 = this.e;
        if (i2 != Integer.MIN_VALUE) {
            t(i2);
        }
        if (z) {
            B(i, rect);
        }
    }

    public final void n() {
        o(-1, 1);
    }

    public final void o(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return;
        }
        AccessibilityEvent D = D(i, 2048);
        D.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.c, D);
    }

    protected void p(int i, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final pc q(int i) {
        if (i == -1) {
            pc b = pc.b(this.c);
            od.b(this.c, b);
            ArrayList arrayList = new ArrayList();
            v(arrayList);
            if (b.d() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    b.e(this.c, ((Integer) arrayList.get(i2)).intValue());
                }
                return b;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        return E(i);
    }

    public final boolean r(int i) {
        if (this.d == i) {
            this.d = Integer.MIN_VALUE;
            this.c.invalidate();
            A(i, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            return true;
        }
        return false;
    }

    public final boolean s(int i) {
        int i2;
        if ((this.c.isFocused() || this.c.requestFocus()) && (i2 = this.e) != i) {
            if (i2 != Integer.MIN_VALUE) {
                t(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.e = i;
            p(i, true);
            A(i, 8);
            return true;
        }
        return false;
    }

    public final boolean t(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        p(i, false);
        A(i, 8);
        return true;
    }

    protected abstract int u(float f2, float f3);

    protected abstract void v(List<Integer> list);

    protected void w(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void x(int i, pc pcVar);

    protected void y(pc pcVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean z(int i, int i2);
}
