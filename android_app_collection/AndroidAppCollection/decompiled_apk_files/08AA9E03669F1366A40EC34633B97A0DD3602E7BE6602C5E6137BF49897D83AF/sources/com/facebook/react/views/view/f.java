package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.uimanager.aq;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.z;
/* compiled from: ReactViewGroup.java */
/* loaded from: classes.dex */
public class f extends ViewGroup implements com.facebook.react.g.c, com.facebook.react.g.d, q, u, z {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f4191a = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final Rect f4192b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private boolean f4193c;

    /* renamed from: d  reason: collision with root package name */
    private View[] f4194d;
    private int e;
    private Rect f;
    private Rect g;
    private String h;
    private p i;
    private a j;
    private d k;
    private com.facebook.react.g.b l;
    private boolean m;
    private final aq n;
    private Path o;
    private int p;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactViewGroup.java */
    /* loaded from: classes.dex */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final f f4195a;

        private a(f fVar) {
            this.f4195a = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f4195a.getRemoveClippedSubviews()) {
                this.f4195a.b(view);
            }
        }
    }

    public f(Context context) {
        super(context);
        this.f4193c = false;
        this.f4194d = null;
        this.i = p.AUTO;
        this.m = false;
        this.n = new aq(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        i.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT < 17 || this.k == null) {
            return;
        }
        this.k.b(this.p);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.k == null) {
            return;
        }
        getOrCreateReactViewBackground().a(i);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        a((Drawable) null);
        if (this.k != null && drawable != null) {
            a(new LayerDrawable(new Drawable[]{this.k, drawable}));
        } else if (drawable == null) {
        } else {
            a(drawable);
        }
    }

    @Override // com.facebook.react.g.d
    public void setOnInterceptTouchEventListener(com.facebook.react.g.b bVar) {
        this.l = bVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.l != null && this.l.a(this, motionEvent)) || this.i == p.NONE || this.i == p.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.i == p.NONE || this.i == p.BOX_NONE) ? false : true;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.m = z;
    }

    public void a(int i, float f) {
        getOrCreateReactViewBackground().a(i, f);
    }

    public void a(int i, float f, float f2) {
        getOrCreateReactViewBackground().a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f);
        if (11 >= Build.VERSION.SDK_INT || Build.VERSION.SDK_INT >= 18) {
            return;
        }
        int i = orCreateReactViewBackground.a() ? 1 : 2;
        if (i == getLayerType()) {
            return;
        }
        setLayerType(i, null);
    }

    public void a(float f, int i) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f, i);
        if (11 >= Build.VERSION.SDK_INT || Build.VERSION.SDK_INT >= 18) {
            return;
        }
        int i2 = orCreateReactViewBackground.a() ? 1 : 2;
        if (i2 == getLayerType()) {
            return;
        }
        setLayerType(i2, null);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().a(str);
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.f4193c) {
            return;
        }
        this.f4193c = z;
        if (z) {
            this.f = new Rect();
            r.a(this, this.f);
            this.e = getChildCount();
            this.f4194d = new View[Math.max(12, this.e)];
            this.j = new a();
            for (int i = 0; i < this.e; i++) {
                View childAt = getChildAt(i);
                this.f4194d[i] = childAt;
                childAt.addOnLayoutChangeListener(this.j);
            }
            a_();
            return;
        }
        com.facebook.j.a.a.b(this.f);
        com.facebook.j.a.a.b(this.f4194d);
        com.facebook.j.a.a.b(this.j);
        for (int i2 = 0; i2 < this.e; i2++) {
            this.f4194d[i2].removeOnLayoutChangeListener(this.j);
        }
        getDrawingRect(this.f);
        b(this.f);
        this.f4194d = null;
        this.f = null;
        this.e = 0;
        this.j = null;
    }

    @Override // com.facebook.react.uimanager.q
    public boolean getRemoveClippedSubviews() {
        return this.f4193c;
    }

    @Override // com.facebook.react.uimanager.q
    public void a(Rect rect) {
        rect.set(this.f);
    }

    @Override // com.facebook.react.uimanager.q
    public void a_() {
        if (!this.f4193c) {
            return;
        }
        com.facebook.j.a.a.b(this.f);
        com.facebook.j.a.a.b(this.f4194d);
        r.a(this, this.f);
        b(this.f);
    }

    private void b(Rect rect) {
        com.facebook.j.a.a.b(this.f4194d);
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            a(rect, i2, i);
            if (this.f4194d[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void a(Rect rect, int i, int i2) {
        View view = ((View[]) com.facebook.j.a.a.b(this.f4194d))[i];
        f4192b.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(f4192b.left, f4192b.top, f4192b.right, f4192b.bottom);
        Animation animation = view.getAnimation();
        boolean z = true;
        boolean z2 = animation != null && !animation.hasEnded();
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, f4191a, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (!z || !(view instanceof q)) {
            return;
        }
        q qVar = (q) view;
        if (!qVar.getRemoveClippedSubviews()) {
            return;
        }
        qVar.a_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        if (!this.f4193c || getParent() == null) {
            return;
        }
        com.facebook.j.a.a.b(this.f);
        com.facebook.j.a.a.b(this.f4194d);
        f4192b.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.f.intersects(f4192b.left, f4192b.top, f4192b.right, f4192b.bottom) == (view.getParent() != null)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (this.f4194d[i2] == view) {
                a(this.f, i2, i);
                return;
            }
            if (this.f4194d[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f4193c) {
            a_();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4193c) {
            a_();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.n.a(view);
        setChildrenDrawingOrderEnabled(this.n.a());
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.n.b(view);
        setChildrenDrawingOrderEnabled(this.n.a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.n.b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.n.a());
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return this.n.a(i, i2);
    }

    @Override // com.facebook.react.uimanager.z
    public int a(int i) {
        return this.n.a() ? this.n.a(getChildCount(), i) : i;
    }

    @Override // com.facebook.react.uimanager.z
    public void b() {
        this.n.b();
        setChildrenDrawingOrderEnabled(this.n.a());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.u
    public p getPointerEvents() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(p pVar) {
        this.i = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(int i) {
        return ((View[]) com.facebook.j.a.a.b(this.f4194d))[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i) {
        a(view, i, f4191a);
    }

    void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        com.facebook.j.a.a.a(this.f4193c);
        com.facebook.j.a.a.b(this.f);
        com.facebook.j.a.a.b(this.f4194d);
        b(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f4194d[i3].getParent() == null) {
                i2++;
            }
        }
        a(this.f, i, i2);
        view.addOnLayoutChangeListener(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        com.facebook.j.a.a.a(this.f4193c);
        com.facebook.j.a.a.b(this.f);
        com.facebook.j.a.a.b(this.f4194d);
        view.removeOnLayoutChangeListener(this.j);
        int c2 = c(view);
        if (this.f4194d[c2].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < c2; i2++) {
                if (this.f4194d[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(c2 - i, 1);
        }
        c(c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        com.facebook.j.a.a.a(this.f4193c);
        com.facebook.j.a.a.b(this.f4194d);
        for (int i = 0; i < this.e; i++) {
            this.f4194d[i].removeOnLayoutChangeListener(this.j);
        }
        removeAllViewsInLayout();
        this.e = 0;
    }

    private int c(View view) {
        int i = this.e;
        View[] viewArr = (View[]) com.facebook.j.a.a.b(this.f4194d);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void b(View view, int i) {
        View[] viewArr = (View[]) com.facebook.j.a.a.b(this.f4194d);
        int i2 = this.e;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                this.f4194d = new View[length + 12];
                System.arraycopy(viewArr, 0, this.f4194d, 0, length);
                viewArr = this.f4194d;
            }
            int i3 = this.e;
            this.e = i3 + 1;
            viewArr[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                this.f4194d = new View[length + 12];
                System.arraycopy(viewArr, 0, this.f4194d, 0, i);
                System.arraycopy(viewArr, i, this.f4194d, i + 1, i2 - i);
                viewArr = this.f4194d;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.e++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
    }

    private void c(int i) {
        View[] viewArr = (View[]) com.facebook.j.a.a.b(this.f4194d);
        int i2 = this.e;
        if (i == i2 - 1) {
            int i3 = this.e - 1;
            this.e = i3;
            viewArr[i3] = null;
        } else if (i >= 0 && i < i2) {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.e - 1;
            this.e = i4;
            viewArr[i4] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((d) getBackground()).d();
        }
        return 0;
    }

    private d getOrCreateReactViewBackground() {
        if (this.k == null) {
            this.k = new d(getContext());
            Drawable background = getBackground();
            a((Drawable) null);
            if (background == null) {
                a(this.k);
            } else {
                a(new LayerDrawable(new Drawable[]{this.k, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.p = com.facebook.react.modules.i18nmanager.a.a().a(getContext()) ? 1 : 0;
                this.k.b(this.p);
            }
        }
        return this.k;
    }

    @Override // com.facebook.react.g.c
    public Rect getHitSlopRect() {
        return this.g;
    }

    public void setHitSlopRect(Rect rect) {
        this.g = rect;
    }

    public void setOverflow(String str) {
        this.h = str;
        invalidate();
    }

    private void a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setBackground(drawable);
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x013c, code lost:
        if (com.facebook.yoga.a.a(r10) == false) goto L50;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void dispatchDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.f.dispatchDraw(android.graphics.Canvas):void");
    }
}
