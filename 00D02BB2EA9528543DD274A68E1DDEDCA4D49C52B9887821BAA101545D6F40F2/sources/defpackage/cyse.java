package defpackage;
/* compiled from: PG */
/* renamed from: cyse  reason: default package */
/* loaded from: classes5.dex */
final class cyse extends bc<cysn> {
    public cyse(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, cysn cysnVar) {
        cysn cysnVar2 = cysnVar;
        awjVar.g(1, cysnVar2.a);
        String str = cysnVar2.b;
        if (str == null) {
            awjVar.f(2);
        } else {
            awjVar.i(2, str);
        }
        awjVar.h(3, cysnVar2.c);
        String b = cysn.b(cysnVar2.d);
        if (b == null) {
            awjVar.f(4);
        } else {
            awjVar.i(4, b);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR ABORT INTO `Tokens` (`contact_id`,`value`,`affinity`,`field_type`) VALUES (?,?,?,?)";
    }
}
