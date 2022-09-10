package defpackage;
/* compiled from: PG */
/* renamed from: degi  reason: default package */
/* loaded from: classes6.dex */
final class degi implements deff {
    final /* synthetic */ degl a;
    final /* synthetic */ deff b;

    public degi(degl deglVar, deff deffVar) {
        this.a = deglVar;
        this.b = deffVar;
    }

    @Override // defpackage.deff
    public final dehn a() {
        if (!this.a.compareAndSet(degk.NOT_RUN, degk.STARTED)) {
            return deha.c();
        }
        return this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
