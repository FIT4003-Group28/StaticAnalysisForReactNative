package defpackage;

import android.view.View;
/* renamed from: ccxq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccxq implements cqfc {
    static final cqfc a = new ccxq();

    private ccxq() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view.animate().setDuration(600L).setStartDelay(65L).setInterpolator(irf.a).translationX(-cqsz.d().e(view.getContext())).alpha(0.0f).start();
    }
}
