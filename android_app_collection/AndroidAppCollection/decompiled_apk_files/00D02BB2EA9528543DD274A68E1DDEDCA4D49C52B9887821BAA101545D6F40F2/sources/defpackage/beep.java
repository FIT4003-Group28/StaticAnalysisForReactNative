package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: beep  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class beep implements cqlc {
    static final cqlc a = new beep();

    private beep() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bees beesVar = (bees) cqkpVar;
        return new cqfc(beesVar) { // from class: been
            private final bees a;

            {
                this.a = beesVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                final bees beesVar2 = this.a;
                cqlc<bees, cqfc> cqlcVar = beeq.a;
                if (view.getTranslationY() == (-view.getMeasuredHeight())) {
                    return;
                }
                ViewPropertyAnimator translationY = view.animate().setStartDelay(beesVar2.d().longValue()).setDuration(beesVar2.c().intValue()).translationY(-view.getMeasuredHeight());
                beesVar2.getClass();
                translationY.withEndAction(new Runnable(beesVar2) { // from class: beeo
                    private final bees a;

                    {
                        this.a = beesVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f();
                    }
                }).start();
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
