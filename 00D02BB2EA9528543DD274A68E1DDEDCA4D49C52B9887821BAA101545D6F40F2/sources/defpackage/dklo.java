package defpackage;
/* compiled from: PG */
/* renamed from: dklo  reason: default package */
/* loaded from: classes.dex */
public final class dklo extends dsqw<dklo, dkll> implements dssk {
    public static final dklo b;
    private static volatile dssr<dklo> d;
    public int a;
    private int c;

    static {
        dklo dkloVar = new dklo();
        b = dkloVar;
        dsqw.cc(dklo.class, dkloVar);
    }

    private dklo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dklm.a});
            }
            if (i2 == 3) {
                return new dklo();
            }
            if (i2 == 4) {
                return new dkll();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dklo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dklo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
