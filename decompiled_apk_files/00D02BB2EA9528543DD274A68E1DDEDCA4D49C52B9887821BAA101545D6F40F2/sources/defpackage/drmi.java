package defpackage;
/* compiled from: PG */
/* renamed from: drmi  reason: default package */
/* loaded from: classes6.dex */
public final class drmi extends dsqw<drmi, drmf> implements dssk {
    public static final drmi e;
    private static volatile dssr<drmi> f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    static {
        drmi drmiVar = new drmi();
        e = drmiVar;
        dsqw.cc(drmi.class, drmiVar);
    }

    private drmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", drmg.a, "d"});
            }
            if (i2 == 3) {
                return new drmi();
            }
            if (i2 == 4) {
                return new drmf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drmi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drmi.class) {
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