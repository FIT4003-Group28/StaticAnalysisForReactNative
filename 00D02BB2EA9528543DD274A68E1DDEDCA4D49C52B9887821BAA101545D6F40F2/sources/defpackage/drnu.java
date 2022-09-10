package defpackage;
/* compiled from: PG */
/* renamed from: drnu  reason: default package */
/* loaded from: classes6.dex */
public final class drnu extends dsqw<drnu, drnt> implements dssk {
    public static final drnu d;
    private static volatile dssr<drnu> e;
    public dsrj<drly> a = dssu.b;
    public dsrj<drlt> b = dssu.b;
    public dsrj<drnd> c = dssu.b;

    static {
        drnu drnuVar = new drnu();
        d = drnuVar;
        dsqw.cc(drnu.class, drnuVar);
    }

    private drnu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", drly.class, "b", drlt.class, "c", drnd.class});
            }
            if (i2 == 3) {
                return new drnu();
            }
            if (i2 == 4) {
                return new drnt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drnu.class) {
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
