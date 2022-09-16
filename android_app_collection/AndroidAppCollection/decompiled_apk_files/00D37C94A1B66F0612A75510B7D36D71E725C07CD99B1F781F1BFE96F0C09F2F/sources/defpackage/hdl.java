package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraFeatureDescriptionView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hdl  reason: default package */
/* loaded from: classes3.dex */
public final class hdl implements View.OnClickListener, hdg, zly {
    public final EditorButtonView a;
    public final EditorButtonView b;
    public final EditorButtonView c;
    public final dt d;
    public final zmb e;
    boolean f;
    public boolean g;
    boolean h;
    public boolean i;
    boolean j;
    private final ShortsCameraFeatureDescriptionView k;
    private final hdi l;
    private final String m;
    private final String n;
    private final Drawable o;
    private final Drawable p;
    private final Drawable q;
    private final Drawable r;
    private final Drawable s;
    private final Drawable t;
    private final gyq u;

    public hdl(EditorButtonView editorButtonView, EditorButtonView editorButtonView2, EditorButtonView editorButtonView3, ShortsCameraFeatureDescriptionView shortsCameraFeatureDescriptionView, zmb zmbVar, Context context, dt dtVar, hdi hdiVar, gyq gyqVar) {
        this.a = editorButtonView;
        this.b = editorButtonView2;
        this.c = editorButtonView3;
        this.k = shortsCameraFeatureDescriptionView;
        this.e = zmbVar;
        this.u = gyqVar;
        this.l = hdiVar;
        this.d = dtVar;
        editorButtonView.setOnClickListener(this);
        editorButtonView2.setOnClickListener(this);
        editorButtonView3.setOnClickListener(this);
        hdiVar.h = this;
        hdiVar.c();
        if (hdiVar.i) {
            a(hdiVar.b);
        }
        this.m = context.getString(R.string.camera_flash_button_label);
        this.n = context.getString(R.string.camera_relight_label);
        this.o = po.b(context, R.drawable.ic_retouch_on);
        this.p = po.b(context, R.drawable.ic_retouch_off);
        this.s = po.b(context, 2131233239);
        this.t = po.b(context, 2131233383);
        this.q = po.b(context, R.drawable.ic_relight_on);
        this.r = po.b(context, R.drawable.ic_relight_off);
    }

    private final void c(actj actjVar) {
        gyq gyqVar = this.u;
        if (gyqVar == null) {
            return;
        }
        gyqVar.a(actjVar).b();
    }

    private final void d(String str) {
        this.b.setContentDescription(str);
        this.b.e(str);
        this.c.setContentDescription(str);
        this.c.e(str);
    }

    private final void e() {
        this.d.runOnUiThread(new hdj(this, 1));
        this.d.runOnUiThread(new hdj(this));
    }

    private final void f() {
        this.d.runOnUiThread(new hdj(this, 2));
        this.d.runOnUiThread(new hdj(this, 3));
    }

    private final void g() {
        Drawable drawable;
        Drawable drawable2 = this.o;
        if (drawable2 == null || (drawable = this.p) == null) {
            return;
        }
        EditorButtonView editorButtonView = this.a;
        if (true != this.h) {
            drawable2 = drawable;
        }
        editorButtonView.b(drawable2);
    }

    @Override // defpackage.hdg
    public final void a(float f) {
        this.h = f == 1.0f;
        g();
    }

    public final void b() {
        Drawable drawable;
        Drawable drawable2;
        if (!this.j) {
            this.d.runOnUiThread(new hdj(this, 4));
            this.d.runOnUiThread(new hdj(this, 5));
        } else if (this.i) {
            d(this.n);
            if (!this.f || (drawable2 = this.q) == null) {
                Drawable drawable3 = this.r;
                if (drawable3 == null) {
                    return;
                }
                this.c.b(drawable3);
                e();
                return;
            }
            this.b.b(drawable2);
            f();
        } else {
            d(this.m);
            if (!this.g || (drawable = this.s) == null) {
                Drawable drawable4 = this.t;
                if (drawable4 == null) {
                    return;
                }
                this.c.b(drawable4);
                e();
                return;
            }
            this.b.b(drawable);
            f();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f = 1.0f;
        if (view != this.a) {
            if (view != this.b && view != this.c) {
                return;
            }
            if (this.i) {
                boolean z = this.f;
                this.f = !z;
                hdi hdiVar = this.l;
                if (true == z) {
                    f = 0.0f;
                }
                hdiVar.c = f;
                hdiVar.g();
            } else {
                boolean z2 = !this.g;
                this.g = z2;
                this.e.K(z2);
            }
            b();
            c(actj.SHORTS_CREATION_RELIGHT_BUTTON);
            return;
        }
        boolean z3 = this.h;
        this.h = !z3;
        ShortsCameraFeatureDescriptionView shortsCameraFeatureDescriptionView = this.k;
        String str = true != z3 ? "Retouch on" : "Retouch off";
        AnimationSet animationSet = shortsCameraFeatureDescriptionView.b;
        if (animationSet != null) {
            animationSet.cancel();
        }
        shortsCameraFeatureDescriptionView.a.setText(str);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(1000L);
        alphaAnimation2.setDuration(500L);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setAnimationListener(new gwn(shortsCameraFeatureDescriptionView));
        shortsCameraFeatureDescriptionView.startAnimation(animationSet2);
        shortsCameraFeatureDescriptionView.b = animationSet2;
        final hdi hdiVar2 = this.l;
        if (true != this.h) {
            f = 0.0f;
        }
        hdiVar2.b = f;
        hdiVar2.h();
        vne vneVar = hdiVar2.j;
        if (vneVar != null) {
            vneVar.b(new ampg() { // from class: hdf
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    hdi hdiVar3 = hdi.this;
                    aopa mo52toBuilder = ((hwp) obj).mo52toBuilder();
                    float f2 = hdiVar3.b;
                    mo52toBuilder.copyOnWrite();
                    ((hwp) mo52toBuilder.instance).q = f2;
                    return (hwp) mo52toBuilder.mo39build();
                }
            }, anjk.a);
        }
        g();
        c(actj.SHORTS_CREATION_ENHANCE_BUTTON);
    }
}
