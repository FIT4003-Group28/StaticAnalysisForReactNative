package defpackage;
/* compiled from: PG */
/* renamed from: dhoq  reason: default package */
/* loaded from: classes6.dex */
public final class dhoq extends dsqw<dhoq, dhop> implements dssk {
    public static final dsrg<Integer, dqfg> b = new dhoo();
    public static final dhoq c;
    private static volatile dssr<dhoq> d;
    public dsrf a = dsqz.b;

    static {
        dhoq dhoqVar = new dhoq();
        c = dhoqVar;
        dsqw.cc(dhoq.class, dhoqVar);
    }

    private dhoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dqfg.c()});
            }
            if (i2 == 3) {
                return new dhoq();
            }
            if (i2 == 4) {
                return new dhop();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhoq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhoq.class) {
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
