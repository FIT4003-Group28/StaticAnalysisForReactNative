package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: vos  reason: default package */
/* loaded from: classes7.dex */
public final class vos {
    public static final dcqe a = dcqe.c("vos");
    public final cqkf<jbk> b;
    public final ViewGroup c;
    private final Activity e;
    public final egl d = new voq(this);
    private boolean f = false;

    public vos(Activity activity, cqkf<jbk> cqkfVar) {
        this.e = activity;
        this.b = cqkfVar;
        View c = cqkfVar.c();
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(c, -1, -2);
        frameLayout.setVisibility(4);
        frameLayout.setAlpha(0.0f);
        this.c = frameLayout;
    }

    public static jhz a() {
        jhz a2 = jhz.a();
        a2.d = ibq.E();
        a2.e = c();
        a2.q = cqta.f();
        a2.x = false;
        a2.h = false;
        return a2;
    }

    public static cqtd c() {
        return cquj.c(cqup.a(cquo.a(cqrt.f(2131231689))), cqup.a(cquo.a(ibo.f())));
    }

    public final void b(boolean z) {
        if (z != this.f) {
            this.c.animate().cancel();
            int a2 = jmj.a(this.e, 10);
            if (z) {
                this.c.setVisibility(0);
                this.c.setTranslationY(-a2);
                this.c.animate().alpha(1.0f).translationY(0.0f).setInterpolator(irf.a).setListener(null).start();
            } else {
                this.c.animate().alpha(0.0f).translationY(-a2).setInterpolator(irf.a).setListener(new vor(this)).start();
            }
            this.f = z;
        }
    }
}
