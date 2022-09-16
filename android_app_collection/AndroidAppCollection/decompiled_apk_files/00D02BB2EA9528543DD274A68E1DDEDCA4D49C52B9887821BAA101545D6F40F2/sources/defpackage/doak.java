package defpackage;
/* compiled from: PG */
/* renamed from: doak  reason: default package */
/* loaded from: classes6.dex */
public final class doak extends dsqw<doak, doaj> implements dssk {
    public static final doak c;
    private static volatile dssr<doak> e;
    public String a = "";
    public dnpq b;
    private int d;

    static {
        doak doakVar = new doak();
        c = doakVar;
        dsqw.cc(doak.class, doakVar);
    }

    private doak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new doak();
            }
            if (i2 == 4) {
                return new doaj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doak> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doak.class) {
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
