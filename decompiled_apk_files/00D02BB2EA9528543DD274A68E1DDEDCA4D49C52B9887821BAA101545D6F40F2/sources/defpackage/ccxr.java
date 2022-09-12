package defpackage;

import android.view.View;
/* renamed from: ccxr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccxr implements cqfc {
    static final cqfc a = new ccxr();

    private ccxr() {
    }

    @Override // defpackage.cqfc
    public final void a(final View view, boolean z) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.animate().setDuration(1200L).setStartDelay(100L).setInterpolator(irf.b).alpha(1.0f).withEndAction(new Runnable(view) { // from class: ccxm
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
