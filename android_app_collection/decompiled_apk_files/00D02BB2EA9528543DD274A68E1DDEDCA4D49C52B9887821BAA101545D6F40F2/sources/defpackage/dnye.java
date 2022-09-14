package defpackage;
/* compiled from: PG */
/* renamed from: dnye  reason: default package */
/* loaded from: classes6.dex */
public final class dnye extends dsqw<dnye, dnyd> implements dssk {
    public static final dnye d;
    private static volatile dssr<dnye> e;
    public int a;
    public boolean b = true;
    public boolean c;

    static {
        dnye dnyeVar = new dnye();
        d = dnyeVar;
        dsqw.cc(dnye.class, dnyeVar);
    }

    private dnye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnye();
            }
            if (i2 == 4) {
                return new dnyd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnye> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnye.class) {
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
