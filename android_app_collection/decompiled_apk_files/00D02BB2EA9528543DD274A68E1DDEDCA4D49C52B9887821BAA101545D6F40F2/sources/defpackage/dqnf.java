package defpackage;
/* compiled from: PG */
/* renamed from: dqnf  reason: default package */
/* loaded from: classes6.dex */
public final class dqnf extends dsqw<dqnf, dqnc> implements dssk {
    public static final dqnf d;
    private static volatile dssr<dqnf> e;
    public int a;
    public dqnr b;
    public dqne c;

    static {
        dqnf dqnfVar = new dqnf();
        d = dqnfVar;
        dsqw.cc(dqnf.class, dqnfVar);
    }

    private dqnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqnf();
            }
            if (i2 == 4) {
                return new dqnc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqnf.class) {
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
