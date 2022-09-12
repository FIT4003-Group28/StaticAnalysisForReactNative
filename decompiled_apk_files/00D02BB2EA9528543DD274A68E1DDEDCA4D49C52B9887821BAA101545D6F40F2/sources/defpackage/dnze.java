package defpackage;
/* compiled from: PG */
/* renamed from: dnze  reason: default package */
/* loaded from: classes6.dex */
public final class dnze extends dsqw<dnze, dnzd> implements dssk {
    public static final dnze d;
    private static volatile dssr<dnze> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dnze dnzeVar = new dnze();
        d = dnzeVar;
        dsqw.cc(dnze.class, dnzeVar);
    }

    private dnze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnze();
            }
            if (i2 == 4) {
                return new dnzd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnze> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnze.class) {
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
