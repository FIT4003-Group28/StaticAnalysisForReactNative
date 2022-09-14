package c.d.h.i;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c.d.h.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0080a {

        /* renamed from: a  reason: collision with root package name */
        public int f3121a;

        /* renamed from: b  reason: collision with root package name */
        public int f3122b;
    }

    public static void a(C0080a c0080a, float f2, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f2 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0080a.f3122b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0080a.f3121a) - i) / f2) + i2), c0080a.f3122b), 1073741824);
        } else if (!a(layoutParams.width)) {
        } else {
            c0080a.f3121a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0080a.f3122b) - i2) * f2) + i), c0080a.f3121a), 1073741824);
        }
    }

    private static boolean a(int i) {
        return i == 0 || i == -2;
    }
}
