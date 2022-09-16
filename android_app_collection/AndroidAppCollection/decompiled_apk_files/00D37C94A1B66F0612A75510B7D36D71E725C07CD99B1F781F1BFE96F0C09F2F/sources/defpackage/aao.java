package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aao  reason: default package */
/* loaded from: classes.dex */
public final class aao implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static aao a;
    public static aao b;
    public final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new aan(this, 1);
    private final Runnable g = new aan(this);
    private int h;
    private int i;
    private aap j;
    private boolean k;

    public aao(View view, CharSequence charSequence) {
        this.c = view;
        this.d = charSequence;
        this.e = lk.c(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(aao aaoVar) {
        aao aaoVar2 = a;
        if (aaoVar2 != null) {
            aaoVar2.c.removeCallbacks(aaoVar2.f);
        }
        a = aaoVar;
        if (aaoVar != null) {
            aaoVar.c.postDelayed(aaoVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    public final void a() {
        if (b == this) {
            b = null;
            aap aapVar = this.j;
            if (aapVar != null) {
                aapVar.a();
                this.j = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            b(null);
        }
        this.c.removeCallbacks(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        if (!lj.aj(this.c)) {
            return;
        }
        b(null);
        aao aaoVar = b;
        if (aaoVar != null) {
            aaoVar.a();
        }
        b = this;
        this.k = z;
        aap aapVar = new aap(this.c.getContext());
        this.j = aapVar;
        View view = this.c;
        int i2 = this.h;
        int i3 = this.i;
        boolean z2 = this.k;
        CharSequence charSequence = this.d;
        if (aapVar.b()) {
            aapVar.a();
        }
        aapVar.c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = aapVar.d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = aapVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = aapVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i3 + dimensionPixelOffset2;
            i = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = aapVar.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
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
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(aapVar.e);
            if (aapVar.e.left < 0 && aapVar.e.top < 0) {
                Resources resources = aapVar.a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                aapVar.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(aapVar.g);
            view.getLocationOnScreen(aapVar.f);
            int[] iArr = aapVar.f;
            int i4 = iArr[0];
            int[] iArr2 = aapVar.g;
            iArr[0] = i4 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            aapVar.b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = aapVar.b.getMeasuredHeight();
            int i5 = aapVar.f[1];
            int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
            int i7 = i5 + height + dimensionPixelOffset3;
            if (z2) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= aapVar.e.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
        ((WindowManager) aapVar.a.getSystemService("window")).addView(aapVar.b, aapVar.d);
        this.c.addOnAttachStateChangeListener(this);
        if (this.k) {
            j2 = 2500;
        } else {
            if ((lj.j(this.c) & 1) == 1) {
                j = 3000;
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
            } else {
                j = 15000;
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
            }
            j2 = j - longPressTimeout;
        }
        this.c.removeCallbacks(this.g);
        this.c.postDelayed(this.g, j2);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j == null || !this.k) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    d();
                    a();
                }
            } else if (this.c.isEnabled() && this.j == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                    this.h = x;
                    this.i = y;
                    b(this);
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
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
