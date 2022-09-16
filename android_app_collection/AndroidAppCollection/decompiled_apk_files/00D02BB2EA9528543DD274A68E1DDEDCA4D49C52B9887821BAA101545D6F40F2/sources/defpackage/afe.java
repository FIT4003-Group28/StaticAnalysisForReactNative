package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afe  reason: default package */
/* loaded from: classes2.dex */
public final class afe implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static afe b;
    public static afe c;
    public final View a;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new afc(this);
    private final Runnable g = new afd(this);
    private int h;
    private int i;
    private aff j;
    private boolean k;

    public afe(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = oe.c(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(afe afeVar) {
        afe afeVar2 = b;
        if (afeVar2 != null) {
            afeVar2.a.removeCallbacks(afeVar2.f);
        }
        b = afeVar;
        if (afeVar != null) {
            afeVar.a.postDelayed(afeVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        if (!od.ak(this.a)) {
            return;
        }
        c(null);
        afe afeVar = c;
        if (afeVar != null) {
            afeVar.b();
        }
        c = this;
        this.k = z;
        aff affVar = new aff(this.a.getContext());
        this.j = affVar;
        View view = this.a;
        int i2 = this.h;
        int i3 = this.i;
        boolean z2 = this.k;
        CharSequence charSequence = this.d;
        if (affVar.b()) {
            affVar.a();
        }
        affVar.c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = affVar.d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = affVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = affVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i3 + dimensionPixelOffset2;
            i = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = affVar.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
            }
        }
        if (rootView != null) {
            rootView.getWindowVisibleDisplayFrame(affVar.e);
            if (affVar.e.left < 0 && affVar.e.top < 0) {
                Resources resources = affVar.a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                affVar.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(affVar.g);
            view.getLocationOnScreen(affVar.f);
            int[] iArr = affVar.f;
            int i4 = iArr[0];
            int[] iArr2 = affVar.g;
            iArr[0] = i4 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            affVar.b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = affVar.b.getMeasuredHeight();
            int i5 = affVar.f[1];
            int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
            int i7 = i5 + height + dimensionPixelOffset3;
            if (z2) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= affVar.e.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
        ((WindowManager) affVar.a.getSystemService("window")).addView(affVar.b, affVar.d);
        this.a.addOnAttachStateChangeListener(this);
        if (this.k) {
            j2 = 2500;
        } else {
            if ((od.K(this.a) & 1) == 1) {
                j = 3000;
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
            } else {
                j = 15000;
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
            }
            j2 = j - longPressTimeout;
        }
        this.a.removeCallbacks(this.g);
        this.a.postDelayed(this.g, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (c == this) {
            c = null;
            aff affVar = this.j;
            if (affVar != null) {
                affVar.a();
                this.j = null;
                d();
                this.a.removeOnAttachStateChangeListener(this);
            }
        }
        if (b == this) {
            c(null);
        }
        this.a.removeCallbacks(this.g);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j == null || !this.k) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    d();
                    b();
                }
            } else if (this.a.isEnabled() && this.j == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                    this.h = x;
                    this.i = y;
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
