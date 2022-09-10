package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: azgc  reason: default package */
/* loaded from: classes3.dex */
final class azgc implements degu<baad> {
    final /* synthetic */ axwf a;
    final /* synthetic */ ProgressDialog b;
    final /* synthetic */ azgh c;

    public azgc(azgh azghVar, axwf axwfVar, ProgressDialog progressDialog) {
        this.c = azghVar;
        this.a = axwfVar;
        this.b = progressDialog;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.dismiss();
        if (th instanceof axzg) {
            this.c.d.c();
        } else {
            this.c.d.f();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        if (baadVar2 != null) {
            this.c.i.a();
            String a = axyk.a(((axvr) this.a).b);
            boolean d = dbsj.d(baadVar2.v());
            boolean z = !d;
            if (a != null && !z) {
                this.c.d.d();
            }
            azgh azghVar = this.c;
            int i = 1;
            if (true != d) {
                i = 3;
            }
            azghVar.s(baadVar2, i);
        }
        this.b.dismiss();
    }
}
