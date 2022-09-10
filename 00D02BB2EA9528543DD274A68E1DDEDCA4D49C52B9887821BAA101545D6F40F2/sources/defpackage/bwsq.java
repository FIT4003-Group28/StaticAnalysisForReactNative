package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bwsq  reason: default package */
/* loaded from: classes4.dex */
public final class bwsq extends cjxe {
    final Set<View> a;
    final Set<View> b;
    private boolean f;

    public bwsq(fd fdVar, List<View> list) {
        super(fdVar, list);
        this.a = dcnm.c();
        this.b = dcnm.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjxe
    public final void a(float f) {
        c();
        this.f = true;
        super.a(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (!this.f) {
            for (View view : this.b) {
                this.d.remove(view);
            }
            this.b.clear();
            i(this.a);
            this.a.clear();
        }
    }

    @Override // defpackage.cjxe, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f = false;
    }
}
