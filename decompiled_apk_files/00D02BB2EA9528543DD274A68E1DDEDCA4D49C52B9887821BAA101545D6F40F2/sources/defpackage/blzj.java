package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blzj  reason: default package */
/* loaded from: classes3.dex */
final class blzj implements cqfc {
    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.animate().setDuration(500L).setInterpolator(irf.a).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).withEndAction(new blzi(view)).start();
    }
}
