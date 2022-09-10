package defpackage;
/* compiled from: PG */
/* renamed from: agxn  reason: default package */
/* loaded from: classes2.dex */
public final class agxn extends dsqw<agxn, agxm> implements dssk {
    public static final agxn c;
    private static volatile dssr<agxn> d;
    public int a;
    public int b;

    static {
        agxn agxnVar = new agxn();
        c = agxnVar;
        dsqw.cc(agxn.class, agxnVar);
    }

    private agxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new agxn();
            }
            if (i2 == 4) {
                return new agxm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agxn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (agxn.class) {
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
