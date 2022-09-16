package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blxi  reason: default package */
/* loaded from: classes3.dex */
public final class blxi implements cqfc {
    final /* synthetic */ blxm a;

    public blxi(blxm blxmVar) {
        this.a = blxmVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setAlpha(1.0f);
        view.animate().setDuration(200L).setInterpolator(irf.c).alpha(0.0f).withEndAction(new blxh(this)).start();
    }
}
