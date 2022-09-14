package defpackage;

import android.view.View;
/* renamed from: ccxp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccxp implements cqfc {
    static final cqfc a = new ccxp();

    private ccxp() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setVisibility(0);
        view.setTranslationY(cqsz.d().e(view.getContext()));
        view.setAlpha(0.0f);
        view.animate().setDuration(600L).setStartDelay(1200L).setInterpolator(irf.a).translationY(0.0f).alpha(1.0f).start();
    }
}
