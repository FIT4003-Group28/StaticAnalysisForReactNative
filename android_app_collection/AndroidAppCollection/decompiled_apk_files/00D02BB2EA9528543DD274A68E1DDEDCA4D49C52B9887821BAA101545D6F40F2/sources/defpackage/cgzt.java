package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cgzt  reason: default package */
/* loaded from: classes4.dex */
final class cgzt implements View.OnClickListener {
    final /* synthetic */ dspd a;
    final /* synthetic */ chac b;

    public cgzt(chac chacVar, dspd dspdVar) {
        this.b = chacVar;
        this.a = dspdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cgzz cgzzVar;
        dspd dspdVar = this.b.a;
        if (dspdVar == null || dspdVar.equals(this.a) || (cgzzVar = this.b.e) == null) {
            return;
        }
        dspd dspdVar2 = this.a;
        cgdv cgdvVar = (cgdv) cgzzVar;
        if (cgdvVar.e.f().booleanValue()) {
            cgdvVar.e.s();
            return;
        }
        dwsr d = cgdvVar.aw.d();
        if (d == null) {
            d = cgdvVar.ad.a();
        }
        cgdvVar.bH(d, dspdVar2);
    }
}
