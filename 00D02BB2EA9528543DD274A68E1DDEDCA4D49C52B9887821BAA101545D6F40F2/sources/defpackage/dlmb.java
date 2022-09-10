package defpackage;
/* compiled from: PG */
/* renamed from: dlmb  reason: default package */
/* loaded from: classes6.dex */
public final class dlmb extends dsqw<dlmb, dlma> implements dssk {
    public static final dlmb c;
    private static volatile dssr<dlmb> d;
    public int a;
    public dpum b;

    static {
        dlmb dlmbVar = new dlmb();
        c = dlmbVar;
        dsqw.cc(dlmb.class, dlmbVar);
    }

    private dlmb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlmb();
            }
            if (i2 == 4) {
                return new dlma();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlmb.class) {
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
