package defpackage;
/* compiled from: PG */
/* renamed from: dqea  reason: default package */
/* loaded from: classes6.dex */
public final class dqea extends dsqw<dqea, dqdz> implements dssk {
    public static final dqea b;
    private static volatile dssr<dqea> c;
    public dsrj<dqdy> a = dssu.b;

    static {
        dqea dqeaVar = new dqea();
        b = dqeaVar;
        dsqw.cc(dqea.class, dqeaVar);
    }

    private dqea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqdy.class});
            }
            if (i2 == 3) {
                return new dqea();
            }
            if (i2 == 4) {
                return new dqdz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqea> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqea.class) {
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
