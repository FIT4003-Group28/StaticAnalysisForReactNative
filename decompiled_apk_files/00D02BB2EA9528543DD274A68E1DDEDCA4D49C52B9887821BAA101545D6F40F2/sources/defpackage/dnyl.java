package defpackage;
/* compiled from: PG */
/* renamed from: dnyl  reason: default package */
/* loaded from: classes6.dex */
public final class dnyl extends dsqw<dnyl, dnyk> implements dssk {
    public static final dnyl d;
    private static volatile dssr<dnyl> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dnyl dnylVar = new dnyl();
        d = dnylVar;
        dsqw.cc(dnyl.class, dnylVar);
    }

    private dnyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnyl();
            }
            if (i2 == 4) {
                return new dnyk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnyl.class) {
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
