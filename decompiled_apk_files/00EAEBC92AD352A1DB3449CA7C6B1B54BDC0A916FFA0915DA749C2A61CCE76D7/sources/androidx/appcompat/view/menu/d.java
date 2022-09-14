package androidx.appcompat.view.menu;

import a.g.m.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = a.a.g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1019c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1020d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1021e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1022f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1023g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f1024h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private n.a y;
    ViewTreeObserver z;
    private final List<g> i = new ArrayList();
    final List<C0042d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = h();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.j.size() <= 0 || d.this.j.get(0).f1032a.l()) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            for (C0042d c0042d : d.this.j) {
                c0042d.f1032a.c();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements k0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0042d f1028b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MenuItem f1029c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f1030d;

            a(C0042d c0042d, MenuItem menuItem, g gVar) {
                this.f1028b = c0042d;
                this.f1029c = menuItem;
                this.f1030d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0042d c0042d = this.f1028b;
                if (c0042d != null) {
                    d.this.B = true;
                    c0042d.f1033b.a(false);
                    d.this.B = false;
                }
                if (!this.f1029c.isEnabled() || !this.f1029c.hasSubMenu()) {
                    return;
                }
                this.f1030d.a(this.f1029c, 4);
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void a(g gVar, MenuItem menuItem) {
            C0042d c0042d = null;
            d.this.f1024h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f1033b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < d.this.j.size()) {
                c0042d = d.this.j.get(i2);
            }
            d.this.f1024h.postAtTime(new a(c0042d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void b(g gVar, MenuItem menuItem) {
            d.this.f1024h.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f1032a;

        /* renamed from: b  reason: collision with root package name */
        public final g f1033b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1034c;

        public C0042d(l0 l0Var, g gVar, int i) {
            this.f1032a = l0Var;
            this.f1033b = gVar;
            this.f1034c = i;
        }

        public ListView a() {
            return this.f1032a.e();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f1019c = context;
        this.p = view;
        this.f1021e = i;
        this.f1022f = i2;
        this.f1023g = z;
        Resources resources = context.getResources();
        this.f1020d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
        this.f1024h = new Handler();
    }

    private MenuItem a(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(C0042d c0042d, g gVar) {
        f fVar;
        int i;
        int firstVisiblePosition;
        MenuItem a2 = a(c0042d.f1033b, gVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = c0042d.a();
        ListAdapter adapter = a3.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a2 == fVar.mo37getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - a3.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a3.getChildCount()) {
            return null;
        }
        return a3.getChildAt(firstVisiblePosition);
    }

    private int c(g gVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.j.get(i).f1033b) {
                return i;
            }
        }
        return -1;
    }

    private int d(int i) {
        List<C0042d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void d(g gVar) {
        C0042d c0042d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1019c);
        f fVar = new f(gVar, from, this.f1023g, C);
        if (!b() && this.w) {
            fVar.a(true);
        } else if (b()) {
            fVar.a(l.b(gVar));
        }
        int a2 = l.a(fVar, null, this.f1019c, this.f1020d);
        l0 g2 = g();
        g2.a((ListAdapter) fVar);
        g2.e(a2);
        g2.f(this.o);
        if (this.j.size() > 0) {
            List<C0042d> list = this.j;
            c0042d = list.get(list.size() - 1);
            view = a(c0042d, gVar);
        } else {
            c0042d = null;
            view = null;
        }
        if (view != null) {
            g2.c(false);
            g2.a((Object) null);
            int d2 = d(a2);
            boolean z = d2 == 1;
            this.r = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                g2.a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z) {
                    a2 = view.getWidth();
                    i3 = i - a2;
                }
                i3 = i + a2;
            } else {
                if (z) {
                    a2 = view.getWidth();
                    i3 = i + a2;
                }
                i3 = i - a2;
            }
            g2.c(i3);
            g2.b(true);
            g2.a(i2);
        } else {
            if (this.s) {
                g2.c(this.u);
            }
            if (this.t) {
                g2.a(this.v);
            }
            g2.a(f());
        }
        this.j.add(new C0042d(g2, gVar, this.r));
        g2.c();
        ListView e2 = g2.e();
        e2.setOnKeyListener(this);
        if (c0042d != null || !this.x || gVar.h() == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) from.inflate(a.a.g.abc_popup_menu_header_item_layout, (ViewGroup) e2, false);
        frameLayout.setEnabled(false);
        ((TextView) frameLayout.findViewById(16908310)).setText(gVar.h());
        e2.addHeaderView(frameLayout, null, false);
        g2.c();
    }

    private l0 g() {
        l0 l0Var = new l0(this.f1019c, null, this.f1021e, this.f1022f);
        l0Var.a(this.m);
        l0Var.a((AdapterView.OnItemClickListener) this);
        l0Var.a((PopupWindow.OnDismissListener) this);
        l0Var.a(this.p);
        l0Var.f(this.o);
        l0Var.a(true);
        l0Var.g(2);
        return l0Var;
    }

    private int h() {
        return v.p(this.p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = a.g.m.d.a(i, v.p(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = a.g.m.d.a(this.n, v.p(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(g gVar) {
        gVar.a(this, this.f1019c);
        if (b()) {
            d(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        int c2 = c(gVar);
        if (c2 < 0) {
            return;
        }
        int i = c2 + 1;
        if (i < this.j.size()) {
            this.j.get(i).f1033b.a(false);
        }
        C0042d remove = this.j.remove(c2);
        remove.f1033b.b(this);
        if (this.B) {
            remove.f1032a.b((Object) null);
            remove.f1032a.d(0);
        }
        remove.f1032a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f1034c : h();
        if (size != 0) {
            if (!z) {
                return;
            }
            this.j.get(0).f1033b.a(false);
            return;
        }
        dismiss();
        n.a aVar = this.y;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        for (C0042d c0042d : this.j) {
            l.a(c0042d.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        for (C0042d c0042d : this.j) {
            if (sVar == c0042d.f1033b) {
                c0042d.a().requestFocus();
                return true;
            }
        }
        if (sVar.hasVisibleItems()) {
            a((g) sVar);
            n.a aVar = this.y;
            if (aVar != null) {
                aVar.a(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).f1032a.b();
    }

    @Override // androidx.appcompat.view.menu.q
    public void c() {
        if (b()) {
            return;
        }
        for (g gVar : this.i) {
            d(gVar);
        }
        this.i.clear();
        this.q = this.p;
        if (this.q == null) {
            return;
        }
        boolean z = this.z == null;
        this.z = this.q.getViewTreeObserver();
        if (z) {
            this.z.addOnGlobalLayoutListener(this.k);
        }
        this.q.addOnAttachStateChangeListener(this.l);
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.l
    protected boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0042d[] c0042dArr = (C0042d[]) this.j.toArray(new C0042d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0042d c0042d = c0042dArr[i];
                if (c0042d.f1032a.b()) {
                    c0042d.f1032a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView e() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0042d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0042d c0042d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0042d = null;
                break;
            }
            c0042d = this.j.get(i);
            if (!c0042d.f1032a.b()) {
                break;
            }
            i++;
        }
        if (c0042d != null) {
            c0042d.f1033b.a(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }
}
