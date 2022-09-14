package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acmg  reason: default package */
/* loaded from: classes2.dex */
final class acmg implements View.OnClickListener {
    final /* synthetic */ acmh a;
    final /* synthetic */ cqkp b;

    public acmg(acmh acmhVar, cqkp cqkpVar) {
        this.a = acmhVar;
        this.b = cqkpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjqm g = cjqg.g(cjqi.a, view);
        if (g == null) {
            bvoo.h("Attempting to invoke a LoggedInteractionOnClickListenerPrivate on a View with no registered LoggedInteraction. Defaulting to LoggedInteraction.NONE.", new Object[0]);
            g = cjqm.a;
        }
        this.a.a(this.b, g).onClick(view);
    }
}
