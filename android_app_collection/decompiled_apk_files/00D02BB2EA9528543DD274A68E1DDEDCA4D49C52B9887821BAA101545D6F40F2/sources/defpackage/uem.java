package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uem  reason: default package */
/* loaded from: classes7.dex */
public final class uem implements degu<udj> {
    final /* synthetic */ tgl a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ dcdc c;
    final /* synthetic */ uen d;

    public uem(uen uenVar, tgl tglVar, dcdc dcdcVar, dcdc dcdcVar2) {
        this.d = uenVar;
        this.a = tglVar;
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.d.s(this.a, dbsg.i(ufa.NO_WAYPOINT_FOUND), this.b, this.c);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(udj udjVar) {
        udj udjVar2 = udjVar;
        int c = udjVar2.c();
        if (c != 0) {
            if (c == 1) {
                this.d.s(this.a, dbsg.i(ufa.NO_WAYPOINT_FOUND), this.b, this.c);
                return;
            } else if (c == 2) {
                this.d.k(udjVar2.b().b(), udjVar2.a().b().intValue());
                return;
            } else {
                this.d.e = udjVar2.a();
                return;
            }
        }
        throw null;
    }
}
