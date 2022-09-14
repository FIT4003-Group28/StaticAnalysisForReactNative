package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: azes  reason: default package */
/* loaded from: classes3.dex */
final class azes implements degu<baad> {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ deig b;
    final /* synthetic */ azet c;

    public azes(azet azetVar, ProgressDialog progressDialog, deig deigVar) {
        this.c = azetVar;
        this.a = progressDialog;
        this.b = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.s(this.a);
        azet azetVar = this.c;
        if (azetVar.a.aZ) {
            azetVar.b.f();
        }
        this.b.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        azet azetVar = this.c;
        azetVar.f = baadVar2;
        azetVar.s(this.a);
        this.b.j(baadVar2);
    }
}
