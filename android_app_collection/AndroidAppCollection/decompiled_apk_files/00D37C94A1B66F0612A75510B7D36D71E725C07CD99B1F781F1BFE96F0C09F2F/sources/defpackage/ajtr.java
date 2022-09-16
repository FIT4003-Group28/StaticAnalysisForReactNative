package defpackage;

import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ajtr  reason: default package */
/* loaded from: classes.dex */
public final class ajtr implements ajsr {
    public ajsq a;
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
        ajsq ajsqVar = this.a;
        ViewPropertyAnimator animate = ajsqVar.a.a().animate();
        this.b = animate;
        animate.alpha(1.0f).setDuration(ajsqVar.b).setListener(new ajua(this, ajsqVar)).start();
    }

    public final void c() {
        ajsq ajsqVar = this.a;
        ajsqVar.a.a().setAlpha(1.0f);
        ajsqVar.d.run();
    }
}
