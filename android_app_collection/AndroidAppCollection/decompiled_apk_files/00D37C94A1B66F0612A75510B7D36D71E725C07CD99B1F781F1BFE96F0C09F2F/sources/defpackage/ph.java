package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ph  reason: default package */
/* loaded from: classes4.dex */
public final class ph extends lp {
    final /* synthetic */ pl a;

    public ph(pl plVar) {
        this.a = plVar;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void a(View view) {
        View view2;
        pl plVar = this.a;
        if (plVar.k && (view2 = plVar.f) != null) {
            view2.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        pl plVar2 = this.a;
        plVar2.n = null;
        rd rdVar = plVar2.i;
        if (rdVar != null) {
            rdVar.a(plVar2.h);
            plVar2.h = null;
            plVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            lj.K(actionBarOverlayLayout);
        }
    }
}
