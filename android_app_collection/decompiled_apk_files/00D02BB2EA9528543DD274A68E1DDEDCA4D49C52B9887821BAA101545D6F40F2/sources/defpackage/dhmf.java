package defpackage;
/* compiled from: PG */
/* renamed from: dhmf  reason: default package */
/* loaded from: classes6.dex */
public final class dhmf extends dsqw<dhmf, dhme> implements dssk {
    public static final dhmf e;
    private static volatile dssr<dhmf> f;
    public int a;
    public boolean b;
    public dsrf c = dsqz.b;
    public boolean d;

    static {
        dhmf dhmfVar = new dhmf();
        e = dhmfVar;
        dsqw.cc(dhmf.class, dhmfVar);
    }

    private dhmf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u0016\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhmf();
            }
            if (i2 == 4) {
                return new dhme();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhmf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
