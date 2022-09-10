package defpackage;
/* compiled from: PG */
/* renamed from: dxqs  reason: default package */
/* loaded from: classes6.dex */
public final class dxqs extends dsqw<dxqs, dxqp> implements dssk {
    public static final dxqs c;
    private static volatile dssr<dxqs> d;
    public dsrj<dxqr> a = dssu.b;
    public int b;

    static {
        dxqs dxqsVar = new dxqs();
        c = dxqsVar;
        dsqw.cc(dxqs.class, dxqsVar);
    }

    private dxqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"a", dxqr.class, "b"});
            }
            if (i2 == 3) {
                return new dxqs();
            }
            if (i2 == 4) {
                return new dxqp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxqs.class) {
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
