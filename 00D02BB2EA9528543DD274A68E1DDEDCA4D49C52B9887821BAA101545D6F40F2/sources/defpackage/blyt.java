package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyt  reason: default package */
/* loaded from: classes3.dex */
public final class blyt implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ blyv c;

    public blyt(blyv blyvVar, boolean z, boolean z2) {
        this.c = blyvVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        blyv blyvVar = this.c;
        view.setTranslationX(blzn.c(blyvVar.e, blyvVar.q).floatValue());
        this.c.q = 0.0f;
        view.setRotation(0.0f);
        blzn.d(this.c.e, view, this.a);
        view.animate().setDuration(true != this.b ? 750L : 333L).setStartDelay(65L).setInterpolator(irf.b).translationX(0.0f).withEndAction(new blys(this, view)).start();
        blyv blyvVar2 = this.c;
        blyvVar2.o = 0.0f;
        blyvVar2.p = 0.0f;
    }
}
