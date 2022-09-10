package defpackage;
/* compiled from: PG */
/* renamed from: byub  reason: default package */
/* loaded from: classes4.dex */
public final class byub {
    private final int a;

    public byub(btvo btvoVar) {
        dkqz dkqzVar = btvoVar.getNotificationsParameters().m;
        this.a = (dkqzVar == null ? dkqz.ap : dkqzVar).A;
    }

    public final byua a(akqq akqqVar) {
        byua[] values;
        akql akqlVar = new akql(anae.a(akqqVar.a), anae.a(akqqVar.b));
        for (byua byuaVar : byua.values()) {
            if (byuaVar.j.D(akqlVar) <= this.a) {
                return byuaVar;
            }
        }
        return byua.UNKNOWN;
    }
}
