package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: apku  reason: default package */
/* loaded from: classes2.dex */
public final class apku implements jkh {
    private final dzsj<jkj> a;
    private final cqkf<jbk> b;
    private final jbk c;
    private final int d;
    private boolean e = true;

    public apku(Activity activity, dzsj<jkj> dzsjVar, cqkj cqkjVar, jbk jbkVar) {
        this.b = cqkjVar.c(new apkx(), null);
        this.a = dzsjVar;
        this.c = jbkVar;
        this.d = jmj.a(activity, 10);
    }

    private final void d(boolean z) {
        if (z != this.e) {
            View c = this.b.c();
            c.animate().cancel();
            if (z) {
                c.setVisibility(0);
                c.setTranslationY(-this.d);
                c.animate().alpha(1.0f).translationY(0.0f).setInterpolator(irf.a).setListener(null).start();
            } else {
                c.animate().alpha(0.0f).translationY(-this.d).setInterpolator(irf.a).setListener(new apkt(c)).start();
            }
            this.e = z;
        }
    }

    private static boolean e(jjn jjnVar) {
        return jjnVar != jjn.FULLY_EXPANDED;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        d(e(jjnVar2));
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    public final View a() {
        return this.b.c();
    }

    public final void b() {
        this.b.e(this.c);
        d(e(this.a.a().L()));
    }

    public final void c() {
        this.b.e(null);
    }
}
