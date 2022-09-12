package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asve  reason: default package */
/* loaded from: classes2.dex */
public final class asve implements View.OnClickListener {
    final /* synthetic */ asvp a;
    final /* synthetic */ View b;
    final /* synthetic */ asvf c;

    public asve(asvf asvfVar, asvp asvpVar, View view) {
        this.c = asvfVar;
        this.a = asvpVar;
        this.b = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        asvp asvpVar = this.a;
        asvf asvfVar = this.c;
        asvpVar.a(asvfVar.c, asvfVar.c());
        cjqy tr = ((cjqz) btsr.a(cjqz.class)).tr();
        ((bvjq) btsr.a(bvjq.class)).rB();
        cjqg.r(tr, this.b);
    }
}
