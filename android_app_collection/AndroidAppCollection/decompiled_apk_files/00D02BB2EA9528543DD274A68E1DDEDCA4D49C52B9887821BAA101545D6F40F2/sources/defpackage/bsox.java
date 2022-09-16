package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: bsox  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsox implements cqjb {
    static final cqjb a = new bsox();

    private bsox() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        final brve brveVar = (brve) cqkpVar;
        return new cqfc(brveVar) { // from class: bspc
            private final brve a;

            {
                this.a = brveVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                final brve brveVar2 = this.a;
                cqjg cqjgVar = bsph.a;
                ViewPropertyAnimator translationY = view.animate().setStartDelay(0L).setDuration(300L).translationY(0.0f);
                brveVar2.getClass();
                translationY.withEndAction(new Runnable(brveVar2) { // from class: bspd
                    private final brve a;

                    {
                        this.a = brveVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.ay();
                    }
                }).start();
            }
        };
    }
}
