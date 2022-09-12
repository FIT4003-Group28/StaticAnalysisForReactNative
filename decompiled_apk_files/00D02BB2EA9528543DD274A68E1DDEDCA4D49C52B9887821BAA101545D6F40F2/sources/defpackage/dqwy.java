package defpackage;
/* compiled from: PG */
/* renamed from: dqwy  reason: default package */
/* loaded from: classes6.dex */
public final class dqwy extends dsqw<dqwy, dqwt> implements dssk {
    public static final dqwy c;
    private static volatile dssr<dqwy> d;
    public dsrj<dqwv> a = dssu.b;
    public dsrj<dqwo> b = dssu.b;

    static {
        dqwy dqwyVar = new dqwy();
        c = dqwyVar;
        dsqw.cc(dqwy.class, dqwyVar);
    }

    private dqwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dqwv.class, "b", dqwo.class});
            }
            if (i2 == 3) {
                return new dqwy();
            }
            if (i2 == 4) {
                return new dqwt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqwy.class) {
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
