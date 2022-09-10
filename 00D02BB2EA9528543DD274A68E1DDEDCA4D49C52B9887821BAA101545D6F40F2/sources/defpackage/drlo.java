package defpackage;
/* compiled from: PG */
/* renamed from: drlo  reason: default package */
/* loaded from: classes.dex */
public final class drlo extends dsqw<drlo, drll> implements dssk {
    public static final drlo d;
    private static volatile dssr<drlo> f;
    public String a = "";
    public int b;
    public int c;
    private int e;

    static {
        drlo drloVar = new drlo();
        d = drloVar;
        dsqw.cc(drlo.class, drloVar);
    }

    private drlo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"e", "a", "b", drlm.a, "c", drkm.a});
            }
            if (i2 == 3) {
                return new drlo();
            }
            if (i2 == 4) {
                return new drll();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drlo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
