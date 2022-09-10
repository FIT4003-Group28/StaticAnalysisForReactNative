package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfv  reason: default package */
/* loaded from: classes7.dex */
public final class sfv implements degu<qec> {
    final /* synthetic */ sfy a;

    public sfv(sfy sfyVar) {
        this.a = sfyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.E(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi qec qecVar) {
        qec qecVar2 = qecVar;
        if (qecVar2 != null) {
            this.a.D(qecVar2.a(), ckem.TRANSIT_STATIONS_FETCH);
        } else {
            this.a.E(new NullPointerException());
        }
    }
}
