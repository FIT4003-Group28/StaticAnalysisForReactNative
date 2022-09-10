package defpackage;
/* compiled from: PG */
/* renamed from: dqkd  reason: default package */
/* loaded from: classes.dex */
public final class dqkd extends dsqw<dqkd, dqjz> implements dssk {
    public static final dqkd f;
    private static volatile dssr<dqkd> g;
    public int a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    static {
        dqkd dqkdVar = new dqkd();
        f = dqkdVar;
        dsqw.cc(dqkd.class, dqkdVar);
    }

    private dqkd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", dqkc.c(), "c", "d", dqka.a, "e"});
            }
            if (i2 == 3) {
                return new dqkd();
            }
            if (i2 == 4) {
                return new dqjz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqkd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqkd.class) {
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
