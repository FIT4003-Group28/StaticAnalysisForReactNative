package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements no, nl {
    private static final pz w = new pz();
    private static final int[] x = {16843130};
    private float A;
    private qa B;
    private long a;
    private final Rect b;
    private OverScroller c;
    private EdgeEffect d;
    private EdgeEffect e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private boolean j;
    private VelocityTracker k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int[] r;
    private final int[] s;
    private int t;
    private int u;
    private SavedState v;
    private final np y;
    private final nm z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final boolean A(View view) {
        return !B(view, 0, getHeight());
    }

    private final boolean B(View view, int i, int i2) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        return this.b.bottom + i >= getScrollY() && this.b.top - i <= getScrollY() + i2;
    }

    private final void C(int i) {
        if (i != 0) {
            if (this.m) {
                s(i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private final void D(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i4 = layoutParams.topMargin;
            int i5 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, i3);
            E(z);
        } else {
            if (!this.c.isFinished()) {
                F();
            }
            scrollBy(i, i2);
        }
        this.a = AnimationUtils.currentAnimationTimeMillis();
    }

    private final void E(boolean z) {
        if (z) {
            g(2, 1);
        } else {
            h(1);
        }
        this.u = getScrollY();
        od.i(this);
    }

    private final void F() {
        this.c.abortAnimation();
        h(1);
    }

    private final void G(View view) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        int o = o(this.b);
        if (o != 0) {
            scrollBy(0, o);
        }
    }

    private static boolean H(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && H((View) parent, view2);
    }

    private final void I() {
        this.j = false;
        x();
        h(0);
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.e.onRelease();
        }
    }

    private final void J() {
        if (getOverScrollMode() == 2) {
            this.d = null;
            this.e = null;
        } else if (this.d != null) {
        } else {
            Context context = getContext();
            this.d = new EdgeEffect(context);
            this.e = new EdgeEffect(context);
        }
    }

    private static int K(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private final void v(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.i(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private final void w() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    private final void x() {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k = null;
        }
    }

    private final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f = (int) motionEvent.getY(i);
            this.q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.k;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    private final boolean z(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z3 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            C(i == 33 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // defpackage.nn
    public final void b(View view, View view2, int i, int i2) {
        this.y.b(i, i2);
        g(2, i2);
    }

    @Override // defpackage.nn
    public final void c(View view, int i) {
        this.y.c(i);
        h(i);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.c.isFinished()) {
            return;
        }
        this.c.computeScrollOffset();
        int currY = this.c.getCurrY();
        int i = currY - this.u;
        this.u = currY;
        int[] iArr = this.s;
        iArr[1] = 0;
        j(0, i, iArr, null, 1);
        int i2 = i - this.s[1];
        int l = l();
        if (i2 != 0) {
            int scrollY = getScrollY();
            r(i2, getScrollX(), scrollY, l);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.s;
            iArr2[1] = 0;
            q(scrollY2, i3, this.r, 1, iArr2);
            i2 = i3 - this.s[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && l > 0)) {
                J();
                if (i2 < 0) {
                    if (this.d.isFinished()) {
                        this.d.onAbsorb((int) this.c.getCurrVelocity());
                    }
                } else if (this.e.isFinished()) {
                    this.e.onAbsorb((int) this.c.getCurrVelocity());
                }
            }
            F();
        }
        if (!this.c.isFinished()) {
            od.i(this);
        } else {
            h(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        v(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.z.l(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.z.m(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return j(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.z.h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(i, min);
                this.d.setSize(width, height);
                if (this.d.draw(canvas)) {
                    od.i(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.e.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(l(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.e.setSize(width2, height2);
            if (this.e.draw(canvas)) {
                od.i(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        j(i, i2, iArr, null, i3);
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        v(i4, i5, iArr);
    }

    public final boolean g(int i, int i2) {
        return this.z.e(i, i2);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom >= verticalFadingEdgeLength) {
            return 1.0f;
        }
        return bottom / verticalFadingEdgeLength;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY >= verticalFadingEdgeLength) {
            return 1.0f;
        }
        return scrollY / verticalFadingEdgeLength;
    }

    public final void h(int i) {
        this.z.g(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return i(0);
    }

    public final boolean i(int i) {
        return this.z.c(i);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.a;
    }

    public final boolean j(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.z.k(i, i2, iArr, iArr2, i3);
    }

    public final boolean k(KeyEvent keyEvent) {
        this.b.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                int i = 33;
                if (keyCode == 19) {
                    if (!keyEvent.isAltPressed()) {
                        return n(33);
                    }
                    return m(33);
                } else if (keyCode == 20) {
                    if (!keyEvent.isAltPressed()) {
                        return n(130);
                    }
                    return m(130);
                } else if (keyCode != 62) {
                    return false;
                } else {
                    if (true != keyEvent.isShiftPressed()) {
                        i = 130;
                    }
                    int height = getHeight();
                    if (i == 130) {
                        this.b.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            View childAt2 = getChildAt(childCount - 1);
                            int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                            if (this.b.top + height > bottom) {
                                this.b.top = bottom - height;
                            }
                        }
                    } else {
                        this.b.top = getScrollY() - height;
                        if (this.b.top < 0) {
                            this.b.top = 0;
                        }
                    }
                    Rect rect = this.b;
                    rect.bottom = rect.top + height;
                    z(i, this.b.top, this.b.bottom);
                    return false;
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final int l() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    public final boolean m(int i) {
        int childCount;
        int height = getHeight();
        this.b.top = 0;
        this.b.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.b;
            rect.top = rect.bottom - height;
        }
        return z(i, this.b.top, this.b.bottom);
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !B(findNextFocus, height, getHeight())) {
            if (i != 33 || getScrollY() >= height) {
                if (i == 130 && getChildCount() > 0) {
                    View childAt = getChildAt(0);
                    height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
                }
            } else {
                height = getScrollY();
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            C(height);
        } else {
            findNextFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findNextFocus, this.b);
            C(o(this.b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !A(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    protected final int o(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom <= i4 || rect.top <= scrollY) {
            if (rect.top >= scrollY || rect.bottom >= i4) {
                return 0;
            }
            if (rect.height() > height) {
                i = -(i4 - rect.bottom);
            } else {
                i = -(scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
        if (rect.height() > height) {
            i2 = rect.top - scrollY;
        } else {
            i2 = rect.bottom - i4;
        }
        return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f = this.A;
                if (f == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    f = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    this.A = f;
                }
                int l = l();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * f));
                if (i < 0) {
                    l = 0;
                } else if (i <= l) {
                    l = i;
                }
                if (l != scrollY) {
                    super.scrollTo(getScrollX(), l);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.j) {
                return true;
            }
            action = 2;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            String str = "Invalid pointerId=" + i2 + " in onInterceptTouchEvent";
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f) > this.n && (2 & getNestedScrollAxes()) == 0) {
                                this.j = true;
                                this.f = y;
                                w();
                                this.k.addMovement(motionEvent);
                                this.t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        y(motionEvent);
                    }
                }
            }
            this.j = false;
            this.q = -1;
            x();
            if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, l())) {
                od.i(this);
            }
            h(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f = y2;
                    this.q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.k;
                    if (velocityTracker == null) {
                        this.k = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.k.addMovement(motionEvent);
                    this.c.computeScrollOffset();
                    this.j = !this.c.isFinished();
                    g(2, 0);
                }
            }
            this.j = false;
            x();
        }
        return this.j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.g = false;
        View view = this.i;
        if (view != null && H(view, this)) {
            G(this.i);
        }
        this.i = null;
        if (!this.h) {
            if (this.v != null) {
                scrollTo(getScrollX(), this.v.a);
                this.v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int K = K(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (K != scrollY) {
                scrollTo(getScrollX(), K);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight >= measuredHeight2) {
                return;
            }
            childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            p((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        v(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect != null && !A(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.v = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        qa qaVar = this.B;
        if (qaVar != null) {
            qaVar.a(this, i2);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !B(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(findFocus, this.b);
        C(o(this.b));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = 0;
            actionMasked = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.t);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.k;
                velocityTracker.computeCurrentVelocity(1000, this.p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.q);
                if (Math.abs(yVelocity) >= this.o) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        p(i);
                    }
                } else if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, l())) {
                    od.i(this);
                }
                this.q = -1;
                I();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.q);
                if (findPointerIndex == -1) {
                    String str = "Invalid pointerId=" + this.q + " in onTouchEvent";
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f - y;
                    if (!this.j && Math.abs(i2) > this.n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.j = true;
                        i2 = i2 > 0 ? i2 - this.n : i2 + this.n;
                    }
                    int i3 = i2;
                    if (this.j) {
                        if (j(0, i3, this.s, this.r, 0)) {
                            i3 -= this.s[1];
                            this.t += this.r[1];
                        }
                        this.f = y - this.r[1];
                        int scrollY = getScrollY();
                        int l = l();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && l > 0);
                        if (r(i3, 0, getScrollY(), l) && !i(0)) {
                            this.k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.s;
                        iArr[1] = 0;
                        q(scrollY2, i3 - scrollY2, this.r, 0, iArr);
                        int i4 = this.f;
                        int i5 = this.r[1];
                        this.f = i4 - i5;
                        this.t += i5;
                        if (z) {
                            int i6 = i3 - this.s[1];
                            J();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                this.d.onPull(i6 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.e.isFinished()) {
                                    this.e.onRelease();
                                }
                            } else if (i7 > l) {
                                this.e.onPull(i6 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                if (!this.d.isFinished()) {
                                    this.d.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.d;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.e.isFinished())) {
                                od.i(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.j && getChildCount() > 0 && this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, l())) {
                    od.i(this);
                }
                this.q = -1;
                I();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f = (int) motionEvent.getY(actionIndex);
                this.q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                y(motionEvent);
                this.f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.q));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.c.isFinished();
            this.j = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.c.isFinished()) {
                F();
            }
            this.f = (int) motionEvent.getY();
            this.q = motionEvent.getPointerId(0);
            g(2, 0);
        }
        VelocityTracker velocityTracker2 = this.k;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i) {
        if (getChildCount() > 0) {
            this.c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            E(true);
        }
    }

    public final void q(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.z.i(0, i, 0, i2, iArr, i3, iArr2);
    }

    final boolean r(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        boolean z2 = i2 > 0 || i2 < 0;
        if (i5 > i4) {
            z = true;
        } else if (i5 < 0) {
            z = true;
            i4 = 0;
        } else {
            i4 = i5;
            z = false;
        }
        if (z && !i(1)) {
            this.c.springBack(0, i4, 0, 0, 0, l());
        }
        onOverScrolled(0, i4, z2, z);
        return z2 || z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.g) {
            G(view2);
        } else {
            this.i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int o = o(rect);
        boolean z2 = o != 0;
        if (z2) {
            if (z) {
                scrollBy(0, o);
            } else {
                s(o);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.g = true;
        super.requestLayout();
    }

    public final void s(int i) {
        D(0, i, 250, false);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int K = K(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int K2 = K(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (K == getScrollX() && K2 == getScrollY()) {
                return;
            }
            super.scrollTo(K, K2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.l) {
            this.l = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.z.a(z);
    }

    public void setOnScrollChangeListener(qa qaVar) {
        this.B = qaVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.m = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        h(0);
    }

    public final void t(int i, int i2, boolean z) {
        D(-getScrollX(), i - getScrollY(), i2, z);
    }

    public final void u(int i) {
        t(i, 250, true);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new qb();
        public int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.g = true;
        this.h = false;
        this.i = null;
        this.j = false;
        this.m = true;
        this.q = -1;
        this.r = new int[2];
        this.s = new int[2];
        this.c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.y = new np();
        this.z = new nm(this);
        setNestedScrollingEnabled(true);
        od.c(this, w);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
