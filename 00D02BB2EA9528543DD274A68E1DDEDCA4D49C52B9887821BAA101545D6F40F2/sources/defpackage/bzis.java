package defpackage;
/* compiled from: PG */
/* renamed from: bzis  reason: default package */
/* loaded from: classes4.dex */
public final class bzis extends dsqw<bzis, bzir> implements dssk {
    public static final bzis d;
    private static volatile dssr<bzis> e;
    public int a;
    public int b;
    public int c;

    static {
        bzis bzisVar = new bzis();
        d = bzisVar;
        dsqw.cc(bzis.class, bzisVar);
    }

    private bzis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bzis();
            }
            if (i2 == 4) {
                return new bzir();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzis> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzis.class) {
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
