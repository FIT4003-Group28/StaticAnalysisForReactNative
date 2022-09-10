package defpackage;
/* compiled from: PG */
/* renamed from: dnmg  reason: default package */
/* loaded from: classes6.dex */
public final class dnmg extends dsqw<dnmg, dnmd> implements dssk {
    public static final dnmg b;
    private static volatile dssr<dnmg> c;
    public dsrj<dnmf> a = dssu.b;

    static {
        dnmg dnmgVar = new dnmg();
        b = dnmgVar;
        dsqw.cc(dnmg.class, dnmgVar);
    }

    private dnmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnmf.class});
            }
            if (i2 == 3) {
                return new dnmg();
            }
            if (i2 == 4) {
                return new dnmd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnmg.class) {
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
