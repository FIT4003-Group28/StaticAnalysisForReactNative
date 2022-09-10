package defpackage;
/* compiled from: PG */
/* renamed from: dkvr  reason: default package */
/* loaded from: classes6.dex */
public final class dkvr extends dsqw<dkvr, dkvq> implements dssk {
    public static final dsrg<Integer, dqek> b = new dkvp();
    public static final dkvr c;
    private static volatile dssr<dkvr> d;
    public dsrf a = dsqz.b;

    static {
        dkvr dkvrVar = new dkvr();
        c = dkvrVar;
        dsqw.cc(dkvr.class, dkvrVar);
    }

    private dkvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dqek.c()});
            }
            if (i2 == 3) {
                return new dkvr();
            }
            if (i2 == 4) {
                return new dkvq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkvr.class) {
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
