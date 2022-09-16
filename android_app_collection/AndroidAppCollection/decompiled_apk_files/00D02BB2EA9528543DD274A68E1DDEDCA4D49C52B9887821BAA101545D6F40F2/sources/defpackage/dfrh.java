package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.view.animation.LinearInterpolator;
import com.google.geo.imagery.viewer.api.PhotoHandle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfrh  reason: default package */
/* loaded from: classes6.dex */
public final class dfrh {
    public static final LinearInterpolator a = new LinearInterpolator();
    public final dfrr b;
    public final dfuh c;
    public final dfum d;
    @dzsi
    public final dfuo e;
    @dzsi
    public dfua f;
    public final dfrx h;
    public final dfun j;
    public AnimatorSet k;
    public final CountDownTimer l;
    private final Executor m;
    public Animator g = new ObjectAnimator();
    private Animator n = new ObjectAnimator();
    public final dfrg i = new dfrg(this);

    public dfrh(Executor executor, Executor executor2, dfua dfuaVar, dfuh dfuhVar, dfrr dfrrVar, dfum dfumVar, @dzsi dfuo dfuoVar) {
        dfun dfunVar = new dfun();
        this.j = dfunVar;
        this.l = new dfrd(this);
        this.m = executor2;
        this.c = dfuhVar;
        this.f = dfuaVar;
        this.b = dfrrVar;
        this.d = dfumVar;
        this.e = dfuoVar;
        this.h = new dfrx(executor, executor2, dfuhVar, dfuaVar, dfumVar, dfunVar);
        this.k = new AnimatorSet();
    }

    @dzsi
    public final PhotoHandle a() {
        return this.j.b();
    }

    public final Animator b(PhotoHandle photoHandle, dhjx dhjxVar, long j, @dzsi Runnable runnable) {
        g();
        e();
        if (j == 0 || !this.j.c()) {
            h(photoHandle, dhjxVar, runnable);
            return null;
        }
        return i(photoHandle, dhjxVar, runnable, j, false);
    }

    public final void c() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.d.b("uiNavArrowOpacity", 1.0f), this.d.b("roadLabelOpacity", 1.0f));
        animatorSet.start();
        this.c.a();
    }

    public final boolean d() {
        return this.n.isRunning();
    }

    public final void e() {
        if (d()) {
            this.n.cancel();
        }
    }

    public final boolean f() {
        return this.g.isRunning();
    }

    public final void g() {
        if (f()) {
            this.g.cancel();
        }
    }

    public final void h(PhotoHandle photoHandle, dhjx dhjxVar, @dzsi Runnable runnable) {
        this.j.a(photoHandle);
        this.b.setCamera(dhjxVar);
        this.m.execute(new Runnable(this) { // from class: dfrc
            private final dfrh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfrh dfrhVar = this.a;
                PhotoHandle b = dfrhVar.j.b();
                dfua dfuaVar = dfrhVar.f;
                if (dfuaVar == null || b == null) {
                    return;
                }
                dfuaVar.e(b);
            }
        });
        if (runnable != null) {
            runnable.run();
        }
        c();
        j();
    }

    public final Animator i(PhotoHandle photoHandle, dhjx dhjxVar, @dzsi Runnable runnable, long j, boolean z) {
        dfrr dfrrVar = this.b;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dfrrVar, "camera", dfrr.b, dfrrVar.e, dhjxVar);
        this.n = ofObject;
        ofObject.setDuration(j);
        this.n.addListener(new dfrf(this));
        if (this.j.c() && !photoHandle.equals(this.j.b())) {
            this.j.d(photoHandle, runnable);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(this.d.b("uiNavArrowOpacity", 0.0f), this.d.b("roadLabelOpacity", 0.0f));
            animatorSet.start();
            j();
            if (z) {
                dfrx dfrxVar = this.h;
                Animator animator = dfrxVar.f;
                if (animator == null || !animator.isRunning()) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(dfrxVar.c.b("photoAOpacity", 0.0f), dfrxVar.c.b("photoBOpacity", 1.0f));
                    animatorSet2.addListener(new dfrw(dfrxVar));
                    dfrxVar.f = animatorSet2;
                    dfrxVar.f.setDuration(j);
                    dfrxVar.f.start();
                    dfrxVar.b.a();
                }
            } else {
                this.h.a(j);
            }
        }
        this.n.start();
        return this.n;
    }

    public final void j() {
        if (this.k.isRunning()) {
            return;
        }
        this.l.cancel();
        this.k.cancel();
        AnimatorSet animatorSet = new AnimatorSet();
        this.k = animatorSet;
        animatorSet.playTogether(this.d.b("railWidthMeters", 0.25f), this.d.b("uiSwipeRailOpacity", 0.9f));
        this.k.setDuration(200L);
        this.k.start();
        this.l.start();
    }
}
