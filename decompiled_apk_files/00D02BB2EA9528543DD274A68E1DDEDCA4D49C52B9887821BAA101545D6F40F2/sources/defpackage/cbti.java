package defpackage;
/* compiled from: PG */
/* renamed from: cbti  reason: default package */
/* loaded from: classes4.dex */
public final class cbti extends dsqw<cbti, cbth> implements dssk {
    public static final cbti c;
    private static volatile dssr<cbti> d;
    public int a;
    public cbto b;

    static {
        cbti cbtiVar = new cbti();
        c = cbtiVar;
        dsqw.cc(cbti.class, cbtiVar);
    }

    private cbti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cbti();
            }
            if (i2 == 4) {
                return new cbth();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbti> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cbti.class) {
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
