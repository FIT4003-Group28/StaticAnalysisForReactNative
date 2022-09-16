package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: czab  reason: default package */
/* loaded from: classes5.dex */
final class czab implements degu<cyts> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cytq b;
    final /* synthetic */ dehn c;
    final /* synthetic */ czac d;

    public czab(czac czacVar, dbtp dbtpVar, cytq cytqVar, dehn dehnVar) {
        this.d = czacVar;
        this.a = dbtpVar;
        this.b = cytqVar;
        this.c = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if ((th instanceof CancellationException) || this.c.isCancelled()) {
            return;
        }
        cypg.c(this.d.c, 42, cyos.a(th), this.b.k);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyts cytsVar) {
        cypg.a(this.d.c, 71, this.a, this.b.k);
    }
}
