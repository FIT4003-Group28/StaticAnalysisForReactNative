package a.j.a;

import a.g.m.e0.c;
import a.g.m.v;
import a.i.b.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a extends ViewGroup {
    private static final int[] L = {16843828};
    static final int[] M = {16842931};
    static final boolean N;
    private static final boolean O;
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;

    /* renamed from: b  reason: collision with root package name */
    private final c f436b;

    /* renamed from: c  reason: collision with root package name */
    private float f437c;

    /* renamed from: d  reason: collision with root package name */
    private int f438d;

    /* renamed from: e  reason: collision with root package name */
    private int f439e;

    /* renamed from: f  reason: collision with root package name */
    private float f440f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f441g;

    /* renamed from: h  reason: collision with root package name */
    private final a.i.b.c f442h;
    private final a.i.b.c i;
    private final g j;
    private final g k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private d t;
    private List<d> u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* renamed from: a.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnApplyWindowInsetsListenerC0022a implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC0022a(a aVar) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    class b extends a.g.m.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f443d = new Rect();

        b() {
        }

        private void a(a.g.m.e0.c cVar, a.g.m.e0.c cVar2) {
            Rect rect = this.f443d;
            cVar2.a(rect);
            cVar.c(rect);
            cVar2.b(rect);
            cVar.d(rect);
            cVar.p(cVar2.v());
            cVar.e(cVar2.g());
            cVar.a(cVar2.d());
            cVar.b(cVar2.e());
            cVar.g(cVar2.n());
            cVar.d(cVar2.m());
            cVar.h(cVar2.o());
            cVar.i(cVar2.p());
            cVar.a(cVar2.j());
            cVar.n(cVar2.t());
            cVar.k(cVar2.q());
            cVar.a(cVar2.b());
        }

        private void a(a.g.m.e0.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (a.m(childAt)) {
                    cVar.a(childAt);
                }
            }
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            if (a.N) {
                super.a(view, cVar);
            } else {
                a.g.m.e0.c a2 = a.g.m.e0.c.a(cVar);
                super.a(view, a2);
                cVar.c(view);
                ViewParent v = v.v(view);
                if (v instanceof View) {
                    cVar.b((View) v);
                }
                a(cVar, a2);
                a2.w();
                a(cVar, (ViewGroup) view);
            }
            cVar.a((CharSequence) a.class.getName());
            cVar.h(false);
            cVar.i(false);
            cVar.b(c.a.f349e);
            cVar.b(c.a.f350f);
        }

        @Override // a.g.m.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View d2 = a.this.d();
                if (d2 == null) {
                    return true;
                }
                CharSequence d3 = a.this.d(a.this.e(d2));
                if (d3 == null) {
                    return true;
                }
                text.add(d3);
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // a.g.m.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.N || a.m(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // a.g.m.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.class.getName());
        }
    }

    /* loaded from: classes.dex */
    static final class c extends a.g.m.a {
        c() {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            if (!a.m(view)) {
                cVar.b((View) null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i);

        void a(View view);

        void a(View view, float f2);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f445a;

        /* renamed from: b  reason: collision with root package name */
        float f446b;

        /* renamed from: c  reason: collision with root package name */
        boolean f447c;

        /* renamed from: d  reason: collision with root package name */
        int f448d;

        public e(int i, int i2) {
            super(i, i2);
            this.f445a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f445a = 0;
            this.f445a = eVar.f445a;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f445a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.M);
            this.f445a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f445a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f445a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class f extends a.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new C0023a();

        /* renamed from: d  reason: collision with root package name */
        int f449d;

        /* renamed from: e  reason: collision with root package name */
        int f450e;

        /* renamed from: f  reason: collision with root package name */
        int f451f;

        /* renamed from: g  reason: collision with root package name */
        int f452g;

        /* renamed from: h  reason: collision with root package name */
        int f453h;

        /* renamed from: a.j.a.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0023a implements Parcelable.ClassLoaderCreator<f> {
            C0023a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public f mo15createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: createFromParcel */
            public f mo16createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public f[] mo17newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f449d = 0;
            this.f449d = parcel.readInt();
            this.f450e = parcel.readInt();
            this.f451f = parcel.readInt();
            this.f452g = parcel.readInt();
            this.f453h = parcel.readInt();
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f449d = 0;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f449d);
            parcel.writeInt(this.f450e);
            parcel.writeInt(this.f451f);
            parcel.writeInt(this.f452g);
            parcel.writeInt(this.f453h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends c.AbstractC0021c {

        /* renamed from: a  reason: collision with root package name */
        private final int f454a;

        /* renamed from: b  reason: collision with root package name */
        private a.i.b.c f455b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f456c = new RunnableC0024a();

        /* renamed from: a.j.a.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0024a implements Runnable {
            RunnableC0024a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.a();
            }
        }

        g(int i) {
            this.f454a = i;
        }

        private void c() {
            int i = 3;
            if (this.f454a == 3) {
                i = 5;
            }
            View b2 = a.this.b(i);
            if (b2 != null) {
                a.this.a(b2);
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public int a(View view) {
            if (a.this.i(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // a.i.b.c.AbstractC0021c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (a.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = a.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        void a() {
            View b2;
            int width;
            int c2 = this.f455b.c();
            int i = 0;
            boolean z = this.f454a == 3;
            if (z) {
                b2 = a.this.b(3);
                if (b2 != null) {
                    i = -b2.getWidth();
                }
                width = i + c2;
            } else {
                b2 = a.this.b(5);
                width = a.this.getWidth() - c2;
            }
            if (b2 != null) {
                if (((!z || b2.getLeft() >= width) && (z || b2.getLeft() <= width)) || a.this.d(b2) != 0) {
                    return;
                }
                this.f455b.b(b2, width, b2.getTop());
                ((e) b2.getLayoutParams()).f447c = true;
                a.this.invalidate();
                c();
                a.this.a();
            }
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(int i, int i2) {
            a aVar;
            int i3;
            if ((i & 1) == 1) {
                aVar = a.this;
                i3 = 3;
            } else {
                aVar = a.this;
                i3 = 5;
            }
            View b2 = aVar.b(i3);
            if (b2 == null || a.this.d(b2) != 0) {
                return;
            }
            this.f455b.a(b2, i2);
        }

        public void a(a.i.b.c cVar) {
            this.f455b = cVar;
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, float f2, float f3) {
            int i;
            float f4 = a.this.f(view);
            int width = view.getWidth();
            if (a.this.a(view, 3)) {
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && f4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && f4 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f455b.d(i, view.getTop());
            a.this.invalidate();
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, int i) {
            ((e) view.getLayoutParams()).f447c = false;
            c();
        }

        @Override // a.i.b.c.AbstractC0021c
        public void a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (a.this.a(view, 3) ? i + width : a.this.getWidth() - i) / width;
            a.this.c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            a.this.invalidate();
        }

        @Override // a.i.b.c.AbstractC0021c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public void b() {
            a.this.removeCallbacks(this.f456c);
        }

        @Override // a.i.b.c.AbstractC0021c
        public void b(int i, int i2) {
            a.this.postDelayed(this.f456c, 160L);
        }

        @Override // a.i.b.c.AbstractC0021c
        public boolean b(int i) {
            return false;
        }

        @Override // a.i.b.c.AbstractC0021c
        public boolean b(View view, int i) {
            return a.this.i(view) && a.this.a(view, this.f454a) && a.this.d(view) == 0;
        }

        @Override // a.i.b.c.AbstractC0021c
        public void c(int i) {
            a.this.a(this.f454a, i, this.f455b.b());
        }
    }

    static {
        boolean z = true;
        N = Build.VERSION.SDK_INT >= 19;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        O = z;
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f436b = new c();
        this.f439e = -1728053248;
        this.f441g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f438d = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.j = new g(3);
        this.k = new g(5);
        this.f442h = a.i.b.c.a(this, 1.0f, this.j);
        this.f442h.d(1);
        this.f442h.a(f3);
        this.j.a(this.f442h);
        this.i = a.i.b.c.a(this, 1.0f, this.k);
        this.i.d(2);
        this.i.a(f3);
        this.k.a(this.i);
        setFocusableInTouchMode(true);
        v.h(this, 1);
        v.a(this, new b());
        setMotionEventSplittingEnabled(false);
        if (v.m(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0022a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
                try {
                    this.x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.x = null;
            }
        }
        this.f437c = f2 * 10.0f;
        this.I = new ArrayList<>();
    }

    private boolean a(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    private boolean a(Drawable drawable, int i) {
        if (drawable == null || !androidx.core.graphics.drawable.a.f(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable, i);
        return true;
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b2 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b2);
            b2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent b(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    private void c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            v.h(childAt, ((z || i(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).f447c) {
                return true;
            }
        }
        return false;
    }

    static String f(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private boolean f() {
        return d() != null;
    }

    private Drawable g() {
        int p = v.p(this);
        if (p == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                a(drawable, p);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                a(drawable2, p);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable h() {
        int p = v.p(this);
        if (p == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                a(drawable, p);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                a(drawable2, p);
                return this.E;
            }
        }
        return this.H;
    }

    private void i() {
        if (O) {
            return;
        }
        this.y = g();
        this.z = h();
    }

    private static boolean l(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    static boolean m(View view) {
        return (v.n(view) == 4 || v.n(view) == 2) ? false : true;
    }

    void a() {
        if (!this.s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.s = true;
        }
    }

    public void a(int i) {
        a(i, true);
    }

    public void a(int i, int i2) {
        View b2;
        int a2 = a.g.m.d.a(i2, v.p(this));
        if (i2 == 3) {
            this.o = i;
        } else if (i2 == 5) {
            this.p = i;
        } else if (i2 == 8388611) {
            this.q = i;
        } else if (i2 == 8388613) {
            this.r = i;
        }
        if (i != 0) {
            (a2 == 3 ? this.f442h : this.i).a();
        }
        if (i != 1) {
            if (i != 2 || (b2 = b(a2)) == null) {
                return;
            }
            k(b2);
            return;
        }
        View b3 = b(a2);
        if (b3 == null) {
            return;
        }
        a(b3);
    }

    void a(int i, int i2, View view) {
        int e2 = this.f442h.e();
        int e3 = this.i.e();
        int i3 = 2;
        if (e2 == 1 || e3 == 1) {
            i3 = 1;
        } else if (e2 != 2 && e3 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((e) view.getLayoutParams()).f446b;
            if (f2 == 0.0f) {
                b(view);
            } else if (f2 == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.l) {
            this.l = i3;
            List<d> list = this.u;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(i3);
            }
        }
    }

    public void a(int i, boolean z) {
        View b2 = b(i);
        if (b2 != null) {
            a(b2, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + f(i));
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(dVar);
    }

    public void a(View view) {
        a(view, true);
    }

    void a(View view, float f2) {
        List<d> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(view, f2);
            }
        }
    }

    public void a(View view, boolean z) {
        a.i.b.c cVar;
        int width;
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.n) {
            eVar.f446b = 0.0f;
            eVar.f448d = 0;
        } else if (z) {
            eVar.f448d |= 4;
            if (a(view, 3)) {
                cVar = this.f442h;
                width = -view.getWidth();
            } else {
                cVar = this.i;
                width = getWidth();
            }
            cVar.b(view, width, view.getTop());
        } else {
            b(view, 0.0f);
            a(eVar.f445a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void a(Object obj, boolean z) {
        this.C = obj;
        this.D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (i(childAt) && (!z || eVar.f447c)) {
                z2 |= a(childAt, 3) ? this.f442h.b(childAt, -childAt.getWidth(), childAt.getTop()) : this.i.b(childAt, getWidth(), childAt.getTop());
                eVar.f447c = false;
            }
        }
        this.j.b();
        this.k.b();
        if (z2) {
            invalidate();
        }
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!i(childAt)) {
                this.I.add(childAt);
            } else if (h(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        v.h(view, (c() != null || i(view)) ? 4 : 1);
        if (!N) {
            v.a(view, this.f436b);
        }
    }

    View b(int i) {
        int a2 = a.g.m.d.a(i, v.p(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public void b() {
        a(false);
    }

    public void b(int i, boolean z) {
        View b2 = b(i);
        if (b2 != null) {
            b(b2, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + f(i));
    }

    public void b(d dVar) {
        List<d> list;
        if (dVar == null || (list = this.u) == null) {
            return;
        }
        list.remove(dVar);
    }

    void b(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f448d & 1) == 1) {
            eVar.f448d = 0;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).b(view);
                }
            }
            c(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void b(View view, float f2) {
        float f3 = f(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        c(view, f2);
    }

    public void b(View view, boolean z) {
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.n) {
            eVar.f446b = 1.0f;
            eVar.f448d = 1;
            c(view, true);
        } else if (z) {
            eVar.f448d |= 2;
            if (a(view, 3)) {
                this.f442h.b(view, 0, view.getTop());
            } else {
                this.i.b(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            b(view, 1.0f);
            a(eVar.f445a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public int c(int i) {
        int p = v.p(this);
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = p == 0 ? this.q : this.r;
            if (i3 == 3) {
                return 0;
            }
            return i3;
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = p == 0 ? this.r : this.q;
            if (i5 == 3) {
                return 0;
            }
            return i5;
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = p == 0 ? this.o : this.p;
            if (i7 == 3) {
                return 0;
            }
            return i7;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = p == 0 ? this.p : this.o;
            if (i9 == 3) {
                return 0;
            }
            return i9;
        }
    }

    View c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((e) childAt.getLayoutParams()).f448d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void c(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f448d & 1) == 0) {
            eVar.f448d = 1;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(view);
                }
            }
            c(view, true);
            if (!hasWindowFocus()) {
                return;
            }
            sendAccessibilityEvent(32);
        }
    }

    void c(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.f446b) {
            return;
        }
        eVar.f446b = f2;
        a(view, f2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((e) getChildAt(i).getLayoutParams()).f446b);
        }
        this.f440f = f2;
        boolean a2 = this.f442h.a(true);
        boolean a3 = this.i.a(true);
        if (a2 || a3) {
            v.M(this);
        }
    }

    public int d(View view) {
        if (i(view)) {
            return c(((e) view.getLayoutParams()).f445a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public CharSequence d(int i) {
        int a2 = a.g.m.d.a(i, v.p(this));
        if (a2 == 3) {
            return this.A;
        }
        if (a2 != 5) {
            return null;
        }
        return this.B;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f440f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (a(x, y, childAt) && !g(childAt) && a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        int height = getHeight();
        boolean g2 = g(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (g2) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && l(childAt) && i(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f440f;
        if (f2 <= 0.0f || !g2) {
            if (this.y != null && a(view, 3)) {
                int intrinsicWidth = this.y.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f442h.c(), 1.0f));
                this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.y.setAlpha((int) (max * 255.0f));
                drawable = this.y;
            } else if (this.z != null && a(view, 5)) {
                int intrinsicWidth2 = this.z.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.i.c(), 1.0f));
                this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.z.setAlpha((int) (max2 * 255.0f));
                drawable = this.z;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.f439e;
            this.f441g.setColor((i5 & 16777215) | (((int) ((((-16777216) & i5) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, i, getHeight(), this.f441g);
        }
        return drawChild;
    }

    int e(View view) {
        return a.g.m.d.a(((e) view.getLayoutParams()).f445a, v.p(this));
    }

    public void e(int i) {
        b(i, true);
    }

    float f(View view) {
        return ((e) view.getLayoutParams()).f446b;
    }

    boolean g(View view) {
        return ((e) view.getLayoutParams()).f445a == 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f437c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public boolean h(View view) {
        if (i(view)) {
            return (((e) view.getLayoutParams()).f448d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean i(View view) {
        int a2 = a.g.m.d.a(((e) view.getLayoutParams()).f445a, v.p(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    public boolean j(View view) {
        if (i(view)) {
            return ((e) view.getLayoutParams()).f446b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void k(View view) {
        b(view, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.D || this.x == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.C) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop <= 0) {
            return;
        }
        this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.x.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            a.i.b.c r1 = r6.f442h
            boolean r1 = r1.b(r7)
            a.i.b.c r2 = r6.i
            boolean r2 = r2.b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            a.i.b.c r7 = r6.f442h
            boolean r7 = r7.a(r4)
            if (r7 == 0) goto L36
            a.j.a.a$g r7 = r6.j
            r7.b()
            a.j.a.a$g r7 = r6.k
            r7.b()
            goto L36
        L31:
            r6.a(r2)
            r6.s = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            float r4 = r6.f440f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            a.i.b.c r4 = r6.f442h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.b(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.g(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.s = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.e()
            if (r7 != 0) goto L70
            boolean r7 = r6.s
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View d2 = d();
            if (d2 != null && d(d2) == 0) {
                b();
            }
            return d2 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.m = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (g(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.f446b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i9 - i5) / f4;
                        i6 = i9 - ((int) (eVar.f446b * f4));
                    }
                    boolean z2 = f2 != eVar.f446b;
                    int i12 = eVar.f445a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight2 + i15);
                    }
                    if (z2) {
                        c(childAt, f2);
                    }
                    int i19 = eVar.f446b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.m = false;
        this.n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.C != null && v.m(this);
        int p = v.p(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z) {
                    int a2 = a.g.m.d.a(eVar.f445a, p);
                    boolean m = v.m(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (m) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.C;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (!i(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (O) {
                        float l = v.l(childAt);
                        float f2 = this.f437c;
                        if (l != f2) {
                            v.a(childAt, f2);
                        }
                    }
                    int e2 = e(childAt) & 7;
                    boolean z4 = e2 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + f(e2) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f438d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                    i4++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View b2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.j());
        int i = fVar.f449d;
        if (i != 0 && (b2 = b(i)) != null) {
            k(b2);
        }
        int i2 = fVar.f450e;
        if (i2 != 3) {
            a(i2, 3);
        }
        int i3 = fVar.f451f;
        if (i3 != 3) {
            a(i3, 5);
        }
        int i4 = fVar.f452g;
        if (i4 != 3) {
            a(i4, 8388611);
        }
        int i5 = fVar.f453h;
        if (i5 == 3) {
            return;
        }
        a(i5, 8388613);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        i();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = eVar.f448d == 1;
            if (eVar.f448d != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f449d = eVar.f445a;
                break;
            }
        }
        fVar.f450e = this.o;
        fVar.f451f = this.p;
        fVar.f452g = this.q;
        fVar.f453h = this.r;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (d(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            a.i.b.c r0 = r6.f442h
            r0.a(r7)
            a.i.b.c r0 = r6.i
            r0.a(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            if (r0 == r2) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6e
        L1a:
            r6.a(r2)
            goto L6c
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a.i.b.c r3 = r6.f442h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.b(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = r6.g(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            a.i.b.c r3 = r6.f442h
            int r3 = r3.d()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.c()
            if (r7 == 0) goto L5b
            int r7 = r6.d(r7)
            r0 = 2
            if (r7 != r0) goto L5c
        L5b:
            r1 = 1
        L5c:
            r6.a(r1)
            goto L6e
        L60:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
        L6c:
            r6.s = r1
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.a.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f2) {
        this.f437c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i(childAt)) {
                v.a(childAt, this.f437c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.t;
        if (dVar2 != null) {
            b(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.t = dVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f439e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? a.g.e.b.c(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }
}
