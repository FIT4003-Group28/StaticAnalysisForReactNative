package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f1244b;

    /* renamed from: c  reason: collision with root package name */
    private int f1245c;

    /* renamed from: d  reason: collision with root package name */
    private int f1246d;

    /* renamed from: e  reason: collision with root package name */
    private int f1247e;

    /* renamed from: f  reason: collision with root package name */
    private int f1248f;

    /* renamed from: g  reason: collision with root package name */
    private int f1249g;

    /* renamed from: h  reason: collision with root package name */
    private Field f1250h;
    private a i;
    private boolean j;
    private boolean k;
    private boolean l;
    private a.g.m.z m;
    private androidx.core.widget.f n;
    b o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends a.a.l.a.c {

        /* renamed from: c  reason: collision with root package name */
        private boolean f1251c;

        a(Drawable drawable) {
            super(drawable);
            this.f1251c = true;
        }

        void a(boolean z) {
            this.f1251c = z;
        }

        @Override // a.a.l.a.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1251c) {
                super.draw(canvas);
            }
        }

        @Override // a.a.l.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1251c) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // a.a.l.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1251c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // a.a.l.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1251c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // a.a.l.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1251c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(Context context, boolean z) {
        super(context, null, a.a.a.dropDownListViewStyle);
        this.f1244b = new Rect();
        this.f1245c = 0;
        this.f1246d = 0;
        this.f1247e = 0;
        this.f1248f = 0;
        this.k = z;
        setCacheColorHint(0);
        try {
            this.f1250h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1250h.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1249g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        a.g.m.z zVar = this.m;
        if (zVar != null) {
            zVar.a();
            this.m = null;
        }
    }

    private void a(int i, View view) {
        Rect rect = this.f1244b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1245c;
        rect.top -= this.f1246d;
        rect.right += this.f1247e;
        rect.bottom += this.f1248f;
        try {
            boolean z = this.f1250h.getBoolean(this);
            if (view.isEnabled() == z) {
                return;
            }
            this.f1250h.set(this, Boolean.valueOf(!z));
            if (i == -1) {
                return;
            }
            refreshDrawableState();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a(int i, View view, float f2, float f3) {
        b(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.a(selector, f2, f3);
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (this.f1244b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1244b);
        selector.draw(canvas);
    }

    private void a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void a(View view, int i, float f2, float f3) {
        View childAt;
        this.l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1249g;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1249g = i;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        a(i, view);
        if (z2) {
            Rect rect = this.f1244b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.a(selector, exactCenterX, exactCenterY);
        }
    }

    private boolean b() {
        return this.l;
    }

    private void c() {
        Drawable selector = getSelector();
        if (selector == null || !b() || !isPressed()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.a(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.a(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.n
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.n = r9
        L5a:
            androidx.core.widget.f r9 = r7.n
            r9.a(r2)
            androidx.core.widget.f r9 = r7.n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.n
            if (r8 == 0) goto L6c
            r8.a(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.o == null) {
            this.o = new b();
            this.o.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1249g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.i = drawable != null ? new a(drawable) : null;
        super.setSelector(this.i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1245c = rect.left;
        this.f1246d = rect.top;
        this.f1247e = rect.right;
        this.f1248f = rect.bottom;
    }
}
