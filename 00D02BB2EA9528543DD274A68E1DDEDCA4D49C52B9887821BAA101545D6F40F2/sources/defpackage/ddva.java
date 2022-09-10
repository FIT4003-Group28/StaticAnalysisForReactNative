package defpackage;
/* compiled from: PG */
/* renamed from: ddva  reason: default package */
/* loaded from: classes6.dex */
public final class ddva extends dsqw<ddva, dduz> implements dssk {
    public static final ddva d;
    private static volatile dssr<ddva> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        ddva ddvaVar = new ddva();
        d = ddvaVar;
        dsqw.cc(ddva.class, ddvaVar);
    }

    private ddva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddva();
            }
            if (i2 == 4) {
                return new dduz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddva> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddva.class) {
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
