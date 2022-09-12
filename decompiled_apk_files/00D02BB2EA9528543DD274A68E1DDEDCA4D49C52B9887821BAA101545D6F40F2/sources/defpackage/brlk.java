package defpackage;
/* compiled from: PG */
/* renamed from: brlk  reason: default package */
/* loaded from: classes4.dex */
public abstract class brlk {
    public static brlk c(bwrs<brln> bwrsVar, bwrs<brlu> bwrsVar2) {
        return new brkz(bwrsVar, bwrsVar2);
    }

    public abstract bwrs<brln> a();

    public abstract bwrs<brlu> b();

    @dzsi
    public final brln d() {
        return a().c();
    }

    @dzsi
    public final brlu e() {
        return b().c();
    }

    public final boolean f() {
        return d() != null && d().m();
    }
}
