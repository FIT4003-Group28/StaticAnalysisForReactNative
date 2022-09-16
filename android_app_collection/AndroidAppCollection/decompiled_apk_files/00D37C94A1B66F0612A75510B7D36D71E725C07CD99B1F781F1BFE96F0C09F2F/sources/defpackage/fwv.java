package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fwv  reason: default package */
/* loaded from: classes3.dex */
public final class fwv implements fxc {
    public LinearLayout a;
    private final Context b;
    private FrameLayout d;
    private TextView e;
    private ImageView f;
    private AlphaAnimation h;
    private TranslateAnimation i;
    private TranslateAnimation j;
    private AnimationSet k;
    private AnimationSet l;
    private ValueAnimator m;
    private fxb n;
    private final ajxz o;
    private FrameLayout p;
    private Resources.Theme q;
    private final aacz r;
    private boolean g = false;
    private final fwt c = new fwt();

    public fwv(Context context, ajxz ajxzVar, aacz aaczVar) {
        this.b = context;
        this.o = ajxzVar;
        this.r = aaczVar;
    }

    private final void i() {
        this.p.addView(this.d);
        FrameLayout frameLayout = (FrameLayout) this.p.findViewById(R.id.bar_wrapper);
        this.d = frameLayout;
        this.a = (LinearLayout) frameLayout.findViewById(R.id.bar_layout);
        this.e = (TextView) this.d.findViewById(R.id.bar_text);
        this.f = (ImageView) this.d.findViewById(R.id.bar_icon);
    }

    @Override // defpackage.fxc
    public final ampq a() {
        return b().h() ? ampq.i(this.a) : amon.a;
    }

    @Override // defpackage.fxc
    public final ampq b() {
        return ampq.i(this.n);
    }

    @Override // defpackage.fxc
    public final ampq c() {
        return b().h() ? ampq.i(this.d) : amon.a;
    }

    @Override // defpackage.fxc
    public final void d(boolean z) {
        if (this.p == null || this.d == null) {
            return;
        }
        if (z) {
            if (this.c.b) {
                this.j.cancel();
            }
            if (this.c.a) {
                this.i.cancel();
            }
            this.a.startAnimation(this.j);
            return;
        }
        this.a.setVisibility(8);
    }

    @Override // defpackage.fxc
    public final void e(FrameLayout frameLayout) {
        f();
        this.p = frameLayout;
        if (this.d != null) {
            i();
        }
    }

