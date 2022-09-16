package defpackage;
/* compiled from: PG */
/* renamed from: bfv  reason: default package */
/* loaded from: classes3.dex */
final class bfv extends bc<bfu> {
    public bfv(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bfu bfuVar) {
        bfu bfuVar2 = bfuVar;
        String str = bfuVar2.a;
        if (str == null) {
            awjVar.f(1);
        } else {
            awjVar.i(1, str);
        }
        awjVar.g(2, bfuVar2.b);
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }
}
