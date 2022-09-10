package defpackage;
/* compiled from: PG */
/* renamed from: dsjx  reason: default package */
/* loaded from: classes6.dex */
public final class dsjx extends dsqw<dsjx, dsju> implements dssk {
    public static final dsjx b;
    private static volatile dssr<dsjx> c;
    public dsrj<dsjw> a = dssu.b;

    static {
        dsjx dsjxVar = new dsjx();
        b = dsjxVar;
        dsqw.cc(dsjx.class, dsjxVar);
    }

    private dsjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsjw.class});
            }
            if (i2 == 3) {
                return new dsjx();
            }
            if (i2 == 4) {
                return new dsju();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsjx.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
