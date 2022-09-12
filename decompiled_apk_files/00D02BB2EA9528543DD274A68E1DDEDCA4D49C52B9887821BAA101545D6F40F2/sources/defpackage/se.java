package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
/* compiled from: PG */
/* renamed from: se  reason: default package */
/* loaded from: classes7.dex */
final class se extends ok {
    final /* synthetic */ si a;

    public se(si siVar) {
        this.a = siVar;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void b() {
        View view;
        si siVar = this.a;
        if (siVar.j && (view = siVar.f) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.setTransitioning(false);
        si siVar2 = this.a;
        siVar2.l = null;
        uc ucVar = siVar2.i;
        if (ucVar != null) {
            ucVar.c(siVar2.h);
            siVar2.h = null;
            siVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            od.L(actionBarOverlayLayout);
        }
    }
}
