package defpackage;
/* compiled from: PG */
/* renamed from: bfs  reason: default package */
/* loaded from: classes3.dex */
final class bfs extends bc<bfr> {
    public bfs(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bfr bfrVar) {
        bfr bfrVar2 = bfrVar;
        awjVar.i(1, bfrVar2.a);
        awjVar.g(2, bfrVar2.b.longValue());
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
