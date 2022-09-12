package defpackage;
/* compiled from: PG */
/* renamed from: dihg  reason: default package */
/* loaded from: classes6.dex */
public final class dihg extends dsqw<dihg, dihb> implements dssk {
    public static final dihg e;
    private static volatile dssr<dihg> g;
    public int c;
    private int f;
    public String a = "";
    public dsrj<dihd> b = dssu.b;
    public dsrj<drij> d = dssu.b;

    static {
        dihg dihgVar = new dihg();
        e = dihgVar;
        dsqw.cc(dihg.class, dihgVar);
    }

    private dihg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0005\u001b", new Object[]{"f", "a", "b", dihd.class, "c", dihe.a, "d", drij.class});
            }
            if (i2 == 3) {
                return new dihg();
            }
            if (i2 == 4) {
                return new dihb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dihg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
