package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: czcg  reason: default package */
/* loaded from: classes5.dex */
final class czcg implements degu<cyts> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cytq b;
    final /* synthetic */ dehn c;
    final /* synthetic */ czch d;

    public czcg(czch czchVar, dbtp dbtpVar, cytq cytqVar, dehn dehnVar) {
        this.d = czchVar;
        this.a = dbtpVar;
        this.b = cytqVar;
        this.c = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if ((th instanceof CancellationException) || this.c.isCancelled()) {
            return;
        }
        cypg.c(this.d.e, 30, cyos.a(th), this.b.k);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyts cytsVar) {
        cypg.a(this.d.e, 46, this.a, this.b.k);
    }
}
