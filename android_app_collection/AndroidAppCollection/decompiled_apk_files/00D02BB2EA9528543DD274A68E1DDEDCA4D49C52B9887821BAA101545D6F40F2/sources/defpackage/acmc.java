package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acmc  reason: default package */
/* loaded from: classes2.dex */
final class acmc implements View.OnClickListener {
    final /* synthetic */ acmd a;
    final /* synthetic */ cqkp b;

    public acmc(acmd acmdVar, cqkp cqkpVar) {
        this.a = acmdVar;
        this.b = cqkpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjqm g = cjqg.g(cjqi.a, view);
        if (g == null) {
            bvoo.h("Attempting to invoke a LoggedInteractionCallback on a View with no registered LoggedInteraction. Defaulting to LoggedInteraction.NONE.", new Object[0]);
            g = cjqm.a;
        }
        this.a.a(this.b, g);
    }
}
