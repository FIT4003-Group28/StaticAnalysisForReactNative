package defpackage;

import android.app.ProgressDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayai  reason: default package */
/* loaded from: classes3.dex */
public final class ayai implements degu<baad> {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ ayak b;

    public ayai(ayak ayakVar, ProgressDialog progressDialog) {
        this.b = ayakVar;
        this.a = progressDialog;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!this.b.b.aZ) {
            return;
        }
        this.a.dismiss();
        this.b.f.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        if (!this.b.b.aZ) {
            return;
        }
        this.a.dismiss();
        this.b.f.b(baadVar2, new ayah(this));
    }
}
