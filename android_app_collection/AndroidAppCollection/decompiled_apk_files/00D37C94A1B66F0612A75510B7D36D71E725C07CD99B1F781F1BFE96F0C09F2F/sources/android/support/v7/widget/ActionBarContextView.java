package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContextView extends td {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private int r;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private final void o() {
        if (this.m == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = linearLayout;
            this.n = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.o = (TextView) this.m.findViewById(R.id.action_bar_subtitle);
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
        }
        this.n.setText(this.g);
        this.o.setText(this.h);
        boolean z = !TextUtils.isEmpty(this.g);
        boolean isEmpty = TextUtils.isEmpty(this.h);
        boolean z2 = !isEmpty;
        int i = 8;
        this.o.setVisibility(true != isEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.m;
        if (z || z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.m.getParent() == null) {
            addView(this.m);
        }
    }

    @Override // defpackage.td
    public final void d(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(re reVar) {
        View view = this.i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.r, (ViewGroup) this, false);
            this.i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        View findViewById = this.i.findViewById(R.id.action_mode_close_button);
        this.k = findViewById;
        findViewById.setOnClickListener(new tf(reVar));
        Menu a = reVar.a();
        tq tqVar = this.d;
        if (tqVar != null) {
            tqVar.n();
        }
        this.d = new tq(getContext());
        this.d.p();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((sf) a).h(this.d, this.b);
        tq tqVar2 = this.d;
        sv svVar = tqVar2.f;
        if (tqVar2.f == null) {
            tqVar2.f = (sv) tqVar2.d.inflate(R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            tqVar2.f.a(tqVar2.c);
            tqVar2.i();
        }
        sv svVar2 = tqVar2.f;
        if (svVar != svVar2) {
            ((ActionMenuView) svVar2).h(tqVar2);
        }
        this.c = (ActionMenuView) svVar2;
        lj.O(this.c, null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.l = null;
        this.c = null;
        this.d = null;
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        LinearLayout linearLayout;
        View view2 = this.l;
        if (view2 != null) {
            removeView(view2);
        }
        this.l = view;
        if (view != null && (linearLayout = this.m) != null) {
            removeView(linearLayout);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        o();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        o();
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        tq tqVar = this.d;
        if (tqVar != null) {
            tqVar.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tq tqVar = this.d;
        if (tqVar != null) {
            tqVar.k();
            this.d.q();
        }
    }

    @Override // defpackage.td, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = aav.b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = a(paddingRight, i5, b);
            paddingRight = a(a + g(this.i, a, paddingTop, paddingTop2, b), i6, b);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null && this.l == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.m, paddingRight, paddingTop, paddingTop2, b);
        }
        View view2 = this.l;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            View view = this.i;
            if (view != null) {
                int f = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
                paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.m;
            if (linearLayout != null && this.l == null) {
                if (this.j) {
                    this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.m.getMeasuredWidth();
                    int i6 = measuredWidth <= paddingLeft ? paddingLeft - measuredWidth : paddingLeft;
                    this.m.setVisibility(measuredWidth > paddingLeft ? 8 : 0);
                    paddingLeft = i6;
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.l;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width != -2 ? 1073741824 : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.e <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i8);
                return;
            }
            setMeasuredDimension(size, i4);
        }
    }

    @Override // defpackage.td, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aad l = aad.l(context, attributeSet, pm.d, i, 0);
        lj.O(this, l.h(0));
        this.p = l.f(5, 0);
        this.q = l.f(4, 0);
        this.e = l.e(3, 0);
        this.r = l.f(2, R.layout.abc_action_mode_close_item_material);
        l.o();
    }
}
