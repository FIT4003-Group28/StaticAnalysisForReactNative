package defpackage;
/* compiled from: PG */
/* renamed from: dnab  reason: default package */
/* loaded from: classes6.dex */
public final class dnab extends dsqw<dnab, dnaa> implements dssk {
    public static final dnab b;
    private static volatile dssr<dnab> d;
    public int a = 1;
    private int c;

    static {
        dnab dnabVar = new dnab();
        b = dnabVar;
        dsqw.cc(dnab.class, dnabVar);
    }

    private dnab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnab();
            }
            if (i2 == 4) {
                return new dnaa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnab> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnab.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
