package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: mlo  reason: default package */
/* loaded from: classes3.dex */
public final class mlo {
    public final mlk a;
    public final ViewSwitcher b;
    public final ViewSwitcher c;
    public final Handler d = new Handler();
    public final Runnable e = new Runnable() { // from class: mll
        @Override // java.lang.Runnable
        public final void run() {
            mlo mloVar = mlo.this;
            mloVar.h = true;
            if (mloVar.b.getDisplayedChild() == 1) {
                ViewSwitcher viewSwitcher = mloVar.b;
                mlk mlkVar = mloVar.a;
                viewSwitcher.setInAnimation(mlkVar.a(0.0f, 1.0f, mlkVar.c, R.interpolator.mtrl_fast_out_linear_in));
                mlk mlkVar2 = mloVar.a;
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.setStartOffset(250L);
                animationSet.addAnimation(mlkVar2.a(0.0f, 1.0f, mlkVar2.d, R.interpolator.mtrl_linear_out_slow_in));
                animationSet.addAnimation(mlkVar2.b(mlkVar2.b, 0, mlkVar2.d, R.interpolator.mtrl_linear_out_slow_in));
                mln mlnVar = mloVar.g;
                if (mlnVar != null) {
                    animationSet.setAnimationListener(new mlm(mlnVar, mloVar.i));
                }
                mloVar.c.setInAnimation(animationSet);
                ViewSwitcher viewSwitcher2 = mloVar.b;
                mlk mlkVar3 = mloVar.a;
                viewSwitcher2.setOutAnimation(mlkVar3.a(1.0f, 0.0f, mlkVar3.c, R.interpolator.mtrl_fast_out_linear_in));
                ViewSwitcher viewSwitcher3 = mloVar.c;
                mlk mlkVar4 = mloVar.a;
                AnimationSet animationSet2 = new AnimationSet(true);
                animationSet2.setStartOffset(50L);
                animationSet2.addAnimation(mlkVar4.a(1.0f, 0.0f, mlkVar4.d, R.interpolator.mtrl_fast_out_linear_in));
                animationSet2.addAnimation(mlkVar4.b(0, -mlkVar4.a, mlkVar4.d, R.interpolator.mtrl_fast_out_linear_in));
                viewSwitcher3.setOutAnimation(animationSet2);
            } else if (mloVar.b.getDisplayedChild() == 0) {
                ViewSwitcher viewSwitcher4 = mloVar.b;
                mlk mlkVar5 = mloVar.a;
                viewSwitcher4.setInAnimation(mlkVar5.a(0.0f, 1.0f, mlkVar5.c, R.interpolator.mtrl_fast_out_linear_in));
                mlk mlkVar6 = mloVar.a;
                AnimationSet animationSet3 = new AnimationSet(true);
                animationSet3.setStartOffset(200L);
                animationSet3.addAnimation(mlkVar6.a(0.0f, 1.0f, mlkVar6.d, R.interpolator.mtrl_linear_out_slow_in));
                animationSet3.addAnimation(mlkVar6.b(-mlkVar6.b, 0, mlkVar6.d, R.interpolator.mtrl_linear_out_slow_in));
                mln mlnVar2 = mloVar.g;
                if (mlnVar2 != null) {
                    animationSet3.setAnimationListener(new mlm(mlnVar2, mloVar.i));
                }
                mloVar.c.setInAnimation(animationSet3);
                ViewSwitcher viewSwitcher5 = mloVar.b;
                mlk mlkVar7 = mloVar.a;
                viewSwitcher5.setOutAnimation(mlkVar7.a(1.0f, 0.0f, mlkVar7.c, R.interpolator.mtrl_fast_out_linear_in));
                ViewSwitcher viewSwitcher6 = mloVar.c;
                mlk mlkVar8 = mloVar.a;
                AnimationSet animationSet4 = new AnimationSet(true);
                animationSet4.addAnimation(mlkVar8.a(1.0f, 0.0f, mlkVar8.d, R.interpolator.mtrl_fast_out_linear_in));
                animationSet4.addAnimation(mlkVar8.b(0, mlkVar8.a, mlkVar8.d, R.interpolator.mtrl_fast_out_linear_in));
                viewSwitcher6.setOutAnimation(animationSet4);
            } else {
                String.format(Locale.US, "Error displaying illegal view %d", Integer.valueOf(mloVar.b.getDisplayedChild()));
            }
            mloVar.b.showNext();
            mloVar.c.showNext();
            if (mloVar.i) {
                mloVar.d.postDelayed(mloVar.e, mloVar.f);
            }
        }
    };
    public final int f;
    public final mln g;
    public boolean h;
    public boolean i;
    private final ajmy j;
    private final ImageView k;
    private final TextView l;
    private aqux m;

    public mlo(Context context, ajmy ajmyVar, ViewSwitcher viewSwitcher, ViewSwitcher viewSwitcher2, ImageView imageView, TextView textView, mln mlnVar) {
        this.j = ajmyVar;
        this.b = viewSwitcher;
        this.c = viewSwitcher2;
        this.k = imageView;
        this.l = textView;
        this.a = new mlk(context);
        this.g = mlnVar;
        this.f = context.getResources().getInteger(R.integer.endorsement_swap_period_ms);
    }

    public final void a() {
        this.d.removeCallbacks(this.e);
    }

    public final void b() {
        this.i = false;
        if (this.m != null) {
            this.h = false;
            this.d.removeCallbacks(this.e);
            if (this.b.getDisplayedChild() != 0) {
                return;
            }
            this.d.post(this.e);
        }
    }

    public final void c() {
        this.i = true;
        if (this.m == null || this.h) {
            return;
        }
        this.h = true;
        this.d.post(this.e);
    }

    public final void d() {
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
    }

    public final void e(aqux aquxVar) {
        this.m = aquxVar;
        if (aquxVar == null) {
            d();
            return;
        }
        ajmy ajmyVar = this.j;
        ImageView imageView = this.k;
        avhn avhnVar = aquxVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.j.c());
        TextView textView = this.l;
        arag aragVar = aquxVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        this.b.setInAnimation(null);
        this.b.setOutAnimation(null);
        this.c.setInAnimation(null);
        this.c.setOutAnimation(null);
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
        this.h = false;
    }
}
