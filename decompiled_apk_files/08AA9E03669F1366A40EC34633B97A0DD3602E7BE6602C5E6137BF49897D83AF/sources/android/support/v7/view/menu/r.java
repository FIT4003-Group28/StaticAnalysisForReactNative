package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.a;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ab;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class r extends k implements m, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    final ab f790a;

    /* renamed from: b  reason: collision with root package name */
    View f791b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f792c;

    /* renamed from: d  reason: collision with root package name */
    private final g f793d;
    private final f e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private PopupWindow.OnDismissListener l;
    private View m;
    private m.a n;
    private ViewTreeObserver o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    private final ViewTreeObserver.OnGlobalLayoutListener j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.r.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r.this.d() || r.this.f790a.g()) {
                return;
            }
            View view = r.this.f791b;
            if (view == null || !view.isShown()) {
                r.this.c();
            } else {
                r.this.f790a.a();
            }
        }
    };
    private final View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.r.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (r.this.o != null) {
                if (!r.this.o.isAlive()) {
                    r.this.o = view.getViewTreeObserver();
                }
                r.this.o.removeGlobalOnLayoutListener(r.this.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int s = 0;

    @Override // android.support.v7.view.menu.k
    public void a(g gVar) {
    }

    @Override // android.support.v7.view.menu.m
    public boolean b() {
        return false;
    }

    public r(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f792c = context;
        this.f793d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), this.f);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
        this.m = view;
        this.f790a = new ab(this.f792c, null, this.h, this.i);
        gVar.a(this, context);
    }

    @Override // android.support.v7.view.menu.k
    public void a(boolean z) {
        this.e.a(z);
    }

    @Override // android.support.v7.view.menu.k
    public void a(int i) {
        this.s = i;
    }

    private boolean h() {
        if (d()) {
            return true;
        }
        if (this.p || this.m == null) {
            return false;
        }
        this.f791b = this.m;
        this.f790a.a((PopupWindow.OnDismissListener) this);
        this.f790a.a((AdapterView.OnItemClickListener) this);
        this.f790a.a(true);
        View view = this.f791b;
        boolean z = this.o == null;
        this.o = view.getViewTreeObserver();
        if (z) {
            this.o.addOnGlobalLayoutListener(this.j);
        }
        view.addOnAttachStateChangeListener(this.k);
        this.f790a.b(view);
        this.f790a.e(this.s);
        if (!this.q) {
            this.r = a(this.e, null, this.f792c, this.g);
            this.q = true;
        }
        this.f790a.g(this.r);
        this.f790a.h(2);
        this.f790a.a(g());
        this.f790a.a();
        ListView e = this.f790a.e();
        e.setOnKeyListener(this);
        if (this.t && this.f793d.l() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f792c).inflate(a.g.abc_popup_menu_header_item_layout, (ViewGroup) e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f793d.l());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, null, false);
        }
        this.f790a.a((ListAdapter) this.e);
        this.f790a.a();
        return true;
    }

    @Override // android.support.v7.view.menu.q
    public void a() {
        if (!h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.q
    public void c() {
        if (d()) {
            this.f790a.c();
        }
    }

    @Override // android.support.v7.view.menu.q
    public boolean d() {
        return !this.p && this.f790a.d();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.p = true;
        this.f793d.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.f791b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.j);
            this.o = null;
        }
        this.f791b.removeOnAttachStateChangeListener(this.k);
        if (this.l != null) {
            this.l.onDismiss();
        }
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean z) {
        this.q = false;
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.m
    public void a(m.a aVar) {
        this.n = aVar;
    }

    @Override // android.support.v7.view.menu.m
    public boolean a(s sVar) {
        if (sVar.hasVisibleItems()) {
            l lVar = new l(this.f792c, sVar, this.f791b, this.f, this.h, this.i);
            lVar.a(this.n);
            lVar.a(k.b(sVar));
            lVar.a(this.s);
            lVar.a(this.l);
            this.l = null;
            this.f793d.a(false);
            if (lVar.a(this.f790a.j(), this.f790a.k())) {
                if (this.n == null) {
                    return true;
                }
                this.n.a(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.m
    public void a(g gVar, boolean z) {
        if (gVar != this.f793d) {
            return;
        }
        c();
        if (this.n == null) {
            return;
        }
        this.n.a(gVar, z);
    }

    @Override // android.support.v7.view.menu.k
    public void a(View view) {
        this.m = view;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            c();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // android.support.v7.view.menu.q
    public ListView e() {
        return this.f790a.e();
    }

    @Override // android.support.v7.view.menu.k
    public void b(int i) {
        this.f790a.c(i);
    }

    @Override // android.support.v7.view.menu.k
    public void c(int i) {
        this.f790a.d(i);
    }

    @Override // android.support.v7.view.menu.k
    public void c(boolean z) {
        this.t = z;
    }
}
