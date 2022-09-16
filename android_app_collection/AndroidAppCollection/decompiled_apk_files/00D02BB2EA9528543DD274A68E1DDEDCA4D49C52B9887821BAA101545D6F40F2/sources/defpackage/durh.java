package defpackage;
/* compiled from: PG */
/* renamed from: durh  reason: default package */
/* loaded from: classes6.dex */
public final class durh extends dsqw<durh, durg> implements dssk {
    public static final durh e;
    private static volatile dssr<durh> f;
    public int a;
    public duqr b;
    public String c = "";
    public dggg d;

    static {
        durh durhVar = new durh();
        e = durhVar;
        dsqw.cc(durh.class, durhVar);
    }

    private durh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new durh();
            }
            if (i2 == 4) {
                return new durg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (durh.class) {
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
