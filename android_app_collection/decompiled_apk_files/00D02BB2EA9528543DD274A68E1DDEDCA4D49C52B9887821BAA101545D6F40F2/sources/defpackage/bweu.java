package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: bweu  reason: default package */
/* loaded from: classes4.dex */
final class bweu implements degu<bwev> {
    final /* synthetic */ deig a;
    final /* synthetic */ ProgressDialog b;

    public bweu(deig deigVar, ProgressDialog progressDialog) {
        this.a = deigVar;
        this.b = progressDialog;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
        this.b.dismiss();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bwev bwevVar) {
        this.a.j(bwevVar);
        this.b.dismiss();
    }
}
