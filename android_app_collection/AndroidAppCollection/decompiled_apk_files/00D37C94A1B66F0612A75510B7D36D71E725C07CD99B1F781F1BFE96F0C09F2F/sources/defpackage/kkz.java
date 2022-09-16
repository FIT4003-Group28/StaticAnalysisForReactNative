package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kkz  reason: default package */
/* loaded from: classes3.dex */
public final class kkz extends aizc implements xft, fgd {
    public View A;
    public TextView B;
    public View C;
    public TextView D;
    public ezx E;
    public int F;
    public xfu G;
    public int H;
    public final Context a;
    public final ajmy b;
    public final int c;
    public final fjn d;
    public ImageView e;
    public ImageView f;
    public TextView g;
    public View h;
    public TextView i;
    public View j;
    public TextView k;
    public TextView l;
    public TextView m;
    public View n;
    public ViewGroup o;
    public int p;
    public int q;
    public CharSequence r;
    public TimeBar s;
    public aibt t;
    public View u;
    public fjm v;
    public aoyl w;
    public maf x;
    public View y;
    public float z;

    public kkz(Context context, ajmy ajmyVar, int i, fjn fjnVar) {
        super(context);
        this.H = 1;
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.c = i;
        this.d = fjnVar;
    }

    public static final void i(TextView textView) {
        if (textView != null) {
            textView.setVisibility(true != TextUtils.isEmpty(textView.getText()) ? 0 : 8);
        }
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void d(apbc apbcVar) {
        avks avksVar;
        ViewGroup viewGroup;
        avkt avktVar;
        if (this.y != null && (apbcVar.b & 2) != 0) {
            apbe apbeVar = apbcVar.d;
            if (apbeVar == null) {
                apbeVar = apbe.a;
            }
            if (apbeVar.b == 1) {
                apbe apbeVar2 = apbcVar.d;
                if (apbeVar2 == null) {
                    apbeVar2 = apbe.a;
                }
                if (apbeVar2.b == 1) {
                    avktVar = (avkt) apbeVar2.c;
                } else {
                    avktVar = avkt.a;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setStartOffset(avktVar.c);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(avktVar.b);
                TranslateAnimation translateAnimation = new TranslateAnimation((this.o.getWidth() / 2) * avktVar.d, 0.0f, (this.o.getHeight() / 2) * avktVar.e, 0.0f);
                translateAnimation.setStartOffset(avktVar.c);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration(avktVar.b);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                this.y.startAnimation(animationSet);
            }
        }
        apbd apbdVar = apbcVar.c;
        if (apbdVar == null) {
            apbdVar = apbd.a;
        }
        if (apbdVar.b == 1) {
            apbd apbdVar2 = apbcVar.c;
            if (apbdVar2 == null) {
                apbdVar2 = apbd.a;
            }
            if (apbdVar2.b == 1) {
                avksVar = (avks) apbdVar2.c;
            } else {
                avksVar = avks.a;
            }
            int width = this.o.getWidth();
            int height = this.o.getHeight();
            float max = Math.max(width, height + height) / 2;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.o, Math.round(viewGroup.getWidth() * avksVar.c), Math.round(this.o.getHeight() * avksVar.d), 0.01f * max, max + max);
            createCircularReveal.setDuration(avksVar.b);
            createCircularReveal.start();
        }
    }

    @Override // defpackage.xft
    public final void e() {
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.g.setClickable(false);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.B.setVisibility(8);
            this.t.l();
            this.s.y(this.t);
            this.e.setClickable(false);
            this.A.setClickable(false);
            this.u.setBackgroundColor(this.F);
        }
        fjm fjmVar = this.v;
        if (fjmVar != null) {
            fjmVar.d();
        }
        maf mafVar = this.x;
        if (mafVar != null) {
            mafVar.a();
        }
        this.p = 0;
        this.q = 0;
        this.r = null;
        setVisibility(8);
    }

    @Override // defpackage.xft
    public final void f(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xft
    public final void g(long j, long j2) {
        if (this.o == null) {
            return;
        }
        long j3 = (int) j2;
        this.t.n((int) (j2 - j), 0L, j3, j3);
        this.s.y(this.t);
        this.l.setText(this.o.getResources().getString(R.string.ad_normal, " · ", zgh.i((int) Math.ceil(((float) j) / 1000.0f))));
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        this.E = ezxVar;
        if (ezxVar.k()) {
            if (this.o == null) {
                return;
            }
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.m.setVisibility(8);
            this.B.setVisibility(8);
            this.n.setVisibility(8);
            this.u.setClickable(false);
            if (this.w != null) {
                this.v.d();
            }
            maf mafVar = this.x;
            if (mafVar == null) {
                return;
            }
            mafVar.a();
        } else if (this.o == null) {
        } else {
            i(this.g);
            i(this.m);
            i(this.B);
            zag.o(this.n, true);
            this.u.setClickable(true);
            aoyl aoylVar = this.w;
            if (aoylVar == null || this.x == null) {
                this.h.setVisibility(0);
                i(this.i);
            } else {
                this.v.a(aoylVar, null);
            }
            maf mafVar2 = this.x;
            if (mafVar2 == null) {
                return;
            }
            mafVar2.b(this.z, this.H);
        }
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar);
    }
}
