package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: auoo  reason: default package */
/* loaded from: classes2.dex */
public class auoo implements bzml {
    private final auom a;
    private final cqat b;
    private final dxio<bzmm> c;

    public auoo(auom auomVar, cqat cqatVar, dxio<bzmm> dxioVar) {
        this.a = auomVar;
        this.b = cqatVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.INBOX_NOTIFICATION_SYSTEM_BAN_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.a.b;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        bzmm a = this.c.a();
        if (a.d(dqkc.INBOX_NOTIFICATION_SYSTEM_BAN_PROMO) >= 2) {
            long c = a.c(dqkc.INBOX_NOTIFICATION_SYSTEM_BAN_PROMO);
            if (c == -1) {
                return bzmk.NONE;
            }
            if (new eapd(c).x(new eapd(this.b.b() - TimeUnit.DAYS.toMillis(365L)))) {
                return bzmk.VISIBLE;
            }
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar == bzmk.VISIBLE;
    }
}
