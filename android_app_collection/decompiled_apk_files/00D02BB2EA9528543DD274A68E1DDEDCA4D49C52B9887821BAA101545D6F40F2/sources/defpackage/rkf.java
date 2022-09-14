package defpackage;
/* compiled from: PG */
/* renamed from: rkf  reason: default package */
/* loaded from: classes7.dex */
public abstract class rkf {
    public static rkf d(@dzsi rkh rkhVar, int i) {
        return new rkc(rkhVar, i);
    }

    @dzsi
    public abstract rkh a();

    public abstract int b();

    public final boolean c() {
        return b() == 1 && a() != null;
    }
}
