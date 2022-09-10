package defpackage;
/* compiled from: PG */
/* renamed from: ckzv  reason: default package */
/* loaded from: classes5.dex */
public final class ckzv extends dsqw<ckzv, ckzs> implements dssk {
    public static final ckzv e;
    private static volatile dssr<ckzv> f;
    public int a;
    public String b = "";
    public int c;
    public ckzu d;

    static {
        ckzv ckzvVar = new ckzv();
        e = ckzvVar;
        dsqw.cc(ckzv.class, ckzvVar);
    }

    private ckzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", dbkp.a, "d"});
            }
            if (i2 == 3) {
                return new ckzv();
            }
            if (i2 == 4) {
                return new ckzs();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckzv.class) {
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
