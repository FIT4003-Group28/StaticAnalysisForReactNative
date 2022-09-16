package a.r;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class p0 extends u0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f671f = true;

    @Override // a.r.u0
    public void a(View view) {
    }

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void a(View view, float f2) {
        if (f671f) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f671f = false;
            }
        }
        view.setAlpha(f2);
    }

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f671f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f671f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a.r.u0
    public void c(View view) {
    }
}
