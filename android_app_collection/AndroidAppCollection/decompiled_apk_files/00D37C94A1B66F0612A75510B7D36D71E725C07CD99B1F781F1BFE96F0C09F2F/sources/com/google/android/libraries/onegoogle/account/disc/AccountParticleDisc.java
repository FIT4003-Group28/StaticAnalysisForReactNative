package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.youtube.R;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticleDisc extends FrameLayout {
    public final RoundBorderImageView a;
    public final CopyOnWriteArrayList b;
    public final ukq c;
    public uku d;
    public boolean e;
    public ujx f;
    public Object g;
    public ampq h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final int l;
    private int m;
    private int n;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    private final void h() {
        int dimension = (this.e || this.i) ? (int) getResources().getDimension(R.dimen.og_apd_min_padding) : 0;
        this.m = dimension;
        this.a.setPadding(dimension, dimension, dimension, dimension);
        this.a.a();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = this.n;
        layoutParams.height = this.n;
    }

    public final int a() {
        int i = this.n;
        int i2 = this.m;
        return i - (i2 + i2);
    }

    public final String b() {
        String str = this.h.h() ? ((ukp) this.h.c()).a : null;
        return str != null ? str : "";
    }

    public final void c(ujw ujwVar) {
        this.b.add(ujwVar);
    }

    public final void d(ujw ujwVar) {
        this.b.remove(ujwVar);
    }

    public final void e() {
        RoundBorderImageView roundBorderImageView = this.a;
        roundBorderImageView.setImageDrawable(udy.b(roundBorderImageView.getContext(), R.drawable.disc_oval, this.l));
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g(ujx ujxVar, zgd zgdVar) {
        ujxVar.getClass();
        this.f = ujxVar;
        if (this.j) {
            int i = this.k - this.n;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int max = Math.max(0, ((i - paddingLeft) - paddingRight) / 2);
            int max2 = Math.max(0, ((i - paddingTop) - paddingBottom) / 2);
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        h();
        umr.b(new Runnable() { // from class: uju
            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                ukq ukqVar = accountParticleDisc.c;
                ukl uklVar = new ukl(new ukn(accountParticleDisc.getResources()));
                uwp.f();
                ukqVar.a.add(uklVar);
                ukqVar.a(uklVar, ukqVar.b);
            }
        });
        this.a.requestLayout();
        if (this.e) {
            this.d = new uku((RingView) findViewById(R.id.og_apd_ring_view), a(), this.n);
        }
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new CopyOnWriteArrayList();
        this.c = new ukq(new usg(), null);
        this.h = amon.a;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        RoundBorderImageView roundBorderImageView = (RoundBorderImageView) findViewById(R.id.og_apd_internal_image_view);
        this.a = roundBorderImageView;
        new uks(getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uko.a, i, 2132083257);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            this.n = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.n = obtainStyledAttributes.getDimensionPixelSize(8, getResources().getDimensionPixelSize(R.dimen.og_apd_default_max_disc_content_size));
            }
            this.i = obtainStyledAttributes.getBoolean(0, true);
            this.e = obtainStyledAttributes.getBoolean(1, false);
            this.j = obtainStyledAttributes.getBoolean(7, false);
            this.k = obtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            int color = obtainStyledAttributes.getColor(2, 0);
            roundBorderImageView.c = color;
            roundBorderImageView.a.setColor(color);
            roundBorderImageView.a.setAlpha(30);
            this.l = obtainStyledAttributes.getColor(6, getResources().getColor(R.color.og_default_disc_placeholder_color_light));
            obtainStyledAttributes.getColor(4, getResources().getColor(R.color.og_background_light));
            obtainStyledAttributes.recycle();
            e();
            h();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
