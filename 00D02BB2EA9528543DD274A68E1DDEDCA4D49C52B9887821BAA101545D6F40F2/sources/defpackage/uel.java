package defpackage;
/* compiled from: PG */
/* renamed from: uel  reason: default package */
/* loaded from: classes7.dex */
final class uel implements degu<tgl> {
    final /* synthetic */ dcdc a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ uen c;

    public uel(uen uenVar, dcdc dcdcVar, dcdc dcdcVar2) {
        this.c = uenVar;
        this.a = dcdcVar;
        this.b = dcdcVar2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.c = dbsg.i(ufa.DIRECTIONS_BACKEND_UNAVAILABLE);
        this.c.t(dcdc.e(), this.c.c, dbpy.a);
        uen uenVar = this.c;
        uenVar.d = null;
        uenVar.b = dcdc.e();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(tgl tglVar) {
        this.c.r(tglVar, this.a, this.b);
    }
}
