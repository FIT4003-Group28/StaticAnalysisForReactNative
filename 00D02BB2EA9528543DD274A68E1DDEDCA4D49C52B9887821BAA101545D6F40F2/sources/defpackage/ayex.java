package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayex  reason: default package */
/* loaded from: classes3.dex */
public final class ayex implements jkh {
    public final gga a;
    public final View b;
    public final View c;
    public final ModAppBar d;
    public final ImageView e;
    public final ImageView f;
    public final aymn g;
    public final cjmt h;
    public ayew i;
    @dzsi
    public ViewPropertyAnimator j;
    @dzsi
    public ViewPropertyAnimator k;
    private final View l;

    public ayex(gga ggaVar, cjmt cjmtVar, cqkf<aymn> cqkfVar) {
        this.a = ggaVar;
        View c = cqkfVar.c();
        this.l = c;
        aymn d = cqkfVar.d();
        dbsk.s(d);
        this.g = d;
        this.h = cjmtVar;
        ModAppBar modAppBar = (ModAppBar) c.findViewById(R.id.mod_app_bar);
        this.d = modAppBar;
        modAppBar.b();
        this.b = c.findViewById(R.id.title_section);
        View a = cqhu.a(c, ise.a);
        dbsk.s(a);
        this.c = a;
        a.setAlpha(0.0f);
        this.e = (ImageView) c.findViewById(R.id.nav_button).findViewById(R.id.mod_app_bar_button_icon);
        this.f = (ImageView) c.findViewById(R.id.overflow_button).findViewById(R.id.mod_app_bar_button_icon);
        e(ayew.INITIALIZING);
    }

    public static Drawable c(Context context, boolean z) {
        if (z) {
            return context.getResources().getDrawable(R.drawable.action_icon_background);
        }
        return new cqlu();
    }

    public static TransitionDrawable d(Context context, ayew ayewVar) {
        Drawable[] drawableArr = new Drawable[2];
        boolean z = false;
        drawableArr[0] = c(context, ayewVar != ayew.TRANSPARENT);
        if (ayewVar == ayew.TRANSPARENT) {
            z = true;
        }
        drawableArr[1] = c(context, z);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        return transitionDrawable;
    }

    private final void e(ayew ayewVar) {
        if (this.i == ayewVar) {
            return;
        }
        this.i = ayewVar;
        b();
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (jkgVar == jkg.AUTOMATED) {
            a(jjnVar2);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (this.i == ayew.INITIALIZING) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (jkjVar.U() <= displayMetrics.heightPixels - this.d.getHeight() && (jkjVar.L() != jjn.HIDDEN || btpf.c(this.a).f)) {
            e(ayew.TRANSPARENT);
        } else {
            e(ayew.SOLID);
        }
    }

    public final void a(jjn jjnVar) {
        boolean z = btpf.c(this.a).f;
        if (jjnVar == jjn.HIDDEN) {
            if (z) {
                z = true;
            }
            e(ayew.SOLID);
        }
        if (jjnVar != jjn.FULLY_EXPANDED) {
            if ((jjnVar != jjn.HIDDEN || !z) && jjnVar != jjn.EXPANDED) {
                return;
            }
            e(ayew.TRANSPARENT);
            return;
        }
        e(ayew.SOLID);
    }

    public final void b() {
        ViewPropertyAnimator viewPropertyAnimator = this.j;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.k;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.l.postOnAnimation(new Runnable(this) { // from class: ayeu
            private final ayex a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cjmu cjmuVar;
                ayex ayexVar = this.a;
                gga ggaVar = ayexVar.a;
                ayew ayewVar = ayexVar.i;
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[ayewVar == ayew.SOLID ? (char) 0 : (char) 1] = new cqlu();
                drawableArr[ayewVar == ayew.SOLID ? (char) 1 : (char) 0] = new ColorDrawable(ibm.b().b(ggaVar));
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                ayexVar.d.setBackground(transitionDrawable);
                transitionDrawable.startTransition(cpnx.a);
                TransitionDrawable d = ayex.d(ayexVar.a, ayexVar.i);
                ayexVar.e.setBackground(d);
                d.startTransition(cpnx.a);
                TransitionDrawable d2 = ayex.d(ayexVar.a, ayexVar.i);
                ayexVar.f.setBackground(d2);
                d2.startTransition(cpnx.a);
                float f = ayexVar.i == ayew.SOLID ? 1.0f : 0.0f;
                ayexVar.j = ayexVar.b.animate().alpha(f).setDuration(300L);
                ayexVar.k = ayexVar.c.animate().alpha(f).setDuration(300L);
                cqss p = ayexVar.i == ayew.SOLID ? ibm.p() : ibl.b();
                ayexVar.e.setColorFilter(p.b(ayexVar.a), PorterDuff.Mode.SRC_ATOP);
                ayexVar.f.setColorFilter(p.b(ayexVar.a), PorterDuff.Mode.SRC_ATOP);
                aymn aymnVar = ayexVar.g;
                jhz e = aymnVar.NC().e();
                int i = (int) (f * 255.0f);
                e.s = i;
                e.r = i;
                e.f = p;
                e.q = ibm.b();
                e.g = p;
                e.e = new ayev(ayexVar, new Object[]{ayexVar.i});
                aymnVar.b(e.b());
                cjmt cjmtVar = ayexVar.h;
                if (ayexVar.i == ayew.SOLID) {
                    cjmuVar = cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE;
                } else {
                    cjmuVar = cjmu.TRANSLUCENT_DARK_BG_WHITE_ICONS;
                }
                cjmtVar.k(cjmuVar);
            }
        });
    }
}
