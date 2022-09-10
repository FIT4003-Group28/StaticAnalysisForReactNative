package defpackage;
/* compiled from: PG */
/* renamed from: dqzx  reason: default package */
/* loaded from: classes6.dex */
public final class dqzx extends dsqw<dqzx, dqzw> implements dssk {
    public static final dqzx c;
    private static volatile dssr<dqzx> d;
    public int a = 0;
    public Object b;

    static {
        dqzx dqzxVar = new dqzx();
        c = dqzxVar;
        dsqw.cc(dqzx.class, dqzxVar);
    }

    private dqzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dqyj.class, dqyb.class});
            }
            if (i2 == 3) {
                return new dqzx();
            }
            if (i2 == 4) {
                return new dqzw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqzx.class) {
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
