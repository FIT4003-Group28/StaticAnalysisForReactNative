package defpackage;
/* compiled from: PG */
/* renamed from: dqol  reason: default package */
/* loaded from: classes.dex */
public final class dqol extends dsqw<dqol, dqok> implements dssk {
    public static final dqol d;
    private static volatile dssr<dqol> e;
    public int a;
    public int b;
    public int c;

    static {
        dqol dqolVar = new dqol();
        d = dqolVar;
        dsqw.cc(dqol.class, dqolVar);
    }

    private dqol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqol();
            }
            if (i2 == 4) {
                return new dqok();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqol> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqol.class) {
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
