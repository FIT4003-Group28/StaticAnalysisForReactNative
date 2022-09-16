package defpackage;
/* compiled from: PG */
/* renamed from: bty  reason: default package */
/* loaded from: classes2.dex */
final class bty extends bkm {
    public bty(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        btx btxVar = (btx) obj;
        String str = btxVar.a;
        if (str == null) {
            bmbVar.e(1);
        } else {
            bmbVar.f(1, str);
        }
        bmbVar.d(2, btxVar.b);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }
}
