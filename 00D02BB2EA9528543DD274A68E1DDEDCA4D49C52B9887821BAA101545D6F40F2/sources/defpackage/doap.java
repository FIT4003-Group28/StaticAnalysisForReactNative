package defpackage;
/* compiled from: PG */
/* renamed from: doap  reason: default package */
/* loaded from: classes6.dex */
public final class doap extends dsqw<doap, doao> implements dssk {
    public static final doap d;
    private static volatile dssr<doap> e;
    public int a;
    public dqfs b;
    public dqfs c;

    static {
        doap doapVar = new doap();
        d = doapVar;
        dsqw.cc(doap.class, doapVar);
    }

    private doap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doap();
            }
            if (i2 == 4) {
                return new doao();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doap> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doap.class) {
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
