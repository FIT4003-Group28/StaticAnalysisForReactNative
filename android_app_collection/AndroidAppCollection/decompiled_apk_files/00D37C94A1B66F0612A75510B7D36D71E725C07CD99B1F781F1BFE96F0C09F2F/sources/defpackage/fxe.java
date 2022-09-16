package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fxe  reason: default package */
/* loaded from: classes3.dex */
public final class fxe implements fxc {
    public TextView a;
    private final Context b;
    private final ajxz c;
    private Animation d;
    private Animation e;
    private fxb f;
    private FrameLayout h;
    private FrameLayout i;
    private boolean j = false;
    private final fwt g = new fwt();

    public fxe(Context context, ajxz ajxzVar) {
        this.b = context;
        this.c = ajxzVar;
    }

    private final void i() {
        this.i.addView(this.h);
        FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.content_pill_layout);
        this.h = frameLayout;
        this.a = (TextView) frameLayout.findViewById(R.id.content_pill_text);
    }

    @Override // defpackage.fxc
    public final ampq a() {
        return b().h() ? ampq.i(this.a) : amon.a;
    }

    @Override // defpackage.fxc
    public final ampq b() {
        return ampq.i(this.f);
    }

    @Override // defpackage.fxc
    public final ampq c() {
        return b().h() ? ampq.i(this.h) : amon.a;
    }

    @Override // defpackage.fxc
    public final void d(boolean z) {
        TextView textView = this.a;
        if (textView == null || this.i == null) {
            return;
        }
        if (!z) {
            textView.setVisibility(8);
            return;
        }
        fwt fwtVar = this.g;
        if (fwtVar.b) {
            return;
        }
        if (fwtVar.a) {
            this.e.cancel();
        }
        this.a.startAnimation(this.d);
    }

    @Override // defpackage.fxc
    public final void e(FrameLayout frameLayout) {
        f();
        this.i = frameLayout;
        if (this.h != null) {
            i();
        }
    }

    @Override // defpackage.fxc
    public final void f() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null && (frameLayout = this.h) != null) {
            frameLayout2.removeView(frameLayout);
        }
        this.f = null;
        this.i = null;
        this.g.a();
    }

    @Override // defpackage.fxc
    public final void g(fxb fxbVar, boolean z) {
        if (this.i != null) {
            if (this.h == null) {
                this.h = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.content_pill, (ViewGroup) this.i, false);
                i();
            }
            if (!this.j) {
                this.e = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_in_translate_to_top);
                Animation loadAnimation = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_out);
                this.d = loadAnimation;
                loadAnimation.setAnimationListener(new fxd(this));
                this.j = true;
            }
            if (fxbVar != this.f) {
                this.f = fxbVar;
                this.a.setText(fxbVar.a);
                Drawable drawable = this.b.getResources().getDrawable(this.c.a(fxbVar.b));
                if (drawable != null) {
                    kz.u(this.a, drawable, null, null);
                }
                Context context = this.b;
                TextView textView = this.a;
                int color = context.getResources().getColor(R.color.yt_white1);
                int color2 = this.b.getResources().getColor(R.color.yt_white1);
                int color3 = this.b.getResources().getColor(R.color.content_pill_color);
                if (b().h()) {
                    avgj avgjVar = ((fxb) b().c()).f;
                    avgg b = avgg.b(avgjVar.c);
                    if (b == null) {
                        b = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a = akeq.a(context, b, color);
                    avgg b2 = avgg.b(avgjVar.e);
                    if (b2 == null) {
                        b2 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a2 = akeq.a(context, b2, color3);
                    avgg b3 = avgg.b(avgjVar.d);
                    if (b3 == null) {
                        b3 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a3 = akeq.a(context, b3, color2);
                    if (textView != null) {
                        textView.setTextColor(a);
                    }
                    if (textView != null) {
                        textView.setBackgroundTintList(ColorStateList.valueOf(a2));
                    }
                    if (drawable != null) {
                        drawable.setTint(a3);
                    }
                }
            }
            this.h.bringToFront();
            this.a.setVisibility(0);
            if (!z) {
                return;
            }
            fwt fwtVar = this.g;
            if (fwtVar.a) {
                return;
            }
            if (fwtVar.b) {
                this.d.cancel();
            }
            this.a.startAnimation(this.e);
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }

    @Override // defpackage.fxc
    public final boolean h() {
        TextView textView = this.a;
        return textView != null && (textView.getVisibility() == 0 || this.g.a);
    }
}
