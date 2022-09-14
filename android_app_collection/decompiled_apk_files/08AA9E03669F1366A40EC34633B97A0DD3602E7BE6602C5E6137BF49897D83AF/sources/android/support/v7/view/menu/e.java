package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.a.a;
import android.support.v7.view.menu.m;
import android.support.v7.widget.aa;
import android.support.v7.widget.ab;
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
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class e extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    final Handler f749a;

    /* renamed from: c  reason: collision with root package name */
    View f751c;

    /* renamed from: d  reason: collision with root package name */
    boolean f752d;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private m.a x;
    private ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;
    private final List<g> j = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final List<a> f750b = new ArrayList();
    private final ViewTreeObserver.OnGlobalLayoutListener k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.e.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.d() || e.this.f750b.size() <= 0 || e.this.f750b.get(0).f760a.g()) {
                return;
            }
            View view = e.this.f751c;
            if (view == null || !view.isShown()) {
                e.this.c();
                return;
            }
            for (a aVar : e.this.f750b) {
                aVar.f760a.a();
            }
        }
    };
    private final View.OnAttachStateChangeListener l = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.e.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (e.this.y != null) {
                if (!e.this.y.isAlive()) {
                    e.this.y = view.getViewTreeObserver();
                }
                e.this.y.removeGlobalOnLayoutListener(e.this.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final aa m = new aa() { // from class: android.support.v7.view.menu.e.3
        @Override // android.support.v7.widget.aa
        public void a(g gVar, MenuItem menuItem) {
            e.this.f749a.removeCallbacksAndMessages(gVar);
        }

        @Override // android.support.v7.widget.aa
        public void b(final g gVar, final MenuItem menuItem) {
            final a aVar = null;
            e.this.f749a.removeCallbacksAndMessages(null);
            int size = e.this.f750b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == e.this.f750b.get(i).f761b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < e.this.f750b.size()) {
                aVar = e.this.f750b.get(i2);
            }
            e.this.f749a.postAtTime(new Runnable() { // from class: android.support.v7.view.menu.e.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null) {
                        e.this.f752d = true;
                        aVar.f761b.a(false);
                        e.this.f752d = false;
                    }
                    if (!menuItem.isEnabled() || !menuItem.hasSubMenu()) {
                        return;
                    }
                    gVar.a(menuItem, 4);
                }
            }, gVar, SystemClock.uptimeMillis() + 200);
        }
    };
    private int n = 0;
    private int o = 0;
    private boolean v = false;
    private int q = i();

    @Override // android.support.v7.view.menu.m
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.k
    protected boolean f() {
        return false;
    }

    public e(Context context, View view, int i, int i2, boolean z) {
        this.e = context;
        this.p = view;
        this.g = i;
        this.h = i2;
        this.i = z;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
        this.f749a = new Handler();
    }

    @Override // android.support.v7.view.menu.k
    public void a(boolean z) {
        this.v = z;
    }

    private ab h() {
        ab abVar = new ab(this.e, null, this.g, this.h);
        abVar.a(this.m);
        abVar.a((AdapterView.OnItemClickListener) this);
        abVar.a((PopupWindow.OnDismissListener) this);
        abVar.b(this.p);
        abVar.e(this.o);
        abVar.a(true);
        abVar.h(2);
        return abVar;
    }

    @Override // android.support.v7.view.menu.q
    public void a() {
        if (d()) {
            return;
        }
        for (g gVar : this.j) {
            c(gVar);
        }
        this.j.clear();
        this.f751c = this.p;
        if (this.f751c == null) {
            return;
        }
        boolean z = this.y == null;
        this.y = this.f751c.getViewTreeObserver();
        if (z) {
            this.y.addOnGlobalLayoutListener(this.k);
        }
        this.f751c.addOnAttachStateChangeListener(this.l);
    }

    @Override // android.support.v7.view.menu.q
    public void c() {
        int size = this.f750b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.f750b.toArray(new a[size]);
            for (int i = size - 1; i >= 0; i--) {
                a aVar = aVarArr[i];
                if (aVar.f760a.d()) {
                    aVar.f760a.c();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            c();
            return true;
        }
        return false;
    }

    private int i() {
        return android.support.v4.j.s.c(this.p) == 1 ? 0 : 1;
    }

    private int d(int i) {
        ListView a2 = this.f750b.get(this.f750b.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f751c.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // android.support.v7.view.menu.k
    public void a(g gVar) {
        gVar.a(this, this.e);
        if (d()) {
            c(gVar);
        } else {
            this.j.add(gVar);
        }
    }

    private void c(g gVar) {
        a aVar;
        View view;
        int i;
        int i2;
        int width;
        LayoutInflater from = LayoutInflater.from(this.e);
        f fVar = new f(gVar, from, this.i);
        if (!d() && this.v) {
            fVar.a(true);
        } else if (d()) {
            fVar.a(k.b(gVar));
        }
        int a2 = a(fVar, null, this.e, this.f);
        ab h = h();
        h.a((ListAdapter) fVar);
        h.g(a2);
        h.e(this.o);
        if (this.f750b.size() > 0) {
            aVar = this.f750b.get(this.f750b.size() - 1);
            view = a(aVar, gVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h.c(false);
            h.a((Object) null);
            int d2 = d(a2);
            boolean z = d2 == 1;
            this.q = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                h.b(view);
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
                width = z ? i + a2 : i - view.getWidth();
            } else {
                width = z ? i + view.getWidth() : i - a2;
            }
            h.c(width);
            h.b(true);
            h.d(i2);
        } else {
            if (this.r) {
                h.c(this.t);
            }
            if (this.s) {
                h.d(this.u);
            }
            h.a(g());
        }
        this.f750b.add(new a(h, gVar, this.q));
        h.a();
        ListView e = h.e();
        e.setOnKeyListener(this);
        if (aVar != null || !this.w || gVar.l() == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) from.inflate(a.g.abc_popup_menu_header_item_layout, (ViewGroup) e, false);
        frameLayout.setEnabled(false);
        ((TextView) frameLayout.findViewById(16908310)).setText(gVar.l());
        e.addHeaderView(frameLayout, null, false);
        h.a();
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

    private View a(a aVar, g gVar) {
        f fVar;
        int i;
        int firstVisiblePosition;
        MenuItem a2 = a(aVar.f761b, gVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = aVar.a();
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
            } else if (a2 == fVar.getItem(i2)) {
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

    @Override // android.support.v7.view.menu.q
    public boolean d() {
        return this.f750b.size() > 0 && this.f750b.get(0).f760a.d();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        int size = this.f750b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f750b.get(i);
            if (!aVar.f760a.d()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f761b.a(false);
        }
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean z) {
        for (a aVar : this.f750b) {
            a(aVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.m
    public void a(m.a aVar) {
        this.x = aVar;
    }

    @Override // android.support.v7.view.menu.m
    public boolean a(s sVar) {
        for (a aVar : this.f750b) {
            if (sVar == aVar.f761b) {
                aVar.a().requestFocus();
                return true;
            }
        }
        if (sVar.hasVisibleItems()) {
            a((g) sVar);
            if (this.x != null) {
                this.x.a(sVar);
            }
            return true;
        }
        return false;
    }

    private int d(g gVar) {
        int size = this.f750b.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f750b.get(i).f761b) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.support.v7.view.menu.m
    public void a(g gVar, boolean z) {
        int d2 = d(gVar);
        if (d2 < 0) {
            return;
        }
        int i = d2 + 1;
        if (i < this.f750b.size()) {
            this.f750b.get(i).f761b.a(false);
        }
        a remove = this.f750b.remove(d2);
        remove.f761b.a(this);
        if (this.f752d) {
            remove.f760a.b((Object) null);
            remove.f760a.b(0);
        }
        remove.f760a.c();
        int size = this.f750b.size();
        if (size > 0) {
            this.q = this.f750b.get(size - 1).f762c;
        } else {
            this.q = i();
        }
        if (size != 0) {
            if (!z) {
                return;
            }
            this.f750b.get(0).f761b.a(false);
            return;
        }
        c();
        if (this.x != null) {
            this.x.a(gVar, true);
        }
        if (this.y != null) {
            if (this.y.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.k);
            }
            this.y = null;
        }
        this.f751c.removeOnAttachStateChangeListener(this.l);
        this.z.onDismiss();
    }

    @Override // android.support.v7.view.menu.k
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = android.support.v4.j.e.a(i, android.support.v4.j.s.c(this.p));
        }
    }

    @Override // android.support.v7.view.menu.k
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = android.support.v4.j.e.a(this.n, android.support.v4.j.s.c(this.p));
        }
    }

    @Override // android.support.v7.view.menu.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // android.support.v7.view.menu.q
    public ListView e() {
        if (this.f750b.isEmpty()) {
            return null;
        }
        return this.f750b.get(this.f750b.size() - 1).a();
    }

    @Override // android.support.v7.view.menu.k
    public void b(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // android.support.v7.view.menu.k
    public void c(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.support.v7.view.menu.k
    public void c(boolean z) {
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ab f760a;

        /* renamed from: b  reason: collision with root package name */
        public final g f761b;

        /* renamed from: c  reason: collision with root package name */
        public final int f762c;

        public a(ab abVar, g gVar, int i) {
            this.f760a = abVar;
            this.f761b = gVar;
            this.f762c = i;
        }

        public ListView a() {
            return this.f760a.e();
        }
    }
}
