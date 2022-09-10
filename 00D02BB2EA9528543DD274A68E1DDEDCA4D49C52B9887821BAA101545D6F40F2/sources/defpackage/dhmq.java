package defpackage;
/* compiled from: PG */
/* renamed from: dhmq  reason: default package */
/* loaded from: classes6.dex */
public final class dhmq extends dsqw<dhmq, dhmp> implements dssk {
    public static final dhmq c;
    private static volatile dssr<dhmq> d;
    public int a;
    public boolean b;

    static {
        dhmq dhmqVar = new dhmq();
        c = dhmqVar;
        dsqw.cc(dhmq.class, dhmqVar);
    }

    private dhmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhmq();
            }
            if (i2 == 4) {
                return new dhmp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhmq.class) {
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
