package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zjb  reason: default package */
/* loaded from: classes7.dex */
final class zjb implements View.OnClickListener {
    final /* synthetic */ zjm a;

    public zjb(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.a.n.a() || !this.a.b.g().equals(dqvj.TRANSIT)) {
            zio zioVar = this.a.d;
            dbsk.s(zioVar);
            zioVar.n();
            return;
        }
        zio zioVar2 = this.a.d;
        dbsk.s(zioVar2);
        zioVar2.J();
    }
}
