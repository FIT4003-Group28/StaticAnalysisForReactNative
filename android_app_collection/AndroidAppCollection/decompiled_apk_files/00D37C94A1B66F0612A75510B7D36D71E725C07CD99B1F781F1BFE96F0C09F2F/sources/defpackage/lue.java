package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lue  reason: default package */
/* loaded from: classes3.dex */
public final class lue implements alik {
    private final oa a;
    private final frw b;
    private fsa c;
    private final Toolbar d;
    private final nj e;
    private final Resources f;
    private final MainCollapsingToolbarLayout g;
    private final azqb h;
    private final lvu i;
    private boolean j;
    private int k;
    private int l;
    private final aacz m;

    public lue(oa oaVar, lvu lvuVar, frw frwVar, Resources resources, Toolbar toolbar, MainCollapsingToolbarLayout mainCollapsingToolbarLayout, AppBarLayout appBarLayout, azqb azqbVar, aacz aaczVar, fsa fsaVar, ActionBarColor actionBarColor, int i, ActionBarColor actionBarColor2, int i2, ActionBarColor actionBarColor3, boolean z) {
        this.a = oaVar;
        this.i = lvuVar;
        azqbVar.getClass();
        this.h = azqbVar;
        frwVar.getClass();
        this.b = frwVar;
        this.f = resources;
        this.d = toolbar;
        nj supportActionBar = oaVar.getSupportActionBar();
        supportActionBar.getClass();
        this.e = supportActionBar;
        this.m = aaczVar;
        this.g = mainCollapsingToolbarLayout;
        supportActionBar.l(false);
        this.j = z;
        appBarLayout.i(this);
        this.k = 0;
        this.l = 0;
        b(fsaVar, actionBarColor, i, actionBarColor2, i2, actionBarColor3, z);
    }

    private final int c(ActionBarColor actionBarColor) {
        return actionBarColor.la(this.a);
    }

    private final void d(int i) {
        Toolbar toolbar = this.d;
        toolbar.setPaddingRelative(i, toolbar.getPaddingTop(), this.d.getPaddingEnd(), this.d.getPaddingBottom());
    }

    @Override // defpackage.alig
    public final void a(AppBarLayout appBarLayout, int i) {
        if (this.l == this.k || !(this.d.getBackground() instanceof ColorDrawable)) {
            return;
        }
        this.d.setBackgroundColor(i < 0 ? this.l : this.k);
        boolean z = this.j;
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.g;
        boolean z2 = false;
        if (z && i >= 0) {
            z2 = true;
        }
        mainCollapsingToolbarLayout.l(z2);
    }

    public final void b(fsa fsaVar, ActionBarColor actionBarColor, int i, ActionBarColor actionBarColor2, int i2, ActionBarColor actionBarColor3, boolean z) {
        fsaVar.getClass();
        int c = c(fsaVar.d);
        if (c == zhn.d(this.e.b(), R.attr.ytIconActiveOther)) {
            c = zhn.d(this.e.b(), R.attr.ytTextPrimary);
        }
        fsa fsaVar2 = this.c;
        if (fsaVar2 == null || fsaVar2.e != fsaVar.e) {
            e(fsaVar.e, c);
        }
        fsa fsaVar3 = this.c;
        if (fsaVar3 == null || fsaVar3.d != fsaVar.d) {
            e(fsaVar.e, c);
            this.b.d(c);
            yzh yzhVar = (yzh) this.h.get();
            Toolbar toolbar = this.d;
            toolbar.q(yzhVar.b(toolbar.e(), c));
            Drawable drawable = this.e.b().getResources().getDrawable(2131233447);
            Toolbar toolbar2 = this.d;
            Drawable b = yzhVar.b(drawable, c);
            toolbar2.j();
            ActionMenuView actionMenuView = toolbar2.a;
            actionMenuView.d();
            tq tqVar = actionMenuView.c;
            tn tnVar = tqVar.g;
            if (tnVar != null) {
                tnVar.setImageDrawable(b);
            } else {
                tqVar.i = true;
                tqVar.h = b;
            }
        }
        this.b.c(fsaVar.c);
        this.c = fsaVar;
        this.j = z;
        if (!this.i.t()) {
            this.d.setBackground(null);
            this.k = 0;
            this.l = 0;
        } else {
            int c2 = c(actionBarColor);
            this.d.setBackgroundColor(c2);
            this.k = c2;
            this.l = c2 | (-16777216);
        }
        fsa fsaVar4 = this.c;
        View view = fsaVar4.b;
        int i3 = 16;
        if (view != null) {
            if (this.e.d() != view || view.getParent() == null) {
                this.e.h(view, new nh(-1, -1));
            }
        } else {
            this.e.p(fsaVar4.a);
            this.g.k(this.c.a);
            i3 = 8;
        }
        this.e.k(i3, 24);
        this.d.x(this.a, i);
        if (c(actionBarColor2) != 0) {
            this.d.y(c(actionBarColor2));
        }
        this.d.u(this.a, i2);
        if (c(actionBarColor3) != 0) {
            this.d.v(ColorStateList.valueOf(c(actionBarColor3)));
        }
    }

    private final void e(int i, int i2) {
        if (i == 0) {
            this.d.q(null);
            this.d.m(this.f.getDimensionPixelSize(R.dimen.keyline_margin_inset_start), 0);
            d(this.a.getResources().getDimensionPixelSize(R.dimen.toolbar_padding_home_action_none));
        } else if (i != 1) {
        } else {
            Drawable a = akf.a(this.e.b(), 2131233316);
            a.mutate().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            this.d.q(a);
            this.d.o(R.string.abc_action_bar_up_description);
            if (eog.aR(this.m)) {
                Toolbar toolbar = this.d;
                if (toolbar.m != 0) {
                    toolbar.m = 0;
                    if (toolbar.e() != null) {
                        toolbar.requestLayout();
                    }
                }
            } else {
                this.d.m(this.f.getDimensionPixelSize(R.dimen.keyline_content_inset_start), 0);
            }
            d(this.a.getResources().getDimensionPixelSize(R.dimen.toolbar_padding_home_action_up));
        }
    }
}
