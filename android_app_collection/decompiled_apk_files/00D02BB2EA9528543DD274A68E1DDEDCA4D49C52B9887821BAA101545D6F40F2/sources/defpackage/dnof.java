package defpackage;
/* compiled from: PG */
/* renamed from: dnof  reason: default package */
/* loaded from: classes6.dex */
public final class dnof extends dsqw<dnof, dnoe> implements dssk {
    public static final dnof b;
    private static volatile dssr<dnof> c;
    public dsrj<dneq> a = dssu.b;

    static {
        dnof dnofVar = new dnof();
        b = dnofVar;
        dsqw.cc(dnof.class, dnofVar);
    }

    private dnof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dneq.class});
            }
            if (i2 == 3) {
                return new dnof();
            }
            if (i2 == 4) {
                return new dnoe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnof> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnof.class) {
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
