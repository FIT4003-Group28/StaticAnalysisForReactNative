package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: bspg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bspg implements cqjb {
    static final cqjb a = new bspg();

    private bspg() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        final brve brveVar = (brve) cqkpVar;
        return new cqfc(brveVar) { // from class: bspe
            private final brve a;

            {
                this.a = brveVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                final brve brveVar2 = this.a;
                cqjg cqjgVar = bsph.a;
                if (brveVar2.aw().booleanValue()) {
                    return;
                }
                ViewPropertyAnimator translationY = view.animate().setStartDelay(100L).setDuration(300L).translationY(-view.getMeasuredHeight());
                brveVar2.getClass();
                translationY.withEndAction(new Runnable(brveVar2) { // from class: bspf
                    private final brve a;

                    {
                        this.a = brveVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.ax();
                    }
                }).start();
            }
        };
    }
}
