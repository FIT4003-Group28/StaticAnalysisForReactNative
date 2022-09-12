package defpackage;
/* compiled from: PG */
/* renamed from: drip  reason: default package */
/* loaded from: classes6.dex */
public final class drip extends dsqw<drip, drik> implements dssk {
    public static final drip h;
    private static volatile dssr<drip> i;
    public int a;
    public dqdk b;
    public drim c;
    public int f;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        drip dripVar = new drip();
        h = dripVar;
        dsqw.cc(drip.class, dripVar);
    }

    private drip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", drin.a, "g"});
            }
            if (i3 == 3) {
                return new drip();
            }
            if (i3 == 4) {
                return new drik();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drip> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drip.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
