package defpackage;
/* compiled from: PG */
/* renamed from: dltq  reason: default package */
/* loaded from: classes6.dex */
public final class dltq extends dsqw<dltq, dltp> implements dssk {
    public static final dltq c;
    private static volatile dssr<dltq> d;
    public int a;
    public boolean b;

    static {
        dltq dltqVar = new dltq();
        c = dltqVar;
        dsqw.cc(dltq.class, dltqVar);
    }

    private dltq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dltq();
            }
            if (i2 == 4) {
                return new dltp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dltq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dltq.class) {
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