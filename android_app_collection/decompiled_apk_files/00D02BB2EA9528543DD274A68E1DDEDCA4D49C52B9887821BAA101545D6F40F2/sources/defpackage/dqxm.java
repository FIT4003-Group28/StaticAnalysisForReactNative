package defpackage;
/* compiled from: PG */
/* renamed from: dqxm  reason: default package */
/* loaded from: classes6.dex */
public final class dqxm extends dsqw<dqxm, dqxf> implements dssk {
    public static final dqxm b;
    private static volatile dssr<dqxm> d;
    public int a = 0;
    private Object c;

    static {
        dqxm dqxmVar = new dqxm();
        b = dqxmVar;
        dsqw.cc(dqxm.class, dqxmVar);
    }

    private dqxm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "a", dqxl.class, dqxe.class, dqxh.class, dqxj.class});
            }
            if (i2 == 3) {
                return new dqxm();
            }
            if (i2 == 4) {
                return new dqxf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqxm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
