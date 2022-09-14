package defpackage;
/* compiled from: PG */
/* renamed from: domq  reason: default package */
/* loaded from: classes6.dex */
public final class domq extends dsqw<domq, doml> implements dssk {
    public static final domq c;
    private static volatile dssr<domq> e;
    public dsrj<domp> a = dssu.b;
    public long b;
    private int d;

    static {
        domq domqVar = new domq();
        c = domqVar;
        dsqw.cc(domq.class, domqVar);
    }

    private domq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"d", "a", domp.class, "b"});
            }
            if (i2 == 3) {
                return new domq();
            }
            if (i2 == 4) {
                return new doml();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (domq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
