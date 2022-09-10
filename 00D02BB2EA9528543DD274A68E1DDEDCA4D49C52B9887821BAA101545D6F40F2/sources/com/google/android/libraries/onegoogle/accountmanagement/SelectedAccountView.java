package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SelectedAccountView<AccountT> extends ConstraintLayout implements cvwq<AccountT> {
    private static final Property<ImageView, Float> n = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc<AccountT> c;
    public final ObjectAnimator d;
    public cvwp<AccountT> e;
    public boolean f;
    public dbsg<cvwn<AccountT>> g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;
    private final ImageView l;
    private final FrameLayout m;

    public SelectedAccountView(Context context) {
        this(context, null);
    }

    @Override // defpackage.cvwq
    public final AccountParticleDisc<AccountT> c() {
        return this.c;
    }

    @Override // defpackage.cvwq
    public final TextView d() {
        return this.h;
    }

    @Override // defpackage.cvwq
    public final TextView e() {
        return this.i;
    }

    @Override // defpackage.cvwq
    public final TextView f() {
        return this.j;
    }

    public final void g() {
        boolean z = false;
        if (!this.g.a() || (this.k.getVisibility() == 8 && this.l.getVisibility() == 8)) {
            z = true;
        }
        dbsk.m(z, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    public void setAccount(AccountT accountt) {
        dbsk.m(this.e != null, "Initialize must be called before setting an account.");
        this.e.a(accountt);
    }

    public void setChevronAnimationDuration(long j) {
        this.d.setDuration(j);
    }

    public void setChevronAnimationInterpolator(Interpolator interpolator) {
        this.d.setInterpolator(interpolator);
    }

    public void setChevronExpanded(boolean z) {
        this.f = z;
        this.k.setRotation(true != z ? 360.0f : 180.0f);
    }

    public void setCustomIconDrawable(int i) {
        this.l.setImageResource(i);
    }

    public void setTrailingDrawable(cvxk cvxkVar) {
        int i = 0;
        this.l.setVisibility(cvxkVar == cvxk.CUSTOM ? 0 : 8);
        this.k.setVisibility(cvxkVar == cvxk.CHEVRON ? 0 : 8);
        FrameLayout frameLayout = this.m;
        if (cvxkVar == cvxk.NONE) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        g();
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = dbpy.a;
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height));
        this.h = (TextView) findViewById(R.id.account_display_name);
        this.i = (TextView) findViewById(R.id.account_name);
        this.j = (TextView) findViewById(R.id.counter);
        this.c = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.k = imageView;
        this.d = ObjectAnimator.ofFloat(imageView, n, 360.0f, 180.0f);
        this.l = (ImageView) findViewById(R.id.og_custom_icon);
        this.m = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
    }
}
