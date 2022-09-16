package defpackage;
/* compiled from: PG */
/* renamed from: didz  reason: default package */
/* loaded from: classes6.dex */
public final class didz extends dsqw<didz, didy> implements dssk {
    public static final didz e;
    private static volatile dssr<didz> f;
    public int a;
    public String b = "";
    public int c;
    public didv d;

    static {
        didz didzVar = new didz();
        e = didzVar;
        dsqw.cc(didz.class, didzVar);
    }

    private didz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new didz();
            }
            if (i2 == 4) {
                return new didy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (didz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
