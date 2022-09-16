package defpackage;
/* compiled from: PG */
/* renamed from: bts  reason: default package */
/* loaded from: classes2.dex */
final class bts extends bkm {
    public bts(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        btr btrVar = (btr) obj;
        String str = btrVar.a;
        if (str == null) {
            bmbVar.e(1);
        } else {
            bmbVar.f(1, str);
        }
        String str2 = btrVar.b;
        if (str2 == null) {
            bmbVar.e(2);
        } else {
            bmbVar.f(2, str2);
        }
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
