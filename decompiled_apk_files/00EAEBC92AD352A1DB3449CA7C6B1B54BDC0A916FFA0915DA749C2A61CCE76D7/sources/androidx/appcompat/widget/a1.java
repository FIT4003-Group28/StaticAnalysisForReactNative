package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static a1 k;
    private static a1 l;

    /* renamed from: b  reason: collision with root package name */
    private final View f1203b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f1204c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1205d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1206e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f1207f = new b();

    /* renamed from: g  reason: collision with root package name */
    private int f1208g;

    /* renamed from: h  reason: collision with root package name */
    private int f1209h;
    private b1 i;
    private boolean j;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.a(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.a();
        }
    }

    private a1(View view, CharSequence charSequence) {
        this.f1203b = view;
        this.f1204c = charSequence;
        this.f1205d = a.g.m.w.a(ViewConfiguration.get(this.f1203b.getContext()));
        c();
        this.f1203b.setOnLongClickListener(this);
        this.f1203b.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        a1 a1Var = k;
        if (a1Var != null && a1Var.f1203b == view) {
            a((a1) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a1(view, charSequence);
            return;
        }
        a1 a1Var2 = l;
        if (a1Var2 != null && a1Var2.f1203b == view) {
            a1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private static void a(a1 a1Var) {
        a1 a1Var2 = k;
        if (a1Var2 != null) {
            a1Var2.b();
        }
        k = a1Var;
        a1 a1Var3 = k;
        if (a1Var3 != null) {
            a1Var3.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1208g) > this.f1205d || Math.abs(y - this.f1209h) > this.f1205d) {
            this.f1208g = x;
            this.f1209h = y;
            return true;
        }
        return false;
    }

    private void b() {
        this.f1203b.removeCallbacks(this.f1206e);
    }

    private void c() {
        this.f1208g = Integer.MAX_VALUE;
        this.f1209h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1203b.postDelayed(this.f1206e, ViewConfiguration.getLongPressTimeout());
    }

    void a() {
        if (l == this) {
            l = null;
            b1 b1Var = this.i;
            if (b1Var != null) {
                b1Var.a();
                this.i = null;
                c();
                this.f1203b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((a1) null);
        }
        this.f1203b.removeCallbacks(this.f1207f);
    }

    void a(boolean z) {
        long longPressTimeout;
        if (!a.g.m.v.H(this.f1203b)) {
            return;
        }
        a((a1) null);
        a1 a1Var = l;
        if (a1Var != null) {
            a1Var.a();
        }
        l = this;
        this.j = z;
        this.i = new b1(this.f1203b.getContext());
        this.i.a(this.f1203b, this.f1208g, this.f1209h, this.j, this.f1204c);
        this.f1203b.addOnAttachStateChangeListener(this);
        if (this.j) {
            longPressTimeout = 2500;
        } else {
            longPressTimeout = ((a.g.m.v.A(this.f1203b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f1203b.removeCallbacks(this.f1207f);
        this.f1203b.postDelayed(this.f1207f, longPressTimeout);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i == null || !this.j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1203b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    c();
                    a();
                }
            } else if (this.f1203b.isEnabled() && this.i == null && a(motionEvent)) {
                a(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1208g = view.getWidth() / 2;
        this.f1209h = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
