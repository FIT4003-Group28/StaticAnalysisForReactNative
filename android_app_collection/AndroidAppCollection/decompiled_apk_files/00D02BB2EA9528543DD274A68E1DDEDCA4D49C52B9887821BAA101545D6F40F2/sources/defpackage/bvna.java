package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: bvna  reason: default package */
/* loaded from: classes4.dex */
final class bvna implements btzi<dkdw, dkdy> {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ deig b;
    final /* synthetic */ bvnb c;

    public bvna(bvnb bvnbVar, ProgressDialog progressDialog, deig deigVar) {
        this.c = bvnbVar;
        this.a = progressDialog;
        this.b = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkdw> btzrVar, btzy btzyVar) {
        ProgressDialog progressDialog;
        if (!this.c.c.isFinishing() && !this.c.c.isDestroyed() && (progressDialog = this.a) != null) {
            progressDialog.dismiss();
        }
        bttq bttqVar = btzyVar.p;
        this.b.j(false);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkdw> btzrVar, dkdy dkdyVar) {
        ProgressDialog progressDialog;
        dkdy dkdyVar2 = dkdyVar;
        if (!this.c.c.isFinishing() && !this.c.c.isDestroyed() && (progressDialog = this.a) != null) {
            progressDialog.dismiss();
        }
        anhk anhkVar = this.c.d;
        dnwb dnwbVar = dnwb.i;
        dnwb dnwbVar2 = dkdyVar2.a;
        if (dnwbVar2 == null) {
            dnwbVar2 = dnwb.i;
        }
        anhkVar.b(dnwbVar, dnwbVar2);
        this.b.j(true);
    }
}
