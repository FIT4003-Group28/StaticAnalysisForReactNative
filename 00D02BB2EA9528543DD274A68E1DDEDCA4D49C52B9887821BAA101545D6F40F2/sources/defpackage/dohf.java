package defpackage;
/* compiled from: PG */
/* renamed from: dohf  reason: default package */
/* loaded from: classes6.dex */
public final class dohf extends dsqw<dohf, dohe> implements dssk {
    public static final dohf c;
    private static volatile dssr<dohf> d;
    public int a;
    public dppz b;

    static {
        dohf dohfVar = new dohf();
        c = dohfVar;
        dsqw.cc(dohf.class, dohfVar);
    }

    private dohf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dohf();
            }
            if (i2 == 4) {
                return new dohe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dohf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
