package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aobd  reason: default package */
/* loaded from: classes2.dex */
final class aobd implements cqfc {
    final /* synthetic */ aobe a;

    public aobd(aobe aobeVar) {
        this.a = aobeVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (!this.a.a) {
            view.animate().cancel();
            view.animate().alpha(0.0f).translationY(-view.getHeight()).setInterpolator(irf.a).setListener(new aobc(this, view)).start();
            return;
        }
        view.animate().cancel();
        view.setVisibility(0);
        view.setTranslationY(-view.getHeight());
        view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(irf.a).setListener(new aobb(this)).start();
    }
}
