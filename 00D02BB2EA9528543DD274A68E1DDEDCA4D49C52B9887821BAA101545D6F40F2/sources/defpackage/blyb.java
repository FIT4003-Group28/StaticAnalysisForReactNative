package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: blyb  reason: default package */
/* loaded from: classes3.dex */
final class blyb implements cqfc {
    final /* synthetic */ blye a;

    public blyb(blye blyeVar) {
        this.a = blyeVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(this.a.f);
        view.setRotation(this.a.g);
        view.setAlpha(1.0f);
        ((TextView) cqkx.e(view, bltv.g, TextView.class)).setAlpha(this.a.d);
        ((TextView) cqkx.e(view, bltv.h, TextView.class)).setAlpha(this.a.e);
        view.animate().setDuration(1000L).setInterpolator(irf.b).translationX(this.a.ao()).rotation(bvox.f(bvox.a(view), -20.0f)).withEndAction(new blya(this)).start();
    }
}
