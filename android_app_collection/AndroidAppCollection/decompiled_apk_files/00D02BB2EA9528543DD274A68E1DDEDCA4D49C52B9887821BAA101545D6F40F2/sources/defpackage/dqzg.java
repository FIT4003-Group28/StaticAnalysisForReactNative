package defpackage;
/* compiled from: PG */
/* renamed from: dqzg  reason: default package */
/* loaded from: classes.dex */
public final class dqzg extends dsqw<dqzg, dqzf> implements dssk {
    public static final dqzg c;
    private static volatile dssr<dqzg> e;
    public dqze a;
    public int b = 18000000;
    private int d;

    static {
        dqzg dqzgVar = new dqzg();
        c = dqzgVar;
        dsqw.cc(dqzg.class, dqzgVar);
    }

    private dqzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqzg();
            }
            if (i2 == 4) {
                return new dqzf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqzg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
