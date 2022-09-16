package defpackage;
/* compiled from: PG */
/* renamed from: cykt  reason: default package */
/* loaded from: classes5.dex */
public final class cykt extends dsqw<cykt, cykp> implements dssk {
    public static final cykt d;
    private static volatile dssr<cykt> e;
    public cylg c;
    public dssd<String, cylo> b = dssd.b;
    public dsrj<cykr> a = dssu.b;

    static {
        cykt cyktVar = new cykt();
        d = cyktVar;
        dsqw.cc(cykt.class, cyktVar);
    }

    private cykt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u001b\u00022\u0003\t", new Object[]{"a", cykr.class, "b", cyks.a, "c"});
            }
            if (i2 == 3) {
                return new cykt();
            }
            if (i2 == 4) {
                return new cykp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cykt.class) {
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
