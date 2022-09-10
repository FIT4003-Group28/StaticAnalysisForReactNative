package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: azgd  reason: default package */
/* loaded from: classes3.dex */
final class azgd implements degu<baad> {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ baab b;
    final /* synthetic */ azgh c;

    public azgd(azgh azghVar, ProgressDialog progressDialog, baab baabVar) {
        this.c = azghVar;
        this.a = progressDialog;
        this.b = baabVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.dismiss();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        if (baadVar2 != null) {
            this.c.i(baadVar2);
        }
        this.a.dismiss();
    }
}
