package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.function.IntConsumer;
/* compiled from: PG */
/* renamed from: kno  reason: default package */
/* loaded from: classes3.dex */
public final class kno implements ajru {
    public final aafo a;
    public final Runnable b;
    public final Context c;
    public final knx d;
    public final yve e;
    public acti f;
    public int h;
    public kbd j;
    public final aacz k;
    private final ajxz l;
    private final ajmy m;
    private View n = null;
    public avch g = null;
    public aypg i = null;

    public kno(Context context, aafo aafoVar, ajxz ajxzVar, ajmy ajmyVar, aacz aaczVar, knx knxVar, yve yveVar, Runnable runnable) {
        this.c = context;
        this.a = aafoVar;
        this.l = ajxzVar;
        this.m = ajmyVar;
        this.k = aaczVar;
        this.b = runnable;
        this.d = knxVar;
        this.e = yveVar;
    }

    private final void h() {
        if (this.n != null) {
            return;
        }
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.suggested_action, (ViewGroup) null);
        this.n = inflate;
        this.d.e = inflate;
        asxj asxjVar = this.k.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (!asxjVar.ba) {
            return;
        }
        View view = this.n;
        view.getClass();
        final TextView textView = (TextView) view.findViewById(R.id.action_text);
        zhn.l(this.c, R.attr.ytTextAppearanceBody1b).ifPresent(new IntConsumer() { // from class: knm
            @Override // j$.util.function.IntConsumer
            public final void accept(int i) {
                kno knoVar = kno.this;
                TextView textView2 = textView;
                kz.s(textView2, i);
                textView2.setTextColor(zhn.d(knoVar.c, R.attr.ytOverlayTextPrimary));
            }

            @Override // j$.util.function.IntConsumer
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return intConsumer.getClass();
            }
        });
        textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_text_to_dismiss_padding_end), textView.getPaddingBottom());
        kw.h((ImageView) view.findViewById(R.id.action_dismiss), zhn.f(this.c, R.attr.ytOverlayTextSecondary));
        ImageView imageView = (ImageView) view.findViewById(R.id.action_image);
        imageView.setPaddingRelative(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_new_icon_padding_start), imageView.getPaddingTop(), imageView.getPaddingEnd(), imageView.getPaddingBottom());
    }

    @Override // defpackage.ajru
    public final View a() {
        h();
        View view = this.n;
        view.getClass();
        return view;
    }

    public final aoob d() {
        avch avchVar = (avch) a().getTag();
        if (avchVar != null) {
            return avchVar.h;
        }
        return null;
    }

    @Override // defpackage.ajru
    /* renamed from: f */
    public final void oK(ajrs ajrsVar, final avch avchVar) {
        zfx b;
        int aH;
        this.g = avchVar;
        h();
        this.f = ajrsVar.a;
        arag aragVar = avchVar.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar);
        final View view = this.n;
        view.getClass();
        ((TextView) view.findViewById(R.id.action_text)).setText(b2);
        ImageView imageView = (ImageView) view.findViewById(R.id.action_image);
        int i = avchVar.c;
        if (i == 2) {
            ajxz ajxzVar = this.l;
            arhr b3 = arhr.b(((arhs) avchVar.d).c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b3);
            if (a != 0) {
                imageView.setImageDrawable(akf.a(this.c, a));
            } else {
                imageView.setImageDrawable(null);
            }
        } else if (i != 13) {
            imageView.setImageDrawable(null);
        } else {
            this.m.h(imageView, (avhn) avchVar.d);
        }
        View findViewById = view.findViewById(R.id.touch_area_action);
        final apzg apzgVar = avchVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: kni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                aoob d;
                int aG;
                int aG2;
                kno knoVar = kno.this;
                knoVar.a.c(apzgVar, null);
                avch avchVar2 = knoVar.g;
                if (avchVar2 != null && (((aG = awwc.aG(avchVar2.j)) == 0 || aG != 2) && (aG2 = awwc.aG(knoVar.g.j)) != 0 && aG2 != 1)) {
                    knoVar.b.run();
                }
                kbd kbdVar = knoVar.j;
                if (kbdVar != null) {
                    kbdVar.g();
                }
                acti actiVar = knoVar.f;
                if (actiVar == null || (d = knoVar.d()) == null) {
                    return;
                }
                actiVar.H(3, new acte(d), null);
            }
        });
        lj.M(findViewById, new knn(b2));
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.action_dismiss);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: knj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kno knoVar = kno.this;
                avcj avcjVar = avchVar.g;
                if (avcjVar == null) {
                    avcjVar = avcj.a;
                }
                if (avcjVar.qn(avcg.b)) {
                    ylx.m(knoVar.e.b(jvb.q), jou.n);
                }
                knoVar.b.run();
                acti actiVar = knoVar.f;
                if (actiVar == null) {
                    return;
                }
                actiVar.H(3, new acte(actj.SUGGESTED_ACTION_DISMISS_BUTTON), null);
            }
        });
        view.post(new Runnable() { // from class: knl
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = imageView2;
                View view3 = view;
                Rect rect = new Rect();
                view2.getHitRect(rect);
                int i2 = -view2.getContext().getResources().getDimensionPixelSize(R.dimen.suggested_action_dismiss_touch_delegate);
                rect.inset(i2, i2);
                view3.setTouchDelegate(new TouchDelegate(rect, view2));
            }
        });
        view.setTag(avchVar);
        if ((avchVar.b & 256) == 0 || (aH = awwc.aH(avchVar.i)) == 0 || aH != 3) {
            b = zgd.b(zgd.g(81), zgd.r(-2), zgd.h(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_height)), zgd.l(0));
        } else {
            b = zgd.b(zgd.g(8388691), zgd.r(-2), zgd.h(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_height)), zgd.l(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_left_aligned_start_margin)));
        }
        zgd.t(view, b, FrameLayout.LayoutParams.class);
        g(avchVar);
        acti actiVar = this.f;
        if (actiVar == null) {
            return;
        }
        actiVar.D(new acte(actj.SUGGESTED_ACTION_DISMISS_BUTTON));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }

    public final void g(avch avchVar) {
        int dimensionPixelSize;
        int aH;
        if (avchVar == null) {
            return;
        }
        if ((avchVar.b & 256) == 0 || (aH = awwc.aH(avchVar.i)) == 0 || aH != 3) {
            dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_center_aligned_default_bottom_margin);
        } else {
            dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_left_aligned_default_bottom_margin);
        }
        asxj asxjVar = this.k.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (!asxjVar.bd) {
            View view = this.n;
            view.getClass();
            zgd.t(view, zgd.e(dimensionPixelSize), FrameLayout.LayoutParams.class);
            return;
        }
        knx knxVar = this.d;
        int i = dimensionPixelSize + this.h;
        if (!knxVar.a || knxVar.f == i) {
            return;
        }
        knxVar.f = i;
        ValueAnimator valueAnimator = knxVar.c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            knxVar.c(i);
            return;
        }
        knxVar.c.cancel();
        knxVar.c.start();
    }
}
