package defpackage;
/* compiled from: PG */
/* renamed from: dwvf  reason: default package */
/* loaded from: classes6.dex */
public final class dwvf extends dsqw<dwvf, dwve> implements dssk {
    public static final dwvf e;
    private static volatile dssr<dwvf> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dwvf dwvfVar = new dwvf();
        e = dwvfVar;
        dsqw.cc(dwvf.class, dwvfVar);
    }

    private dwvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001း\u0000\u0003ဈ\u0003\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", dggg.class});
            }
            if (i2 == 3) {
                return new dwvf();
            }
            if (i2 == 4) {
                return new dwve();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwvf.class) {
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
