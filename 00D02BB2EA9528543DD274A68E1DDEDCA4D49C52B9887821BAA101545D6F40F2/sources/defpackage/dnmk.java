package defpackage;
/* compiled from: PG */
/* renamed from: dnmk  reason: default package */
/* loaded from: classes6.dex */
public final class dnmk extends dsqw<dnmk, dnmj> implements dssk {
    public static final dnmk b;
    private static volatile dssr<dnmk> c;
    public dsrj<dorc> a = dssu.b;

    static {
        dnmk dnmkVar = new dnmk();
        b = dnmkVar;
        dsqw.cc(dnmk.class, dnmkVar);
    }

    private dnmk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dorc.class});
            }
            if (i2 == 3) {
                return new dnmk();
            }
            if (i2 == 4) {
                return new dnmj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnmk.class) {
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
