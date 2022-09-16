package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ajtz  reason: default package */
/* loaded from: classes.dex */
public final class ajtz extends ajtu {
    public ViewPropertyAnimator b;
    public ViewPropertyAnimator c;
    private float d;
    private float e;

    private static final void g(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.ajsr
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            f();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        } else {
            e();
        }
    }

    @Override // defpackage.ajsr
    public final void b() {
        ajto ajtoVar = this.a;
        long j = ajtoVar.c;
        ViewPropertyAnimator animate = ajtoVar.a.a().animate();
        this.b = animate;
        animate.setDuration(j).alpha(0.0f).translationX(this.d).translationY(this.e).setListener(new ajtx(this, ajtoVar)).start();
        ViewPropertyAnimator animate2 = ajtoVar.b.a().animate();
        this.c = animate2;
        animate2.setDuration(j).alpha(1.0f).translationX(0.0f).translationY(0.0f).setListener(new ajty(this, ajtoVar)).start();
    }

    @Override // defpackage.ajtu
    protected final boolean c() {
        ajto ajtoVar = this.a;
        this.d = ajtoVar.j - ajtoVar.h;
        this.e = ajtoVar.k - ajtoVar.i;
        View a = ajtoVar.a.a();
        float f = this.d;
        float translationX = a.getTranslationX();
        float f2 = this.e;
        float translationY = a.getTranslationY();
        View a2 = ajtoVar.b.a();
        a2.setAlpha(0.0f);
        a2.setTranslationX(-(f - translationX));
        a2.setTranslationY(-(f2 - translationY));
        return true;
    }

    public final void e() {
        ajto ajtoVar = this.a;
        g(ajtoVar.b.a());
        ajtoVar.g.run();
    }

    public final void f() {
        ajto ajtoVar = this.a;
        g(ajtoVar.a.a());
        ajtoVar.e.run();
    }
}
