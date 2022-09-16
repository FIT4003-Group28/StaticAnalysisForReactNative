package defpackage;

import android.app.Activity;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.common.tutorial.ClingTutorialView;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ngb  reason: default package */
/* loaded from: classes3.dex */
public final class ngb implements fpf, ynl {
    public final fpg a;
    private final Activity b;
    private final iwa c;
    private ViewGroup d;
    private ClingTutorialView e;
    private final azqb f;
    private final azqb g;
    private final oja h;

    public ngb(Activity activity, oja ojaVar, fpg fpgVar, iwa iwaVar, azqb azqbVar, azqb azqbVar2) {
        this.b = activity;
        this.h = ojaVar;
        fpgVar.getClass();
        this.a = fpgVar;
        iwaVar.getClass();
        this.c = iwaVar;
        azqbVar.getClass();
        this.f = azqbVar;
        this.g = azqbVar2;
    }

    @Override // defpackage.fpc
    public final int c() {
        return 5500;
    }

    @Override // defpackage.fpc
    public final void d() {
        ClingTutorialView clingTutorialView = this.e;
        if (clingTutorialView != null) {
            clingTutorialView.b();
            this.d.removeView(this.e);
        }
    }

    @Override // defpackage.fpc
    public final void e() {
        if (this.d == null) {
            ViewGroup viewGroup = (ViewGroup) this.b.getWindow().findViewById(R.id.accessibility_layer_container);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) this.b.getWindow().getDecorView();
            }
            this.d = viewGroup;
        }
        ClingTutorialView clingTutorialView = this.e;
        if (clingTutorialView == null) {
            ClingTutorialView clingTutorialView2 = (ClingTutorialView) this.b.getLayoutInflater().inflate(R.layout.tutorial_view, this.d).findViewById(R.id.tutorial_view);
            this.e = clingTutorialView2;
            clingTutorialView2.d = new nga(this);
            ClingTutorialView clingTutorialView3 = this.e;
            clingTutorialView3.b.setText(Html.fromHtml(this.b.getString(R.string.dial_screen_tutorial)));
            clingTutorialView = this.e;
            clingTutorialView.c = 1000;
        }
        if (this.d.indexOfChild(clingTutorialView) < 0) {
            this.d.addView(this.e);
        }
        MediaRouteButton b = this.c.b();
        ClingTutorialView clingTutorialView4 = this.e;
        ViewGroup viewGroup2 = this.d;
        ClingView clingView = clingTutorialView4.a;
        View view = clingView.b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(clingView.d);
        }
        clingView.b = b;
        viewGroup2.getClass();
        clingView.a = viewGroup2;
        View view2 = clingView.b;
        if (view2 != null) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(clingView.d);
        }
        clingView.postInvalidate();
        clingTutorialView4.postInvalidate();
        ClingTutorialView clingTutorialView5 = this.e;
        if (clingTutorialView5.getVisibility() == 0) {
            clingTutorialView5.setAnimation(null);
            return;
        }
        clingTutorialView5.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(clingTutorialView5.c);
        clingTutorialView5.startAnimation(alphaAnimation);
    }

    @Override // defpackage.fpf
    public final boolean f() {
        boolean z;
        oja ojaVar;
        MediaRouteButton b = this.c.b();
        if (b != null && b.isShown()) {
            bhd bhdVar = (bhd) this.f.get();
            if (bhd.i() != null) {
                bhd bhdVar2 = (bhd) this.f.get();
                for (bhc bhcVar : bhd.i()) {
                    if (((adgc) this.g.get()).T(bhcVar)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return (!z || (ojaVar = this.h) == null) ? z : ((frv) ojaVar.a.get()).q() && !ojaVar.b.l() && !ojaVar.b.i();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adnp adnpVar = (adnp) obj;
                this.a.d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adnp.class};
    }
}
