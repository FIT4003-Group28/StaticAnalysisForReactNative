package defpackage;
/* compiled from: PG */
/* renamed from: ddxs  reason: default package */
/* loaded from: classes6.dex */
public final class ddxs extends dsqw<ddxs, ddxr> implements dssk {
    public static final ddxs d;
    private static volatile dssr<ddxs> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        ddxs ddxsVar = new ddxs();
        d = ddxsVar;
        dsqw.cc(ddxs.class, ddxsVar);
    }

    private ddxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddxs();
            }
            if (i2 == 4) {
                return new ddxr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddxs.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
