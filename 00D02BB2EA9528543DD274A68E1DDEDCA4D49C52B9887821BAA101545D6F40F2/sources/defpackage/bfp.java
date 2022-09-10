package defpackage;
/* compiled from: PG */
/* renamed from: bfp  reason: default package */
/* loaded from: classes3.dex */
final class bfp extends bc<bfo> {
    public bfp(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bfo bfoVar) {
        bfo bfoVar2 = bfoVar;
        String str = bfoVar2.a;
        if (str == null) {
            awjVar.f(1);
        } else {
            awjVar.i(1, str);
        }
        String str2 = bfoVar2.b;
        if (str2 == null) {
            awjVar.f(2);
        } else {
            awjVar.i(2, str2);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
