package a.r;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final u0 f669a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f670b;

    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(o0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, Float f2) {
            o0.a(view, f2.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return a.g.m.v.j(view);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, Rect rect) {
            a.g.m.v.a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f669a = i >= 29 ? new t0() : i >= 23 ? new s0() : i >= 22 ? new r0() : i >= 21 ? new q0() : i >= 19 ? new p0() : new u0();
        f670b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f669a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f2) {
        f669a.a(view, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        f669a.a(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i, int i2, int i3, int i4) {
        f669a.a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, Matrix matrix) {
        f669a.a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new m0(view) : l0.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Matrix matrix) {
        f669a.b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f669a.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, Matrix matrix) {
        f669a.c(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new y0(view) : new x0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f669a.c(view);
    }
}
