package defpackage;
/* compiled from: PG */
/* renamed from: cbte  reason: default package */
/* loaded from: classes4.dex */
public final class cbte extends dsqw<cbte, cbtd> implements dssk {
    public static final cbte e;
    private static volatile dssr<cbte> f;
    public int a;
    public int b = 1;
    public cbti c;
    public cbtq d;

    static {
        cbte cbteVar = new cbte();
        e = cbteVar;
        dsqw.cc(cbte.class, cbteVar);
    }

    private cbte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "c", "b", cbuf.c(), "d"});
            }
            if (i2 == 3) {
                return new cbte();
            }
            if (i2 == 4) {
                return new cbtd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbte> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cbte.class) {
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
