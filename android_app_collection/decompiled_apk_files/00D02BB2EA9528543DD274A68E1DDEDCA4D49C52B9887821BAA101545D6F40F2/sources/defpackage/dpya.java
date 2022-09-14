package defpackage;
/* compiled from: PG */
/* renamed from: dpya  reason: default package */
/* loaded from: classes.dex */
public final class dpya extends dsqw<dpya, dpxv> implements dssk {
    public static final dpya c;
    private static volatile dssr<dpya> e;
    public dpxz a;
    public dpxx b;
    private int d;

    static {
        dpya dpyaVar = new dpya();
        c = dpyaVar;
        dsqw.cc(dpya.class, dpyaVar);
    }

    private dpya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpya();
            }
            if (i2 == 4) {
                return new dpxv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpya> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpya.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
