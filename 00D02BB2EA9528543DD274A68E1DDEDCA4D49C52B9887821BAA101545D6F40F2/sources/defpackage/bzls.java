package defpackage;
/* compiled from: PG */
/* renamed from: bzls  reason: default package */
/* loaded from: classes.dex */
public final class bzls {
    public final btvo a;
    private final ckmc b;

    public bzls(ckmc ckmcVar, btvo btvoVar) {
        this.b = ckmcVar;
        this.a = btvoVar;
    }

    @dzsi
    public final String a(int i) {
        if (i == 4) {
            return this.b.a();
        }
        if (i != 5) {
            return null;
        }
        return this.b.b(dcdc.f("en"));
    }

    public final boolean b(int i) {
        if (i == 3) {
            return true;
        }
        return i == 5 && a(5) == null;
    }
}
