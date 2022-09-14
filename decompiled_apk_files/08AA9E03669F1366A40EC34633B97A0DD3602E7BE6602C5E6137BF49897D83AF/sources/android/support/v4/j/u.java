package android.support.v4.j;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: ViewPager.java */
/* loaded from: classes.dex */
public class u extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private EdgeEffect R;
    private EdgeEffect S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private List<f> aa;
    private f ab;
    private f ac;
    private List<e> ad;
    private g ae;
    private int af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj;
    private int ak;

    /* renamed from: b  reason: collision with root package name */
    q f536b;

    /* renamed from: c  reason: collision with root package name */
    int f537c;

    /* renamed from: d  reason: collision with root package name */
    private int f538d;
    private final ArrayList<b> g;
    private final b h;
    private final Rect i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private boolean n;
    private h o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: a  reason: collision with root package name */
    static final int[] f535a = {16842931};
    private static final Comparator<b> e = new Comparator<b>() { // from class: android.support.v4.j.u.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.f543b - bVar2.f543b;
        }
    };
    private static final Interpolator f = new Interpolator() { // from class: android.support.v4.j.u.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final j ai = new j();

    /* compiled from: ViewPager.java */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(u uVar, q qVar, q qVar2);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f542a;

        /* renamed from: b  reason: collision with root package name */
        int f543b;

        /* renamed from: c  reason: collision with root package name */
        boolean f544c;

        /* renamed from: d  reason: collision with root package name */
        float f545d;
        float e;

        b() {
        }
    }

    public u(Context context) {
        super(context);
        this.g = new ArrayList<>();
        this.h = new b();
        this.i = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.aj = new Runnable() { // from class: android.support.v4.j.u.3
            @Override // java.lang.Runnable
            public void run() {
                u.this.setScrollState(0);
                u.this.c();
            }
        };
        this.ak = 0;
        a();
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new EdgeEffect(context);
        this.S = new EdgeEffect(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (f2 * 16.0f);
        s.a(this, new d());
        if (s.b(this) == 0) {
            s.a((View) this, 1);
        }
        s.a(this, new p() { // from class: android.support.v4.j.u.4

            /* renamed from: b  reason: collision with root package name */
            private final Rect f541b = new Rect();

            @Override // android.support.v4.j.p
            public x a(View view, x xVar) {
                x a2 = s.a(view, xVar);
                if (a2.e()) {
                    return a2;
                }
                Rect rect = this.f541b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = u.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    x b2 = s.b(u.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        if (this.m != null && !this.m.isFinished()) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i2) {
        if (this.ak == i2) {
            return;
        }
        this.ak = i2;
        if (this.ae != null) {
            b(i2 != 0);
        }
        f(i2);
    }

    public void setAdapter(q qVar) {
        if (this.f536b != null) {
            this.f536b.a((DataSetObserver) null);
            this.f536b.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                b bVar = this.g.get(i2);
                this.f536b.a((ViewGroup) this, bVar.f543b, bVar.f542a);
            }
            this.f536b.b((ViewGroup) this);
            this.g.clear();
            f();
            this.f537c = 0;
            scrollTo(0, 0);
        }
        q qVar2 = this.f536b;
        this.f536b = qVar;
        this.f538d = 0;
        if (this.f536b != null) {
            if (this.o == null) {
                this.o = new h();
            }
            this.f536b.a((DataSetObserver) this.o);
            this.z = false;
            boolean z = this.T;
            this.T = true;
            this.f538d = this.f536b.a();
            if (this.j >= 0) {
                this.f536b.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!z) {
                c();
            } else {
                requestLayout();
            }
        }
        if (this.ad == null || this.ad.isEmpty()) {
            return;
        }
        int size = this.ad.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.ad.get(i3).a(this, qVar2, qVar);
        }
    }

    private void f() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((c) getChildAt(i2).getLayoutParams()).f546a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: getAdapter */
    public q mo72getAdapter() {
        return this.f536b;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i2) {
        this.z = false;
        a(i2, !this.T, false);
    }

    public void a(int i2, boolean z) {
        this.z = false;
        a(i2, z, false);
    }

    public int getCurrentItem() {
        return this.f537c;
    }

    void a(int i2, boolean z, boolean z2) {
        a(i2, z, z2, 0);
    }

    void a(int i2, boolean z, boolean z2, int i3) {
        if (this.f536b == null || this.f536b.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.f537c == i2 && this.g.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            boolean z3 = true;
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f536b.a()) {
                i2 = this.f536b.a() - 1;
            }
            int i4 = this.A;
            if (i2 > this.f537c + i4 || i2 < this.f537c - i4) {
                for (int i5 = 0; i5 < this.g.size(); i5++) {
                    this.g.get(i5).f544c = true;
                }
            }
            if (this.f537c == i2) {
                z3 = false;
            }
            if (this.T) {
                this.f537c = i2;
                if (z3) {
                    e(i2);
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z, i3, z3);
        }
    }

    private void a(int i2, boolean z, int i3, boolean z2) {
        b b2 = b(i2);
        int clientWidth = b2 != null ? (int) (getClientWidth() * Math.max(this.t, Math.min(b2.e, this.u))) : 0;
        if (z) {
            a(clientWidth, 0, i3);
            if (!z2) {
                return;
            }
            e(i2);
            return;
        }
        if (z2) {
            e(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        d(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.ab = fVar;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.ag == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.ah.get(i3).getLayoutParams()).f;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.A) {
            this.A = i2;
            c();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.p;
        this.p = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public int getPageMargin() {
        return this.p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(android.support.v4.a.a.a(getContext(), i2));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float a(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    void a(int i2, int i3, int i4) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.m != null && !this.m.isFinished()) {
            scrollX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float a2 = f3 + (a(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / ((f2 * this.f536b.a(this.f537c)) + this.p)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.n = false;
        this.m.startScroll(i5, scrollY, i6, i7, min);
        s.a(this);
    }

    b a(int i2, int i3) {
        b bVar = new b();
        bVar.f543b = i2;
        bVar.f542a = this.f536b.a((ViewGroup) this, i2);
        bVar.f545d = this.f536b.a(i2);
        if (i3 < 0 || i3 >= this.g.size()) {
            this.g.add(bVar);
        } else {
            this.g.add(i3, bVar);
        }
        return bVar;
    }

    void b() {
        int a2 = this.f536b.a();
        this.f538d = a2;
        boolean z = this.g.size() < (this.A * 2) + 1 && this.g.size() < a2;
        int i2 = this.f537c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.g.size()) {
            b bVar = this.g.get(i3);
            int a3 = this.f536b.a(bVar.f542a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.g.remove(i3);
                    i3--;
                    if (!z2) {
                        this.f536b.a((ViewGroup) this);
                        z2 = true;
                    }
                    this.f536b.a((ViewGroup) this, bVar.f543b, bVar.f542a);
                    if (this.f537c == bVar.f543b) {
                        i2 = Math.max(0, Math.min(this.f537c, a2 - 1));
                    }
                } else if (bVar.f543b != a3) {
                    if (bVar.f543b == this.f537c) {
                        i2 = a3;
                    }
                    bVar.f543b = a3;
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.f536b.b((ViewGroup) this);
        }
        Collections.sort(this.g, e);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f546a) {
                    cVar.f548c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void c() {
        a(this.f537c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
        if (r8.f543b == r18.f537c) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(int r19) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.j.u.a(int):void");
    }

    private void g() {
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList<>();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.ah.add(getChildAt(i2));
            }
            Collections.sort(this.ah, ai);
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int a2 = this.f536b.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.p / clientWidth : BitmapDescriptorFactory.HUE_RED;
        if (bVar2 != null) {
            int i3 = bVar2.f543b;
            if (i3 < bVar.f543b) {
                float f3 = bVar2.e + bVar2.f545d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f543b && i5 < this.g.size()) {
                    b bVar5 = this.g.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 <= bVar4.f543b || i5 >= this.g.size() - 1) {
                            break;
                        }
                        i5++;
                        bVar5 = this.g.get(i5);
                    }
                    while (i4 < bVar4.f543b) {
                        f3 += this.f536b.a(i4) + f2;
                        i4++;
                    }
                    bVar4.e = f3;
                    f3 += bVar4.f545d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f543b) {
                int size = this.g.size() - 1;
                float f4 = bVar2.e;
                while (true) {
                    i3--;
                    if (i3 < bVar.f543b || size < 0) {
                        break;
                    }
                    b bVar6 = this.g.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i3 >= bVar3.f543b || size <= 0) {
                            break;
                        }
                        size--;
                        bVar6 = this.g.get(size);
                    }
                    while (i3 > bVar3.f543b) {
                        f4 -= this.f536b.a(i3) + f2;
                        i3--;
                    }
                    f4 -= bVar3.f545d + f2;
                    bVar3.e = f4;
                }
            }
        }
        int size2 = this.g.size();
        float f5 = bVar.e;
        int i6 = bVar.f543b - 1;
        this.t = bVar.f543b == 0 ? bVar.e : -3.4028235E38f;
        int i7 = a2 - 1;
        this.u = bVar.f543b == i7 ? (bVar.e + bVar.f545d) - 1.0f : Float.MAX_VALUE;
        int i8 = i2 - 1;
        while (i8 >= 0) {
            b bVar7 = this.g.get(i8);
            while (i6 > bVar7.f543b) {
                f5 -= this.f536b.a(i6) + f2;
                i6--;
            }
            f5 -= bVar7.f545d + f2;
            bVar7.e = f5;
            if (bVar7.f543b == 0) {
                this.t = f5;
            }
            i8--;
            i6--;
        }
        float f6 = bVar.e + bVar.f545d + f2;
        int i9 = bVar.f543b + 1;
        int i10 = i2 + 1;
        while (i10 < size2) {
            b bVar8 = this.g.get(i10);
            while (i9 < bVar8.f543b) {
                f6 += this.f536b.a(i9) + f2;
                i9++;
            }
            if (bVar8.f543b == i7) {
                this.u = (bVar8.f545d + f6) - 1.0f;
            }
            bVar8.e = f6;
            f6 += bVar8.f545d + f2;
            i10++;
            i9++;
        }
        this.U = false;
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class i extends android.support.v4.j.a {
        public static final Parcelable.Creator<i> CREATOR = new Parcelable.ClassLoaderCreator<i>() { // from class: android.support.v4.j.u.i.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public i[] newArray(int i) {
                return new i[i];
            }
        };

        /* renamed from: b  reason: collision with root package name */
        int f552b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f553c;

        /* renamed from: d  reason: collision with root package name */
        ClassLoader f554d;

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.j.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f552b);
            parcel.writeParcelable(this.f553c, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f552b + "}";
        }

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f552b = parcel.readInt();
            this.f553c = parcel.readParcelable(classLoader);
            this.f554d = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f552b = this.f537c;
        if (this.f536b != null) {
            iVar.f553c = this.f536b.b();
        }
        return iVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        if (this.f536b != null) {
            this.f536b.a(iVar.f553c, iVar.f554d);
            a(iVar.f552b, false, true);
            return;
        }
        this.j = iVar.f552b;
        this.k = iVar.f553c;
        this.l = iVar.f554d;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.f546a |= c(view);
        if (this.x) {
            if (cVar != null && cVar.f546a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            cVar.f549d = true;
            addViewInLayout(view, i2, layoutParams);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(a.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    b a(View view) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (this.f536b.a(view, bVar.f542a)) {
                return bVar;
            }
        }
        return null;
    }

    b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return a(view);
            }
        }
    }

    b b(int i2) {
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            b bVar = this.g.get(i3);
            if (bVar.f543b == i2) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.j.u.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            a(i2, i4, this.p, this.p);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.g.isEmpty()) {
            if (!this.m.isFinished()) {
                this.m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        b b2 = b(this.f537c);
        int min = (int) ((b2 != null ? Math.min(b2.e, this.u) : BitmapDescriptorFactory.HUE_RED) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min == getScrollX()) {
            return;
        }
        a(false);
        scrollTo(min, getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        b a2;
        int max;
        int max2;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = paddingBottom;
        int i9 = 0;
        int i10 = paddingTop;
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f546a) {
                    int i13 = cVar.f547b & 7;
                    int i14 = cVar.f547b & 112;
                    if (i13 == 1) {
                        max = Math.max((i6 - childAt.getMeasuredWidth()) / 2, i11);
                    } else if (i13 == 3) {
                        max = i11;
                        i11 = childAt.getMeasuredWidth() + i11;
                    } else if (i13 != 5) {
                        max = i11;
                    } else {
                        max = (i6 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i14 == 16) {
                        max2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, i10);
                    } else if (i14 == 48) {
                        max2 = i10;
                        i10 = childAt.getMeasuredHeight() + i10;
                    } else if (i14 != 80) {
                        max2 = i10;
                    } else {
                        max2 = (i7 - i8) - childAt.getMeasuredHeight();
                        i8 += childAt.getMeasuredHeight();
                    }
                    int i15 = max + scrollX;
                    childAt.layout(i15, max2, childAt.getMeasuredWidth() + i15, max2 + childAt.getMeasuredHeight());
                    i9++;
                }
            }
        }
        int i16 = (i6 - i11) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.f546a && (a2 = a(childAt2)) != null) {
                    float f2 = i16;
                    int i18 = ((int) (a2.e * f2)) + i11;
                    if (cVar2.f549d) {
                        cVar2.f549d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f548c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - i10) - i8, 1073741824));
                    }
                    childAt2.layout(i18, i10, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + i10);
                }
            }
        }
        this.r = i10;
        this.s = i7 - i8;
        this.W = i9;
        if (this.T) {
            z2 = false;
            a(this.f537c, false, 0, false);
        } else {
            z2 = false;
        }
        this.T = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.n = true;
        if (!this.m.isFinished() && this.m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!d(currX)) {
                    this.m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            s.a(this);
            return;
        }
        a(true);
    }

    private boolean d(int i2) {
        if (this.g.size() == 0) {
            if (this.T) {
                return false;
            }
            this.V = false;
            a(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b i3 = i();
        int clientWidth = getClientWidth();
        int i4 = this.p + clientWidth;
        float f2 = clientWidth;
        int i5 = i3.f543b;
        float f3 = ((i2 / f2) - i3.e) / (i3.f545d + (this.p / f2));
        this.V = false;
        a(i5, f3, (int) (i4 * f3));
        if (this.V) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L1d:
            if (r3 >= r6) goto L6d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.j.u$c r9 = (android.support.v4.j.u.c) r9
            boolean r10 = r9.f546a
            if (r10 != 0) goto L2e
            goto L6a
        L2e:
            int r9 = r9.f547b
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L3c
            r9 = r4
            goto L5e
        L3c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L5b
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L5e
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L5b:
            r11 = r9
            r9 = r4
            r4 = r11
        L5e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L69
            r8.offsetLeftAndRight(r4)
        L69:
            r4 = r9
        L6a:
            int r3 = r3 + 1
            goto L1d
        L6d:
            r12.b(r13, r14, r15)
            android.support.v4.j.u$g r13 = r12.ae
            if (r13 == 0) goto La1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7c:
            if (r1 >= r14) goto La1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.j.u$c r0 = (android.support.v4.j.u.c) r0
            boolean r0 = r0.f546a
            if (r0 == 0) goto L8d
            goto L9e
        L8d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.j.u$g r3 = r12.ae
            r3.a(r15, r0)
        L9e:
            int r1 = r1 + 1
            goto L7c
        La1:
            r12.V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.j.u.a(int, float, int):void");
    }

    private void b(int i2, float f2, int i3) {
        if (this.ab != null) {
            this.ab.a(i2, f2, i3);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = this.aa.get(i4);
                if (fVar != null) {
                    fVar.a(i2, f2, i3);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i2, f2, i3);
        }
    }

    private void e(int i2) {
        if (this.ab != null) {
            this.ab.a(i2);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.aa.get(i3);
                if (fVar != null) {
                    fVar.a(i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i2);
        }
    }

    private void f(int i2) {
        if (this.ab != null) {
            this.ab.b(i2);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.aa.get(i3);
                if (fVar != null) {
                    fVar.b(i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.b(i2);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.z = false;
        boolean z3 = z2;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.f544c) {
                bVar.f544c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                s.a(this, this.aj);
            } else {
                this.aj.run();
            }
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.E) && f3 > BitmapDescriptorFactory.HUE_RED) || (f2 > ((float) (getWidth() - this.E)) && f3 < BitmapDescriptorFactory.HUE_RED);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.af : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            h();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.I = x;
            this.G = x;
            float y = motionEvent.getY();
            this.J = y;
            this.H = y;
            this.K = motionEvent.getPointerId(0);
            this.C = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.ak == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
                this.m.abortAnimation();
                this.z = false;
                c();
                this.B = true;
                c(true);
                setScrollState(1);
            } else {
                a(false);
                this.B = false;
            }
        } else if (action == 2) {
            int i2 = this.K;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.G;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.J);
                int i3 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i3 != 0 && !a(this.G, f2) && a(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.G = x2;
                    this.H = y2;
                    this.C = true;
                    return false;
                }
                if (abs > this.F && abs * 0.5f > abs2) {
                    this.B = true;
                    c(true);
                    setScrollState(1);
                    this.G = i3 > 0 ? this.I + this.F : this.I - this.F;
                    this.H = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > this.F) {
                    this.C = true;
                }
                if (this.B && b(x2)) {
                    s.a(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.f536b == null || this.f536b.a() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.z = false;
                c();
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                float y = motionEvent.getY();
                this.J = y;
                this.H = y;
                this.K = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.B) {
                    VelocityTracker velocityTracker = this.L;
                    velocityTracker.computeCurrentVelocity(NetstatsParserPatterns.NEW_TS_TO_MILLIS, this.N);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.K);
                    this.z = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    b i2 = i();
                    float f2 = clientWidth;
                    a(a(i2.f543b, ((scrollX / f2) - i2.e) / (i2.f545d + (this.p / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)), true, true, xVelocity);
                    z = h();
                    break;
                }
                break;
            case 2:
                if (!this.B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.K);
                    if (findPointerIndex == -1) {
                        z = h();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.G);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.H);
                        if (abs > this.F && abs > abs2) {
                            this.B = true;
                            c(true);
                            this.G = x2 - this.I > BitmapDescriptorFactory.HUE_RED ? this.I + this.F : this.I - this.F;
                            this.H = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.B) {
                    z = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                    break;
                }
                break;
            case 3:
                if (this.B) {
                    a(this.f537c, true, 0, false);
                    z = h();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.G = motionEvent.getX(actionIndex);
                this.K = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                break;
        }
        if (z) {
            s.a(this);
        }
        return true;
    }

    private boolean h() {
        this.K = -1;
        j();
        this.R.onRelease();
        this.S.onRelease();
        return this.R.isFinished() || this.S.isFinished();
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean b(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.G - f2;
        this.G = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.t * clientWidth;
        float f5 = this.u * clientWidth;
        boolean z3 = false;
        b bVar = this.g.get(0);
        b bVar2 = this.g.get(this.g.size() - 1);
        if (bVar.f543b != 0) {
            f4 = bVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f543b != this.f536b.a() - 1) {
            f5 = bVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.R.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.S.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.G += scrollX - i2;
        scrollTo(i2, getScrollY());
        d(i2);
        return z3;
    }

    private b i() {
        int i2;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : BitmapDescriptorFactory.HUE_RED;
        float f2 = clientWidth > 0 ? this.p / clientWidth : BitmapDescriptorFactory.HUE_RED;
        b bVar = null;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        while (i3 < this.g.size()) {
            b bVar2 = this.g.get(i3);
            if (!z && bVar2.f543b != (i2 = i4 + 1)) {
                bVar2 = this.h;
                bVar2.e = f3 + f4 + f2;
                bVar2.f543b = i2;
                bVar2.f545d = this.f536b.a(bVar2.f543b);
                i3--;
            }
            f3 = bVar2.e;
            float f5 = bVar2.f545d + f3 + f2;
            if (!z && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i3 == this.g.size() - 1) {
                return bVar2;
            }
            i4 = bVar2.f543b;
            f4 = bVar2.f545d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.O || Math.abs(i3) <= this.M) {
            i2 += (int) (f2 + (i2 >= this.f537c ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        return this.g.size() > 0 ? Math.max(this.g.get(0).f543b, Math.min(i2, this.g.get(this.g.size() - 1).f543b)) : i2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f536b != null && this.f536b.a() > 1)) {
            if (!this.R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.R.setSize(height, width);
                z = false | this.R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.S.setSize(height2, width2);
                z |= this.S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.R.finish();
            this.S.finish();
        }
        if (z) {
            s.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.p <= 0 || this.q == null || this.g.size() <= 0 || this.f536b == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.p / width2;
        int i2 = 0;
        b bVar = this.g.get(0);
        float f5 = bVar.e;
        int size = this.g.size();
        int i3 = bVar.f543b;
        int i4 = this.g.get(size - 1).f543b;
        while (i3 < i4) {
            while (i3 > bVar.f543b && i2 < size) {
                i2++;
                bVar = this.g.get(i2);
            }
            if (i3 == bVar.f543b) {
                f2 = (bVar.e + bVar.f545d) * width2;
                f5 = bVar.e + bVar.f545d + f4;
            } else {
                float a2 = this.f536b.a(i3);
                f2 = (f5 + a2) * width2;
                f5 += a2 + f4;
            }
            if (this.p + f2 > scrollX) {
                f3 = f4;
                this.q.setBounds(Math.round(f2), this.r, Math.round(this.p + f2), this.s);
                this.q.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + width) {
                return;
            }
            i3++;
            f4 = f3;
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(i2);
            this.K = motionEvent.getPointerId(i2);
            if (this.L == null) {
                return;
            }
            this.L.clear();
        }
    }

    private void j() {
        this.B = false;
        this.C = false;
        if (this.L != null) {
            this.L.recycle();
            this.L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f536b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    protected boolean a(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2)) {
                            return d();
                        }
                        return c(17);
                    case 22:
                        if (keyEvent.hasModifiers(2)) {
                            return e();
                        }
                        return c(66);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return c(2);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    public boolean c(int i2) {
        boolean requestFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && findNextFocus != view) {
            if (i2 == 17) {
                int i3 = a(this.i, findNextFocus).left;
                int i4 = a(this.i, view).left;
                if (view != null && i3 >= i4) {
                    requestFocus = d();
                } else {
                    requestFocus = findNextFocus.requestFocus();
                }
            } else if (i2 == 66) {
                int i5 = a(this.i, findNextFocus).left;
                int i6 = a(this.i, view).left;
                if (view != null && i5 <= i6) {
                    requestFocus = e();
                } else {
                    requestFocus = findNextFocus.requestFocus();
                }
            }
            z2 = requestFocus;
        } else if (i2 == 17 || i2 == 1) {
            z2 = d();
        } else if (i2 == 66 || i2 == 2) {
            z2 = e();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z2;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean d() {
        if (this.f537c > 0) {
            a(this.f537c - 1, true);
            return true;
        }
        return false;
    }

    boolean e() {
        if (this.f536b == null || this.f537c >= this.f536b.a() - 1) {
            return false;
        }
        a(this.f537c + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f543b == this.f537c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f543b == this.f537c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f543b == this.f537c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f543b == this.f537c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public class d extends android.support.v4.j.b {
        d() {
        }

        @Override // android.support.v4.j.b
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(u.class.getName());
            accessibilityEvent.setScrollable(b());
            if (accessibilityEvent.getEventType() != 4096 || u.this.f536b == null) {
                return;
            }
            accessibilityEvent.setItemCount(u.this.f536b.a());
            accessibilityEvent.setFromIndex(u.this.f537c);
            accessibilityEvent.setToIndex(u.this.f537c);
        }

        @Override // android.support.v4.j.b
        public void a(View view, android.support.v4.j.a.a aVar) {
            super.a(view, aVar);
            aVar.b(u.class.getName());
            aVar.i(b());
            if (u.this.canScrollHorizontally(1)) {
                aVar.a(4096);
            }
            if (u.this.canScrollHorizontally(-1)) {
                aVar.a(PKIFailureInfo.certRevoked);
            }
        }

        @Override // android.support.v4.j.b
        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!u.this.canScrollHorizontally(1)) {
                    return false;
                }
                u.this.setCurrentItem(u.this.f537c + 1);
                return true;
            } else if (i != 8192 || !u.this.canScrollHorizontally(-1)) {
                return false;
            } else {
                u.this.setCurrentItem(u.this.f537c - 1);
                return true;
            }
        }

        private boolean b() {
            return u.this.f536b != null && u.this.f536b.a() > 1;
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    private class h extends DataSetObserver {
        h() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            u.this.b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            u.this.b();
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class c extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f546a;

        /* renamed from: b  reason: collision with root package name */
        public int f547b;

        /* renamed from: c  reason: collision with root package name */
        float f548c;

        /* renamed from: d  reason: collision with root package name */
        boolean f549d;
        int e;
        int f;

        public c() {
            super(-1, -1);
            this.f548c = BitmapDescriptorFactory.HUE_RED;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f548c = BitmapDescriptorFactory.HUE_RED;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f535a);
            this.f547b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f546a != cVar2.f546a) {
                return cVar.f546a ? 1 : -1;
            }
            return cVar.e - cVar2.e;
        }
    }
}
