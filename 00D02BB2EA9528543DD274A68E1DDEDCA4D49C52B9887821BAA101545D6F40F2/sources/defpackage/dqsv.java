package defpackage;
/* compiled from: PG */
/* renamed from: dqsv  reason: default package */
/* loaded from: classes6.dex */
public final class dqsv extends dsqw<dqsv, dqsu> implements dssk {
    public static final dqsv d;
    private static volatile dssr<dqsv> f;
    public dgly a;
    public dqtb b;
    public String c;
    private int e;

    static {
        dqsv dqsvVar = new dqsv();
        d = dqsvVar;
        dsqw.cc(dqsv.class, dqsvVar);
    }

    private dqsv() {
        dssu<Object> dssuVar = dssu.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဈ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqsv();
            }
            if (i2 == 4) {
                return new dqsu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqsv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
