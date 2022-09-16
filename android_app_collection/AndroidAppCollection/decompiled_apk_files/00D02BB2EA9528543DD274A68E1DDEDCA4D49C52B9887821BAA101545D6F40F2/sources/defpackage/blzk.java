package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: blzk  reason: default package */
/* loaded from: classes3.dex */
final class blzk implements cqfc {
    final /* synthetic */ Context a;

    public blzk(Context context) {
        this.a = context;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setTranslationX(cqsz.c().e(this.a));
        view.setVisibility(0);
        view.animate().setDuration(500L).setInterpolator(irf.a).translationX(0.0f).alpha(1.0f).start();
    }
}
