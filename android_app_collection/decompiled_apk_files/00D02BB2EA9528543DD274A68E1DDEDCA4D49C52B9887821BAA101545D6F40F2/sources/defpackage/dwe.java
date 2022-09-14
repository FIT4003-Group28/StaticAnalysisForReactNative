package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dwe  reason: default package */
/* loaded from: classes6.dex */
final class dwe implements degu<dtu> {
    final /* synthetic */ dtu a;
    final /* synthetic */ dtj b;
    final /* synthetic */ dtu c;
    final /* synthetic */ dwf d;

    public dwe(dwf dwfVar, dtu dtuVar, dtj dtjVar, dtu dtuVar2) {
        this.d = dwfVar;
        this.a = dtuVar;
        this.b = dtjVar;
        this.c = dtuVar2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dtu dtuVar) {
        dtu dtuVar2 = dtuVar;
        if (this.d.d != this.a) {
            return;
        }
        dae t = dtuVar2.t();
        String str = this.b.c;
        if (str.isEmpty()) {
            str = this.d.a.getString(R.string.AR_STEP_CONTINUE);
        }
        this.d.f = new dwl(t, str);
        this.c.g(true);
        this.d.h = dtuVar2.s("left");
        dbsk.t(this.d.h, "Failed to create left ModelAnimator for the turn barrier animation.");
        this.d.i = dtuVar2.s("right");
        dbsk.t(this.d.i, "Failed to create right ModelAnimator for the turn barrier animation.");
        dwf dwfVar = this.d;
        dwfVar.j = dwfVar.h;
        dva dvaVar = dwfVar.j;
        dbsk.s(dvaVar);
        dvaVar.a();
        dva dvaVar2 = this.d.j;
        dbsk.s(dvaVar2);
        dvaVar2.b();
        dwf dwfVar2 = this.d;
        dvh dvhVar = dwfVar2.m;
        dwl dwlVar = dwfVar2.f;
        dbsk.s(dwlVar);
        dwk.a(dvhVar, dtuVar2, dwlVar.b);
    }
}
