package defpackage;
/* compiled from: PG */
/* renamed from: drcy  reason: default package */
/* loaded from: classes.dex */
public final class drcy extends dsqw<drcy, drct> implements dssk {
    public static final drcy e;
    private static volatile dssr<drcy> f;
    public int a;
    public String b = "";
    public dggg c;
    public drcx d;

    static {
        drcy drcyVar = new drcy();
        e = drcyVar;
        dsqw.cc(drcy.class, drcyVar);
    }

    private drcy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drcy();
            }
            if (i2 == 4) {
                return new drct();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drcy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drcy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
