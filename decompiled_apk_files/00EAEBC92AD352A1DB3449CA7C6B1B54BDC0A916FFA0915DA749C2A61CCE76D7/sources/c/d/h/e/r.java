package c.d.h.e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class r {

    /* loaded from: classes.dex */
    public static abstract class a implements b {
        @Override // c.d.h.e.r.b
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3) {
            a(matrix, rect, i, i2, f2, f3, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5);
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3071a = j.f3084g;

        /* renamed from: b  reason: collision with root package name */
        public static final b f3072b;

        /* renamed from: c  reason: collision with root package name */
        public static final b f3073c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f3074d;

        /* renamed from: e  reason: collision with root package name */
        public static final b f3075e;

        /* renamed from: f  reason: collision with root package name */
        public static final b f3076f;

        static {
            b bVar = i.f3083g;
            f3072b = g.f3081g;
            b bVar2 = h.f3082g;
            f3073c = c.f3077g;
            f3074d = e.f3079g;
            f3075e = d.f3078g;
            f3076f = k.f3085g;
            b bVar3 = f.f3080g;
        }

        Matrix a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3);
    }

    /* loaded from: classes.dex */
    private static class c extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3077g = new c();

        private c() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* loaded from: classes.dex */
    private static class d extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3078g = new d();

        private d() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float f6;
            float height;
            if (f5 > f4) {
                height = rect.top;
                f6 = rect.left + ((rect.width() - (i * f5)) * 0.5f);
                f4 = f5;
            } else {
                f6 = rect.left;
                height = ((rect.height() - (i2 * f4)) * 0.5f) + rect.top;
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* loaded from: classes.dex */
    private static class e extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3079g = new e();

        private e() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(Math.min(f4, f5), 1.0f);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* loaded from: classes.dex */
    private static class f extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3080g = new f();

        private f() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* loaded from: classes.dex */
    private static class g extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3081g = new g();

        private g() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* loaded from: classes.dex */
    private static class h extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3082g = new h();

        private h() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i * min)) + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* loaded from: classes.dex */
    private static class i extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3083g = new i();

        private i() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* loaded from: classes.dex */
    private static class j extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3084g = new j();

        private j() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            matrix.setScale(f4, f5);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* loaded from: classes.dex */
    private static class k extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f3085g = new k();

        private k() {
        }

        @Override // c.d.h.e.r.a
        public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
            float f6;
            float max;
            if (f5 > f4) {
                float f7 = i * f5;
                f6 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f2 * f7), 0.0f), rect.width() - f7);
                max = rect.top;
                f4 = f5;
            } else {
                f6 = rect.left;
                float f8 = i2 * f4;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f3 * f8), 0.0f), rect.height() - f8) + rect.top;
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (f6 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        Object getState();
    }

    public static q a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof q) {
            return (q) drawable;
        }
        if (drawable instanceof c.d.h.e.d) {
            return a(((c.d.h.e.d) drawable).a());
        }
        if (drawable instanceof c.d.h.e.a) {
            c.d.h.e.a aVar = (c.d.h.e.a) drawable;
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                q a3 = a(aVar.a(i2));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }
}
