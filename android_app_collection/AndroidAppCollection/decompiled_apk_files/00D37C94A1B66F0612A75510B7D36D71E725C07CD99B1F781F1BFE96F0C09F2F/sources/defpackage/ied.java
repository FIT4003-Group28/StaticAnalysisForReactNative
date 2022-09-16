package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: ied  reason: default package */
/* loaded from: classes3.dex */
public final class ied {
    public final ajmy a;
    public final aafo b;
    public final acth c;
    public final ajxz d;
    View e;
    View f;
    public LottieAnimationView g;
    public ImageView h;
    public View i;
    public ajnj j;
    public boolean k = false;

    public ied(ajmy ajmyVar, aafo aafoVar, acth acthVar, ajxz ajxzVar) {
        this.a = ajmyVar;
        this.b = aafoVar;
        this.c = acthVar;
        this.d = ajxzVar;
    }

    public static View a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewGroup.addView(inflate);
        hqs.c(inflate, true);
        return inflate;
    }

    public static void b(ViewGroup viewGroup, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(view);
        }
        viewGroup.addView(view);
    }

    public final void c() {
        View view = this.f;
        if (view != null) {
            hqs.c(view, false);
            this.f.setOnClickListener(null);
        }
        View view2 = this.e;
        if (view2 != null) {
            hqs.c(view2, false);
            this.e.setOnClickListener(null);
        }
        this.j = null;
        this.k = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = null;
        this.h = null;
    }
}
