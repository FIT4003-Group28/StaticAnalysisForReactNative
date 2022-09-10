package defpackage;
/* compiled from: PG */
/* renamed from: duoq  reason: default package */
/* loaded from: classes.dex */
public final class duoq extends dsqw<duoq, duon> implements dssk {
    public static final duoq d;
    private static volatile dssr<duoq> f;
    public boolean a;
    public int b = 100;
    public int c;
    private int e;

    static {
        duoq duoqVar = new duoq();
        d = duoqVar;
        dsqw.cc(duoq.class, duoqVar);
    }

    private duoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", duoo.a});
            }
            if (i2 == 3) {
                return new duoq();
            }
            if (i2 == 4) {
                return new duon();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duoq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duoq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
