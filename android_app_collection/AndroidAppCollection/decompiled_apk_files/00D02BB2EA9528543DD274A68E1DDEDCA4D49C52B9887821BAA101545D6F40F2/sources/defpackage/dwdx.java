package defpackage;
/* compiled from: PG */
/* renamed from: dwdx  reason: default package */
/* loaded from: classes.dex */
public final class dwdx extends dsqw<dwdx, dwdw> implements dssk {
    public static final dwdx c;
    private static volatile dssr<dwdx> e;
    public dsrj<dwef> a = dssu.b;
    public dwfn b;
    private int d;

    static {
        dwdx dwdxVar = new dwdx();
        c = dwdxVar;
        dsqw.cc(dwdx.class, dwdxVar);
    }

    private dwdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dwef.class, "b"});
            }
            if (i2 == 3) {
                return new dwdx();
            }
            if (i2 == 4) {
                return new dwdw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwdx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
