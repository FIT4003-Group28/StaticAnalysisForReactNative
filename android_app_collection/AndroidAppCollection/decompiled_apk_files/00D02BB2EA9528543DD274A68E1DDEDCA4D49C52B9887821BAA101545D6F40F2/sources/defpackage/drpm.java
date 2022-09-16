package defpackage;
/* compiled from: PG */
/* renamed from: drpm  reason: default package */
/* loaded from: classes6.dex */
public final class drpm extends dsqw<drpm, drpd> implements dssk {
    public static final drpm c;
    private static volatile dssr<drpm> e;
    public drpl a;
    public drph b;
    private int d;

    static {
        drpm drpmVar = new drpm();
        c = drpmVar;
        dsqw.cc(drpm.class, drpmVar);
    }

    private drpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drpm();
            }
            if (i2 == 4) {
                return new drpd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drpm.class) {
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
