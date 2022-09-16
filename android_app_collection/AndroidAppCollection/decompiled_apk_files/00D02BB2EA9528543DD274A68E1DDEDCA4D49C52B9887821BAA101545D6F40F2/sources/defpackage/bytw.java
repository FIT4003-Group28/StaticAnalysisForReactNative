package defpackage;
/* compiled from: PG */
/* renamed from: bytw  reason: default package */
/* loaded from: classes4.dex */
public final class bytw {
    private final btvo a;
    private final axwq b;

    public bytw(btvo btvoVar, axwq axwqVar) {
        this.a = btvoVar;
        this.b = axwqVar;
    }

    public final boolean a() {
        dkqz dkqzVar = this.a.getNotificationsParameters().m;
        if (dkqzVar == null) {
            dkqzVar = dkqz.ap;
        }
        if (dkqzVar.U) {
            byuh f = byuh.f(this.b);
            return !f.a().a() || !f.b().a();
        }
        return false;
    }
}
