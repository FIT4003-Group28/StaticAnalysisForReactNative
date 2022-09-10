package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: gij  reason: default package */
/* loaded from: classes.dex */
public final class gij implements egc {
    public final MainLayout a;
    public final Iterable<gii> b;
    @dzsi
    public AnimatorSet c;
    private final List<gii> d;
    private final List<gii> e;
    private final List<gii> f;
    private final List<gii> g;
    private final List<gii> h;
    private final List<gii> i;
    private final Iterable<gii> j;
    private final Iterable<gii> k;
    private final Iterable<gii> l;
    private final Iterable<gii> m;
    private final cjmt n;
    private boolean o;

    public gij(MainLayout mainLayout, cjmt cjmtVar) {
        this.a = mainLayout;
        this.n = cjmtVar;
        dcdc i = dcdc.i(new gii(mainLayout, R.id.custom_header_container), new gii(mainLayout, R.id.header_container), new gii(mainLayout, R.id.search_omnibox_container), new gii(mainLayout, R.id.below_search_omnibox_container));
        this.d = i;
        dcdc f = dcdc.f(new gii(mainLayout, mainLayout.af().getId()));
        this.e = f;
        dcdc f2 = dcdc.f(new gii(mainLayout, R.id.on_map_refresh_action_container));
        this.f = f2;
        dcdc i2 = dcdc.i(new gii(mainLayout, R.id.custom_slider_container), new gii(mainLayout, R.id.footer_container), new gii(mainLayout, R.id.expandingscrollview_container), new gii(mainLayout, R.id.home_bottom_sheet_container));
        this.g = i2;
        dcdc h = dcdc.h(new gii(mainLayout, R.id.indoor_content), new gii(mainLayout, R.id.scalebar_widget), new gii(mainLayout, mainLayout.ag().getId()));
        this.h = h;
        dcdc m = dcdc.m(new gii(mainLayout, R.id.on_map_action_button), new gii(mainLayout, R.id.on_map_secondary_action_button_container), new gii(mainLayout, R.id.ar_view_action_button_container), new gii(mainLayout, R.id.bottommapoverlay_container), new gii(mainLayout, R.id.qu_sv_entrypoint_container), new gii(mainLayout, R.id.satellite_button), new gii(mainLayout, R.id.footer_fab_container), new gii(mainLayout, R.id.map_overlay));
        this.i = m;
        this.j = dcbg.g(i, f, f2, i2, h, m);
        this.k = dcbg.e(i, f, f2);
        this.l = dcbg.e(i2, h, m);
        this.m = dcbg.d(f2, m);
        this.b = dcbg.f(i, f2, i2, m);
    }

    private static Animator c(View view, float f) {
        return ObjectAnimator.ofFloat(view, "translationY", f);
    }

    @Override // defpackage.egc
    public final void a(@dzsi egu eguVar, boolean z, @dzsi Runnable runnable, @dzsi Runnable runnable2) {
        float h;
        float translationY;
        View a;
        int i;
        float translationY2;
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null && animatorSet.isRunning()) {
            if (this.o == z) {
                return;
            }
            this.c.end();
            this.c = null;
        }
        if (!z) {
            for (gii giiVar : this.j) {
                giiVar.a();
                View view = giiVar.a;
                if (view != null) {
                    giiVar.b = view.getTranslationY();
                    giiVar.c = giiVar.a.getVisibility();
                    giiVar.d = giiVar.a.getAlpha();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<gii> it = this.k.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            gii next = it.next();
            View a2 = next.a();
            if (a2 != null && (a = next.a()) != null) {
                ViewGroup af = this.a.af();
                boolean z3 = !this.a.S();
                if (eguVar != null && eguVar.c != null) {
                    z2 = true;
                }
                if (!z3 || !z2 || a != af) {
                    if (this.d.contains(next)) {
                        i = this.a.j(true);
                    } else {
                        i = this.a.i() - this.a.e();
                    }
                    if (z) {
                        translationY2 = next.b;
                    } else {
                        translationY2 = a2.getTranslationY() - i;
                    }
                    arrayList.add(c(a2, translationY2));
                }
            }
        }
        for (gii giiVar2 : this.l) {
            View a3 = giiVar2.a();
            if (a3 != null) {
                float a4 = jmj.a(this.a.getContext(), 64) / 2.0f;
                if (this.g.contains(giiVar2)) {
                    h = this.a.h() + a4;
                } else {
                    h = this.a.h();
                }
                if (z) {
                    translationY = giiVar2.b;
                } else {
                    translationY = a3.getTranslationY() + h;
                }
                arrayList.add(c(a3, translationY));
            }
        }
        for (gii giiVar3 : this.m) {
            View a5 = giiVar3.a();
            if (a5 != null) {
                arrayList.add(ObjectAnimator.ofFloat(a5, "alpha", z ? giiVar3.d : 0.0f));
            }
        }
        if (eguVar != null && this.a.q.c()) {
            arrayList.add(this.n.j(z ? eguVar.J : cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c = animatorSet2;
        this.o = z;
        animatorSet2.playTogether(arrayList);
        this.c.setDuration(333L);
        this.c.addListener(new gih(this, z, runnable, runnable2));
        this.c.start();
    }

    @Override // defpackage.egc
    public final void b() {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
