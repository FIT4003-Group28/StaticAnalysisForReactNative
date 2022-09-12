package defpackage;
/* compiled from: PG */
/* renamed from: dquf  reason: default package */
/* loaded from: classes6.dex */
public final class dquf extends dsqw<dquf, dqua> implements dssk {
    public static final dquf c;
    private static volatile dssr<dquf> d;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;

    static {
        dquf dqufVar = new dquf();
        c = dqufVar;
        dsqw.cc(dquf.class, dqufVar);
    }

    private dquf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001e\u0003\u001e", new Object[]{"a", dque.c(), "b", dquc.c()});
            }
            if (i2 == 3) {
                return new dquf();
            }
            if (i2 == 4) {
                return new dqua();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dquf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dquf.class) {
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
