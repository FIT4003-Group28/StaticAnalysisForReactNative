package defpackage;
/* compiled from: PG */
/* renamed from: cyrz  reason: default package */
/* loaded from: classes5.dex */
final class cyrz extends bc<cysi> {
    public cyrz(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, cysi cysiVar) {
        cysi cysiVar2 = cysiVar;
        awjVar.i(1, cysiVar2.a);
        awjVar.i(2, cysiVar2.b);
        awjVar.g(3, cysiVar2.c);
        dspd dspdVar = cysiVar2.d;
        byte[] G = dspdVar == null ? null : dspdVar.G();
        if (G == null) {
            awjVar.f(4);
        } else {
            awjVar.j(4, G);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR REPLACE INTO `RpcCache` (`type`,`key`,`timestamp`,`proto_bytes`) VALUES (?,?,?,?)";
    }
}
