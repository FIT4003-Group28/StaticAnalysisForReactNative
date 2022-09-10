package defpackage;
/* compiled from: PG */
/* renamed from: duuu  reason: default package */
/* loaded from: classes6.dex */
public final class duuu extends dsqw<duuu, duur> implements dssk {
    public static final duuu d;
    private static volatile dssr<duuu> f;
    public boolean a;
    public long b = 15780000;
    public int c;
    private int e;

    static {
        duuu duuuVar = new duuu();
        d = duuuVar;
        dsqw.cc(duuu.class, duuuVar);
    }

    private duuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", duus.a});
            }
            if (i2 == 3) {
                return new duuu();
            }
            if (i2 == 4) {
                return new duur();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duuu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duuu.class) {
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
