package com.facebook.f.e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ScalingUtils.java */
/* loaded from: classes.dex */
public class o {

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2451a = i.i;

        /* renamed from: b  reason: collision with root package name */
        public static final b f2452b = h.i;

        /* renamed from: c  reason: collision with root package name */
        public static final b f2453c = f.i;

        /* renamed from: d  reason: collision with root package name */
        public static final b f2454d = g.i;
        public static final b e = c.i;
        public static final b f = e.i;
        public static final b g = d.i;
        public static final b h = j.i;

        Matrix a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public interface k {
        Object a();
    }

    public static n a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof n) {
            return (n) drawable;
        }
        if (drawable instanceof com.facebook.f.e.c) {
            return a(((com.facebook.f.e.c) drawable).a());
        }
        if (drawable instanceof com.facebook.f.e.a) {
            com.facebook.f.e.a aVar = (com.facebook.f.e.a) drawable;
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                n a3 = a(aVar.a(i2));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static abstract class a implements b {
        public abstract void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        @Override // com.facebook.f.e.o.b
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            a(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class i extends a {
        public static final b i = new i();

        public String toString() {
            return "fit_xy";
        }

        private i() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class h extends a {
        public static final b i = new h();

        public String toString() {
            return "fit_start";
        }

        private h() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class f extends a {
        public static final b i = new f();

        public String toString() {
            return "fit_center";
        }

        private f() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = rect.left + ((rect.width() - (i2 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i3 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class g extends a {
        public static final b i = new g();

        public String toString() {
            return "fit_end";
        }

        private g() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i2 * min)) + 0.5f), (int) (rect.top + (rect.height() - (i3 * min)) + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class c extends a {
        public static final b i = new c();

        public String toString() {
            return "center";
        }

        private c() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i2) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i3) * 0.5f) + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class e extends a {
        public static final b i = new e();

        public String toString() {
            return "center_inside";
        }

        private e() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = rect.left + ((rect.width() - (i2 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i3 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class d extends a {
        public static final b i = new d();

        public String toString() {
            return "center_crop";
        }

        private d() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float f5;
            float height;
            if (f4 > f3) {
                height = rect.top;
                f5 = rect.left + ((rect.width() - (i2 * f4)) * 0.5f);
                f3 = f4;
            } else {
                f5 = rect.left;
                height = ((rect.height() - (i3 * f3)) * 0.5f) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class j extends a {
        public static final b i = new j();

        public String toString() {
            return "focus_crop";
        }

        private j() {
        }

        @Override // com.facebook.f.e.o.a
        public void a(Matrix matrix, Rect rect, int i2, int i3, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                float f6 = i2 * f4;
                f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), (float) BitmapDescriptorFactory.HUE_RED), rect.width() - f6);
                max = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                float f7 = i3 * f3;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), (float) BitmapDescriptorFactory.HUE_RED), rect.height() - f7) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
        }
    }
}
