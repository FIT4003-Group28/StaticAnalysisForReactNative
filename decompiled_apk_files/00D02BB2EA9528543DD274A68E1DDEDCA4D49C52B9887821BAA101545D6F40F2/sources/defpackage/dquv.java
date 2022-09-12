package defpackage;
/* compiled from: PG */
/* renamed from: dquv  reason: default package */
/* loaded from: classes6.dex */
public final class dquv extends dsqw<dquv, dquu> implements dssk {
    public static final dquv c;
    private static volatile dssr<dquv> d;
    public int a;
    public int b;

    static {
        dquv dquvVar = new dquv();
        c = dquvVar;
        dsqw.cc(dquv.class, dquvVar);
    }

    private dquv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqut.c()});
            }
            if (i2 == 3) {
                return new dquv();
            }
            if (i2 == 4) {
                return new dquu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dquv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dquv.class) {
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
