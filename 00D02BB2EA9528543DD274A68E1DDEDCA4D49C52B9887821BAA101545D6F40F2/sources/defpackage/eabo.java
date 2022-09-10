package defpackage;
/* compiled from: PG */
/* renamed from: eabo  reason: default package */
/* loaded from: classes6.dex */
public final class eabo extends dsqw<eabo, eabn> implements dssk {
    public static final eabo e;
    private static volatile dssr<eabo> f;
    public int a;
    public String b = "";
    public dsri c = dsrx.b;
    public long d;

    static {
        eabo eaboVar = new eabo();
        e = eaboVar;
        dsqw.cc(eabo.class, eaboVar);
    }

    private eabo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new eabo();
            }
            if (i2 == 4) {
                return new eabn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eabo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eabo.class) {
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
