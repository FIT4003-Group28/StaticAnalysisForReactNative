package defpackage;
/* compiled from: PG */
/* renamed from: ddfq  reason: default package */
/* loaded from: classes.dex */
public final class ddfq extends dsqw<ddfq, ddfp> implements dssk {
    public static final ddfq c;
    private static volatile dssr<ddfq> d;
    public int a;
    public int b;

    static {
        ddfq ddfqVar = new ddfq();
        c = ddfqVar;
        dsqw.cc(ddfq.class, ddfqVar);
    }

    private ddfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဋ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddfq();
            }
            if (i2 == 4) {
                return new ddfp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddfq.class) {
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
