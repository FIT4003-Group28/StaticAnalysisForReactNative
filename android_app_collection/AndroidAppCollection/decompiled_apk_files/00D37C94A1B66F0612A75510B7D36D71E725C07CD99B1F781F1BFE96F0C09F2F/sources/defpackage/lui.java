package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lui  reason: default package */
/* loaded from: classes3.dex */
public final class lui implements lvl {
    public final aafo a;
    public String b;
    public int c;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final Context l;
    private AnimationSet n;
    private final Interpolator m = kt.o(0.05f, 0.0f, 0.0f, 1.0f);
    private boolean o = false;

    public lui(Context context, aacz aaczVar, aafo aafoVar) {
        this.l = context;
        asxj asxjVar = aaczVar.b().e;
        this.e = (asxjVar == null ? asxj.a : asxjVar).B;
        asxj asxjVar2 = aaczVar.b().e;
        this.f = (asxjVar2 == null ? asxj.a : asxjVar2).C;
        this.g = eog.aW(aaczVar);
        asxj asxjVar3 = aaczVar.b().e;
        this.i = (asxjVar3 == null ? asxj.a : asxjVar3).Y;
        asxj asxjVar4 = aaczVar.b().e;
        this.j = (asxjVar4 == null ? asxj.a : asxjVar4).Z;
        this.h = eog.aX(aaczVar);
        this.k = eog.ag(aaczVar).h() ? (String) eog.ag(aaczVar).c() : "default";
        this.a = aafoVar;
    }

    private final InsetDrawable g() {
        PaintDrawable paintDrawable = new PaintDrawable(zhn.j(this.l, R.attr.ytBadgeChipBackground).orElse(0));
        paintDrawable.setCornerRadius(zew.i(this.l.getResources().getDisplayMetrics(), 2));
        return new InsetDrawable((Drawable) paintDrawable, this.l.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_start), zew.i(this.l.getResources().getDisplayMetrics(), 8), this.l.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_end), zew.i(this.l.getResources().getDisplayMetrics(), 8));
    }

    private final InsetDrawable h() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(zhn.j(this.l, R.attr.ytBadgeChipBackground).orElse(0));
        return new InsetDrawable((Drawable) shapeDrawable, zew.i(this.l.getResources().getDisplayMetrics(), 8));
    }

    private final void j(View view, apzg apzgVar) {
        view.setOnClickListener(new luh(this, apzgVar));
    }

    private final void k(ImageView imageView, boolean z, boolean z2) {
        if (z2) {
            imageView.setImageDrawable(akf.a(this.l, 2131233295));
        } else if (z) {
            imageView.setImageDrawable(zhn.g(this.l, R.attr.ytPremiumWordmarkHeader));
        } else {
            imageView.setImageDrawable(zhn.g(this.l, R.attr.ytWordmarkHeader));
        }
    }

    @Override // defpackage.lvl
    public final View a(LayoutInflater layoutInflater) {
        if (this.e) {
            View inflate = layoutInflater.inflate(R.layout.action_bar_search_results_view_mic, (ViewGroup) null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(g());
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.voice_search);
            appCompatImageView.setBackgroundDrawable(h());
            i(appCompatImageView);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.action_bar_search_results_view_grey, (ViewGroup) null);
        inflate2.setBackgroundDrawable(g());
        return inflate2;
    }

    @Override // defpackage.lvl
    public final View b(LayoutInflater layoutInflater) {
        if (!this.g) {
            return layoutInflater.inflate(R.layout.action_bar_ringo, (ViewGroup) null);
        }
        if (!zew.y(this.l) || !this.h) {
            return layoutInflater.inflate(R.layout.action_bar_ringo_background, (ViewGroup) null);
        }
        return layoutInflater.inflate(R.layout.action_bar_ringo_background_static, (ViewGroup) null);
    }

    @Override // defpackage.lvl
    public final View c(LayoutInflater layoutInflater) {
        if (this.f) {
            View inflate = layoutInflater.inflate(R.layout.action_bar_search_view_mic_out, (ViewGroup) null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(g());
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.voice_search);
            appCompatImageView.setBackgroundDrawable(h());
            i(appCompatImageView);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.action_bar_search_view_grey, (ViewGroup) null);
        inflate2.setBackgroundDrawable(g());
        i((AppCompatImageView) inflate2.findViewById(R.id.voice_search));
        return inflate2;
    }

    @Override // defpackage.lvl
    public final void d(View view) {
        if (!this.h || !this.o) {
            return;
        }
        zgd.t(view.findViewById(R.id.search_box), zgd.r(zew.l(this.l) / 2), br.class);
    }

    @Override // defpackage.lvl
    public final void e(View view, apzg apzgVar, boolean z, boolean z2) {
        if (!this.g) {
            return;
        }
        if (!zew.y(this.l) || !this.h) {
            TextView textView = (TextView) view.findViewById(R.id.search_box);
            ImageView imageView = (ImageView) view.findViewById(R.id.youtube_logo);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.youtube_text);
            j(textView, apzgVar);
            j((ImageView) view.findViewById(R.id.search_icon), apzgVar);
            textView.setBackgroundDrawable(g());
            if (!this.i) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.setMarginStart(0);
                textView.setLayoutParams(layoutParams);
                return;
            }
            if (this.j) {
                imageView.setImageDrawable(akf.a(this.l, 2131233295));
                if (z2) {
                    imageView2.setVisibility(8);
                } else if (z) {
                    imageView2.setImageDrawable(zhn.g(this.l, R.attr.ytPremiumWordmarkText));
                } else {
                    imageView2.setImageDrawable(zhn.g(this.l, R.attr.ytWordmarkText));
                }
            } else {
                imageView.setVisibility(8);
                k(imageView2, z, z2);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.setMarginStart(0);
                textView.setLayoutParams(layoutParams2);
            }
            imageView2.animate().alpha(0.0f).setStartDelay(1100L).setDuration(300L).setInterpolator(this.m).setListener(new lug(imageView2));
            if (this.n == null) {
                this.n = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                this.n.addAnimation(new ScaleAnimation(0.6f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
                this.n.addAnimation(alphaAnimation);
                this.n.setStartOffset(1100L);
                this.n.setDuration(400L);
                this.n.setInterpolator(this.m);
            }
            textView.startAnimation(this.n);
            return;
        }
        View findViewById = view.findViewById(R.id.search_box);
        findViewById.setBackgroundDrawable(g());
        j(findViewById, apzgVar);
        k((ImageView) view.findViewById(R.id.youtube_logo), z, z2);
        zgd.t(findViewById, zgd.r(zew.l(this.l) / 2), br.class);
    }

    @Override // defpackage.lvl
    public final void f(boolean z) {
        this.o = z;
    }

    @Override // defpackage.fsm
    public final void n(String str) {
        this.b = str;
    }

    @Override // defpackage.fsm
    public final void o() {
        this.c = 10349;
    }

    private final void i(AppCompatImageView appCompatImageView) {
        char c;
        String str = this.k;
        int hashCode = str.hashCode();
        if (hashCode == -791090288) {
            if (str.equals("pattern")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 109618859) {
            if (hashCode == 110330781 && str.equals("thick")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("solid")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            appCompatImageView.setImageResource(2131233248);
        } else if (c == 1) {
            appCompatImageView.setImageResource(2131233258);
        } else if (c == 2) {
            appCompatImageView.setImageResource(2131233427);
        } else {
            appCompatImageView.setImageResource(2131233437);
        }
    }
}
