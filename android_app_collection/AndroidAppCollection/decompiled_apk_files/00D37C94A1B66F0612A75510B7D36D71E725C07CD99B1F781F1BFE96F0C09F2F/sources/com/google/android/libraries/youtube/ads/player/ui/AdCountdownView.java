package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdCountdownView extends LinearLayout implements View.OnClickListener {
    public xhx a;
    public xhw b;
    public xhn c;
    public ImageView d;
    public boolean e;
    public boolean f;
    public boolean g;
    public xdb h;
    public int i;
    public int j;
    public int k;
    public int l;
    private CharSequence m;
    private CharSequence n;

    public AdCountdownView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        LayoutInflater.from(getContext()).inflate(R.layout.ad_countdown, (ViewGroup) this, true);
        setOrientation(0);
        this.f = true;
        Resources resources = getResources();
        ImageView imageView = (ImageView) findViewById(R.id.content_thumbnail);
        this.d = imageView;
        imageView.setOnClickListener(this);
        this.c = new xhn(getContext(), resources, (ImageView) findViewById(R.id.countdown_background), (AdCountdownTextView) findViewById(R.id.countdown_text), getAlpha());
        this.a = new xhx(this, getBackground(), getAlpha());
        a();
        this.i = resources.getDimensionPixelSize(R.dimen.skip_button_default_bottom_margin);
        this.j = resources.getDimensionPixelSize(R.dimen.skip_button_cta_bottom_margin);
        this.k = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getText(R.string.video_after_ad_mulitline);
        this.n = resources.getText(R.string.video_after_ads_mulitline);
    }

    public final void a() {
        b(false);
        xhn xhnVar = this.c;
        ajgo e = ajgo.e(xhnVar.n);
        if (e != null) {
            xhnVar.c.setTypeface(e.d(xhnVar.a, 0), 0);
        }
        xhv xhvVar = xhnVar.d;
        xhvVar.b = null;
        xhvVar.d(5);
        xhnVar.c.setClickable(true);
        xhnVar.c.setAlpha(1.0f);
        AdCountdownTextView adCountdownTextView = xhnVar.c;
        adCountdownTextView.setPadding(xhnVar.j, adCountdownTextView.getPaddingTop(), xhnVar.k, xhnVar.c.getPaddingBottom());
        zgd.v(xhnVar.b, xhnVar.l, xhnVar.m);
        zgd.v(xhnVar.c, -2, xhnVar.m);
        xhw xhwVar = xhnVar.p;
        if (xhwVar != null) {
            xhwVar.b();
        }
        this.f = true;
        xhw xhwVar2 = this.b;
        if (xhwVar2 != null) {
            xhwVar2.b();
        }
        int i = this.l;
        int i2 = this.k;
        this.d.getLayoutParams().width = i;
        this.d.getLayoutParams().height = i2;
    }

    public final void b(boolean z) {
        this.e = z;
        CharSequence charSequence = this.m;
        if (charSequence == null) {
            return;
        }
        if (z || this.h == xdb.POST_ROLL) {
            charSequence = "";
        } else if (this.g) {
            charSequence = this.n;
        }
        xhv xhvVar = this.c.d;
        xhvVar.a = charSequence;
        xhvVar.a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e || !this.f) {
            return;
        }
        this.c.a();
        xhn xhnVar = this.c;
        xhnVar.c.setClickable(true);
        ln q = lj.q(xhnVar.c);
        q.c(1.0f);
        q.d(xhnVar.o);
        q.g(0L);
        q.f(new xhm(xhnVar));
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.c.a();
        if (this.e || !this.f || i != 0) {
            return;
        }
        this.c.b();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }
}
