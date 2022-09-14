package defpackage;
/* compiled from: PG */
/* renamed from: bysw  reason: default package */
/* loaded from: classes4.dex */
public final class bysw {
    private final btvo a;
    private final auhi b;
    private final bytc c;

    public bysw(btvo btvoVar, auhi auhiVar, bytc bytcVar) {
        this.a = btvoVar;
        this.b = auhiVar;
        this.c = bytcVar;
    }

    public final boolean a() {
        boolean z;
        boolean z2 = false;
        if (ako.b()) {
            return false;
        }
        dkhd dkhdVar = e().a;
        if (dkhdVar == null) {
            dkhdVar = dkhd.h;
        }
        if (!dkhdVar.b) {
            this.c.a(2);
            z = false;
        } else {
            z = true;
        }
        if (!this.b.s(dpyv.TRANSIT_STATION.dm)) {
            this.c.a(100);
        } else {
            z2 = z;
        }
        this.c.a(229);
        return z2;
    }

    public final boolean b() {
        return e().M;
    }

    public final int c() {
        return e().Q;
    }

    public final int d() {
        return e().g;
    }

    public final dkqz e() {
        dkqz dkqzVar = this.a.getNotificationsParameters().m;
        return dkqzVar == null ? dkqz.ap : dkqzVar;
    }
}
