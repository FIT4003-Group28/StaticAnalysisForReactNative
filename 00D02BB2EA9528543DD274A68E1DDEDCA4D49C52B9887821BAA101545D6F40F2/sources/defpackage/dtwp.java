package defpackage;
/* compiled from: PG */
/* renamed from: dtwp  reason: default package */
/* loaded from: classes6.dex */
public final class dtwp extends dsqw<dtwp, dtwo> implements dssk {
    public static final dtwp d;
    private static volatile dssr<dtwp> e;
    public String a = "";
    public dsrj<String> b = dssu.b;
    public boolean c;

    static {
        dtwp dtwpVar = new dtwp();
        d = dtwpVar;
        dsqw.cc(dtwp.class, dtwpVar);
    }

    private dtwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtwp();
            }
            if (i2 == 4) {
                return new dtwo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtwp.class) {
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
