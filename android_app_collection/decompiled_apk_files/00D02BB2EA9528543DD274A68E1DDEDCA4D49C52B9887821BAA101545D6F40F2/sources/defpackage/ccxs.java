package defpackage;

import android.view.View;
/* renamed from: ccxs  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccxs implements cqfc {
    static final cqfc a = new ccxs();

    private ccxs() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.animate().setDuration(600L).setStartDelay(1200L).setInterpolator(irf.a).translationY(-cqsz.d().e(view.getContext())).alpha(0.0f).start();
    }
}
