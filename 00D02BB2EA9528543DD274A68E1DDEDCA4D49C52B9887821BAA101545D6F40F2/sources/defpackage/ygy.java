package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ygy  reason: default package */
/* loaded from: classes7.dex */
final class ygy implements jkh {
    private boolean a = true;
    private boolean b = false;
    @dzsi
    private jjn c = null;
    private final cqkf<? extends cqkp> d;

    public ygy(cqkf<? extends cqkp> cqkfVar) {
        this.d = cqkfVar;
    }

    private final void a(View view) {
        view.clearAnimation();
        view.animate().alpha(1.0f).setDuration(200L).setInterpolator(irf.b).start();
        this.b = false;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        this.a = false;
        this.c = null;
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        View c;
        this.c = jjnVar;
        if (!this.a && (c = this.d.c()) != null && this.b) {
            a(c);
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        View c;
        jjn jjnVar2;
        if (!this.a && (c = this.d.c()) != null) {
            if (this.b) {
                if (f != 0.0f || (jjnVar2 = this.c) == null || !jjnVar.equals(jjnVar2)) {
                    return;
                }
                a(c);
            } else if (f <= 0.0f || this.c != null) {
            } else {
                c.clearAnimation();
                c.animate().alpha(0.0f).setDuration(20L).setInterpolator(irf.c).start();
                this.b = true;
            }
        }
    }
}
