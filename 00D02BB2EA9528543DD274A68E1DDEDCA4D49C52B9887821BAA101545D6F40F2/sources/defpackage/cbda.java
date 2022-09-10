package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: cbda  reason: default package */
/* loaded from: classes4.dex */
final class cbda implements degu<ilo> {
    final /* synthetic */ ily a;
    final /* synthetic */ cbdb b;

    public cbda(cbdb cbdbVar, ily ilyVar) {
        this.b = cbdbVar;
        this.a = ilyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.h("Failed to fetch the placemark", new Object[0]);
        ProgressDialog progressDialog = this.b.b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.b.a.Nw(this.a.d());
        this.b.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        ProgressDialog progressDialog = this.b.b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.b.a.Nw(iloVar2);
        this.b.a();
    }
}
