package a.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private c f12b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f13c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f14d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f15e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17g;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private C0002b m;

    /* renamed from: f  reason: collision with root package name */
    private int f16f = 255;

    /* renamed from: h  reason: collision with root package name */
    private int f18h = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002b implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        private Drawable.Callback f20b;

        C0002b() {
        }

        public C0002b a(Drawable.Callback callback) {
            this.f20b = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f20b;
            this.f20b = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f20b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f20b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f21a;

        /* renamed from: b  reason: collision with root package name */
        Resources f22b;

        /* renamed from: c  reason: collision with root package name */
        int f23c;

        /* renamed from: d  reason: collision with root package name */
        int f24d;

        /* renamed from: e  reason: collision with root package name */
        int f25e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f26f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f27g;

        /* renamed from: h  reason: collision with root package name */
        int f28h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, b bVar, Resources resources) {
            this.f23c = 160;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f21a = bVar;
            this.f22b = resources != null ? resources : cVar != null ? cVar.f22b : null;
            this.f23c = b.a(resources, cVar != null ? cVar.f23c : 0);
            if (cVar == null) {
                this.f27g = new Drawable[10];
                this.f28h = 0;
                return;
            }
            this.f24d = cVar.f24d;
            this.f25e = cVar.f25e;
            this.v = true;
            this.w = true;
            this.i = cVar.i;
            this.l = cVar.l;
            this.x = cVar.x;
            this.y = cVar.y;
            this.z = cVar.z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f23c == this.f23c) {
                if (cVar.j) {
                    this.k = new Rect(cVar.k);
                    this.j = true;
                }
                if (cVar.m) {
                    this.n = cVar.n;
                    this.o = cVar.o;
                    this.p = cVar.p;
                    this.q = cVar.q;
                    this.m = true;
                }
            }
            if (cVar.r) {
                this.s = cVar.s;
                this.r = true;
            }
            if (cVar.t) {
                this.u = cVar.u;
                this.t = true;
            }
            Drawable[] drawableArr = cVar.f27g;
            this.f27g = new Drawable[drawableArr.length];
            this.f28h = cVar.f28h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f26f;
            this.f26f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f28h);
            int i = this.f28h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f26f.put(i2, constantState);
                    } else {
                        this.f27g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f21a);
            return mutate;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f26f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f27g[this.f26f.keyAt(i)] = b(this.f26f.valueAt(i).newDrawable(this.f22b));
                }
                this.f26f = null;
            }
        }

        public final int a(Drawable drawable) {
            int i = this.f28h;
            if (i >= this.f27g.length) {
                a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f21a);
            this.f27g[i] = drawable;
            this.f28h++;
            this.f25e = drawable.getChangingConfigurations() | this.f25e;
            k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i;
        }

        public final Drawable a(int i) {
            int indexOfKey;
            Drawable drawable = this.f27g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f26f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b2 = b(this.f26f.valueAt(indexOfKey).newDrawable(this.f22b));
            this.f27g[i] = b2;
            this.f26f.removeAt(indexOfKey);
            if (this.f26f.size() == 0) {
                this.f26f = null;
            }
            return b2;
        }

        public void a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f27g, 0, drawableArr, 0, i);
            this.f27g = drawableArr;
        }

        final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int i = this.f28h;
                Drawable[] drawableArr = this.f27g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f25e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        final void a(Resources resources) {
            if (resources != null) {
                this.f22b = resources;
                int a2 = b.a(resources, this.f23c);
                int i = this.f23c;
                this.f23c = a2;
                if (i == a2) {
                    return;
                }
                this.m = false;
                this.j = false;
            }
        }

        public final void a(boolean z) {
            this.l = z;
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i = this.f28h;
            Drawable[] drawableArr = this.f27g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        protected void b() {
            this.m = true;
            n();
            int i = this.f28h;
            Drawable[] drawableArr = this.f27g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b(int i) {
            this.A = i;
        }

        public final void b(boolean z) {
            this.i = z;
        }

        final boolean b(int i, int i2) {
            int i3 = this.f28h;
            Drawable[] drawableArr = this.f27g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.z = i;
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int c() {
            return this.f27g.length;
        }

        public final void c(int i) {
            this.B = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f28h;
            Drawable[] drawableArr = this.f27g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f26f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.f28h;
        }

        public final int e() {
            if (!this.m) {
                b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.m) {
                b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.m) {
                b();
            }
            return this.p;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f24d | this.f25e;
        }

        public final Rect h() {
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect rect = new Rect();
            int i = this.f28h;
            Drawable[] drawableArr = this.f27g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.j = true;
            this.k = rect2;
            return rect2;
        }

        public final int i() {
            if (!this.m) {
                b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int i = this.f28h;
            Drawable[] drawableArr = this.f27g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.l;
        }

        abstract void m();
    }

    static int a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new C0002b();
        }
        C0002b c0002b = this.m;
        c0002b.a(drawable.getCallback());
        drawable.setCallback(c0002b);
        try {
            if (this.f12b.A <= 0 && this.f17g) {
                drawable.setAlpha(this.f16f);
            }
            if (this.f12b.E) {
                drawable.setColorFilter(this.f12b.D);
            } else {
                if (this.f12b.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f12b.F);
                }
                if (this.f12b.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f12b.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f12b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f12b.C);
            }
            Rect rect = this.f13c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    private boolean c() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    /* renamed from: a */
    c mo1a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f12b = cVar;
        int i = this.f18h;
        if (i >= 0) {
            this.f14d = cVar.a(i);
            Drawable drawable = this.f14d;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.f15e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.f12b.a(resources);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f17g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f14d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f16f
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.a.l.a.b$c r9 = r13.f12b
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f16f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.k = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f15e
            if (r9 == 0) goto L61
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f15e = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.a.l.a.b$c r4 = r13.f12b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f16f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.l = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.l.a.b.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f18h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.a.l.a.b$c r0 = r9.f12b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f15e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f14d
            if (r0 == 0) goto L29
            r9.f15e = r0
            a.a.l.a.b$c r0 = r9.f12b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L35
        L29:
            r9.f15e = r4
            r9.l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f14d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.a.l.a.b$c r0 = r9.f12b
            int r1 = r0.f28h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.a(r10)
            r9.f14d = r0
            r9.f18h = r10
            if (r0 == 0) goto L5a
            a.a.l.a.b$c r10 = r9.f12b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L51:
            r9.a(r0)
            goto L5a
        L55:
            r9.f14d = r4
            r10 = -1
            r9.f18h = r10
        L5a:
            long r0 = r9.k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.j
            if (r0 != 0) goto L73
            a.a.l.a.b$a r0 = new a.a.l.a.b$a
            r0.<init>()
            r9.j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.l.a.b.a(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f12b.a(theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f18h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f12b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f15e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f12b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f12b.a()) {
            this.f12b.f24d = getChangingConfigurations();
            return this.f12b;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f14d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f12b.l()) {
            return this.f12b.e();
        }
        Drawable drawable = this.f14d;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f12b.l()) {
            return this.f12b.i();
        }
        Drawable drawable = this.f14d;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f12b.l()) {
            return this.f12b.f();
        }
        Drawable drawable = this.f14d;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f12b.l()) {
            return this.f12b.g();
        }
        Drawable drawable = this.f14d;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f12b.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f14d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect h2 = this.f12b.h();
        if (h2 != null) {
            rect.set(h2);
            padding = (h2.right | ((h2.left | h2.top) | h2.bottom)) != 0;
        } else {
            Drawable drawable = this.f14d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f12b;
        if (cVar != null) {
            cVar.k();
        }
        if (drawable != this.f14d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f12b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f15e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f15e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f14d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17g) {
                this.f14d.setAlpha(this.f16f);
            }
        }
        if (this.l != 0) {
            this.l = 0L;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c mo1a = mo1a();
            mo1a.m();
            a(mo1a);
            this.i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f12b.b(i, b());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f15e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f14d;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f15e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f14d;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f14d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f17g || this.f16f != i) {
            this.f17g = true;
            this.f16f = i;
            Drawable drawable = this.f14d;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f12b;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f14d;
            if (drawable == null) {
                return;
            }
            androidx.core.graphics.drawable.a.a(drawable, cVar.C);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f12b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f14d;
            if (drawable == null) {
                return;
            }
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f12b;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f14d;
            if (drawable == null) {
                return;
            }
            drawable.setDither(cVar.x);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f14d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f13c;
        if (rect == null) {
            this.f13c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f14d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f12b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.f14d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f12b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.a(this.f14d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f15e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f14d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f14d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
