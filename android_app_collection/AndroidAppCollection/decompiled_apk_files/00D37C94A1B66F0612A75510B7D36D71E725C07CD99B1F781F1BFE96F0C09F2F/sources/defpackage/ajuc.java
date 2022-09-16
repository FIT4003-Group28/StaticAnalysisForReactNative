package defpackage;

import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ajuc  reason: default package */
/* loaded from: classes.dex */
public final class ajuc extends ajtt {
    public ViewPropertyAnimator b;

    @Override // defpackage.ajsr
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            c();
        }
    }

    @Override // defpackage.ajsr
    public final void b() {
        ajtl ajtlVar = ((ajtt) this).a;
        ViewPropertyAnimator animate = ajtlVar.a.a().animate();
        this.b = animate;
        animate.alpha(0.0f).setDuration(ajtlVar.b).setListener(new ajub(this, ajtlVar)).start();
    }

    public final void c() {
        ajtl ajtlVar = ((ajtt) this).a;
        ajtlVar.a.a().setAlpha(1.0f);
        ajtlVar.d.run();
    }

    @Override // defpackage.ajtt
    protected final void d() {
    }
}
