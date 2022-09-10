package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: balb  reason: default package */
/* loaded from: classes3.dex */
public final class balb implements jkh {
    public static final cqss a = ibm.b();
    public static final cqss b = ibl.b();
    public static final cqss c = iva.b(ibl.e(), ibl.b());
    public static final cqss d = cqrt.c(R.color.mod_black_alpha20);
    public static final cqss e = ibl.a();
    public final gga f;
    public final TextView g;
    public final View h;
    public final ImageView i;
    public final FrameLayout j;
    public final ImageView k;
    public final FrameLayout l;
    public final View m;
    @dzsi
    public ViewPropertyAnimator n;
    public int o;

    public balb(gga ggaVar, View view) {
        this.f = ggaVar;
        View childAt = ((ViewGroup) view).getChildAt(0);
        dbsk.s(childAt);
        this.h = childAt;
        TextView textView = (TextView) childAt.findViewById(R.id.title);
        dbsk.s(textView);
        this.g = textView;
        FrameLayout frameLayout = (FrameLayout) childAt.findViewById(R.id.nav_button);
        dbsk.s(frameLayout);
        this.j = frameLayout;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.mod_app_bar_button_icon);
        dbsk.s(imageView);
        this.i = imageView;
        FrameLayout frameLayout2 = (FrameLayout) childAt.findViewById(R.id.overflow_button);
        dbsk.s(frameLayout2);
        this.l = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(R.id.mod_app_bar_button_icon);
        dbsk.s(imageView2);
        this.k = imageView2;
        View findViewById = view.findViewById(R.id.trip_reservations_toolbar_shadow);
        dbsk.s(findViewById);
        this.m = findViewById;
        Drawable a2 = cqui.c(cquh.a(1), cquh.f(d)).a(ggaVar);
        frameLayout.setBackground(a2);
        frameLayout2.setBackground(a2);
        findViewById.setAlpha(0.0f);
        this.o = 2;
    }

    private final void c(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        b();
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        a(jjnVar2);
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
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (jkjVar.U() > displayMetrics.heightPixels - this.h.getHeight()) {
            c(1);
        } else if (jkjVar.L() == jjn.HIDDEN) {
        } else {
            c(2);
        }
    }

    public final void a(jjn jjnVar) {
        if (jjnVar == jjn.FULLY_EXPANDED) {
            c(1);
        } else if (jjnVar != jjn.EXPANDED) {
        } else {
            c(2);
        }
    }

    public final void b() {
        this.h.postOnAnimation(new Runnable(this) { // from class: bala
            private final balb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                balb balbVar = this.a;
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[balbVar.o == 1 ? (char) 0 : (char) 1] = new cqlu();
                drawableArr[balbVar.o == 1 ? (char) 1 : (char) 0] = new ColorDrawable(balb.a.b(balbVar.f));
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                balbVar.h.setBackground(transitionDrawable);
                transitionDrawable.startTransition(400);
                float f = balbVar.o == 1 ? 1.0f : 0.0f;
                balbVar.n = balbVar.g.animate().alpha(f).setDuration(400L);
                ViewPropertyAnimator viewPropertyAnimator = balbVar.n;
                dbsk.s(viewPropertyAnimator);
                viewPropertyAnimator.start();
                balbVar.m.animate().alpha(f).setDuration(400L).start();
                int b2 = (balbVar.o == 1 ? balb.c : balb.b).b(balbVar.f);
                balbVar.i.setColorFilter(b2, PorterDuff.Mode.SRC_ATOP);
                balbVar.k.setColorFilter(b2, PorterDuff.Mode.SRC_ATOP);
                Drawable a2 = cqui.c(cquh.a(1), cquh.f(balbVar.o == 1 ? balb.e : balb.d)).a(balbVar.f);
                balbVar.j.setBackground(a2);
                balbVar.l.setBackground(a2);
            }
        });
    }
}
