package c.e.a.c.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import c.e.a.c.p.c;
/* loaded from: classes.dex */
public interface d extends c.a {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f4765b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f4766a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f4766a.a(c.e.a.c.v.a.a(eVar.f4769a, eVar2.f4769a, f2), c.e.a.c.v.a.a(eVar.f4770b, eVar2.f4770b, f2), c.e.a.c.v.a.a(eVar.f4771c, eVar2.f4771c, f2));
            return this.f4766a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f4767a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: c.e.a.c.p.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0103d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f4768a = new C0103d("circularRevealScrimColor");

        private C0103d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f4769a;

        /* renamed from: b  reason: collision with root package name */
        public float f4770b;

        /* renamed from: c  reason: collision with root package name */
        public float f4771c;

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.f4769a = f2;
            this.f4770b = f3;
            this.f4771c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.f4769a = f2;
            this.f4770b = f3;
            this.f4771c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
