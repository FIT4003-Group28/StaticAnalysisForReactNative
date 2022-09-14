package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gwt  reason: default package */
/* loaded from: classes.dex */
final class gwt implements cqfc {
    final /* synthetic */ boolean a;

    public gwt(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        boolean z2 = this.a;
        float f = true != z2 ? 1.0f : 0.5f;
        view.animate().alpha(f).setInterpolator(irf.a).setDuration(true != z2 ? 250 : 167).setStartDelay(true != z2 ? 0 : 2000).setListener(new gws(view, f)).start();
    }
}
