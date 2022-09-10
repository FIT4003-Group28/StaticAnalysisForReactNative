package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: azgb  reason: default package */
/* loaded from: classes3.dex */
final class azgb implements degu<baad> {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ axwf b;
    final /* synthetic */ azgh c;

    public azgb(azgh azghVar, ProgressDialog progressDialog, axwf axwfVar) {
        this.c = azghVar;
        this.a = progressDialog;
        this.b = axwfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.dismiss();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        if (baadVar2 == null) {
            this.c.r(this.b, this.a);
            return;
        }
        this.c.i(baadVar2);
        this.a.dismiss();
    }
}
