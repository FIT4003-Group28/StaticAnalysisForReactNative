package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czxx  reason: default package */
/* loaded from: classes5.dex */
final class czxx implements View.OnClickListener {
    final /* synthetic */ czxy a;

    public czxx(czxy czxyVar) {
        this.a = czxyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        czxy czxyVar = this.a;
        czxyVar.ah.setEnabled(czxyVar.af.b());
        this.a.ag.toggle();
        czxy czxyVar2 = this.a;
        czxyVar2.aL(czxyVar2.ag);
        this.a.aK();
    }
}
