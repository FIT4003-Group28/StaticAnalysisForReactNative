package defpackage;
/* compiled from: PG */
/* renamed from: dozu  reason: default package */
/* loaded from: classes6.dex */
public final class dozu extends dsqw<dozu, dozt> implements dssk {
    public static final dozu c;
    private static volatile dssr<dozu> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dozu dozuVar = new dozu();
        c = dozuVar;
        dsqw.cc(dozu.class, dozuVar);
    }

    private dozu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dozu();
            }
            if (i2 == 4) {
                return new dozt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dozu.class) {
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
