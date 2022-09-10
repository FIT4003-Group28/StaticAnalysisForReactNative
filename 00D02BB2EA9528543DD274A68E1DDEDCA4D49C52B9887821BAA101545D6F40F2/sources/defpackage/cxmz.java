package defpackage;
/* compiled from: PG */
/* renamed from: cxmz  reason: default package */
/* loaded from: classes5.dex */
public final class cxmz extends dsqw<cxmz, cxmy> implements dssk {
    public static final cxmz e;
    private static volatile dssr<cxmz> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        cxmz cxmzVar = new cxmz();
        e = cxmzVar;
        dsqw.cc(cxmz.class, cxmzVar);
    }

    private cxmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new cxmz();
            }
            if (i2 == 4) {
                return new cxmy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cxmz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cxmz.class) {
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
