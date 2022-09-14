package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
public class v extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1017a;

    /* renamed from: b  reason: collision with root package name */
    private int f1018b;

    /* renamed from: c  reason: collision with root package name */
    private int f1019c;

    /* renamed from: d  reason: collision with root package name */
    private int f1020d;
    private int e;
    private int f;
    private Field g;
    private a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private android.support.v4.j.w l;
    private android.support.v4.widget.j m;
    private b n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Context context, boolean z) {
        super(context, null, a.C0020a.dropDownListViewStyle);
        this.f1017a = new Rect();
        this.f1018b = 0;
        this.f1019c = 0;
        this.f1020d = 0;
        this.e = 0;
        this.j = z;
        setCacheColorHint(0);
        try {
            this.g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.j && this.i) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.h = drawable != null ? new a(drawable) : null;
        super.setSelector(this.h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1018b = rect.left;
        this.f1019c = rect.top;
        this.f1020d = rect.right;
        this.e = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        a();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.n != null) {
            this.n.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
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
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
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

    private void setSelectorEnabled(boolean z) {
        if (this.h != null) {
            this.h.a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class a extends android.support.v7.c.a.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1021a;

        a(Drawable drawable) {
            super(drawable);
            this.f1021a = true;
        }

        void a(boolean z) {
            this.f1021a = z;
        }

        @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1021a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1021a) {
                super.draw(canvas);
            }
        }

        @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1021a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1021a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1021a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            this.n = new b();
            this.n.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
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
            switch(r0) {
                case 1: goto L11;
                case 2: goto Lf;
                case 3: goto Lc;
                default: goto L9;
            }
        L9:
            r9 = 0
            r3 = 1
            goto L41
        Lc:
            r9 = 0
            r3 = 0
            goto L41
        Lf:
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L19
            goto Lc
        L19:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L2c
            r9 = 1
            goto L41
        L2c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.a(r3, r5, r4, r9)
            if (r0 != r2) goto L9
            r7.a(r3, r5)
            goto L9
        L41:
            if (r3 == 0) goto L45
            if (r9 == 0) goto L48
        L45:
            r7.b()
        L48:
            if (r3 == 0) goto L60
            android.support.v4.widget.j r9 = r7.m
            if (r9 != 0) goto L55
            android.support.v4.widget.j r9 = new android.support.v4.widget.j
            r9.<init>(r7)
            r7.m = r9
        L55:
            android.support.v4.widget.j r9 = r7.m
            r9.a(r2)
            android.support.v4.widget.j r9 = r7.m
            r9.onTouch(r7, r8)
            goto L69
        L60:
            android.support.v4.widget.j r8 = r7.m
            if (r8 == 0) goto L69
            android.support.v4.widget.j r8 = r7.m
            r8.a(r1)
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.v.a(android.view.MotionEvent, int):boolean");
    }

    private void a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.i = z;
    }

    private void a() {
        Drawable selector = getSelector();
        if (selector == null || !c() || !isPressed()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (this.f1017a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1017a);
        selector.draw(canvas);
    }

    private void a(int i, View view, float f, float f2) {
        a(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        android.support.v4.b.a.a.a(selector, f, f2);
    }

    private void a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        b(i, view);
        if (z2) {
            Rect rect = this.f1017a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            android.support.v4.b.a.a.a(selector, exactCenterX, exactCenterY);
        }
    }

    private void b(int i, View view) {
        Rect rect = this.f1017a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1018b;
        rect.top -= this.f1019c;
        rect.right += this.f1020d;
        rect.bottom += this.e;
        try {
            boolean z = this.g.getBoolean(this);
            if (view.isEnabled() == z) {
                return;
            }
            this.g.set(this, Boolean.valueOf(!z));
            if (i == -1) {
                return;
            }
            refreshDrawableState();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void b() {
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.l != null) {
            this.l.a();
            this.l = null;
        }
    }

    private void a(View view, int i, float f, float f2) {
        View childAt;
        this.k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f != -1 && (childAt = getChildAt(this.f - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.n = null;
            v.this.drawableStateChanged();
        }

        public void a() {
            v.this.n = null;
            v.this.removeCallbacks(this);
        }

        public void b() {
            v.this.post(this);
        }
    }
}
