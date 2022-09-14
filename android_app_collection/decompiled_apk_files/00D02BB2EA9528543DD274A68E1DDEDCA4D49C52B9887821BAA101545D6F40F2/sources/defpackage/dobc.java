package defpackage;
/* compiled from: PG */
/* renamed from: dobc  reason: default package */
/* loaded from: classes6.dex */
public final class dobc extends dsqw<dobc, dobb> implements dssk {
    public static final dobc d;
    private static volatile dssr<dobc> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dobc dobcVar = new dobc();
        d = dobcVar;
        dsqw.cc(dobc.class, dobcVar);
    }

    private dobc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dobc();
            }
            if (i2 == 4) {
                return new dobb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dobc.class) {
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
