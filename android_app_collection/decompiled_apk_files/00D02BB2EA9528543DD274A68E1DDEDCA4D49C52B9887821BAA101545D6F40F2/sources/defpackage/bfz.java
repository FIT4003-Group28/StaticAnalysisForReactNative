package defpackage;
/* compiled from: PG */
/* renamed from: bfz  reason: default package */
/* loaded from: classes3.dex */
final class bfz extends bc<bfy> {
    public bfz(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bfy bfyVar) {
        bfy bfyVar2 = bfyVar;
        String str = bfyVar2.a;
        if (str == null) {
            awjVar.f(1);
        } else {
            awjVar.i(1, str);
        }
        String str2 = bfyVar2.b;
        if (str2 == null) {
            awjVar.f(2);
        } else {
            awjVar.i(2, str2);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
