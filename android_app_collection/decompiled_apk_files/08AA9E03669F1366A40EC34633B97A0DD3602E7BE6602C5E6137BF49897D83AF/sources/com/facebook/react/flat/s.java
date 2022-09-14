package com.facebook.react.flat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.ao;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.CertificateBody;
import org.spongycastle.asn1.x509.DisplayText;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlatViewGroup.java */
/* loaded from: classes.dex */
public final class s extends ViewGroup implements com.facebook.react.g.c, com.facebook.react.g.d, com.facebook.react.uimanager.q, com.facebook.react.uimanager.t, com.facebook.react.uimanager.u {

    /* renamed from: b  reason: collision with root package name */
    private static Paint f3414b;

    /* renamed from: c  reason: collision with root package name */
    private static Paint f3415c;

    /* renamed from: d  reason: collision with root package name */
    private static Paint f3416d;
    private static Paint e;
    private static Rect f;
    private static final ArrayList<s> g = new ArrayList<>();
    private static final Rect h = new Rect();
    private static final SparseArray<View> u = new SparseArray<>(0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f3417a;
    private a i;
    private h[] j;
    private c[] k;
    private v[] l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private com.facebook.react.uimanager.p r;
    private long s;
    private com.facebook.react.g.b t;
    private i v;
    private Rect w;

    private static int a(float f2) {
        return f2 >= BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlatViewGroup.java */
    /* loaded from: classes.dex */
    public static final class a extends WeakReference<s> {
        private a(s sVar) {
            super(sVar);
        }

        public void a() {
            s sVar = (s) get();
            if (sVar != null) {
                sVar.invalidate();
            }
        }

        public void a(int i, int i2) {
            s sVar = (s) get();
            if (sVar == null) {
                return;
            }
            ((UIManagerModule) ((aj) sVar.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.image.b(i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Context context) {
        super(context);
        this.j = h.f3398b;
        this.k = c.f3389a;
        this.l = v.f3425a;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = com.facebook.react.uimanager.p.AUTO;
        setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void detachAllViewsFromParent() {
        super.detachAllViewsFromParent();
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        if (this.o) {
            return;
        }
        this.o = true;
        g.add(this);
    }

    @Override // com.facebook.react.uimanager.s
    public int a(float f2, float f3) {
        v c2;
        ao.a(this.r != com.facebook.react.uimanager.p.NONE, "TouchTargetHelper should not allow calling this method when pointer events are NONE");
        if (this.r != com.facebook.react.uimanager.p.BOX_ONLY && (c2 = c(f2, f3)) != null) {
            return c2.b(f2, f3);
        }
        return getId();
    }

    @Override // com.facebook.react.uimanager.t
    public boolean b(float f2, float f3) {
        v d2 = d(f2, f3);
        return d2 != null && d2.f3428d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f3417a = false;
        super.dispatchDraw(canvas);
        if (this.v != null) {
            this.v.a(canvas);
        } else {
            for (h hVar : this.j) {
                hVar.a(this, canvas);
            }
        }
        if (this.m != getChildCount()) {
            throw new RuntimeException("Did not draw all children: " + this.m + " / " + getChildCount());
        }
        this.m = 0;
        if (this.f3417a) {
            b();
            c(canvas);
        }
        if (this.q == null) {
            return;
        }
        this.q.draw(canvas);
    }

    private void c(Canvas canvas) {
        if (this.v != null) {
            this.v.b(canvas);
        } else {
            for (h hVar : this.j) {
                hVar.b(this, canvas);
            }
        }
        this.m = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        View childAt;
        a(canvas, getChildAt(this.m) instanceof s ? -12303292 : -65536, childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        this.m++;
    }

    int a(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static void a(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5) {
        int i;
        float f6;
        float f7;
        float f8;
        float f9;
        int i2 = (f2 > f4 ? 1 : (f2 == f4 ? 0 : -1));
        if (i2 == 0 || f3 == f5) {
            return;
        }
        if (i2 > 0) {
            f7 = f2;
            f6 = f4;
        } else {
            f6 = f2;
            f7 = f4;
        }
        if (i > 0) {
            f9 = f3;
            f8 = f5;
        } else {
            f8 = f3;
            f9 = f5;
        }
        canvas.drawRect(f6, f8, f7, f9, paint);
    }

    private static void a(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5, float f6) {
        a(canvas, paint, f2, f3, f2 + f4, f3 + (a(f5) * f6));
        a(canvas, paint, f2, f3, f2 + (f6 * a(f4)), f3 + f5);
    }

    private static void a(Canvas canvas, float f2, float f3, float f4, float f5, Paint paint, int i, int i2) {
        float f6 = i;
        float f7 = i2;
        a(canvas, paint, f2, f3, f6, f6, f7);
        float f8 = -i;
        a(canvas, paint, f2, f5, f6, f8, f7);
        a(canvas, paint, f4, f3, f8, f6, f7);
        a(canvas, paint, f4, f5, f8, f8, f7);
    }

    private void b() {
        if (f3414b == null) {
            f3414b = new Paint();
            f3414b.setTextAlign(Paint.Align.RIGHT);
            f3414b.setTextSize(a(9));
            f3414b.setTypeface(Typeface.MONOSPACE);
            f3414b.setAntiAlias(true);
            f3414b.setColor(-65536);
        }
        if (f3415c == null) {
            f3415c = new Paint();
            f3415c.setColor(-1);
            f3415c.setAlpha(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            f3415c.setStyle(Paint.Style.FILL);
        }
        if (f3416d == null) {
            f3416d = new Paint();
            f3416d.setAlpha(100);
            f3416d.setStyle(Paint.Style.STROKE);
        }
        if (e == null) {
            e = new Paint();
            e.setAlpha(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            e.setColor(Color.rgb(63, (int) CertificateBody.profileType, 255));
            e.setStyle(Paint.Style.FILL);
        }
        if (f == null) {
            f = new Rect();
        }
    }

    private void a(Canvas canvas, int i, float f2, float f3, float f4, float f5) {
        a(canvas, i, "", f2, f3, f4, f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas, int i, String str, float f2, float f3, float f4, float f5) {
        f3416d.setColor((f3416d.getColor() & (-16777216)) | (16777215 & i));
        f3416d.setAlpha(100);
        canvas.drawRect(f2, f3, f4 - 1.0f, f5 - 1.0f, f3416d);
        a(canvas, f2, f3, f4, f5, e, a(8), a(1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        if (this.n) {
            return;
        }
        this.n = true;
        super.onAttachedToWindow();
        a(this.k);
        a_();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (!this.n) {
            throw new RuntimeException("Double detach");
        }
        this.n = false;
        super.onDetachedFromWindow();
        b(this.k);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.q != null) {
            this.q.setBounds(0, 0, i, i2);
            invalidate();
        }
        a_();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDrawableHotspotChanged(float f2, float f3) {
        if (this.q != null) {
            this.q.setHotspot(f2, f3);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.q == null || !this.q.isStateful()) {
            return;
        }
        this.q.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.q != null) {
            this.q.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        invalidate(0, 0, getWidth() + 1, getHeight() + 1);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.p;
    }

    @Override // com.facebook.react.g.d
    public void setOnInterceptTouchEventListener(com.facebook.react.g.b bVar) {
        this.t = bVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        long downTime = motionEvent.getDownTime();
        if (downTime != this.s) {
            this.s = downTime;
            if (b(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        if ((this.t != null && this.t.a(this, motionEvent)) || this.r == com.facebook.react.uimanager.p.NONE || this.r == com.facebook.react.uimanager.p.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.r == com.facebook.react.uimanager.p.NONE) {
            return false;
        }
        return (this.r == com.facebook.react.uimanager.p.BOX_NONE && c(motionEvent.getX(), motionEvent.getY()) == null) ? false : true;
    }

    @Override // com.facebook.react.uimanager.u
    public com.facebook.react.uimanager.p getPointerEvents() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.facebook.react.uimanager.p pVar) {
        this.r = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        if (this.q != null) {
            this.q.setCallback(null);
            unscheduleDrawable(this.q);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        this.q = drawable;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Canvas canvas) {
        View childAt = getChildAt(this.m);
        if (childAt instanceof s) {
            super.drawChild(canvas, childAt, getDrawingTime());
        } else {
            canvas.save(2);
            childAt.getHitRect(h);
            canvas.clipRect(h);
            super.drawChild(canvas, childAt, getDrawingTime());
            canvas.restore();
        }
        this.m++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        removeDetachedView(view, false);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        this.j = h.f3398b;
        super.removeAllViewsInLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i) {
        addViewInLayout(view, i, a(view.getLayoutParams()), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, int i) {
        attachViewToParent(view, i, a(view.getLayoutParams()));
    }

    private v c(float f2, float f3) {
        if (this.v != null) {
            return this.v.b(f2, f3);
        }
        for (int length = this.l.length - 1; length >= 0; length--) {
            v vVar = this.l[length];
            if (vVar.f3428d && vVar.a(f2, f3)) {
                return vVar;
            }
        }
        return null;
    }

    private v d(float f2, float f3) {
        if (this.v != null) {
            return this.v.c(f2, f3);
        }
        for (int length = this.l.length - 1; length >= 0; length--) {
            v vVar = this.l[length];
            if (vVar.a(f2, f3)) {
                return vVar;
            }
        }
        return null;
    }

    private void a(c[] cVarArr) {
        if (cVarArr.length == 0) {
            return;
        }
        a c2 = c();
        for (c cVar : cVarArr) {
            cVar.a(c2);
        }
    }

    private a c() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    private static void b(c[] cVarArr) {
        for (c cVar : cVarArr) {
            cVar.a();
        }
    }

    private ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        return checkLayoutParams(layoutParams) ? layoutParams : generateDefaultLayoutParams();
    }

    @Override // com.facebook.react.uimanager.q
    public void a_() {
        if (this.v != null && this.v.b()) {
            invalidate();
        }
    }

    @Override // com.facebook.react.uimanager.q
    public void a(Rect rect) {
        if (this.v == null) {
            throw new RuntimeException("Trying to get the clipping rect for a non-clipping FlatViewGroup");
        }
        this.v.a(rect);
    }

    public void b(boolean z) {
        boolean removeClippedSubviews = getRemoveClippedSubviews();
        if (z == removeClippedSubviews) {
            return;
        }
        if (removeClippedSubviews) {
            throw new RuntimeException("Trying to transition FlatViewGroup from clipping to non-clipping state");
        }
        this.v = i.a(this, this.j);
        this.j = h.f3398b;
    }

    @Override // com.facebook.react.uimanager.q
    public boolean getRemoveClippedSubviews() {
        return this.v != null;
    }

    @Override // com.facebook.react.g.c
    public Rect getHitSlopRect() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Rect rect) {
        this.w = rect;
    }
}
