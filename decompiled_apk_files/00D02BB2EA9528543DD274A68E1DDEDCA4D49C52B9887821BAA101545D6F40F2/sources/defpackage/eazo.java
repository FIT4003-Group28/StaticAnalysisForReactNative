package defpackage;
/* compiled from: PG */
/* renamed from: eazo  reason: default package */
/* loaded from: classes6.dex */
public final class eazo extends dsqw<eazo, eazn> implements dssk {
    public static final eazo d;
    private static volatile dssr<eazo> e;
    public int a;
    public ddbs b;
    public boolean c;

    static {
        eazo eazoVar = new eazo();
        d = eazoVar;
        dsqw.cc(eazo.class, eazoVar);
    }

    private eazo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new eazo();
            }
            if (i2 == 4) {
                return new eazn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eazo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eazo.class) {
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
