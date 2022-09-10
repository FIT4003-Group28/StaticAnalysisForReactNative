package defpackage;
/* compiled from: PG */
/* renamed from: dlno  reason: default package */
/* loaded from: classes6.dex */
public final class dlno extends dsqw<dlno, dlnn> implements dssk {
    public static final dlno f;
    private static volatile dssr<dlno> g;
    public int a;
    public dspd b = dspd.b;
    public dsrj<dlnm> c = dssu.b;
    public dsrj<dlny> d = dssu.b;
    public int e = 10;

    static {
        dlno dlnoVar = new dlno();
        f = dlnoVar;
        dsqw.cc(dlno.class, dlnoVar);
    }

    private dlno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002\u001b\u0003ည\u0000\u0004\u001b\u0005ဌ\u0001", new Object[]{"a", "c", dlnm.class, "b", "d", dlny.class, "e", ddos.c()});
            }
            if (i2 == 3) {
                return new dlno();
            }
            if (i2 == 4) {
                return new dlnn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlno> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlno.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
