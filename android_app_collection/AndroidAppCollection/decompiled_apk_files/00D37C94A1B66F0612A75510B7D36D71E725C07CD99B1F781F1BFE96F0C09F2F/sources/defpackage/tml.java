package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: tml  reason: default package */
/* loaded from: classes4.dex */
public final class tml implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, tms {
    public final View a;
    public final tmb b;
    public final tmt c;
    public ViewGroup e;
    public final tou g;
    private tmb i;
    private final ViewTreeObserver.OnDrawListener n;
    private boolean j = false;
    public boolean d = false;
    private boolean k = false;
    public tmb f = null;
    private int o = 2;
    private final Rect l = new Rect();
    public Runnable h = null;
    private boolean m = false;

    public tml(View view, tmb tmbVar) {
        this.a = view;
        this.b = tmbVar;
        this.c = tmbVar.a;
        tou touVar = (tou) tmbVar.f.qm(tot.a);
        this.g = touVar;
        int k = tqj.k(touVar.b);
        if (k == 0 || k != 3) {
            this.n = null;
        } else {
            this.n = new ViewTreeObserver.OnDrawListener() { // from class: tmj
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    final tml tmlVar = tml.this;
                    if (tmlVar.e.isDirty() && tmlVar.h == null) {
                        tmlVar.h = new Runnable() { // from class: tmk
                            @Override // java.lang.Runnable
                            public final void run() {
                                tml.this.c();
                            }
                        };
                        uwp.g(tmlVar.h, tmlVar.g.c);
                    }
                }
            };
        }
    }

    public static tmb a(View view) {
        return (tmb) view.getTag(R.id.ve_tag);
    }

    public static boolean e(View view) {
        return view.getId() == 16908290;
    }

    public static void f(View view, tmz tmzVar) {
        tmb a = a(view);
        if (a != null) {
            tms tmsVar = a.b;
            if (tmsVar instanceof tml) {
                tml tmlVar = (tml) tmsVar;
                tmb tmbVar = tmlVar.i;
                if (tmlVar.k) {
                    return;
                }
            }
            tmzVar.a(a);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                f(viewGroup.getChildAt(i), tmzVar);
            }
        }
    }

    private final void i() {
        Runnable runnable = this.h;
        if (runnable != null) {
            uwp.i(runnable);
            this.h = null;
        }
    }

    private final void j() {
        int k;
        i();
        int k2 = tqj.k(this.g.b);
        if (k2 != 0 && k2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.n);
        }
        if (this.e == null || ((k = tqj.k(this.g.b)) != 0 && k == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.e = null;
        }
    }

    private final void k() {
        int k;
        aqxo.y(this.j);
        if (this.k) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(16908290);
            viewGroup.getClass();
            this.e = viewGroup;
        } else {
            this.e = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        }
        if (this.e == null || ((k = tqj.k(this.g.b)) != 0 && k == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int k2 = tqj.k(this.g.b);
        if (k2 != 0 && k2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.n);
        }
    }

    public final tmb b() {
        if (!d() && !this.k) {
            tmb tmbVar = this.f;
            if (tmbVar != null) {
                return tmbVar;
            }
            for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
                View view = (View) parent;
                tmb a = a(view);
                if (a != null) {
                    if (this.j) {
                        this.f = a;
                    }
                    return a;
                }
                if (e(view)) {
                    break;
                }
            }
        }
        return null;
    }

    public final void c() {
        i();
        int h = h();
        if (h != this.o) {
            this.o = h;
            if (this.d) {
                tmt tmtVar = this.c;
                tmb tmbVar = this.b;
                if (!tmtVar.a.isEmpty()) {
                    for (tmr tmrVar : tmtVar.a) {
                        tmrVar.g(tmbVar, h);
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // defpackage.tms
    public final boolean d() {
        return e(this.a) || this.k;
    }

    public final void g(boolean z) {
        if (this.k == z) {
            return;
        }
        boolean z2 = true;
        aqxo.y(true);
        if (z && e(this.a)) {
            z2 = false;
        }
        aqxo.p(z2);
        if (this.j) {
            j();
        }
        this.k = z;
        if (!this.j) {
            return;
        }
        k();
    }

    public final int h() {
        if (this.a.getVisibility() != 0) {
            return 2;
        }
        if (this.k && !this.a.isShown()) {
            return 2;
        }
        int k = tqj.k(this.g.b);
        if (k != 0 && k != 1) {
            ViewGroup viewGroup = this.e;
            if (viewGroup == null) {
                return 2;
            }
            this.l.set(viewGroup.getScrollX(), this.e.getScrollY(), this.e.getWidth() + this.e.getScrollX(), this.e.getHeight() + this.e.getScrollY());
            if (this.a.getLeft() > this.l.left || this.a.getTop() > this.l.top || this.a.getRight() < this.l.right || this.a.getBottom() < this.l.bottom) {
                if (this.l.intersect(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom())) {
                    String.valueOf(String.valueOf(this.l)).length();
                    int width = ((this.l.width() * this.l.height()) * 100) / (this.a.getWidth() * this.a.getHeight());
                    tos tosVar = this.g.d;
                    if (tosVar == null) {
                        tosVar = tos.a;
                    }
                    if (width < tosVar.b) {
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aqxo.y(!this.j);
        this.j = true;
        k();
        if (this.j && !this.d) {
            this.d = true;
            this.c.a(this.b);
        }
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aqxo.y(this.j);
        this.j = false;
        j();
        if (this.d) {
            this.d = false;
            this.c.b(this.b);
            this.f = null;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int k = tqj.k(this.g.b);
        boolean z = true;
        if (k != 0 && k == 2) {
            if (this.m && view == this.e) {
                this.m = false;
                return;
            }
            View view2 = this.a;
            boolean z2 = view != view2;
            if (view == view2) {
                this.m = true;
            } else {
                this.m = false;
            }
            if (this.e == null) {
                aqxo.y(!z2);
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                this.e = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
            }
        } else if (view == this.a) {
            if (this.e != null) {
                z = false;
            }
            aqxo.y(z);
            ViewGroup viewGroup2 = (ViewGroup) this.a.getParent();
            this.e = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.a.removeOnLayoutChangeListener(this);
        }
        c();
    }
}
