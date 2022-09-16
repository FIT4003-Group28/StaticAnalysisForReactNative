package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akkg  reason: default package */
/* loaded from: classes.dex */
public final class akkg implements View.OnClickListener {
    final /* synthetic */ autc a;
    final /* synthetic */ akki b;

    public akkg(akki akkiVar, autc autcVar) {
        this.b = akkiVar;
        this.a = autcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.al.d(new akma());
        this.b.aK(this.a.d);
        autc autcVar = this.a;
        if ((autcVar.b & 4) != 0) {
            this.b.aj.H(3, new acte(autcVar.e), null);
        }
        this.b.dismiss();
    }
}
