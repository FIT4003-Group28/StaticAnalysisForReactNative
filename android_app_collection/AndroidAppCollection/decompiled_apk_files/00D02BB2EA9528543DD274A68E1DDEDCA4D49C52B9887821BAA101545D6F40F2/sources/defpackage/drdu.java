package defpackage;
/* compiled from: PG */
/* renamed from: drdu  reason: default package */
/* loaded from: classes6.dex */
public final class drdu extends dsqw<drdu, drdt> implements dssk {
    public static final drdu d;
    private static volatile dssr<drdu> e;
    public int a;
    public dsrj<drea> b = dssu.b;
    public String c = "";

    static {
        drdu drduVar = new drdu();
        d = drduVar;
        dsqw.cc(drdu.class, drduVar);
    }

    private drdu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", drea.class, "c"});
            }
            if (i2 == 3) {
                return new drdu();
            }
            if (i2 == 4) {
                return new drdt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drdu.class) {
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
