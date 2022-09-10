package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blxx  reason: default package */
/* loaded from: classes3.dex */
public final class blxx implements cqfc {
    final /* synthetic */ blxy a;

    public blxx(blxy blxyVar) {
        this.a = blxyVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.animate().setDuration(500L).setInterpolator(irf.b).translationX(blzn.c(this.a.e, 0.0f).floatValue()).start();
    }
}
