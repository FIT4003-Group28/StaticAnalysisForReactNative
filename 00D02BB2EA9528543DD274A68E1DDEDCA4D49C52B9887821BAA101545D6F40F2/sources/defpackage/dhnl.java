package defpackage;
/* compiled from: PG */
/* renamed from: dhnl  reason: default package */
/* loaded from: classes6.dex */
public final class dhnl extends dsqw<dhnl, dhng> implements dssk {
    public static final dhnl b;
    private static volatile dssr<dhnl> c;
    public dsrj<dhnk> a = dssu.b;

    static {
        dhnl dhnlVar = new dhnl();
        b = dhnlVar;
        dsqw.cc(dhnl.class, dhnlVar);
    }

    private dhnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dhnk.class});
            }
            if (i2 == 3) {
                return new dhnl();
            }
            if (i2 == 4) {
                return new dhng();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhnl.class) {
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
