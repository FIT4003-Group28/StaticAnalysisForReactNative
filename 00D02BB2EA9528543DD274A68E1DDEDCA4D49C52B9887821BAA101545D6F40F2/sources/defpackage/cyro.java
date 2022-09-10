package defpackage;
/* compiled from: PG */
/* renamed from: cyro  reason: default package */
/* loaded from: classes5.dex */
final class cyro extends bc<cyqg> {
    public cyro(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, cyqg cyqgVar) {
        cyqg cyqgVar2 = cyqgVar;
        awjVar.g(1, cyqgVar2.a);
        awjVar.h(2, cyqgVar2.b);
        byte[] G = cyqgVar2.c.G();
        if (G == null) {
            awjVar.f(3);
        } else {
            awjVar.j(3, G);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR ABORT INTO `Contacts` (`id`,`affinity`,`proto_bytes`) VALUES (nullif(?, 0),?,?)";
    }
}
