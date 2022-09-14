package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blzc  reason: default package */
/* loaded from: classes3.dex */
public final class blzc implements cqfc {
    final /* synthetic */ blze a;

    public blzc(blze blzeVar) {
        this.a = blzeVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setTranslationX(cqsz.c().e(this.a.a));
        view.setRotation(0.0f);
        view.setVisibility(0);
        view.animate().setDuration(750L).setStartDelay(65L).setInterpolator(irf.b).translationX(0.0f).withEndAction(new blzb(this)).start();
        blze blzeVar = this.a;
        blzeVar.b = 0.0f;
        blzeVar.c = 0.0f;
    }
}
