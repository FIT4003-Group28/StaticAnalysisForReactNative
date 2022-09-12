package defpackage;
/* compiled from: PG */
/* renamed from: dnxv  reason: default package */
/* loaded from: classes6.dex */
public final class dnxv extends dsqw<dnxv, dnxu> implements dssk {
    public static final dnxv e;
    private static volatile dssr<dnxv> f;
    public int a;
    public long b;
    public float c;
    public int d;

    static {
        dnxv dnxvVar = new dnxv();
        e = dnxvVar;
        dsqw.cc(dnxv.class, dnxvVar);
    }

    private dnxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnxv();
            }
            if (i2 == 4) {
                return new dnxu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnxv.class) {
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
