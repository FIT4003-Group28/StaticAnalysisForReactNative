package defpackage;
/* compiled from: PG */
/* renamed from: btv  reason: default package */
/* loaded from: classes2.dex */
final class btv extends bkm {
    public btv(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        btu btuVar = (btu) obj;
        bmbVar.f(1, btuVar.a);
        bmbVar.d(2, btuVar.b.longValue());
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
