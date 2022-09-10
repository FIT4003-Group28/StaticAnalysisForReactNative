package defpackage;
/* compiled from: PG */
/* renamed from: dqrb  reason: default package */
/* loaded from: classes6.dex */
public final class dqrb extends dsqw<dqrb, dqra> implements dssk {
    public static final dqrb c;
    private static volatile dssr<dqrb> d;
    public int a;
    public drnu b;

    static {
        dqrb dqrbVar = new dqrb();
        c = dqrbVar;
        dsqw.cc(dqrb.class, dqrbVar);
    }

    private dqrb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqrb();
            }
            if (i2 == 4) {
                return new dqra();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqrb.class) {
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
