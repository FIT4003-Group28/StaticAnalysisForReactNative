package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ank  reason: default package */
/* loaded from: classes.dex */
public class ank extends ViewGroup {
    private static final boolean G;
    public static final /* synthetic */ int i = 0;
    private Drawable A;
    private ow B;
    private boolean C;
    private final ArrayList<View> D;
    private Rect E;
    private Matrix F;
    private final pp H;
    public final amy b;
    public final amy c;
    public int d;
    public boolean e;
    public List<ane> f;
    public CharSequence g;
    public CharSequence h;
    private float k;
    private int l;
    private int m;
    private float n;
    private Paint o;
    private final anj p;
    private final anj q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private ane x;
    private float y;
    private float z;
    private static final int[] j = {16843828};
    static final int[] a = {16842931};

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 29) {
            z = false;
        }
        G = z;
    }

    public ank(Context context) {
        this(context, null);
    }

    public static String i(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    static final boolean m(View view) {
        return ((anf) view.getLayoutParams()).a == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean n(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((anf) view.getLayoutParams()).a, od.s(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static final boolean p(View view) {
        if (n(view)) {
            return (((anf) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int a(View view) {
        int i2;
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i3 = ((anf) view.getLayoutParams()).a;
        int s = od.s(this);
        if (i3 == 3) {
            i2 = this.t;
            if (i2 == 3) {
                i2 = s == 0 ? this.v : this.w;
                if (i2 == 3) {
                    return 0;
                }
            }
        } else if (i3 == 5) {
            i2 = this.u;
            if (i2 == 3) {
                i2 = s == 0 ? this.w : this.v;
                if (i2 == 3) {
                    return 0;
                }
            }
        } else if (i3 == 8388611) {
            i2 = this.v;
            if (i2 == 3) {
                i2 = s == 0 ? this.t : this.u;
                if (i2 == 3) {
                    return 0;
                }
            }
        } else if (i3 != 8388613) {
            return 0;
        } else {
            i2 = this.w;
            if (i2 == 3) {
                i2 = s == 0 ? this.u : this.t;
                if (i2 == 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (n(childAt)) {
                if (p(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z = true;
                }
            } else {
                this.D.add(childAt);
            }
        }
        if (!z) {
            int size = this.D.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.D.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.D.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (g() != null || n(view)) {
            od.m(view, 4);
        } else {
            od.m(view, 1);
        }
    }

    public final void b(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (z ? childAt == view : !n(childAt)) {
                od.m(childAt, 1);
            } else {
                od.m(childAt, 4);
            }
        }
    }

    public final void c(View view) {
        od.p(view, oy.h.a());
        if (!p(view) || a(view) == 2) {
            return;
        }
        od.aD(view, oy.h, this.H);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof anf) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f = Math.max(f, ((anf) getChildAt(i2).getLayoutParams()).b);
        }
        this.n = f;
        boolean l = this.b.l();
        boolean l2 = this.c.l();
        if (l || l2) {
            od.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(View view, float f) {
        anf anfVar = (anf) view.getLayoutParams();
        if (f == anfVar.b) {
            return;
        }
        anfVar.b = f;
        List<ane> list = this.f;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.f.get(size).d();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.n <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            if (this.E == null) {
                this.E = new Rect();
            }
            childAt.getHitRect(this.E);
            if (this.E.contains((int) x, (int) y) && !m(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    int scrollX = getScrollX();
                    int left = childAt.getLeft();
                    int scrollY = getScrollY();
                    int top = childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX - left, scrollY - top);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.F == null) {
                            this.F = new Matrix();
                        }
                        matrix.invert(this.F);
                        obtain.transform(this.F);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX2, scrollY2);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX2, -scrollY2);
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        int height = getHeight();
        boolean m = m(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (m) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && n(childAt) && childAt.getHeight() >= height) {
                    if (f(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f = this.n;
        if (f > 0.0f && m) {
            int i5 = this.m;
            this.o.setColor((((int) ((i5 >>> 24) * f)) << 24) | (i5 & 16777215));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.o);
        }
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(View view) {
        return Gravity.getAbsoluteGravity(((anf) view.getLayoutParams()).a, od.s(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(View view, int i2) {
        return (e(view) & i2) == i2;
    }

    final View g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((anf) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new anf();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new anf(getContext(), attributeSet);
    }

    public final View h(int i2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, od.s(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((e(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    final void j(boolean z) {
        boolean d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            anf anfVar = (anf) childAt.getLayoutParams();
            if (n(childAt) && (!z || anfVar.c)) {
                int width = childAt.getWidth();
                if (f(childAt, 3)) {
                    d = this.b.d(childAt, -width, childAt.getTop());
                } else {
                    d = this.c.d(childAt, getWidth(), childAt.getTop());
                }
                z2 |= d;
                anfVar.c = false;
            }
        }
        this.p.m();
        this.q.m();
        if (z2) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View k() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (n(childAt)) {
                if (!n(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((anf) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final void l(View view) {
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        anf anfVar = (anf) view.getLayoutParams();
        if (this.s) {
            anfVar.b = 0.0f;
            anfVar.d = 0;
        } else {
            anfVar.d |= 4;
            if (f(view, 3)) {
                this.b.d(view, -view.getWidth(), view.getTop());
            } else {
                this.c.d(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void o(View view) {
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        anf anfVar = (anf) view.getLayoutParams();
        if (this.s) {
            anfVar.b = 1.0f;
            anfVar.d = 1;
            b(view, true);
            c(view);
        } else {
            anfVar.d |= 2;
            if (f(view, 3)) {
                this.b.d(view, 0, view.getTop());
            } else {
                this.c.d(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.A == null) {
            return;
        }
        ow owVar = this.B;
        int d = owVar != null ? owVar.d() : 0;
        if (d <= 0) {
            return;
        }
        this.A.setBounds(0, 0, getWidth(), d);
        this.A.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            amy r1 = r8.b
            boolean r1 = r1.i(r9)
            amy r2 = r8.c
            boolean r2 = r2.i(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L62
            if (r0 == r2) goto L5b
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5b
            goto L60
        L1e:
            amy r9 = r8.b
            float[] r0 = r9.c
            int r0 = r0.length
            r4 = 0
        L24:
            if (r4 >= r0) goto L60
            boolean r5 = r9.f(r4)
            if (r5 != 0) goto L2d
            goto L58
        L2d:
            float[] r5 = r9.e
            r5 = r5[r4]
            float[] r6 = r9.c
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f
            r6 = r6[r4]
            float[] r7 = r9.d
            r7 = r7[r4]
            float r6 = r6 - r7
            int r7 = r9.b
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r5 = r5 + r6
            int r7 = r7 * r7
            float r6 = (float) r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L58
            anj r9 = r8.p
            r9.m()
            anj r9 = r8.q
            r9.m()
            goto L60
        L58:
            int r4 = r4 + 1
            goto L24
        L5b:
            r8.j(r2)
            r8.e = r3
        L60:
            r9 = 0
            goto L8a
        L62:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.y = r0
            r8.z = r9
            float r4 = r8.n
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L87
            amy r4 = r8.b
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.k(r0, r9)
            if (r9 == 0) goto L87
            boolean r9 = m(r9)
            if (r9 == 0) goto L87
            r9 = 1
            goto L88
        L87:
            r9 = 0
        L88:
            r8.e = r3
        L8a:
            if (r1 != 0) goto Lac
            if (r9 != 0) goto Lac
            int r9 = r8.getChildCount()
            r0 = 0
        L93:
            if (r0 >= r9) goto La7
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            anf r1 = (defpackage.anf) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La4
            goto Lac
        La4:
            int r0 = r0 + 1
            goto L93
        La7:
            boolean r9 = r8.e
            if (r9 != 0) goto Lac
            return r3
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (k() != null) {
                keyEvent.startTracking();
                return true;
            }
            i2 = 4;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            View k = k();
            if (k != null && a(k) == 0) {
                j(false);
            }
            return k != null;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f;
        int i6;
        int i7;
        this.r = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                anf anfVar = (anf) childAt.getLayoutParams();
                if (m(childAt)) {
                    childAt.layout(anfVar.leftMargin, anfVar.topMargin, anfVar.leftMargin + childAt.getMeasuredWidth(), anfVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (f(childAt, 3)) {
                        f = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (anfVar.b * f));
                        i7 = measuredWidth + i6;
                    } else {
                        f = measuredWidth;
                        i6 = i8 - ((int) (anfVar.b * f));
                        i7 = i8 - i6;
                    }
                    float f2 = i7 / f;
                    float f3 = anfVar.b;
                    int i10 = anfVar.a & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < anfVar.topMargin) {
                            i12 = anfVar.topMargin;
                        } else if (i12 + measuredHeight > i11 - anfVar.bottomMargin) {
                            i12 = (i11 - anfVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 == 80) {
                        int i13 = i5 - i3;
                        childAt.layout(i6, (i13 - anfVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - anfVar.bottomMargin);
                    } else {
                        childAt.layout(i6, anfVar.topMargin, measuredWidth + i6, anfVar.topMargin + measuredHeight);
                    }
                    if (f2 != f3) {
                        d(childAt, f2);
                    }
                    int i14 = anfVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i14) {
                        childAt.setVisibility(i14);
                    }
                }
            }
        }
        if (G && (rootWindowInsets = getRootWindowInsets()) != null) {
            kd n = ow.a(rootWindowInsets).n();
            amy amyVar = this.b;
            amyVar.h = Math.max(amyVar.i, n.b);
            amy amyVar2 = this.c;
            amyVar2.h = Math.max(amyVar2.i, n.d);
        }
        this.r = false;
        this.s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        View h;
        if (!(parcelable instanceof DrawerLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DrawerLayout$SavedState drawerLayout$SavedState = (DrawerLayout$SavedState) parcelable;
        super.onRestoreInstanceState(drawerLayout$SavedState.d);
        int i2 = drawerLayout$SavedState.a;
        if (i2 != 0 && (h = h(i2)) != null) {
            o(h);
        }
        int i3 = drawerLayout$SavedState.b;
        if (i3 != 3) {
            setDrawerLockMode(i3, 3);
        }
        int i4 = drawerLayout$SavedState.e;
        if (i4 != 3) {
            setDrawerLockMode(i4, 5);
        }
        int i5 = drawerLayout$SavedState.f;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388611);
        }
        int i6 = drawerLayout$SavedState.g;
        if (i6 == 3) {
            return;
        }
        setDrawerLockMode(i6, 8388613);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            anf anfVar = (anf) getChildAt(i2).getLayoutParams();
            int i3 = anfVar.d;
            if (i3 == 1 || i3 == 2) {
                drawerLayout$SavedState.a = anfVar.a;
                break;
            }
        }
        drawerLayout$SavedState.b = this.t;
        drawerLayout$SavedState.e = this.u;
        drawerLayout$SavedState.f = this.v;
        drawerLayout$SavedState.g = this.w;
        return drawerLayout$SavedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (a(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            amy r0 = r6.b
            r0.j(r7)
            amy r0 = r6.c
            r0.j(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6e
        L1a:
            r6.j(r2)
            r6.e = r1
            goto L6e
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            amy r3 = r6.b
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.k(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = m(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.y
            float r0 = r0 - r3
            float r3 = r6.z
            float r7 = r7 - r3
            amy r3 = r6.b
            int r3 = r3.b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.g()
            if (r7 == 0) goto L5b
            int r7 = r6.a(r7)
            r0 = 2
            if (r7 != r0) goto L5c
        L5b:
            r1 = 1
        L5c:
            r6.j(r1)
            goto L6e
        L60:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.y = r0
            r6.z = r7
            r6.e = r1
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            j(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.r) {
            super.requestLayout();
        }
    }

    public void setChildInsets(ow owVar, boolean z) {
        this.B = owVar;
        this.C = z;
        boolean z2 = false;
        if (!z && getBackground() == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.k = f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (n(childAt)) {
                od.F(childAt, this.k);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(ane aneVar) {
        List<ane> list;
        ane aneVar2 = this.x;
        if (aneVar2 != null && (list = this.f) != null) {
            list.remove(aneVar2);
        }
        if (aneVar != null) {
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(aneVar);
        }
        this.x = aneVar;
    }

    public void setDrawerLockMode(int i2) {
        setDrawerLockMode(i2, 3);
        setDrawerLockMode(i2, 5);
    }

    public void setDrawerShadow(int i2, int i3) {
        setDrawerShadow(getContext().getDrawable(i2), i3);
    }

    public void setDrawerShadow(Drawable drawable, int i2) {
    }

    public void setDrawerTitle(int i2, CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, od.s(this));
        if (absoluteGravity == 3) {
            this.g = charSequence;
        } else if (absoluteGravity != 5) {
        } else {
            this.h = charSequence;
        }
    }

    public void setScrimColor(int i2) {
        this.m = i2;
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.A = i2 != 0 ? getContext().getDrawable(i2) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.A = new ColorDrawable(i2);
        invalidate();
    }

    public ank(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.maps.R.attr.drawerLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof anf) {
            return new anf((anf) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new anf((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new anf(layoutParams);
    }

    public ank(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        new and();
        this.m = -1728053248;
        this.o = new Paint();
        this.s = true;
        this.t = 3;
        this.u = 3;
        this.v = 3;
        this.w = 3;
        this.H = new ana(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.l = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        anj anjVar = new anj(this, 3);
        this.p = anjVar;
        anj anjVar2 = new anj(this, 5);
        this.q = anjVar2;
        amy m = amy.m(this, anjVar);
        this.b = m;
        m.j = 1;
        m.g = f2;
        anjVar.b = m;
        amy m2 = amy.m(this, anjVar2);
        this.c = m2;
        m2.j = 2;
        m2.g = f2;
        anjVar2.b = m2;
        setFocusableInTouchMode(true);
        od.m(this, 1);
        od.c(this, new anc(this));
        setMotionEventSplittingEnabled(false);
        if (od.M(this)) {
            od.O(this, new anb());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j);
            try {
                this.A = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, amz.a, i2, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.k = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.k = getResources().getDimension(com.google.android.apps.maps.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.D = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i2, int i3) {
        View h;
        amy amyVar;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, od.s(this));
        if (i3 == 3) {
            this.t = i2;
        } else if (i3 == 5) {
            this.u = i2;
        } else if (i3 == 8388611) {
            this.v = i2;
        } else if (i3 == 8388613) {
            this.w = i2;
        }
        if (i2 != 0) {
            if (absoluteGravity == 3) {
                amyVar = this.b;
            } else {
                amyVar = this.c;
            }
            amyVar.c();
        }
        if (i2 != 1) {
            if (i2 != 2 || (h = h(absoluteGravity)) == null) {
                return;
            }
            o(h);
            return;
        }
        View h2 = h(absoluteGravity);
        if (h2 == null) {
            return;
        }
        l(h2);
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.A = drawable;
        invalidate();
    }

    public void setDrawerLockMode(int i2, View view) {
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        setDrawerLockMode(i2, ((anf) view.getLayoutParams()).a);
    }
}
