package c.e.a.c.a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    d f4679a;

    /* renamed from: b  reason: collision with root package name */
    d f4680b;

    /* renamed from: c  reason: collision with root package name */
    d f4681c;

    /* renamed from: d  reason: collision with root package name */
    d f4682d;

    /* renamed from: e  reason: collision with root package name */
    c.e.a.c.a0.c f4683e;

    /* renamed from: f  reason: collision with root package name */
    c.e.a.c.a0.c f4684f;

    /* renamed from: g  reason: collision with root package name */
    c.e.a.c.a0.c f4685g;

    /* renamed from: h  reason: collision with root package name */
    c.e.a.c.a0.c f4686h;
    f i;
    f j;
    f k;
    f l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f4687a;

        /* renamed from: b  reason: collision with root package name */
        private d f4688b;

        /* renamed from: c  reason: collision with root package name */
        private d f4689c;

        /* renamed from: d  reason: collision with root package name */
        private d f4690d;

        /* renamed from: e  reason: collision with root package name */
        private c.e.a.c.a0.c f4691e;

        /* renamed from: f  reason: collision with root package name */
        private c.e.a.c.a0.c f4692f;

        /* renamed from: g  reason: collision with root package name */
        private c.e.a.c.a0.c f4693g;

        /* renamed from: h  reason: collision with root package name */
        private c.e.a.c.a0.c f4694h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.f4687a = h.a();
            this.f4688b = h.a();
            this.f4689c = h.a();
            this.f4690d = h.a();
            this.f4691e = new c.e.a.c.a0.a(0.0f);
            this.f4692f = new c.e.a.c.a0.a(0.0f);
            this.f4693g = new c.e.a.c.a0.a(0.0f);
            this.f4694h = new c.e.a.c.a0.a(0.0f);
            this.i = h.b();
            this.j = h.b();
            this.k = h.b();
            this.l = h.b();
        }

        public b(k kVar) {
            this.f4687a = h.a();
            this.f4688b = h.a();
            this.f4689c = h.a();
            this.f4690d = h.a();
            this.f4691e = new c.e.a.c.a0.a(0.0f);
            this.f4692f = new c.e.a.c.a0.a(0.0f);
            this.f4693g = new c.e.a.c.a0.a(0.0f);
            this.f4694h = new c.e.a.c.a0.a(0.0f);
            this.i = h.b();
            this.j = h.b();
            this.k = h.b();
            this.l = h.b();
            this.f4687a = kVar.f4679a;
            this.f4688b = kVar.f4680b;
            this.f4689c = kVar.f4681c;
            this.f4690d = kVar.f4682d;
            this.f4691e = kVar.f4683e;
            this.f4692f = kVar.f4684f;
            this.f4693g = kVar.f4685g;
            this.f4694h = kVar.f4686h;
            this.i = kVar.i;
            this.j = kVar.j;
            this.k = kVar.k;
            this.l = kVar.l;
        }

        private static float e(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f4678a;
            }
            if (!(dVar instanceof e)) {
                return -1.0f;
            }
            return ((e) dVar).f4659a;
        }

        public b a(float f2) {
            d(f2);
            e(f2);
            c(f2);
            b(f2);
            return this;
        }

        public b a(int i, c.e.a.c.a0.c cVar) {
            a(h.a(i));
            a(cVar);
            return this;
        }

        public b a(c.e.a.c.a0.c cVar) {
            this.f4694h = cVar;
            return this;
        }

        public b a(d dVar) {
            this.f4690d = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                b(e2);
            }
            return this;
        }

        public k a() {
            return new k(this);
        }

        public b b(float f2) {
            this.f4694h = new c.e.a.c.a0.a(f2);
            return this;
        }

        public b b(int i, c.e.a.c.a0.c cVar) {
            b(h.a(i));
            b(cVar);
            return this;
        }

        public b b(c.e.a.c.a0.c cVar) {
            this.f4693g = cVar;
            return this;
        }

        public b b(d dVar) {
            this.f4689c = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                c(e2);
            }
            return this;
        }

        public b c(float f2) {
            this.f4693g = new c.e.a.c.a0.a(f2);
            return this;
        }

        public b c(int i, c.e.a.c.a0.c cVar) {
            c(h.a(i));
            c(cVar);
            return this;
        }

        public b c(c.e.a.c.a0.c cVar) {
            this.f4691e = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f4687a = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                d(e2);
            }
            return this;
        }

        public b d(float f2) {
            this.f4691e = new c.e.a.c.a0.a(f2);
            return this;
        }

        public b d(int i, c.e.a.c.a0.c cVar) {
            d(h.a(i));
            d(cVar);
            return this;
        }

        public b d(c.e.a.c.a0.c cVar) {
            this.f4692f = cVar;
            return this;
        }

        public b d(d dVar) {
            this.f4688b = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                e(e2);
            }
            return this;
        }

        public b e(float f2) {
            this.f4692f = new c.e.a.c.a0.a(f2);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        c.e.a.c.a0.c a(c.e.a.c.a0.c cVar);
    }

    static {
        new i(0.5f);
    }

    public k() {
        this.f4679a = h.a();
        this.f4680b = h.a();
        this.f4681c = h.a();
        this.f4682d = h.a();
        this.f4683e = new c.e.a.c.a0.a(0.0f);
        this.f4684f = new c.e.a.c.a0.a(0.0f);
        this.f4685g = new c.e.a.c.a0.a(0.0f);
        this.f4686h = new c.e.a.c.a0.a(0.0f);
        this.i = h.b();
        this.j = h.b();
        this.k = h.b();
        this.l = h.b();
    }

    private k(b bVar) {
        this.f4679a = bVar.f4687a;
        this.f4680b = bVar.f4688b;
        this.f4681c = bVar.f4689c;
        this.f4682d = bVar.f4690d;
        this.f4683e = bVar.f4691e;
        this.f4684f = bVar.f4692f;
        this.f4685g = bVar.f4693g;
        this.f4686h = bVar.f4694h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    private static c.e.a.c.a0.c a(TypedArray typedArray, int i, c.e.a.c.a0.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new c.e.a.c.a0.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public static b a(Context context, int i, int i2) {
        return a(context, i, i2, 0);
    }

    private static b a(Context context, int i, int i2, int i3) {
        return a(context, i, i2, new c.e.a.c.a0.a(i3));
    }

    private static b a(Context context, int i, int i2, c.e.a.c.a0.c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c.e.a.c.k.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(c.e.a.c.k.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(c.e.a.c.k.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(c.e.a.c.k.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(c.e.a.c.k.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(c.e.a.c.k.ShapeAppearance_cornerFamilyBottomLeft, i3);
            c.e.a.c.a0.c a2 = a(obtainStyledAttributes, c.e.a.c.k.ShapeAppearance_cornerSize, cVar);
            c.e.a.c.a0.c a3 = a(obtainStyledAttributes, c.e.a.c.k.ShapeAppearance_cornerSizeTopLeft, a2);
            c.e.a.c.a0.c a4 = a(obtainStyledAttributes, c.e.a.c.k.ShapeAppearance_cornerSizeTopRight, a2);
            c.e.a.c.a0.c a5 = a(obtainStyledAttributes, c.e.a.c.k.ShapeAppearance_cornerSizeBottomRight, a2);
            c.e.a.c.a0.c a6 = a(obtainStyledAttributes, c.e.a.c.k.ShapeAppearance_cornerSizeBottomLeft, a2);
            b bVar = new b();
            bVar.c(i4, a3);
            bVar.d(i5, a4);
            bVar.b(i6, a5);
            bVar.a(i7, a6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2) {
        return a(context, attributeSet, i, i2, 0);
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return a(context, attributeSet, i, i2, new c.e.a.c.a0.a(i3));
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2, c.e.a.c.a0.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.a.c.k.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cVar);
    }

    public static b n() {
        return new b();
    }

    public f a() {
        return this.k;
    }

    public k a(float f2) {
        b m = m();
        m.a(f2);
        return m.a();
    }

    public k a(c cVar) {
        b m = m();
        m.c(cVar.a(j()));
        m.d(cVar.a(l()));
        m.a(cVar.a(c()));
        m.b(cVar.a(e()));
        return m.a();
    }

    public boolean a(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.f4683e.a(rectF);
        return z && ((this.f4684f.a(rectF) > a2 ? 1 : (this.f4684f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f4686h.a(rectF) > a2 ? 1 : (this.f4686h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f4685g.a(rectF) > a2 ? 1 : (this.f4685g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f4680b instanceof j) && (this.f4679a instanceof j) && (this.f4681c instanceof j) && (this.f4682d instanceof j));
    }

    public d b() {
        return this.f4682d;
    }

    public c.e.a.c.a0.c c() {
        return this.f4686h;
    }

    public d d() {
        return this.f4681c;
    }

    public c.e.a.c.a0.c e() {
        return this.f4685g;
    }

    public f f() {
        return this.l;
    }

    public f g() {
        return this.j;
    }

    public f h() {
        return this.i;
    }

    public d i() {
        return this.f4679a;
    }

    public c.e.a.c.a0.c j() {
        return this.f4683e;
    }

    public d k() {
        return this.f4680b;
    }

    public c.e.a.c.a0.c l() {
        return this.f4684f;
    }

    public b m() {
        return new b(this);
    }
}
