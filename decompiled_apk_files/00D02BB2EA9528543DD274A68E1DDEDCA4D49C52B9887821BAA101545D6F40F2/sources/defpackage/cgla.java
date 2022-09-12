package defpackage;

import android.content.Context;
import android.view.View;
/* renamed from: cgla  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgla implements cqjb {
    static final cqjb a = new cgla();

    private cgla() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        final cgwg cgwgVar = (cgwg) cqkpVar;
        return new cqfc(cgwgVar) { // from class: cgku
            private final cgwg a;

            {
                this.a = cgwgVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                final cgwg cgwgVar2 = this.a;
                int i = cglf.a;
                if (!cgwgVar2.X().booleanValue()) {
                    return;
                }
                view.setAlpha(0.0f);
                view.animate().setDuration(175L).setInterpolator(irf.a).setStartDelay(400L).alpha(1.0f).withEndAction(new Runnable(cgwgVar2) { // from class: cgkv
                    private final cgwg a;

                    {
                        this.a = cgwgVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cgwg cgwgVar3 = this.a;
                        int i2 = cglf.a;
                        cgwgVar3.Y(false);
                    }
                }).start();
            }
        };
    }
}
