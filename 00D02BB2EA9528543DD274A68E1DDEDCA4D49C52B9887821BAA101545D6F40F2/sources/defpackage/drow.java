package defpackage;
/* compiled from: PG */
/* renamed from: drow  reason: default package */
/* loaded from: classes6.dex */
public final class drow extends dsqw<drow, drov> implements dssk {
    public static final drow e;
    private static volatile dssr<drow> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        drow drowVar = new drow();
        e = drowVar;
        dsqw.cc(drow.class, drowVar);
    }

    private drow() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drow();
            }
            if (i2 == 4) {
                return new drov();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drow> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drow.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
