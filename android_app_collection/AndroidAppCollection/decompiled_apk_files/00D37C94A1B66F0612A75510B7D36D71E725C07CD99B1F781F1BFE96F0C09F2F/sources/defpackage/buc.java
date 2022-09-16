package defpackage;
/* compiled from: PG */
/* renamed from: buc  reason: default package */
/* loaded from: classes2.dex */
final class buc extends bkm {
    public buc(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        bub bubVar = (bub) obj;
        String str = bubVar.a;
        if (str == null) {
            bmbVar.e(1);
        } else {
            bmbVar.f(1, str);
        }
        String str2 = bubVar.b;
        if (str2 == null) {
            bmbVar.e(2);
        } else {
            bmbVar.f(2, str2);
        }
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
