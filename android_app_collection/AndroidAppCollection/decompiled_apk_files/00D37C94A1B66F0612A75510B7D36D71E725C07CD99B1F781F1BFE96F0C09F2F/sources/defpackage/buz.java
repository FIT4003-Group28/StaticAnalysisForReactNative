package defpackage;
/* compiled from: PG */
/* renamed from: buz  reason: default package */
/* loaded from: classes2.dex */
final class buz extends bkm {
    public buz(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        buy buyVar = (buy) obj;
        String str = buyVar.a;
        if (str == null) {
            bmbVar.e(1);
        } else {
            bmbVar.f(1, str);
        }
        String str2 = buyVar.b;
        if (str2 == null) {
            bmbVar.e(2);
        } else {
            bmbVar.f(2, str2);
        }
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
