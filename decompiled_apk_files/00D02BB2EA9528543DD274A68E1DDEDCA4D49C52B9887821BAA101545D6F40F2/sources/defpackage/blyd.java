package defpackage;

import android.view.View;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyd  reason: default package */
/* loaded from: classes3.dex */
public final class blyd implements cqfc {
    final /* synthetic */ blye a;

    public blyd(blye blyeVar) {
        this.a = blyeVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
        ((TextView) cqkx.e(view, bltv.g, TextView.class)).setAlpha(this.a.d);
        ((TextView) cqkx.e(view, bltv.h, TextView.class)).setAlpha(this.a.e);
        view.animate().setDuration(500L).setInterpolator(irf.a).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).withEndAction(new blyc(this)).start();
    }
}
