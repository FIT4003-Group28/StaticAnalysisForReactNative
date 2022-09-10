package defpackage;
/* compiled from: PG */
/* renamed from: ddtn  reason: default package */
/* loaded from: classes6.dex */
public final class ddtn extends dsqw<ddtn, ddtl> implements dssk {
    public static final ddtn e;
    private static volatile dssr<ddtn> f;
    public int a;
    public ddxq b;
    public int c;
    public int d;

    static {
        ddtn ddtnVar = new ddtn();
        e = ddtnVar;
        dsqw.cc(ddtn.class, ddtnVar);
    }

    private ddtn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", ddtm.a, "d"});
            }
            if (i2 == 3) {
                return new ddtn();
            }
            if (i2 == 4) {
                return new ddtl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddtn.class) {
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
