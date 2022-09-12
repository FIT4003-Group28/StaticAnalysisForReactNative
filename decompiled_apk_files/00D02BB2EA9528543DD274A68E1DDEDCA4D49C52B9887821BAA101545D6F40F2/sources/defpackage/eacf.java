package defpackage;
/* compiled from: PG */
/* renamed from: eacf  reason: default package */
/* loaded from: classes.dex */
public final class eacf extends dsqw<eacf, eace> implements dssk {
    public static final eacf d;
    private static volatile dssr<eacf> e;
    public int a;
    public long b;
    public int c;

    static {
        eacf eacfVar = new eacf();
        d = eacfVar;
        dsqw.cc(eacf.class, eacfVar);
    }

    private eacf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", eaag.a});
            }
            if (i2 == 3) {
                return new eacf();
            }
            if (i2 == 4) {
                return new eace();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eacf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eacf.class) {
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
