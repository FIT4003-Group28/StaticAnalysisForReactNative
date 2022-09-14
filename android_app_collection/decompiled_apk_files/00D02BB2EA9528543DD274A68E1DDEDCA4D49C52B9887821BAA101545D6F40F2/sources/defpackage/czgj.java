package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: czgj  reason: default package */
/* loaded from: classes5.dex */
final class czgj implements degu<cyts> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cytq b;
    final /* synthetic */ dehn c;
    final /* synthetic */ czgk d;

    public czgj(czgk czgkVar, dbtp dbtpVar, cytq cytqVar, dehn dehnVar) {
        this.d = czgkVar;
        this.a = dbtpVar;
        this.b = cytqVar;
        this.c = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if ((th instanceof CancellationException) || this.c.isCancelled()) {
            return;
        }
        cypg.c(this.d.h, 29, cyos.a(th), this.b.k);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyts cytsVar) {
        cypg.a(this.d.h, 45, this.a, this.b.k);
    }
}