    @Override // defpackage.fxc
    public final void f() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.p;
        if (frameLayout2 != null && (frameLayout = this.d) != null) {
            frameLayout2.removeView(frameLayout);
        }
        this.n = null;
        this.p = null;
        this.c.a();
    }

    @Override // defpackage.fxc
    public final void g(fxb fxbVar, boolean z) {
        if (this.p != null) {
            if (this.d == null) {
                this.d = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.bar, (ViewGroup) this.p, false);
                i();
                LinearLayout linearLayout = this.a;
                zag.k(linearLayout, linearLayout.getBackground());
            }
            this.q = this.p.getContext().getTheme();
            if (!this.g) {
                this.h = (AlphaAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_text_fade_in);
                this.i = (TranslateAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_entry_translation);
                this.j = (TranslateAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_exit_translation);
                this.k = (AnimationSet) AnimationUtils.loadAnimation(this.b, R.anim.bar_icon_entry);
                this.l = (AnimationSet) AnimationUtils.loadAnimation(this.b, R.anim.bar_icon_remind_rotation);
                ValueAnimator ofInt = ValueAnimator.ofInt(51, 0);
                this.m = ofInt;
                ofInt.setDuration(this.b.getResources().getInteger(R.integer.bar_color_pulse_duration));
                this.m.setStartDelay(this.b.getResources().getInteger(R.integer.bar_color_pulse_offset));
                if (Build.VERSION.SDK_INT >= 22) {
                    app appVar = new app();
                    this.h.setInterpolator(appVar);
                    this.i.setInterpolator(appVar);
                    this.j.setInterpolator(appVar);
                    this.k.setInterpolator(appVar);
                    this.l.setInterpolator(appVar);
                    this.m.setInterpolator(appVar);
                }
                fwt fwtVar = this.c;
                TranslateAnimation translateAnimation = this.i;
                TranslateAnimation translateAnimation2 = this.j;
                LinearLayout linearLayout2 = this.a;
                fwtVar.a();
                translateAnimation.setAnimationListener(new fwr(fwtVar));
                translateAnimation2.setAnimationListener(new fws(fwtVar, linearLayout2));
            }
            if (!this.g) {
                final int orElse = zhn.j(this.p.getContext(), R.attr.ytFilledButtonText).orElse(0);
                this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fwu
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        fwv fwvVar = fwv.this;
                        int i = orElse;
                        LinearLayout linearLayout3 = fwvVar.a;
                        if (linearLayout3 != null) {
                            linearLayout3.getBackground().setColorFilter(zdb.d(i, ((Integer) valueAnimator.getAnimatedValue()).intValue()), PorterDuff.Mode.SRC_ATOP);
                        }
                    }
                });
            }
            this.g = true;
            if (fxbVar != this.n) {
                this.n = fxbVar;
                this.e.setText(fxbVar.a);
                int a = this.o.a(fxbVar.b);
                if (a == 0) {
                    a = this.o.a(arhr.REFRESH);
                }
                this.f.setImageDrawable(this.b.getResources().getDrawable(a));
                int i = fxbVar.i;
                TypedValue typedValue = new TypedValue();
                this.b.getTheme().resolveAttribute(i == 2 ? R.attr.ytTextAppearanceButton : R.attr.ytTextAppearanceTitle1, typedValue, true);
                kz.s(this.e, typedValue.data);
                int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(fxbVar.i == 2 ? R.dimen.bar_between_icon_and_text_padding_prominent : R.dimen.bar_between_icon_and_text_padding_default);
                TextView textView = this.e;
                textView.setPaddingRelative(dimensionPixelSize, textView.getPaddingTop(), this.e.getPaddingEnd(), this.e.getPaddingBottom());
                Context context = this.b;
                TextView textView2 = this.e;
                ImageView imageView = this.f;
                LinearLayout linearLayout3 = this.a;
                int d = zhn.d(context, R.attr.ytFilledButtonText);
                int d2 = zhn.d(this.b, R.attr.ytFilledButtonText);
                int d3 = zhn.d(this.b, R.attr.ytThemedBlue);
                if (b().h()) {
                    avgj avgjVar = ((fxb) b().c()).f;
                    avgg b = avgg.b(avgjVar.c);
                    if (b == null) {
                        b = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a2 = akeq.a(context, b, d);
                    avgg b2 = avgg.b(avgjVar.e);
                    if (b2 == null) {
                        b2 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a3 = akeq.a(context, b2, d3);
                    avgg b3 = avgg.b(avgjVar.d);
                    if (b3 == null) {
                        b3 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a4 = akeq.a(context, b3, d2);
                    if (textView2 != null) {
                        textView2.setTextColor(a2);
                    }
                    if (linearLayout3 != null) {
                        linearLayout3.setBackgroundTintList(ColorStateList.valueOf(a3));
                    }
                    if (imageView != null) {
                        imageView.setImageTintList(ColorStateList.valueOf(a4));
                    }
                }
                int i2 = fxbVar.g;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 != 5) {
                    FrameLayout frameLayout = this.d;
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), (int) this.b.getResources().getDimension(R.dimen.bar_shadow_height));
                } else {
                    FrameLayout frameLayout2 = this.d;
                    frameLayout2.setPadding(frameLayout2.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), 0);
                }
                int i4 = fxbVar.i;
                int dimension = (int) this.b.getResources().getDimension(R.dimen.bar_height);
                if (i4 == 2) {
                    dimension = (int) this.b.getResources().getDimension(R.dimen.bar_height_prominent);
                }
                this.a.getLayoutParams().height = dimension;
            }
            if (eog.ay(this.r)) {
                this.d.setElevation(8.0f);
            }
            this.d.bringToFront();
            this.a.setVisibility(0);
            if (!z || this.c.a) {
                return;
            }
            this.a.startAnimation(this.i);
            this.e.startAnimation(this.h);
            this.f.startAnimation(this.k);
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }

    @Override // defpackage.fxc
    public final boolean h() {
        LinearLayout linearLayout = this.a;
        return linearLayout != null && (linearLayout.getVisibility() == 0 || this.c.a);
    }
}
