package defpackage;
/* compiled from: PG */
/* renamed from: cyrj  reason: default package */
/* loaded from: classes5.dex */
final class cyrj extends bc<cyqe> {
    public cyrj(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, cyqe cyqeVar) {
        cyqe cyqeVar2 = cyqeVar;
        awjVar.g(1, cyqeVar2.a);
        awjVar.g(2, cyqeVar2.b);
        awjVar.g(3, cyqeVar2.c);
        dudy dudyVar = cyqeVar2.d;
        byte[] bS = dudyVar == null ? null : dudyVar.bS();
        if (bS == null) {
            awjVar.f(4);
        } else {
            awjVar.j(4, bS);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR REPLACE INTO `CacheInfo` (`rowid`,`last_updated`,`num_contacts`,`affinity_response_context`) VALUES (?,?,?,?)";
    }
}
