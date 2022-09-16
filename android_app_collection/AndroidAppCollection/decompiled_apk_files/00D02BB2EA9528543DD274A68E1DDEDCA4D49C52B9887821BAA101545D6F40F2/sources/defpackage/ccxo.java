package defpackage;

import android.view.View;
/* renamed from: ccxo  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccxo implements cqfc {
    static final cqfc a = new ccxo();

    private ccxo() {
    }

    @Override // defpackage.cqfc
    public final void a(final View view, boolean z) {
        view.setTranslationX(cqsz.c().e(view.getContext()));
        view.setAlpha(0.0f);
        view.animate().setDuration(600L).setStartDelay(65L).setInterpolator(irf.a).translationX(0.0f).alpha(1.0f).withEndAction(new Runnable(view) { // from class: ccxn
            private final View a;

            {
                this.a = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpv.a.c(this.a, 8);
            }
        }).start();
    }
}
