package defpackage;
/* compiled from: PG */
/* renamed from: byty  reason: default package */
/* loaded from: classes4.dex */
public final class byty {
    private final btvo a;
    private final cjnx b;

    public byty(btvo btvoVar, cjnx cjnxVar) {
        this.a = btvoVar;
        this.b = cjnxVar;
    }

    public final boolean a() {
        dkqz dkqzVar = this.a.getNotificationsParameters().m;
        if (dkqzVar == null) {
            dkqzVar = dkqz.ap;
        }
        return dkqzVar.T && !((Boolean) deha.s(this.b.d())).booleanValue();
    }
}
