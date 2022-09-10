package defpackage;
/* compiled from: PG */
/* renamed from: cyko  reason: default package */
/* loaded from: classes5.dex */
public final class cyko extends dsqw<cyko, cykm> implements dssk {
    public static final cyko c;
    private static volatile dssr<cyko> d;
    public int a;
    public dsrj<String> b = dssu.b;

    static {
        cyko cykoVar = new cyko();
        c = cykoVar;
        dsqw.cc(cyko.class, cykoVar);
    }

    private cyko() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyko();
            }
            if (i2 == 4) {
                return new cykm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyko> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyko.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
