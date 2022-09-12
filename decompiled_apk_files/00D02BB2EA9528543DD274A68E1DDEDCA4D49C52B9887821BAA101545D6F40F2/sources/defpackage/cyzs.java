package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: cyzs  reason: default package */
/* loaded from: classes5.dex */
final class cyzs implements degu<cyts> {
    final /* synthetic */ cytq a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ dehn c;
    final /* synthetic */ cyzt d;

    public cyzs(cyzt cyztVar, cytq cytqVar, dbtp dbtpVar, dehn dehnVar) {
        this.d = cyztVar;
        this.a = cytqVar;
        this.b = dbtpVar;
        this.c = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if ((th instanceof CancellationException) || this.c.isCancelled()) {
            return;
        }
        cypg.c(this.d.f, 4, cyos.a(th), this.a.k);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyts cytsVar) {
        cypg.a(this.d.f, this.a.b.isEmpty() ? 7 : 9, this.b, this.a.k);
    }
}
