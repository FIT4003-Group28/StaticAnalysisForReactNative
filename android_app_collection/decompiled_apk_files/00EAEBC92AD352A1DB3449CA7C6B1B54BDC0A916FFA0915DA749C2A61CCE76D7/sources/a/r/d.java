package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* loaded from: classes.dex */
public class d extends x {
    private static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> O = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new C0034d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, "position");
    private static t U = new t();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f564d;

        a(d dVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f561a = viewGroup;
            this.f562b = bitmapDrawable;
            this.f563c = view;
            this.f564d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0.b(this.f561a).b(this.f562b);
            o0.a(this.f563c, this.f564d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f565a;

        b(Class cls, String str) {
            super(cls, str);
            this.f565a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f565a);
            Rect rect = this.f565a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f565a);
            this.f565a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f565a);
        }
    }

    /* loaded from: classes.dex */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.b(pointF);
        }
    }

    /* renamed from: a.r.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0034d extends Property<k, PointF> {
        C0034d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            o0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            o0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            o0.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f566a;
        private k mViewBounds;

        h(d dVar, k kVar) {
            this.f566a = kVar;
            this.mViewBounds = this.f566a;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f568b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f570d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f571e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f572f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f573g;

        i(d dVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f568b = view;
            this.f569c = rect;
            this.f570d = i;
            this.f571e = i2;
            this.f572f = i3;
            this.f573g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f567a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f567a) {
                a.g.m.v.a(this.f568b, this.f569c);
                o0.a(this.f568b, this.f570d, this.f571e, this.f572f, this.f573g);
            }
        }
    }

    /* loaded from: classes.dex */
    class j extends y {

        /* renamed from: a  reason: collision with root package name */
        boolean f574a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f575b;

        j(d dVar, ViewGroup viewGroup) {
            this.f575b = viewGroup;
        }

        @Override // a.r.y, a.r.x.f
        public void b(x xVar) {
            j0.b(this.f575b, false);
            this.f574a = true;
        }

        @Override // a.r.y, a.r.x.f
        public void c(x xVar) {
            j0.b(this.f575b, false);
        }

        @Override // a.r.y, a.r.x.f
        public void d(x xVar) {
            j0.b(this.f575b, true);
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            if (!this.f574a) {
                j0.b(this.f575b, false);
            }
            xVar.mo24b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f576a;

        /* renamed from: b  reason: collision with root package name */
        private int f577b;

        /* renamed from: c  reason: collision with root package name */
        private int f578c;

        /* renamed from: d  reason: collision with root package name */
        private int f579d;

        /* renamed from: e  reason: collision with root package name */
        private View f580e;

        /* renamed from: f  reason: collision with root package name */
        private int f581f;

        /* renamed from: g  reason: collision with root package name */
        private int f582g;

        k(View view) {
            this.f580e = view;
        }

        private void a() {
            o0.a(this.f580e, this.f576a, this.f577b, this.f578c, this.f579d);
            this.f581f = 0;
            this.f582g = 0;
        }

        void a(PointF pointF) {
            this.f578c = Math.round(pointF.x);
            this.f579d = Math.round(pointF.y);
            this.f582g++;
            if (this.f581f == this.f582g) {
                a();
            }
        }

        void b(PointF pointF) {
            this.f576a = Math.round(pointF.x);
            this.f577b = Math.round(pointF.y);
            this.f581f++;
            if (this.f581f == this.f582g) {
                a();
            }
        }
    }

    private boolean a(View view, View view2) {
        if (this.M) {
            d0 a2 = a(view, true);
            if (a2 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == a2.f584b) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void d(d0 d0Var) {
        View view = d0Var.f584b;
        if (!a.g.m.v.I(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0Var.f583a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0Var.f583a.put("android:changeBounds:parent", d0Var.f584b.getParent());
        if (this.M) {
            d0Var.f584b.getLocationInWindow(this.K);
            d0Var.f583a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
            d0Var.f583a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
        }
        if (!this.L) {
            return;
        }
        d0Var.f583a.put("android:changeBounds:clip", a.g.m.v.j(view));
    }

    @Override // a.r.x
    public Animator a(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator a2;
        Path a3;
        Property<View, PointF> property;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Map<String, Object> map = d0Var.f583a;
        Map<String, Object> map2 = d0Var2.f583a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = d0Var2.f584b;
        if (!a(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) d0Var.f583a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) d0Var.f583a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) d0Var2.f583a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) d0Var2.f583a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.K);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c2 = o0.c(view2);
            o0.a(view2, 0.0f);
            o0.b(viewGroup).a(bitmapDrawable);
            p g2 = g();
            int[] iArr = this.K;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, r.a(O, g2.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c2));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) d0Var.f583a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) d0Var2.f583a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) d0Var.f583a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) d0Var2.f583a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (!this.L) {
            view = view2;
            o0.a(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    a3 = g().a(i4, i6, i5, i7);
                    property = T;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a4 = o.a(kVar, P, g().a(i4, i6, i5, i7));
                    ObjectAnimator a5 = o.a(kVar, Q, g().a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a4, a5);
                    animatorSet.addListener(new h(this, kVar));
                    a2 = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                a3 = g().a(i8, i10, i9, i11);
                property = R;
            } else {
                a3 = g().a(i4, i6, i5, i7);
                property = S;
            }
            a2 = o.a(view, property, a3);
        } else {
            view = view2;
            o0.a(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator a6 = (i4 == i5 && i6 == i7) ? null : o.a(view, T, g().a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (!rect.equals(rect6)) {
                a.g.m.v.a(view, rect);
                t tVar = U;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", tVar, objArr);
                objectAnimator.addListener(new i(this, view, rect5, i5, i7, i9, i11));
            } else {
                objectAnimator = null;
            }
            a2 = c0.a(a6, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            j0.b(viewGroup4, true);
            mo20a(new j(this, viewGroup4));
        }
        return a2;
    }

    @Override // a.r.x
    public void a(d0 d0Var) {
        d(d0Var);
    }

    @Override // a.r.x
    public void c(d0 d0Var) {
        d(d0Var);
    }

    @Override // a.r.x
    public String[] n() {
        return N;
    }
}
