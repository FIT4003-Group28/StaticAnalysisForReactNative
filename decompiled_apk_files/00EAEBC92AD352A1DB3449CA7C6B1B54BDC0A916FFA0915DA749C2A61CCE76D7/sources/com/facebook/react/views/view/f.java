package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.x0;
/* loaded from: classes.dex */
public class f extends ViewGroup implements com.facebook.react.g0.d, t, x, com.facebook.react.g0.c, e0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private b mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private final x0 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing;
    private com.facebook.react.g0.b mOnInterceptTouchEventListener;
    private String mOverflow;
    private Path mPath;
    private r mPointerEvents;
    private d mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private final f f6403b;

        private b(f fVar) {
            this.f6403b = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f6403b.getRemoveClippedSubviews()) {
                this.f6403b.updateSubviewClipStatus(view);
            }
        }
    }

    public f(Context context) {
        super(context);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mPointerEvents = r.AUTO;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        setClipChildren(false);
        this.mDrawingOrderHelper = new x0(this);
    }

    private void addInArray(View view, int i) {
        View[] viewArr = this.mAllChildren;
        c.d.k.a.a.a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.mAllChildrenCount;
        int length = viewArr2.length;
        if (i == i2) {
            if (length == i2) {
                this.mAllChildren = new View[length + 12];
                System.arraycopy(viewArr2, 0, this.mAllChildren, 0, length);
                viewArr2 = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr2[i3] = view;
        } else if (i >= i2) {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        } else {
            if (length == i2) {
                this.mAllChildren = new View[length + 12];
                System.arraycopy(viewArr2, 0, this.mAllChildren, 0, i);
                System.arraycopy(viewArr2, i, this.mAllChildren, i + 1, i2 - i);
                viewArr2 = this.mAllChildren;
            } else {
                System.arraycopy(viewArr2, i, viewArr2, i + 1, i2 - i);
            }
            viewArr2[i] = view;
            this.mAllChildrenCount++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0136, code lost:
        if (com.facebook.yoga.g.a(r10) == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchOverflowDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.f.dispatchOverflowDraw(android.graphics.Canvas):void");
    }

    private d getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new d(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.mLayoutDirection = com.facebook.react.modules.i18nmanager.a.a().b(getContext()) ? 1 : 0;
                this.mReactBackgroundDrawable.c(this.mLayoutDirection);
            }
        }
        return this.mReactBackgroundDrawable;
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = this.mAllChildren;
        c.d.k.a.a.a(viewArr);
        View[] viewArr2 = viewArr;
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr2[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void removeFromArray(int i) {
        View[] viewArr = this.mAllChildren;
        c.d.k.a.a.a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.mAllChildrenCount = i3;
            viewArr2[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr2[i4] = null;
        }
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void updateClippingToRect(Rect rect) {
        c.d.k.a.a.a(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.mAllChildren;
        c.d.k.a.a.a(viewArr);
        View view = viewArr[i];
        sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Rect rect2 = sHelperRect;
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z = true;
        boolean z2 = animation != null && !animation.hasEnded();
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (!z || !(view instanceof t)) {
            return;
        }
        t tVar = (t) view;
        if (!tVar.getRemoveClippedSubviews()) {
            return;
        }
        tVar.updateClippingRect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        c.d.k.a.a.a(this.mClippingRect);
        c.d.k.a.a.a(this.mAllChildren);
        sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Rect rect = this.mClippingRect;
        Rect rect2 = sHelperRect;
        if (rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom) == (view.getParent() != null)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            View[] viewArr = this.mAllChildren;
            if (viewArr[i2] == view) {
                updateSubviewClipStatus(this.mClippingRect, i2, i);
                return;
            }
            if (viewArr[i2].getParent() == null) {
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.mDrawingOrderHelper.a(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c.d.k.a.a.a(this.mRemoveClippedSubviews);
        c.d.k.a.a.a(this.mClippingRect);
        c.d.k.a.a.a(this.mAllChildren);
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException e2) {
            c.d.d.e.a.b("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", e2);
        } catch (StackOverflowError e3) {
            f0 a2 = g0.a(this);
            if (a2 != null) {
                a2.a(e3);
            } else if (!(getContext() instanceof ReactContext)) {
                throw e3;
            } else {
                ((ReactContext) getContext()).handleException(new com.facebook.react.uimanager.g("StackOverflowException", this, e3));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e2) {
            c.d.d.e.a.b("ReactNative", "NullPointerException when executing dispatchProvideStructure", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((d) getBackground()).a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getChildAtWithSubviewClippingEnabled(int i) {
        View[] viewArr = this.mAllChildren;
        c.d.k.a.a.a(viewArr);
        return viewArr[i];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return this.mDrawingOrderHelper.a(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return com.facebook.react.b0.a.i ? u.a(view, rect, point, this, this.mOverflow) : super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // com.facebook.react.g0.c
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // com.facebook.react.uimanager.x
    public r getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.e0
    public int getZIndexMappedChildIndex(int i) {
        return this.mDrawingOrderHelper.a() ? this.mDrawingOrderHelper.a(getChildCount(), i) : i;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r rVar;
        com.facebook.react.g0.b bVar = this.mOnInterceptTouchEventListener;
        if ((bVar != null && bVar.a(this, motionEvent)) || (rVar = this.mPointerEvents) == r.NONE || rVar == r.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        k.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        d dVar;
        if (Build.VERSION.SDK_INT < 17 || (dVar = this.mReactBackgroundDrawable) == null) {
            return;
        }
        dVar.c(this.mLayoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar = this.mPointerEvents;
        return (rVar == r.NONE || rVar == r.BOX_NONE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAllViewsWithSubviewClippingEnabled() {
        c.d.k.a.a.a(this.mRemoveClippedSubviews);
        c.d.k.a.a.a(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeViewAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        c.d.k.a.a.a(this.mRemoveClippedSubviews);
        c.d.k.a.a.a(this.mClippingRect);
        c.d.k.a.a.a(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < indexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        float f2;
        if (!this.mBackfaceVisibility.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (!(rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f)) {
                f2 = 0.0f;
                setAlpha(f2);
            }
        }
        f2 = this.mBackfaceOpacity;
        setAlpha(f2);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.mReactBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().b(i);
    }

    public void setBorderColor(int i, float f2, float f3) {
        getOrCreateReactViewBackground().a(i, f2, f3);
    }

    public void setBorderRadius(float f2) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f2);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.f() ? 1 : 2;
            if (i == getLayerType()) {
                return;
            }
            setLayerType(i, null);
        }
    }

    public void setBorderRadius(float f2, int i) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.b(f2, i);
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.f() ? 1 : 2;
            if (i2 == getLayerType()) {
                return;
            }
            setLayerType(i2, null);
        }
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().a(str);
    }

    public void setBorderWidth(int i, float f2) {
        getOrCreateReactViewBackground().a(i, f2);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    @Override // com.facebook.react.g0.d
    public void setOnInterceptTouchEventListener(com.facebook.react.g0.b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    public void setOpacityIfPossible(float f2) {
        this.mBackfaceOpacity = f2;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(r rVar) {
        this.mPointerEvents = rVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z;
        if (z) {
            this.mClippingRect = new Rect();
            u.a(this, this.mClippingRect);
            this.mAllChildrenCount = getChildCount();
            this.mAllChildren = new View[Math.max(12, this.mAllChildrenCount)];
            this.mChildrenLayoutChangeListener = new b();
            for (int i = 0; i < this.mAllChildrenCount; i++) {
                View childAt = getChildAt(i);
                this.mAllChildren[i] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        c.d.k.a.a.a(this.mClippingRect);
        c.d.k.a.a.a(this.mAllChildren);
        c.d.k.a.a.a(this.mChildrenLayoutChangeListener);
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        d dVar = this.mReactBackgroundDrawable;
        if (dVar != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{dVar, drawable}));
        } else if (drawable == null) {
        } else {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (!this.mRemoveClippedSubviews) {
            return;
        }
        c.d.k.a.a.a(this.mClippingRect);
        c.d.k.a.a.a(this.mAllChildren);
        u.a(this, this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
    }

    @Override // com.facebook.react.uimanager.e0
    public void updateDrawingOrder() {
        this.mDrawingOrderHelper.b();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        invalidate();
    }
}
