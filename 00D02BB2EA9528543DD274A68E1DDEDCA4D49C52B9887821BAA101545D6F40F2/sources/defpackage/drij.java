package defpackage;
/* compiled from: PG */
/* renamed from: drij  reason: default package */
/* loaded from: classes6.dex */
public final class drij extends dsqw<drij, drii> implements dssk {
    public static final drij e;
    private static volatile dssr<drij> f;
    public int a;
    public String b = "";
    public dpsn c;
    public dpum d;

    static {
        drij drijVar = new drij();
        e = drijVar;
        dsqw.cc(drij.class, drijVar);
    }

    private drij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drij();
            }
            if (i2 == 4) {
                return new drii();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drij> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drij.class) {
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
