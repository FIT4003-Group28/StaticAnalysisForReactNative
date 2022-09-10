package defpackage;
/* compiled from: PG */
/* renamed from: drhq  reason: default package */
/* loaded from: classes6.dex */
public final class drhq extends dsqw<drhq, drhp> implements dssk {
    public static final drhq c;
    private static volatile dssr<drhq> d;
    public int a;
    public int b;

    static {
        drhq drhqVar = new drhq();
        c = drhqVar;
        dsqw.cc(drhq.class, drhqVar);
    }

    private drhq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drhq();
            }
            if (i2 == 4) {
                return new drhp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drhq.class) {
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
