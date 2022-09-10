package defpackage;
/* compiled from: PG */
/* renamed from: dqvq  reason: default package */
/* loaded from: classes6.dex */
public final class dqvq extends dsqw<dqvq, dqvp> implements dssk {
    public static final dqvq d;
    private static volatile dssr<dqvq> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dqvq dqvqVar = new dqvq();
        d = dqvqVar;
        dsqw.cc(dqvq.class, dqvqVar);
    }

    private dqvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\f\r\u0002\u0000\u0000\u0000\fဇ\u0006\rဇ\b", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqvq();
            }
            if (i2 == 4) {
                return new dqvp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqvq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqvq.class) {
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
