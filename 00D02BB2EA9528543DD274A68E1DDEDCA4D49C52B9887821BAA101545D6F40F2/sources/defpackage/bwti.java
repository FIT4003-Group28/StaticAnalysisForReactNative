package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bwti  reason: default package */
/* loaded from: classes4.dex */
final class bwti implements View.OnClickListener {
    final /* synthetic */ bwtr a;

    public bwti(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bwtr bwtrVar = this.a;
        if (bwtrVar.aD) {
            if (!bwtrVar.e.v().booleanValue() || this.a.e.Y() == null) {
                bwtr bwtrVar2 = this.a;
                ((efh) bwtrVar2.g).e = false;
                bwtrVar2.A.f();
                return;
            }
            begj begjVar = new begj();
            begjVar.b(this.a.e.Y());
            begjVar.c = jjn.COLLAPSED;
            this.a.aw.n(begjVar, true, null);
        }
    }
}
