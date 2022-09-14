package defpackage;
/* compiled from: PG */
/* renamed from: dwqp  reason: default package */
/* loaded from: classes6.dex */
public final class dwqp extends dsqw<dwqp, dwqm> implements dssk {
    public static final dwqp d;
    private static volatile dssr<dwqp> e;
    public int a;
    public int b;
    public dsrj<dwqt> c = dssu.b;

    static {
        dwqp dwqpVar = new dwqp();
        d = dwqpVar;
        dsqw.cc(dwqp.class, dwqpVar);
    }

    private dwqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", dwqn.a, "c", dwqt.class});
            }
            if (i2 == 3) {
                return new dwqp();
            }
            if (i2 == 4) {
                return new dwqm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwqp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwqp.class) {
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
