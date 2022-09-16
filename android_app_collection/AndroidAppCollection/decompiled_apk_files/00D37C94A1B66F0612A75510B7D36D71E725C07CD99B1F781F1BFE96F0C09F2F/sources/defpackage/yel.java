package defpackage;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: yel  reason: default package */
/* loaded from: classes4.dex */
public class yel {
    private static final String a = "yel";
    private final Activity b;
    private final acth c;
    private final yek d;
    public Object e;
    ViewGroup f;
    final FrameLayout g;
    private final axnm h;

    public yel(Activity activity, axnm axnmVar, acth acthVar) {
        this.b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.g = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        this.d = new yek();
        this.h = axnmVar;
        this.c = acthVar;
    }

    private final View f() {
        if (d()) {
            return this.g.getChildAt(0);
        }
        return null;
    }

    private final void g(ajru ajruVar, Object obj) {
        if (ajruVar != null) {
            View a2 = ajruVar.a();
            ajrs f = akel.f(a2);
            if (f == null) {
                f = new ajrs();
                akel.l(a2, f);
            }
            f.h();
            f.a(this.c.oi());
            this.d.a(f, null, 0);
            ajruVar.oK(f, obj);
        }
    }

    private final void h() {
        if (!d()) {
            return;
        }
        View f = f();
        this.g.removeView(f);
        ((ajsa) this.h.get()).b(f);
    }

    public void a() {
        if (!d()) {
            Log.e(a, "No overlay to dismiss.");
            return;
        }
        h();
        this.f.removeView(this.g);
        this.f.setVisibility(8);
        this.d.a = null;
    }

    public void b(Object obj, Pair pair) {
        ajru ajruVar;
        if (obj == null) {
            return;
        }
        if (this.f == null) {
            this.f = zdk.b(this.b);
        }
        View view = null;
        if (pair == null) {
            pair = Pair.create("overlay_controller_param", null);
        }
        this.d.a = pair;
        this.e = obj;
        if (d()) {
            Object obj2 = this.e;
            if (!d() || akel.d(this.g.getChildAt(0)) != ((ajsa) this.h.get()).c(obj2)) {
                h();
            } else {
                c();
                return;
            }
        }
        Object obj3 = this.e;
        if (obj3 != null && (ajruVar = (ajru) akel.i((ajsa) this.h.get(), obj3, this.f).f()) != null) {
            g(ajruVar, obj3);
            view = ajruVar.a();
        }
        if (view == null) {
            return;
        }
        if (this.g.indexOfChild(view) < 0) {
            this.g.addView(view);
        }
        if (this.f.indexOfChild(this.g) < 0) {
            this.f.addView(this.g);
        }
        this.f.setVisibility(0);
    }

    public final void c() {
        if (d()) {
            View f = f();
            akel.j(f, (ajsa) this.h.get());
            g(akel.g(f), this.e);
        }
    }

    public final boolean d() {
        ViewGroup viewGroup = this.f;
        return viewGroup != null && viewGroup.indexOfChild(this.g) >= 0 && this.g.getChildCount() > 0;
    }

    public final void e(Object obj) {
        b(obj, null);
    }
}
