package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ajue  reason: default package */
/* loaded from: classes.dex */
public final class ajue extends ajts {
    public ViewPropertyAnimator b;

    private static final boolean i(ajti ajtiVar) {
        View a = ajtiVar.a.a();
        float translationX = (ajtiVar.g - ajtiVar.e) - a.getTranslationX();
        float translationY = (ajtiVar.h - ajtiVar.f) - a.getTranslationY();
        if (translationX != 0.0f || translationY != 0.0f) {
            a.setTranslationX(-translationX);
            a.setTranslationY(-translationY);
            return true;
        }
        a.setTranslationX(0.0f);
        a.setTranslationY(0.0f);
        return false;
    }

    @Override // defpackage.ajsr
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            h();
        }
    }

    @Override // defpackage.ajsr
    public final void b() {
        ajti ajtiVar = ((ajts) this).a;
        ViewPropertyAnimator animate = ajtiVar.a.a().animate();
        this.b = animate;
        animate.setDuration(ajtiVar.b).translationX(0.0f).translationY(0.0f).setListener(new ajud(this, ajtiVar)).start();
    }

    @Override // defpackage.ajts
    protected final boolean c() {
        return i(((ajts) this).a);
    }

    @Override // defpackage.ajts
    protected final boolean d(ajtg ajtgVar) {
        ViewPropertyAnimator viewPropertyAnimator;
        boolean i = i(((ajts) this).a.b(ajtgVar));
        if (!i || (viewPropertyAnimator = this.b) == null) {
            return i;
        }
        viewPropertyAnimator.setListener(null).cancel();
        this.b = null;
        return true;
    }

    public final void h() {
        ajti ajtiVar = ((ajts) this).a;
        View a = ajtiVar.a.a();
        a.setTranslationX(0.0f);
        a.setTranslationY(0.0f);
        ajtiVar.d.run();
    }
}
