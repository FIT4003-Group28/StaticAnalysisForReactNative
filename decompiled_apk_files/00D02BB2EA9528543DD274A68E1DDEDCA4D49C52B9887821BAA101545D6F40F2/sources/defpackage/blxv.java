package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blxv  reason: default package */
/* loaded from: classes3.dex */
public final class blxv implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ blxy c;

    public blxv(blxy blxyVar, boolean z, boolean z2) {
        this.c = blxyVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        blzn.d(this.c.e, view, this.a);
        float translationX = view.getTranslationX();
        if (bvox.a(view)) {
            view.setTranslationX((-500.0f) + translationX);
        } else {
            view.setTranslationX(500.0f + translationX);
        }
        view.animate().setDuration(true != this.b ? 750L : 333L).setStartDelay(130L).setInterpolator(irf.b).translationX(translationX).withEndAction(new blxu(this)).start();
    }
}
