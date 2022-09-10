package defpackage;
/* compiled from: PG */
/* renamed from: bgu  reason: default package */
/* loaded from: classes3.dex */
final class bgu extends bc<bgt> {
    public bgu(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bgt bgtVar) {
        bgt bgtVar2 = bgtVar;
        String str = bgtVar2.a;
        if (str == null) {
            awjVar.f(1);
        } else {
            awjVar.i(1, str);
        }
        String str2 = bgtVar2.b;
        if (str2 == null) {
            awjVar.f(2);
        } else {
            awjVar.i(2, str2);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
