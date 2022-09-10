package defpackage;
/* compiled from: PG */
/* renamed from: dhob  reason: default package */
/* loaded from: classes6.dex */
public final class dhob extends dsqw<dhob, dhoa> implements dssk {
    public static final dsrg<Integer, dkee> b = new dhnz();
    public static final dhob c;
    private static volatile dssr<dhob> d;
    public dsrf a = dsqz.b;

    static {
        dhob dhobVar = new dhob();
        c = dhobVar;
        dsqw.cc(dhob.class, dhobVar);
    }

    private dhob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dkee.c()});
            }
            if (i2 == 3) {
                return new dhob();
            }
            if (i2 == 4) {
                return new dhoa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhob> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhob.class) {
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
