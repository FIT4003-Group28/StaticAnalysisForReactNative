package android.support.v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
class ap implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    private static ap i;
    private static ap j;

    /* renamed from: a  reason: collision with root package name */
    private final View f930a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f931b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f932c = new Runnable() { // from class: android.support.v7.widget.ap.1
        @Override // java.lang.Runnable
        public void run() {
            ap.this.a(false);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f933d = new Runnable() { // from class: android.support.v7.widget.ap.2
        @Override // java.lang.Runnable
        public void run() {
            ap.this.a();
        }
    };
    private int e;
    private int f;
    private aq g;
    private boolean h;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public static void a(View view, CharSequence charSequence) {
        if (i != null && i.f930a == view) {
            b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (j != null && j.f930a == view) {
                j.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ap(view, charSequence);
    }

    private ap(View view, CharSequence charSequence) {
        this.f930a = view;
        this.f931b = charSequence;
        this.f930a.setOnLongClickListener(this);
        this.f930a.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.e = view.getWidth() / 2;
        this.f = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.g == null || !this.h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f930a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                }
            } else if (this.f930a.isEnabled() && this.g == null) {
                this.e = (int) motionEvent.getX();
                this.f = (int) motionEvent.getY();
                b(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        long longPressTimeout;
        if (!android.support.v4.j.s.q(this.f930a)) {
            return;
        }
        b(null);
        if (j != null) {
            j.a();
        }
        j = this;
        this.h = z;
        this.g = new aq(this.f930a.getContext());
        this.g.a(this.f930a, this.e, this.f, this.h, this.f931b);
        this.f930a.addOnAttachStateChangeListener(this);
        if (this.h) {
            longPressTimeout = 2500;
        } else if ((android.support.v4.j.s.h(this.f930a) & 1) == 1) {
            longPressTimeout = 3000 - ViewConfiguration.getLongPressTimeout();
        } else {
            longPressTimeout = 15000 - ViewConfiguration.getLongPressTimeout();
        }
        this.f930a.removeCallbacks(this.f933d);
        this.f930a.postDelayed(this.f933d, longPressTimeout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (j == this) {
            j = null;
            if (this.g != null) {
                this.g.a();
                this.g = null;
                this.f930a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (i == this) {
            b(null);
        }
        this.f930a.removeCallbacks(this.f933d);
    }

    private static void b(ap apVar) {
        if (i != null) {
            i.c();
        }
        i = apVar;
        if (i != null) {
            i.b();
        }
    }

    private void b() {
        this.f930a.postDelayed(this.f932c, ViewConfiguration.getLongPressTimeout());
    }

    private void c() {
        this.f930a.removeCallbacks(this.f932c);
    }
}
