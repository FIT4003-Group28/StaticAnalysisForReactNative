package defpackage;
/* compiled from: PG */
/* renamed from: ambv  reason: default package */
/* loaded from: classes.dex */
public abstract class ambv {
    public static ambv l(akry akryVar, alyh alyhVar, @dzsi amcm amcmVar) {
        return new amab(akryVar, alyhVar, amcmVar, 1, true, true, false, "", -1, true);
    }

    public static boolean n(int i) {
        if (i != 0) {
            return i == 4 || i == 5;
        }
        throw null;
    }

    public static ambv o(akry akryVar, alyh alyhVar, @dzsi amcm amcmVar, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return new amab(akryVar, alyhVar, amcmVar, i, z, z2, z3, str, i2, z4);
    }

    public abstract akry a();

    public abstract alyh b();

    @dzsi
    public abstract amcm c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract int f();

    public abstract boolean g();

    public abstract String h();

    public abstract int i();

    public abstract boolean j();

    public abstract int k();

    public final boolean m() {
        int k = k();
        if (k != 0) {
            return k == 12 || k == 6 || k == 4 || k == 5;
        }
        throw null;
    }
}
