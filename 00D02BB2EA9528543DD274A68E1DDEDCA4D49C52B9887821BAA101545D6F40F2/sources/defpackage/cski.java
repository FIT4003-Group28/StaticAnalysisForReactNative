package defpackage;
/* compiled from: PG */
/* renamed from: cski  reason: default package */
/* loaded from: classes5.dex */
public final class cski extends dsqw<cski, cskh> implements dssk {
    public static final cski d;
    private static volatile dssr<cski> e;
    public int a;
    public String b = "";
    public boolean c;

    static {
        cski cskiVar = new cski();
        d = cskiVar;
        dsqw.cc(cski.class, cskiVar);
    }

    private cski() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cski();
            }
            if (i2 == 4) {
                return new cskh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cski> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cski.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
