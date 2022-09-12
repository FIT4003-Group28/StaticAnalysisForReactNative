package defpackage;
/* compiled from: PG */
/* renamed from: drts  reason: default package */
/* loaded from: classes6.dex */
public final class drts extends dsqw<drts, drtq> implements dssk {
    public static final drts d;
    private static volatile dssr<drts> e;
    public int a;
    public String b = "";
    public int c;

    static {
        drts drtsVar = new drts();
        d = drtsVar;
        dsqw.cc(drts.class, drtsVar);
    }

    private drts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", drtr.a});
            }
            if (i2 == 3) {
                return new drts();
            }
            if (i2 == 4) {
                return new drtq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drts> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drts.class) {
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
