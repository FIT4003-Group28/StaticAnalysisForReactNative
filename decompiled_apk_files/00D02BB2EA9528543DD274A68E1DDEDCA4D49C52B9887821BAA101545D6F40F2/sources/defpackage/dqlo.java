package defpackage;
/* compiled from: PG */
/* renamed from: dqlo  reason: default package */
/* loaded from: classes.dex */
public final class dqlo extends dsqw<dqlo, dqll> implements dssk {
    public static final dqlo d;
    private static volatile dssr<dqlo> e;
    public int a;
    public dpuc b;
    public int c;

    static {
        dqlo dqloVar = new dqlo();
        d = dqloVar;
        dsqw.cc(dqlo.class, dqloVar);
    }

    private dqlo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dqlm.a});
            }
            if (i2 == 3) {
                return new dqlo();
            }
            if (i2 == 4) {
                return new dqll();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqlo.class) {
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
