package defpackage;
/* compiled from: PG */
/* renamed from: dirj  reason: default package */
/* loaded from: classes6.dex */
public final class dirj extends dsqw<dirj, dirg> implements dssk {
    public static final dirj e;
    private static volatile dssr<dirj> f;
    public int a;
    public int b;
    public String c = "";
    public dnwb d;

    static {
        dirj dirjVar = new dirj();
        e = dirjVar;
        dsqw.cc(dirj.class, dirjVar);
    }

    private dirj() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဌ\u0000\u0006ဈ\u0001", new Object[]{"a", "d", "b", dirh.a, "c"});
            }
            if (i2 == 3) {
                return new dirj();
            }
            if (i2 == 4) {
                return new dirg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dirj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dirj.class) {
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
